package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.radioTypesMod.LabelPlacement
import typingsJapgolly.baseui.radioTypesMod.StyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledDescription {
  
  inline def apply[C /* <: ElementType */](
    $checked: Boolean,
    $disabled: Boolean,
    $error: Boolean,
    $hasDescription: Boolean,
    $isActive: Boolean,
    $isFocusVisible: Boolean,
    $isFocused: Boolean,
    $isHovered: Boolean,
    $labelPlacement: LabelPlacement,
    $required: Boolean,
    $value: String
  ): SharedBuilder_AsOverrideProps1125437709[C] = {
    val __props = js.Dynamic.literal($checked = $checked.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $hasDescription = $hasDescription.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isHovered = $isHovered.asInstanceOf[js.Any], $labelPlacement = $labelPlacement.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $value = $value.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps1125437709[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyleProps])]))
  }
  
  @JSImport("baseui/radio", "StyledDescription")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyleProps])): SharedBuilder_AsOverrideProps1125437709[C] = new SharedBuilder_AsOverrideProps1125437709[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
