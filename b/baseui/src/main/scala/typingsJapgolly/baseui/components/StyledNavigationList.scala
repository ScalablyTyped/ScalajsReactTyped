package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.Align
import typingsJapgolly.baseui.baseuiStrings.`flex-end`
import typingsJapgolly.baseui.baseuiStrings.`flex-start`
import typingsJapgolly.baseui.baseuiStrings.center
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledNavigationList {
  
  inline def apply[C /* <: ElementType */]($align: `flex-end` | `flex-start` | center): SharedBuilder_AsOverrideProps869822303[C] = {
    val __props = js.Dynamic.literal($align = $align.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps869822303[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, Align])]))
  }
  
  @JSImport("baseui/header-navigation", "StyledNavigationList")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, Align])): SharedBuilder_AsOverrideProps869822303[C] = new SharedBuilder_AsOverrideProps869822303[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
