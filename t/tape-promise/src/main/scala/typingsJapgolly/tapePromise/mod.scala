package typingsJapgolly.tapePromise

import typingsJapgolly.std.PromiseLike
import typingsJapgolly.tape.mod.TestOptions
import typingsJapgolly.tapePromise.anon.AsyncTapeFunctionNonename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tape-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tapeTest: Any): AsyncTapeFunctionNonename = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tapeTest.asInstanceOf[js.Any]).asInstanceOf[AsyncTapeFunctionNonename]
  
  // tslint:enable: ban-types
  // tslint:disable: unified-signatures
  @js.native
  trait AsyncTapeFunction extends StObject {
    
    def apply(cb: TestCase): Unit = js.native
    /**
      * Create a new test with an optional name string and optional opts object.
      * cb(t) fires with the new test object t once all preceding tests have finished.
      * Tests execute serially.
      */
    def apply(name: String, cb: TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase): Unit = js.native
    
    /**
      * Create a new test harness instance, which is a function like test(),
      * but with a new pending stack and test state.
      */
    def createHarness(): AsyncTapeFunctionNonename = js.native
    
    def only(cb: TestCase): Unit = js.native
    /**
      * Like test(name?, opts?, cb) except if you use .only this
      * is the only test case that will run for the entire process,
      * all other test cases using tape will be ignored.
      */
    def only(name: String, cb: TestCase): Unit = js.native
    def only(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def only(opts: TestOptions, cb: TestCase): Unit = js.native
    
    def skip(cb: TestCase): Unit = js.native
    /**
      * Generate a new test that will be skipped over.
      */
    def skip(name: String, cb: TestCase): Unit = js.native
    def skip(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def skip(opts: TestOptions, cb: TestCase): Unit = js.native
  }
  
  @js.native
  trait Test
    extends StObject
       with typingsJapgolly.tape.mod.Test {
    
    def doesNotReject(promise: js.Function0[PromiseLike[Any]]): js.Promise[Unit] = js.native
    def doesNotReject(promise: js.Function0[PromiseLike[Any]], expected: js.Function): js.Promise[Unit] = js.native
    def doesNotReject(promise: js.Function0[PromiseLike[Any]], expected: js.Function, msg: String): js.Promise[Unit] = js.native
    def doesNotReject(promise: js.Function0[PromiseLike[Any]], expected: js.RegExp): js.Promise[Unit] = js.native
    def doesNotReject(promise: js.Function0[PromiseLike[Any]], expected: js.RegExp, msg: String): js.Promise[Unit] = js.native
    def doesNotReject(promise: js.Function0[PromiseLike[Any]], expected: Unit, msg: String): js.Promise[Unit] = js.native
    def doesNotReject(promise: js.Function0[PromiseLike[Any]], msg: String): js.Promise[Unit] = js.native
    /**
      * Assert that the promise resolves successfully.
      */
    def doesNotReject(promise: PromiseLike[Any]): js.Promise[Unit] = js.native
    def doesNotReject(promise: PromiseLike[Any], expected: js.Function): js.Promise[Unit] = js.native
    def doesNotReject(promise: PromiseLike[Any], expected: js.Function, msg: String): js.Promise[Unit] = js.native
    def doesNotReject(promise: PromiseLike[Any], expected: js.RegExp): js.Promise[Unit] = js.native
    def doesNotReject(promise: PromiseLike[Any], expected: js.RegExp, msg: String): js.Promise[Unit] = js.native
    def doesNotReject(promise: PromiseLike[Any], expected: Unit, msg: String): js.Promise[Unit] = js.native
    def doesNotReject(promise: PromiseLike[Any], msg: String): js.Promise[Unit] = js.native
    
    def rejects(promise: js.Function0[PromiseLike[Any]]): js.Promise[Unit] = js.native
    def rejects(promise: js.Function0[PromiseLike[Any]], expected: js.Function): js.Promise[Unit] = js.native
    def rejects(promise: js.Function0[PromiseLike[Any]], expected: js.Function, msg: String): js.Promise[Unit] = js.native
    def rejects(promise: js.Function0[PromiseLike[Any]], expected: js.RegExp): js.Promise[Unit] = js.native
    def rejects(promise: js.Function0[PromiseLike[Any]], expected: js.RegExp, msg: String): js.Promise[Unit] = js.native
    def rejects(promise: js.Function0[PromiseLike[Any]], expected: Unit, msg: String): js.Promise[Unit] = js.native
    def rejects(promise: js.Function0[PromiseLike[Any]], msg: String): js.Promise[Unit] = js.native
    /**
      * Assert that the promise settles with a rejection result.
      *
      * @param expected if present, must be a RegExp or Function, which is used to test the exception object.
      */
    def rejects(promise: PromiseLike[Any]): js.Promise[Unit] = js.native
    def rejects(promise: PromiseLike[Any], expected: js.Function): js.Promise[Unit] = js.native
    def rejects(promise: PromiseLike[Any], expected: js.Function, msg: String): js.Promise[Unit] = js.native
    def rejects(promise: PromiseLike[Any], expected: js.RegExp): js.Promise[Unit] = js.native
    def rejects(promise: PromiseLike[Any], expected: js.RegExp, msg: String): js.Promise[Unit] = js.native
    def rejects(promise: PromiseLike[Any], expected: Unit, msg: String): js.Promise[Unit] = js.native
    def rejects(promise: PromiseLike[Any], msg: String): js.Promise[Unit] = js.native
  }
  
  type TestCase = js.Function1[/* test */ Test, Unit | PromiseLike[Unit]]
}
