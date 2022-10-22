package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCalendarCalendarDotdriverMod.CalendarDriver
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotdriverMod.DropdownLayoutDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelCalendarPanelDotdriverMod {
  
  trait CalendarPanelDriver
    extends StObject
       with BaseDriver {
    
    def calendarDriver(): CalendarDriver
    
    def isDropdownExists(): Boolean
    
    def presetsDropdownLayoutDriver(): DropdownLayoutDriver
  }
  object CalendarPanelDriver {
    
    inline def apply(
      calendarDriver: CallbackTo[CalendarDriver],
      exists: CallbackTo[Boolean],
      isDropdownExists: CallbackTo[Boolean],
      presetsDropdownLayoutDriver: CallbackTo[DropdownLayoutDriver]
    ): CalendarPanelDriver = {
      val __obj = js.Dynamic.literal(calendarDriver = calendarDriver.toJsFn, exists = exists.toJsFn, isDropdownExists = isDropdownExists.toJsFn, presetsDropdownLayoutDriver = presetsDropdownLayoutDriver.toJsFn)
      __obj.asInstanceOf[CalendarPanelDriver]
    }
    
    extension [Self <: CalendarPanelDriver](x: Self) {
      
      inline def setCalendarDriver(value: CallbackTo[CalendarDriver]): Self = StObject.set(x, "calendarDriver", value.toJsFn)
      
      inline def setIsDropdownExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDropdownExists", value.toJsFn)
      
      inline def setPresetsDropdownLayoutDriver(value: CallbackTo[DropdownLayoutDriver]): Self = StObject.set(x, "presetsDropdownLayoutDriver", value.toJsFn)
    }
  }
}
