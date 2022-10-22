package typingsJapgolly.reactInputCalendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactInputCalendar {
  
  type ReactInputCalendar = Component[ReactInputCalendarProps & js.Object, js.Object]
  
  trait ReactInputCalendarProps extends StObject {
    
    /**
      * Define state when date picker would close once the user has clicked on a date.
      */
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Format of date for the onChange event. Default on the date format (ISO 8601) to ease the save of data.
      * Allowed Keys: All formats supported by moment.js
      * @default 'MM-DD-YYYY'
      */
    var computableFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Set initial date value
      * @default current date
      */
    var date: js.UndefOr[String | js.Date] = js.undefined
    
    /**
      * If true, the input field gets disabled and the icon next to it disappears.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Format of date, which display in input and set in date property.
      * Allowed Keys: All formats supported by moment.js
      * @default 'MM-DD-YYYY'
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Define the class name of the input field where the date picker represents its value.
      */
    var inputFieldClass: js.UndefOr[String] = js.undefined
    
    /**
      * Id that should be applied to the input field. Useful when using it with a label element.
      */
    var inputFieldId: js.UndefOr[String] = js.undefined
    
    /**
      * Set the selectable maximum date
      * @default null
      */
    var maxDate: js.UndefOr[String | js.Date] = js.undefined
    
    /**
      * Set the selectable minimum date
      * @default null
      */
    var minDate: js.UndefOr[String | js.Date] = js.undefined
    
    /**
      * Set minimal view. Values:
      * 0 - days
      * 1 - months
      * 2 - years.
      * @default 0 (DaysView)
      */
    var minView: js.UndefOr[Double] = js.undefined
    
    /**
      * Set a function that will be triggered the when input field is blurred. It will return the event and the date in the props.computableFormat format.
      */
    var onBlur: js.UndefOr[
        js.Function2[
          /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element], 
          /* computableDate */ String, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Set a function that will be triggered whenever there is a change in the selected date. It will return the date in the props.computableFormat format.
      */
    var onChange: js.UndefOr[js.Function1[/* computableDate */ String, Unit]] = js.undefined
    
    /**
      * Set a function that will be triggered when the input field is focused.
      */
    var onFocus: js.UndefOr[
        js.Function1[
          /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Setting this value to true makes the calendar widget open when the iput field is focused.
      */
    var openOnInputFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value to show in the input text box if no date is set.
      */
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object ReactInputCalendarProps {
    
    inline def apply(): ReactInputCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactInputCalendarProps]
    }
    
    extension [Self <: ReactInputCalendarProps](x: Self) {
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setComputableFormat(value: String): Self = StObject.set(x, "computableFormat", value.asInstanceOf[js.Any])
      
      inline def setComputableFormatUndefined: Self = StObject.set(x, "computableFormat", js.undefined)
      
      inline def setDate(value: String | js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInputFieldClass(value: String): Self = StObject.set(x, "inputFieldClass", value.asInstanceOf[js.Any])
      
      inline def setInputFieldClassUndefined: Self = StObject.set(x, "inputFieldClass", js.undefined)
      
      inline def setInputFieldId(value: String): Self = StObject.set(x, "inputFieldId", value.asInstanceOf[js.Any])
      
      inline def setInputFieldIdUndefined: Self = StObject.set(x, "inputFieldId", js.undefined)
      
      inline def setMaxDate(value: String | js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: String | js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinView(value: Double): Self = StObject.set(x, "minView", value.asInstanceOf[js.Any])
      
      inline def setMinViewUndefined: Self = StObject.set(x, "minView", js.undefined)
      
      inline def setOnBlur(
        value: (/* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element], /* computableDate */ String) => Callback
      ): Self = StObject.set(x, "onBlur", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element], t1: /* computableDate */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* computableDate */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* computableDate */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(
        value: /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element] => Callback
      ): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[(Component[ReactInputCalendarProps & js.Object, js.Object]) & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOpenOnInputFocus(value: Boolean): Self = StObject.set(x, "openOnInputFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnInputFocusUndefined: Self = StObject.set(x, "openOnInputFocus", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  trait ReactInputCalendarState extends StObject
}
