package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.datepickerTypesMod.Density
import typingsJapgolly.baseui.datepickerTypesMod.SharedStyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledCalendarContainer {
  
  inline def apply[C /* <: ElementType */]($date: Any, $density: Density, $hasLockedBehavior: Boolean, $value: js.Date | js.Array[js.Date]): SharedBuilder_AsOverrideProps604325982[C] = {
    val __props = js.Dynamic.literal($date = $date.asInstanceOf[js.Any], $density = $density.asInstanceOf[js.Any], $hasLockedBehavior = $hasLockedBehavior.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps604325982[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStyleProps])]))
  }
  
  @JSImport("baseui/datepicker", "StyledCalendarContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStyleProps])): SharedBuilder_AsOverrideProps604325982[C] = new SharedBuilder_AsOverrideProps604325982[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
