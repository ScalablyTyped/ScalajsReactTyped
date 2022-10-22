package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.selectTypesMod.SharedStylePropsArg
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledPlaceholder {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps_1754443696[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps_1754443696[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStylePropsArg])]))
  }
  
  @JSImport("baseui/select", "StyledPlaceholder")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: StyledPlaceholder.type): SharedBuilder_AsOverrideProps_1754443696[C] = new SharedBuilder_AsOverrideProps_1754443696[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStylePropsArg])): SharedBuilder_AsOverrideProps_1754443696[C] = new SharedBuilder_AsOverrideProps_1754443696[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
