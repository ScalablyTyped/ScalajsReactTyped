package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addons {
  
  @JSImport("react-native", "addons.TestModule")
  @js.native
  val TestModule: TestModuleStatic = js.native
  type TestModule = TestModuleStatic
  
  trait TestModuleStatic extends StObject {
    
    def markTestCompleted(): Unit
    
    def markTestPassed(indicator: Any): Unit
    
    def verifySnapshot(done: js.Function1[/* indicator */ js.UndefOr[Any], Unit]): Unit
  }
  object TestModuleStatic {
    
    inline def apply(
      markTestCompleted: Callback,
      markTestPassed: Any => Callback,
      verifySnapshot: js.Function1[/* indicator */ js.UndefOr[Any], Unit] => Callback
    ): TestModuleStatic = {
      val __obj = js.Dynamic.literal(markTestCompleted = markTestCompleted.toJsFn, markTestPassed = js.Any.fromFunction1((t0: Any) => markTestPassed(t0).runNow()), verifySnapshot = js.Any.fromFunction1((t0: js.Function1[/* indicator */ js.UndefOr[Any], Unit]) => verifySnapshot(t0).runNow()))
      __obj.asInstanceOf[TestModuleStatic]
    }
    
    extension [Self <: TestModuleStatic](x: Self) {
      
      inline def setMarkTestCompleted(value: Callback): Self = StObject.set(x, "markTestCompleted", value.toJsFn)
      
      inline def setMarkTestPassed(value: Any => Callback): Self = StObject.set(x, "markTestPassed", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setVerifySnapshot(value: js.Function1[/* indicator */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "verifySnapshot", js.Any.fromFunction1((t0: js.Function1[/* indicator */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    }
  }
}
