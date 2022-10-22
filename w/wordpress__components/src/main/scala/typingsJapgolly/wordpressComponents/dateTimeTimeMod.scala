package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.dateTimeTimeMod.TimePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeTimeMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/date-time/time", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TimePicker {
    
    trait Props extends StObject {
      
      /**
        * Date string to use as current time. If not set, current time is used.
        */
      var currentTime: js.UndefOr[String] = js.undefined
      
      /**
        * Whether we use a 12-hour clock. With a 12-hour clock, an AM/PM
        * widget is displayed and the time format is assumed to be MM-DD-YYYY.
        */
      var is12Hour: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Function to call when the time value changes.
        */
      def onChange(time: String): Unit
    }
    object Props {
      
      inline def apply(onChange: String => Callback): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: String) => onChange(t0).runNow()))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setCurrentTime(value: String): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
        
        inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
        
        inline def setIs12Hour(value: Boolean): Self = StObject.set(x, "is12Hour", value.asInstanceOf[js.Any])
        
        inline def setIs12HourUndefined: Self = StObject.set(x, "is12Hour", js.undefined)
        
        inline def setOnChange(value: String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
  }
}
