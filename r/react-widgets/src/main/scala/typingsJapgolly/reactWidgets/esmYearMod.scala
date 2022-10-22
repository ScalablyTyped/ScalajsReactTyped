package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLTableElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWidgets.esmCalendarViewMod.CalendarViewProps
import typingsJapgolly.reactWidgets.esmLocalizationMod.Localizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmYearMod {
  
  @JSImport("react-widgets/esm/Year", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasFocusedItemDisabledOnChangeValueMinLocalizerMaxProps: YearProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasFocusedItemDisabledOnChangeValueMinLocalizerMaxProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait YearProps
    extends StObject
       with CalendarViewProps {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var localizer: Localizer[Any, Any]
    
    var max: js.Date
    
    var min: js.Date
    
    def onChange(nextDate: js.Date): Unit
    
    var value: js.UndefOr[js.Date | Null] = js.undefined
  }
  object YearProps {
    
    inline def apply(
      `aria-labelledby`: String,
      focusedItem: js.Date,
      id: String,
      localizer: Localizer[Any, Any],
      max: js.Date,
      min: js.Date,
      onChange: js.Date => Callback,
      onKeyDown: ReactKeyboardEventFrom[HTMLTableElement & org.scalajs.dom.Element] => Callback
    ): YearProps = {
      val __obj = js.Dynamic.literal(focusedItem = focusedItem.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: js.Date) => onChange(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTableElement & org.scalajs.dom.Element]) => onKeyDown(t0).runNow()))
      __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearProps]
    }
    
    extension [Self <: YearProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLocalizer(value: Localizer[Any, Any]): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: js.Date => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: js.Date) => value(t0).runNow()))
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
