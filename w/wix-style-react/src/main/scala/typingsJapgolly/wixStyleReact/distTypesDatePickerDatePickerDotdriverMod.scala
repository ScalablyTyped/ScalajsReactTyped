package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.ClickOutside
import typingsJapgolly.wixStyleReact.distTypesCalendarCalendarDotdriverMod.CalendarDriver
import typingsJapgolly.wixStyleReact.distTypesInputInputDotdriverMod.InputDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDatePickerDatePickerDotdriverMod {
  
  trait DatePickerDriver
    extends StObject
       with BaseDriver {
    
    var calendarDriver: CalendarDriver
    
    var driver: ClickOutside
    
    var inputDriver: InputDriver
  }
  object DatePickerDriver {
    
    inline def apply(
      calendarDriver: CalendarDriver,
      driver: ClickOutside,
      exists: CallbackTo[Boolean],
      inputDriver: InputDriver
    ): DatePickerDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = calendarDriver.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any], exists = exists.toJsFn, inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerDriver]
    }
    
    extension [Self <: DatePickerDriver](x: Self) {
      
      inline def setCalendarDriver(value: CalendarDriver): Self = StObject.set(x, "calendarDriver", value.asInstanceOf[js.Any])
      
      inline def setDriver(value: ClickOutside): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
