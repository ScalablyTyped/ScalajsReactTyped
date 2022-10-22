package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.modalTypesMod.RoleProp
import typingsJapgolly.baseui.modalTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.modalTypesMod.SizeProp
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledClose {
  
  inline def apply[C /* <: ElementType */](
    $animate: Boolean,
    $closeable: Boolean,
    $isFocusVisible: Boolean,
    $isOpen: Boolean,
    $isVisible: Boolean,
    $role: RoleProp,
    $size: SizeProp
  ): SharedBuilder_AsOverrideProps_1562401161[C] = {
    val __props = js.Dynamic.literal($animate = $animate.asInstanceOf[js.Any], $closeable = $closeable.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $role = $role.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_1562401161[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStylePropsArg])]))
  }
  
  @JSImport("baseui/modal", "StyledClose")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStylePropsArg])): SharedBuilder_AsOverrideProps_1562401161[C] = new SharedBuilder_AsOverrideProps_1562401161[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
