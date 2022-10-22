package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.inputTypesMod.Adjoined
import typingsJapgolly.baseui.inputTypesMod.SharedProps
import typingsJapgolly.baseui.inputTypesMod.Size
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputEnhancer {
  
  inline def apply[C /* <: ElementType */]($adjoined: Adjoined, $size: Size): SharedBuilder_AsOverrideProps1490998973[C] = {
    val __props = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps1490998973[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedProps])]))
  }
  
  @JSImport("baseui/input/styled-components", "InputEnhancer")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedProps])): SharedBuilder_AsOverrideProps1490998973[C] = new SharedBuilder_AsOverrideProps1490998973[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
