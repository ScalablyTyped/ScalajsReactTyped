package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.drawerTypesMod.AnchorProp
import typingsJapgolly.baseui.drawerTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.drawerTypesMod.SizeProp
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledDrawerContainer {
  
  inline def apply[C /* <: ElementType */](
    $anchor: AnchorProp,
    $animating: Boolean,
    $closeable: Boolean,
    $isFocusVisible: Boolean,
    $isOpen: Boolean,
    $isVisible: Boolean,
    $showBackdrop: Boolean,
    $size: SizeProp
  ): SharedBuilder_AsOverrideProps_1832055675[C] = {
    val __props = js.Dynamic.literal($anchor = $anchor.asInstanceOf[js.Any], $animating = $animating.asInstanceOf[js.Any], $closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $showBackdrop = $showBackdrop.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_1832055675[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStylePropsArg])]))
  }
  
  @JSImport("baseui/drawer", "StyledDrawerContainer")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStylePropsArg])): SharedBuilder_AsOverrideProps_1832055675[C] = new SharedBuilder_AsOverrideProps_1832055675[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
