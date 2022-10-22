package typingsJapgolly.antdMobile

import typingsJapgolly.antdMobile.esComponentsCalendarConvertMod.Page
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCalendarCalendarMod {
  
  @JSImport("antd-mobile/es/components/calendar/calendar", "Calendar")
  @js.native
  val Calendar: ForwardRefExoticComponent[CalendarProps & RefAttributes[CalendarRef]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antdMobile.anon.selectionModeundefinedval
    - typingsJapgolly.antdMobile.anon.selectionModesinglevalueD
    - typingsJapgolly.antdMobile.anon.selectionModerangevalueDa
  */
  trait CalendarProps extends StObject
  object CalendarProps {
    
    inline def selectionModerangevalueDa(): typingsJapgolly.antdMobile.anon.selectionModerangevalueDa = {
      val __obj = js.Dynamic.literal(selectionMode = "range")
      __obj.asInstanceOf[typingsJapgolly.antdMobile.anon.selectionModerangevalueDa]
    }
    
    inline def selectionModesinglevalueD(): typingsJapgolly.antdMobile.anon.selectionModesinglevalueD = {
      val __obj = js.Dynamic.literal(selectionMode = "single")
      __obj.asInstanceOf[typingsJapgolly.antdMobile.anon.selectionModesinglevalueD]
    }
    
    inline def selectionModeundefinedval(defaultValue: Unit, onChange: Unit, selectionMode: Unit, value: Unit): typingsJapgolly.antdMobile.anon.selectionModeundefinedval = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.antdMobile.anon.selectionModeundefinedval]
    }
  }
  
  @js.native
  trait CalendarRef extends StObject {
    
    def jumpTo(page: js.Function1[/* page */ Page, Page]): Unit = js.native
    def jumpTo(page: Page): Unit = js.native
    
    def jumpToToday(): Unit = js.native
  }
}
