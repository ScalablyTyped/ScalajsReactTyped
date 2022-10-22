package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.accordionTypesMod.SharedStylePropsArg
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  inline def apply[C /* <: ElementType */]($isFocusVisible: Boolean): SharedBuilder_AsOverrideProps_150591286[C] = {
    val __props = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps_150591286[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStylePropsArg])]))
  }
  
  @JSImport("baseui/accordion/styled-components", "Header")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStylePropsArg])): SharedBuilder_AsOverrideProps_150591286[C] = new SharedBuilder_AsOverrideProps_150591286[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
