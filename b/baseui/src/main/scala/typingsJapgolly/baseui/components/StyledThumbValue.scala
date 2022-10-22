package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.sliderTypesMod.StyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledThumbValue {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps_1995238606[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps_1995238606[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyleProps])]))
  }
  
  @JSImport("baseui/slider", "StyledThumbValue")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: StyledThumbValue.type): SharedBuilder_AsOverrideProps_1995238606[C] = new SharedBuilder_AsOverrideProps_1995238606[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyleProps])): SharedBuilder_AsOverrideProps_1995238606[C] = new SharedBuilder_AsOverrideProps_1995238606[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
