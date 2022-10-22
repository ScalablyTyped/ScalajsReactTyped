package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.dateTimeDateMod.DatePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeMod {
  
  @JSImport("@wordpress/components/date-time", "DatePicker")
  @js.native
  val DatePicker: ComponentType[Props] = js.native
  
  object DateTimePicker extends Shortcut {
    
    @JSImport("@wordpress/components/date-time", "DateTimePicker")
    @js.native
    val ^ : ComponentType[typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props] = js.native
    
    /* Inlined std.Omit<@wordpress/components.@wordpress/components/date-time/date.default.Props, 'isInvalidDate'> */
    trait Props extends StObject {
      
      var currentDate: js.UndefOr[String] = js.undefined
      
      var is12Hour: js.UndefOr[Boolean] = js.undefined
      
      var onChange: js.Function1[/* currentDate */ String, Unit]
    }
    object Props {
      
      inline def apply(onChange: /* currentDate */ String => Callback): typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: /* currentDate */ String) => onChange(t0).runNow()))
        __obj.asInstanceOf[typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props]
      }
      
      extension [Self <: typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props](x: Self) {
        
        inline def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
        
        inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
        
        inline def setIs12Hour(value: Boolean): Self = StObject.set(x, "is12Hour", value.asInstanceOf[js.Any])
        
        inline def setIs12HourUndefined: Self = StObject.set(x, "is12Hour", js.undefined)
        
        inline def setOnChange(value: /* currentDate */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* currentDate */ String) => value(t0).runNow()))
      }
    }
    
    type _To = ComponentType[typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props]
    
    /* This means you don't have to write `^`, but can instead just say `DateTimePicker.foo` */
    override def _to: ComponentType[typingsJapgolly.wordpressComponents.dateTimeMod.DateTimePicker.Props] = ^
  }
  
  @JSImport("@wordpress/components/date-time", "TimePicker")
  @js.native
  val TimePicker: ComponentType[typingsJapgolly.wordpressComponents.dateTimeTimeMod.TimePicker.Props] = js.native
}
