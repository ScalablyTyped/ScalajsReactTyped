package typingsJapgolly.reactDates.components

import typingsJapgolly.reactDates.esmComponentsDayPickerMod.defaultCls
import typingsJapgolly.reactDates.mod.DayPickerShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented, Support for combinations of intersection and union types not implemented */
object Default {
  
  def apply(p: DayPickerShape): typingsJapgolly.StBuildingComponent.Default[defaultCls] = new typingsJapgolly.StBuildingComponent.Default[defaultCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-dates/esm/components/DayPicker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Default.type): typingsJapgolly.StBuildingComponent.Default[defaultCls] = new typingsJapgolly.StBuildingComponent.Default[defaultCls](js.Array(this.component, js.Dictionary.empty))()
}
