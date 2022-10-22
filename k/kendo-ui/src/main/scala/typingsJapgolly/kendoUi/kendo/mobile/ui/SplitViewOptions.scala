package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitViewOptions extends StObject {
  
  var init: js.UndefOr[js.Function1[/* e */ SplitViewInitEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var show: js.UndefOr[js.Function1[/* e */ SplitViewShowEvent, Unit]] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object SplitViewOptions {
  
  inline def apply(): SplitViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitViewOptions]
  }
  
  extension [Self <: SplitViewOptions](x: Self) {
    
    inline def setInit(value: /* e */ SplitViewInitEvent => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* e */ SplitViewInitEvent) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShow(value: /* e */ SplitViewShowEvent => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: /* e */ SplitViewShowEvent) => value(t0).runNow()))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
