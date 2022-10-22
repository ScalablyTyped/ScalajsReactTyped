package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.bannerTypesMod.ActionPosition
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledMessageContent {
  
  inline def apply[C /* <: ElementType */]($actionPosition: ActionPosition): SharedBuilder_AsOverrideProps292923048[C] = {
    val __props = js.Dynamic.literal($actionPosition = $actionPosition.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps292923048[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, typingsJapgolly.baseui.anon.ActionPosition])]))
  }
  
  @JSImport("baseui/banner", "StyledMessageContent")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, typingsJapgolly.baseui.anon.ActionPosition])): SharedBuilder_AsOverrideProps292923048[C] = new SharedBuilder_AsOverrideProps292923048[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
