package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.anon.Round
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledInnerXSmallAnchor {
  
  inline def apply[C /* <: ElementType */]($color: String, $round: Boolean, $size: Double): SharedBuilder_AsOverrideProps1446851027[C] = {
    val __props = js.Dynamic.literal($color = $color.asInstanceOf[js.Any], $round = $round.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps1446851027[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, Round])]))
  }
  
  @JSImport("baseui/map-marker/styled-components", "StyledInnerXSmallAnchor")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, Round])): SharedBuilder_AsOverrideProps1446851027[C] = new SharedBuilder_AsOverrideProps1446851027[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
