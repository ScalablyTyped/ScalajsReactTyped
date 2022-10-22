package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.layerTypesMod.TetherPlacement
import typingsJapgolly.baseui.popoverTypesMod.Offset
import typingsJapgolly.baseui.popoverTypesMod.SharedStylePropsArg
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Inner {
  
  inline def apply[C /* <: ElementType */](
    $animationDuration: Double,
    $arrowOffset: Offset,
    $isAnimating: Boolean,
    $isHoverTrigger: Boolean,
    $isOpen: Boolean,
    $placement: TetherPlacement,
    $popoverMargin: Double,
    $popoverOffset: Offset,
    $showArrow: Boolean
  ): SharedBuilder_AsOverrideProps686217960[C] = {
    val __props = js.Dynamic.literal($animationDuration = $animationDuration.asInstanceOf[js.Any], $arrowOffset = $arrowOffset.asInstanceOf[js.Any], $isAnimating = $isAnimating.asInstanceOf[js.Any], $isHoverTrigger = $isHoverTrigger.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $placement = $placement.asInstanceOf[js.Any], $popoverMargin = $popoverMargin.asInstanceOf[js.Any], $popoverOffset = $popoverOffset.asInstanceOf[js.Any], $showArrow = $showArrow.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps686217960[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStylePropsArg])]))
  }
  
  @JSImport("baseui/tooltip/styled-components", "Inner")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStylePropsArg])): SharedBuilder_AsOverrideProps686217960[C] = new SharedBuilder_AsOverrideProps686217960[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
