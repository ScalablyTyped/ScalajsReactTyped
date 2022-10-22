package typingsJapgolly.nightwatch.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestHooks
  extends StObject
     with NightwatchGlobals
     with NightwatchTests {
  
  var after: js.UndefOr[GlobalNightwatchTestHook] = js.undefined
  
  var afterEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.undefined
  
  var before: js.UndefOr[GlobalNightwatchTestHook] = js.undefined
  
  var beforeEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.undefined
}
object NightwatchTestHooks {
  
  inline def apply(
    afterTestCase: Any => js.Promise[Unit],
    afterTestSuite: Any => js.Promise[Unit],
    beforeTestCase: Any => js.Promise[Unit],
    beforeTestSuite: Any => js.Promise[Unit],
    onBrowserNavigate: Any => js.Promise[Unit],
    onBrowserQuit: Any => js.Promise[Unit],
    reporter: (Any, Any) => Callback
  ): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal(afterTestCase = js.Any.fromFunction1(afterTestCase), afterTestSuite = js.Any.fromFunction1(afterTestSuite), beforeTestCase = js.Any.fromFunction1(beforeTestCase), beforeTestSuite = js.Any.fromFunction1(beforeTestSuite), onBrowserNavigate = js.Any.fromFunction1(onBrowserNavigate), onBrowserQuit = js.Any.fromFunction1(onBrowserQuit), reporter = js.Any.fromFunction2((t0: Any, t1: Any) => (reporter(t0, t1)).runNow()))
    __obj.asInstanceOf[NightwatchTestHooks]
  }
  
  extension [Self <: NightwatchTestHooks](x: Self) {
    
    inline def setAfter(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setAfterEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Callback
    ): Self = StObject.set(x, "afterEach", js.Any.fromFunction2((t0: /* browser */ NightwatchBrowser, t1: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "before", js.Any.fromFunction1((t0: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setBeforeEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Callback
    ): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2((t0: /* browser */ NightwatchBrowser, t1: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
