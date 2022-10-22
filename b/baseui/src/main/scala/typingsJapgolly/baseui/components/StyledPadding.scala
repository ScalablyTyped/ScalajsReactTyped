package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledPadding {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps1154346082[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps1154346082[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, js.Object])]))
  }
  
  @JSImport("baseui/popover", "StyledPadding")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: StyledPadding.type): SharedBuilder_AsOverrideProps1154346082[C] = new SharedBuilder_AsOverrideProps1154346082[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, js.Object])): SharedBuilder_AsOverrideProps1154346082[C] = new SharedBuilder_AsOverrideProps1154346082[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
