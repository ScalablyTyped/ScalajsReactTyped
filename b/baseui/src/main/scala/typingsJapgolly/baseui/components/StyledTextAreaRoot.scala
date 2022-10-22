package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.baseuiStrings.both
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.textareaTypesMod.SharedStyleProps
import typingsJapgolly.baseui.textareaTypesMod.Size
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledTextAreaRoot {
  
  inline def apply[C /* <: ElementType */]($adjoined: /* keyof baseui.anon.Both */ none | left | right | both, $size: Size): SharedBuilder_AsOverrideProps66669616[C] = {
    val __props = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps66669616[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, SharedStyleProps])]))
  }
  
  @JSImport("baseui/textarea/styled-components", "StyledTextAreaRoot")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, SharedStyleProps])): SharedBuilder_AsOverrideProps66669616[C] = new SharedBuilder_AsOverrideProps66669616[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
