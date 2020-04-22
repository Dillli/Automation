package JavaSessions;

public class Travel {

	/*
	 * finalize protected void finalize() throws Throwable
	 * 
	 * Called by the garbage collector on an object when garbage
	 
	 * 
	 * The finalize method of class Object performs no special action; it simply
	 * returns normally. Subclasses of Object may override this definition.
	 * 
	 * The Java programming language does not guarantee which thread will invoke the
	 * finalize method for any given object. It is guaranteed, however, that the
	 * thread that invokes finalize will not be holding any user-visible
	 * synchronization locks when finalize is invoked. If an uncaught exception is
	 * thrown by the finalize method,the exception is ignored and finalization of
	 * that object terminates.
	 * 
	 * After the finalize method has been invoked for an object, no further action is
	 * taken until the Java virtual machine has again determined that there is no
	 * longer any means by which this object can be accessed by any thread that has
	 * not yet died, including possible actions by other objects or classes which are
	 * ready to be finalized,at which point the object may be discarded.
	 * 
	 * The finalize method is never invoked more than once by a Java virtual machine
	 * for any given object.
	 * 
	 * Any exception thrown by the finalize method causes the finalization of this
	 * object to be halted, but is otherwise ignored. Throws:Throwable - the
	 * Exception raised by this method
	 */

	public static void main(String[] args) {

		Travel e = new Travel();
		e = null;

		// requesting JVM to call GC:
//		System.gc();
		System.out.println("processing done....");
		System.gc();

	}

//	@Override
//	public void finalize() {
//		System.out.println("this is my finalize method");
//	}

	@Override
	public void finalize() {

	}

}
