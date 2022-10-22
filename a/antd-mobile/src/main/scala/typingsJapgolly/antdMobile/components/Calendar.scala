package typingsJapgolly.antdMobile.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsCalendarCalendarMod.CalendarProps
import typingsJapgolly.antdMobile.esComponentsCalendarCalendarMod.CalendarRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Calendar {
  
  def apply(p: CalendarProps & RefAttributes[CalendarRef]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("antd-mobile", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Calendar.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
