package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.listTypesMod.StyledHeadingHeadingProps
import typingsJapgolly.styletronReact.anon.As
import typingsJapgolly.styletronReact.libTypesMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledHeadingMainHeading {
  
  inline def apply[C /* <: ElementType */]($maxLines: Double): SharedBuilder_AsOverrideProps1697069957[C] = {
    val __props = js.Dynamic.literal($maxLines = $maxLines.asInstanceOf[js.Any])
    new SharedBuilder_AsOverrideProps1697069957[C](js.Array(this.component, __props.asInstanceOf[As[C] & (OverrideProps[C, StyledHeadingHeadingProps])]))
  }
  
  @JSImport("baseui/list", "StyledHeadingMainHeading")
  @js.native
  val component: js.Object = js.native
  
  def withProps[C /* <: ElementType */](p: As[C] & (OverrideProps[C, StyledHeadingHeadingProps])): SharedBuilder_AsOverrideProps1697069957[C] = new SharedBuilder_AsOverrideProps1697069957[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
