package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.Exists
import typingsJapgolly.wixStyleReact.distTypesCalendarCalendarDotuniDotdriverMod.CalendarUniDriver
import typingsJapgolly.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDatePickerDatePickerDotuniDotdriverMod {
  
  trait DatePickerUniDriver
    extends StObject
       with BaseUniDriver {
    
    var calendarDriver: CalendarUniDriver
    
    var driver: Exists
    
    var inputDriver: InputUniDriver
  }
  object DatePickerUniDriver {
    
    inline def apply(
      calendarDriver: CalendarUniDriver,
      click: CallbackTo[js.Promise[Unit]],
      driver: Exists,
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      inputDriver: InputUniDriver
    ): DatePickerUniDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = calendarDriver.asInstanceOf[js.Any], click = click.toJsFn, driver = driver.asInstanceOf[js.Any], element = element.toJsFn, exists = exists.toJsFn, inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerUniDriver]
    }
    
    extension [Self <: DatePickerUniDriver](x: Self) {
      
      inline def setCalendarDriver(value: CalendarUniDriver): Self = StObject.set(x, "calendarDriver", value.asInstanceOf[js.Any])
      
      inline def setDriver(value: Exists): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputUniDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
