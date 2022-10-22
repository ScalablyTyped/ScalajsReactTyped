package typingsJapgolly.nightwatch.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchTestFunctions
  extends StObject
     with /* key */ StringDictionary[Any]
     with NightwatchTests {
  
  var `@disabled`: js.UndefOr[Boolean] = js.undefined
  
  var `@tags`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var after: js.UndefOr[NightwatchTestHook] = js.undefined
  
  var afterEach: js.UndefOr[NightwatchTestHook] = js.undefined
  
  var before: js.UndefOr[NightwatchTestHook] = js.undefined
  
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.undefined
}
object NightwatchTestFunctions {
  
  inline def apply(): NightwatchTestFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestFunctions]
  }
  
  extension [Self <: NightwatchTestFunctions](x: Self) {
    
    inline def `set@disabled`(value: Boolean): Self = StObject.set(x, "@disabled", value.asInstanceOf[js.Any])
    
    inline def `set@disabledUndefined`: Self = StObject.set(x, "@disabled", js.undefined)
    
    inline def `set@tags`(value: String | js.Array[String]): Self = StObject.set(x, "@tags", value.asInstanceOf[js.Any])
    
    inline def `set@tagsUndefined`: Self = StObject.set(x, "@tags", js.undefined)
    
    inline def `set@tagsVarargs`(value: String*): Self = StObject.set(x, "@tags", js.Array(value*))
    
    inline def setAfter(value: NightwatchTestHook): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterEach(value: NightwatchTestHook): Self = StObject.set(x, "afterEach", value.asInstanceOf[js.Any])
    
    inline def setAfterEachFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "afterEach", js.Any.fromFunction1((t0: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setAfterEachFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Callback
    ): Self = StObject.set(x, "afterEach", js.Any.fromFunction2((t0: /* browser */ NightwatchBrowser, t1: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
    
    inline def setAfterFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "after", js.Any.fromFunction1((t0: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setAfterFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Callback
    ): Self = StObject.set(x, "after", js.Any.fromFunction2((t0: /* browser */ NightwatchBrowser, t1: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: NightwatchTestHook): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeEach(value: NightwatchTestHook): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
    
    inline def setBeforeEachFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1((t0: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setBeforeEachFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Callback
    ): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2((t0: /* browser */ NightwatchBrowser, t1: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
    
    inline def setBeforeFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "before", js.Any.fromFunction1((t0: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setBeforeFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Callback
    ): Self = StObject.set(x, "before", js.Any.fromFunction2((t0: /* browser */ NightwatchBrowser, t1: /* done */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
