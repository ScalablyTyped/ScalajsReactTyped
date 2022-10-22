package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.buttonTypesMod.SharedStyleProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadingSpinner {
  
  inline def apply[C /* <: ElementType */](): SharedBuilder_AsOverrideProps_1651054587[C] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_AsOverrideProps_1651054587[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStyleProps])]))
  }
  
  @JSImport("baseui/button/styled-components", "LoadingSpinner")
  @js.native
  val component: js.Object = js.native
  
  implicit def make[C /* <: ElementType */](companion: LoadingSpinner.type): SharedBuilder_AsOverrideProps_1651054587[C] = new SharedBuilder_AsOverrideProps_1651054587[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStyleProps])): SharedBuilder_AsOverrideProps_1651054587[C] = new SharedBuilder_AsOverrideProps_1651054587[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
