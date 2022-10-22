package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerOptions
  extends StObject
     with AllEditorOptions {
  
  var animation: js.UndefOr[Boolean | TimePickerAnimation] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ TimePickerChangeEvent, Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ TimePickerCloseEvent, Unit]] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var dateInput: js.UndefOr[Boolean] = js.undefined
  
  var dates: js.UndefOr[Any] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ TimePickerOpenEvent, Unit]] = js.undefined
  
  var parseFormats: js.UndefOr[Any] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[js.Date] = js.undefined
}
object TimePickerOptions {
  
  inline def apply(): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerOptions]
  }
  
  extension [Self <: TimePickerOptions](x: Self) {
    
    inline def setAnimation(value: Boolean | TimePickerAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setChange(value: /* e */ TimePickerChangeEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ TimePickerChangeEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClose(value: /* e */ TimePickerCloseEvent => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: /* e */ TimePickerCloseEvent) => value(t0).runNow()))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDateInput(value: Boolean): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
    
    inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
    
    inline def setDates(value: Any): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesUndefined: Self = StObject.set(x, "dates", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ TimePickerOpenEvent => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: /* e */ TimePickerOpenEvent) => value(t0).runNow()))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setParseFormats(value: Any): Self = StObject.set(x, "parseFormats", value.asInstanceOf[js.Any])
    
    inline def setParseFormatsUndefined: Self = StObject.set(x, "parseFormats", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
