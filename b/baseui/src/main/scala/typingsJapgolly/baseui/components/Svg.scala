package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.iconTypesMod.StyledComponentArgs
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Svg {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps_1536238557[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps_1536238557[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyledComponentArgs])]))
  }
  
  @JSImport("baseui/icon/styled-components", "Svg")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: Svg.type): SharedBuilder_AsOverrideProps_1536238557[C] = new SharedBuilder_AsOverrideProps_1536238557[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyledComponentArgs])): SharedBuilder_AsOverrideProps_1536238557[C] = new SharedBuilder_AsOverrideProps_1536238557[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
