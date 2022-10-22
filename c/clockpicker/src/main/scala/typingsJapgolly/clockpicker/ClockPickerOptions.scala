package typingsJapgolly.clockpicker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClockPickerOptions extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var afterDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var afterShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var align: js.UndefOr[String] = js.undefined
  
  var autoclose: js.UndefOr[Boolean] = js.undefined
  
  var beforeDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeHourSelect: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var beforeShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var donetext: js.UndefOr[String] = js.undefined
  
  var fromnow: js.UndefOr[Double] = js.undefined
  
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placement: js.UndefOr[String] = js.undefined
  
  var twelvehour: js.UndefOr[Boolean] = js.undefined
  
  var vibrate: js.UndefOr[Boolean] = js.undefined
}
object ClockPickerOptions {
  
  inline def apply(): ClockPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClockPickerOptions]
  }
  
  extension [Self <: ClockPickerOptions](x: Self) {
    
    inline def setAfterDone(value: Callback): Self = StObject.set(x, "afterDone", value.toJsFn)
    
    inline def setAfterDoneUndefined: Self = StObject.set(x, "afterDone", js.undefined)
    
    inline def setAfterHide(value: Callback): Self = StObject.set(x, "afterHide", value.toJsFn)
    
    inline def setAfterHideUndefined: Self = StObject.set(x, "afterHide", js.undefined)
    
    inline def setAfterHourSelect(value: Callback): Self = StObject.set(x, "afterHourSelect", value.toJsFn)
    
    inline def setAfterHourSelectUndefined: Self = StObject.set(x, "afterHourSelect", js.undefined)
    
    inline def setAfterShow(value: Callback): Self = StObject.set(x, "afterShow", value.toJsFn)
    
    inline def setAfterShowUndefined: Self = StObject.set(x, "afterShow", js.undefined)
    
    inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAutoclose(value: Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    inline def setBeforeDone(value: Callback): Self = StObject.set(x, "beforeDone", value.toJsFn)
    
    inline def setBeforeDoneUndefined: Self = StObject.set(x, "beforeDone", js.undefined)
    
    inline def setBeforeHide(value: Callback): Self = StObject.set(x, "beforeHide", value.toJsFn)
    
    inline def setBeforeHideUndefined: Self = StObject.set(x, "beforeHide", js.undefined)
    
    inline def setBeforeHourSelect(value: Callback): Self = StObject.set(x, "beforeHourSelect", value.toJsFn)
    
    inline def setBeforeHourSelectUndefined: Self = StObject.set(x, "beforeHourSelect", js.undefined)
    
    inline def setBeforeShow(value: Callback): Self = StObject.set(x, "beforeShow", value.toJsFn)
    
    inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDonetext(value: String): Self = StObject.set(x, "donetext", value.asInstanceOf[js.Any])
    
    inline def setDonetextUndefined: Self = StObject.set(x, "donetext", js.undefined)
    
    inline def setFromnow(value: Double): Self = StObject.set(x, "fromnow", value.asInstanceOf[js.Any])
    
    inline def setFromnowUndefined: Self = StObject.set(x, "fromnow", js.undefined)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setTwelvehour(value: Boolean): Self = StObject.set(x, "twelvehour", value.asInstanceOf[js.Any])
    
    inline def setTwelvehourUndefined: Self = StObject.set(x, "twelvehour", js.undefined)
    
    inline def setVibrate(value: Boolean): Self = StObject.set(x, "vibrate", value.asInstanceOf[js.Any])
    
    inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
  }
}
