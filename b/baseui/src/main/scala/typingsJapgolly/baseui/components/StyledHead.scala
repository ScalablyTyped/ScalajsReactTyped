package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.tableStyledComponentsMod.HorizontalStyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledHead {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps1905225938[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps1905225938[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, HorizontalStyleProps])]))
  }
  
  @JSImport("baseui/table", "StyledHead")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: StyledHead.type): SharedBuilder_AsOverrideProps1905225938[C] = new SharedBuilder_AsOverrideProps1905225938[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, HorizontalStyleProps])): SharedBuilder_AsOverrideProps1905225938[C] = new SharedBuilder_AsOverrideProps1905225938[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
