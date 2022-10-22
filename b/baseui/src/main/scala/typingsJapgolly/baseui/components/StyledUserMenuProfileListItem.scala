package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.Disabled
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledUserMenuProfileListItem {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps_465345146[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps_465345146[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, Disabled])]))
  }
  
  @JSImport("baseui/app-nav-bar", "StyledUserMenuProfileListItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: StyledUserMenuProfileListItem.type): SharedBuilder_AsOverrideProps_465345146[C] = new SharedBuilder_AsOverrideProps_465345146[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, Disabled])): SharedBuilder_AsOverrideProps_465345146[C] = new SharedBuilder_AsOverrideProps_465345146[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
