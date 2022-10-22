package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCalendarCalendarDotuniDotdriverMod.CalendarUniDriver
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelCalendarPanelDotuniDotdriverMod {
  
  trait CalendarPanelUniDriver
    extends StObject
       with BaseUniDriver {
    
    def calendarDriver(): js.Promise[CalendarUniDriver]
    
    def isDropdownExists(): js.Promise[Boolean]
    
    def presetsDropdownLayoutDriver(): DropdownLayoutUniDriver
  }
  object CalendarPanelUniDriver {
    
    inline def apply(
      calendarDriver: CallbackTo[js.Promise[CalendarUniDriver]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isDropdownExists: CallbackTo[js.Promise[Boolean]],
      presetsDropdownLayoutDriver: CallbackTo[DropdownLayoutUniDriver]
    ): CalendarPanelUniDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = calendarDriver.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isDropdownExists = isDropdownExists.toJsFn, presetsDropdownLayoutDriver = presetsDropdownLayoutDriver.toJsFn)
      __obj.asInstanceOf[CalendarPanelUniDriver]
    }
    
    extension [Self <: CalendarPanelUniDriver](x: Self) {
      
      inline def setCalendarDriver(value: CallbackTo[js.Promise[CalendarUniDriver]]): Self = StObject.set(x, "calendarDriver", value.toJsFn)
      
      inline def setIsDropdownExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDropdownExists", value.toJsFn)
      
      inline def setPresetsDropdownLayoutDriver(value: CallbackTo[DropdownLayoutUniDriver]): Self = StObject.set(x, "presetsDropdownLayoutDriver", value.toJsFn)
    }
  }
}
