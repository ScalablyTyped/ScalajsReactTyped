package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.BackgroundRound
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledOuterXSmallAnchor {
  
  inline def apply[C /* <: ElementType */]($background: String, $round: Boolean, $size: Double): SharedBuilder_AsOverrideProps68770852[C] = {
    val __props = js.Dynamic.literal($background = $background.asInstanceOf[js.Any], $round = $round.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps68770852[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, BackgroundRound])]))
  }
  
  @JSImport("baseui/map-marker/styled-components", "StyledOuterXSmallAnchor")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, BackgroundRound])): SharedBuilder_AsOverrideProps68770852[C] = new SharedBuilder_AsOverrideProps68770852[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
