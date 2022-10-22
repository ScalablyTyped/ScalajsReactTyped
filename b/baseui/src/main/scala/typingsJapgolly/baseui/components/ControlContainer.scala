package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.formControlTypesMod.StyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ControlContainer {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps1880065505[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps1880065505[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyleProps])]))
  }
  
  @JSImport("baseui/form-control/styled-components", "ControlContainer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: ControlContainer.type): SharedBuilder_AsOverrideProps1880065505[C] = new SharedBuilder_AsOverrideProps1880065505[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyleProps])): SharedBuilder_AsOverrideProps1880065505[C] = new SharedBuilder_AsOverrideProps1880065505[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
