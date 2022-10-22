package typingsJapgolly.nodeunit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodeunit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nodeunit", "testCase")
  @js.native
  def testCase: ITestCase = js.native
  inline def testCase_=(x: ITestCase): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("testCase")(x.asInstanceOf[js.Any])
  
  type ICallbackFunction = js.Function1[/* err */ js.UndefOr[Any], Unit]
  
  type ITestBody = js.Function1[/* callback */ Test, Unit]
  
  type ITestCase = js.Function1[/* testCase */ StringDictionary[ITestBody | ITestGroup | Unit], Unit]
  
  trait ITestGroup
    extends StObject
       with /* property */ StringDictionary[
          js.UndefOr[ITestGroup | ITestBody | (js.Function1[/* callback */ ICallbackFunction, Unit])]
        ] {
    
    /** The setUp function is run before each test */
    var setUp: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, Unit]] = js.undefined
    
    /** The tearDown function is run after each test calls test.done() */
    var tearDown: js.UndefOr[js.Function1[/* callback */ ICallbackFunction, Unit]] = js.undefined
  }
  object ITestGroup {
    
    inline def apply(): ITestGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITestGroup]
    }
    
    extension [Self <: ITestGroup](x: Self) {
      
      inline def setSetUp(value: /* callback */ ICallbackFunction => Callback): Self = StObject.set(x, "setUp", js.Any.fromFunction1((t0: /* callback */ ICallbackFunction) => value(t0).runNow()))
      
      inline def setSetUpUndefined: Self = StObject.set(x, "setUp", js.undefined)
      
      inline def setTearDown(value: /* callback */ ICallbackFunction => Callback): Self = StObject.set(x, "tearDown", js.Any.fromFunction1((t0: /* callback */ ICallbackFunction) => value(t0).runNow()))
      
      inline def setTearDownUndefined: Self = StObject.set(x, "tearDown", js.undefined)
    }
  }
  
  @js.native
  trait Test extends StObject {
    
    def assert(value: Any, message: String): Unit = js.native
    
    def deepEqual(actual: Any, expected: Any): Unit = js.native
    def deepEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def doesNotThrow(block: Any): Unit = js.native
    def doesNotThrow(block: Any, error: Any): Unit = js.native
    def doesNotThrow(block: Any, error: Any, message: String): Unit = js.native
    def doesNotThrow(block: Any, error: Unit, message: String): Unit = js.native
    
    def done(): Unit = js.native
    def done(err: Any): Unit = js.native
    @JSName("done")
    var done_Original: ICallbackFunction = js.native
    
    def equal(actual: Any, expected: Any): Unit = js.native
    def equal(actual: Any, expected: Any, message: String): Unit = js.native
    
    //assertion wrappers
    def equals(actual: Any, expected: Any): Unit = js.native
    def equals(actual: Any, expected: Any, message: String): Unit = js.native
    
    def expect(num: Double): Unit = js.native
    
    //assersions from node assert module
    def fail(actual: Any, expected: Any, message: String, operator: String): Unit = js.native
    
    def ifError(value: Any): Unit = js.native
    
    def notDeepEqual(actual: Any, expected: Any): Unit = js.native
    def notDeepEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def notEqual(actual: Any, expected: Any): Unit = js.native
    def notEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def notStrictEqual(actual: Any, expected: Any): Unit = js.native
    def notStrictEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def ok(value: Any): Unit = js.native
    def ok(value: Any, message: String): Unit = js.native
    
    def same(actual: Any, expected: Any): Unit = js.native
    def same(actual: Any, expected: Any, message: String): Unit = js.native
    
    def strictEqual(actual: Any, expected: Any): Unit = js.native
    def strictEqual(actual: Any, expected: Any, message: String): Unit = js.native
    
    def throws(block: Any): Unit = js.native
    def throws(block: Any, error: Any): Unit = js.native
    def throws(block: Any, error: Any, message: String): Unit = js.native
    def throws(block: Any, error: Unit, message: String): Unit = js.native
  }
}
