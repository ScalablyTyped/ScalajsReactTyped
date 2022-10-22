package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.IsFocusVisible
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledUserMenuButton {
  
  inline def apply[C /* <: ElementType */]($isFocusVisible: Boolean): SharedBuilder_AsOverrideProps_683311694[C] = {
    val __props = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_683311694[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, IsFocusVisible])]))
  }
  
  @JSImport("baseui/app-nav-bar", "StyledUserMenuButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, IsFocusVisible])): SharedBuilder_AsOverrideProps_683311694[C] = new SharedBuilder_AsOverrideProps_683311694[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
