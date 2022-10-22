package typingsJapgolly.kendoUi.kendo.mobile.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonGroupOptions extends StObject {
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ ButtonGroupSelectEvent, Unit]] = js.undefined
  
  var selectOn: js.UndefOr[String] = js.undefined
}
object ButtonGroupOptions {
  
  inline def apply(): ButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonGroupOptions]
  }
  
  extension [Self <: ButtonGroupOptions](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelect(value: /* e */ ButtonGroupSelectEvent => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ ButtonGroupSelectEvent) => value(t0).runNow()))
    
    inline def setSelectOn(value: String): Self = StObject.set(x, "selectOn", value.asInstanceOf[js.Any])
    
    inline def setSelectOnUndefined: Self = StObject.set(x, "selectOn", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
