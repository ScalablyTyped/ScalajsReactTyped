package typingsJapgolly.tapePromise

import typingsJapgolly.tape.mod.TestCase
import typingsJapgolly.tape.mod.TestOptions
import typingsJapgolly.tapePromise.mod.AsyncTapeFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined tape-promise.tape-promise.AsyncTapeFunction & {None (name : string, opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, None (cb : tape.tape.TestCase): void, None (opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, None (name : string, cb : tape.tape.TestCase): void} */
  @js.native
  trait AsyncTapeFunctionNonename extends StObject {
    
    def apply(cb: TestCase | typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Create a new test with an optional name string and optional opts object.
      * cb(t) fires with the new test object t once all preceding tests have finished.
      * Tests execute serially.
      */
    def apply(name: String, cb: TestCase | typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase | typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase | typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    
    /**
      * Create a new test harness instance, which is a function like test(),
      * but with a new pending stack and test state.
      */
    def createHarness(): AsyncTapeFunction & FnCall = js.native
    
    def only(cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Like test(name?, opts?, cb) except if you use .only this
      * is the only test case that will run for the entire process,
      * all other test cases using tape will be ignored.
      */
    def only(name: String, cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    def only(name: String, opts: TestOptions, cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    def only(opts: TestOptions, cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    
    def skip(cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Generate a new test that will be skipped over.
      */
    def skip(name: String, cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    def skip(name: String, opts: TestOptions, cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
    def skip(opts: TestOptions, cb: typingsJapgolly.tapePromise.mod.TestCase): Unit = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(cb: TestCase): Unit = js.native
    def apply(name: String, cb: TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase): Unit = js.native
  }
}
