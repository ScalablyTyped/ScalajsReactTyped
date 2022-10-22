package typingsJapgolly.reactScrollableAnchor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactScrollableAnchor.mod.ScrollableAnchorProps
import typingsJapgolly.reactScrollableAnchor.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactScrollableAnchor {
  
  inline def apply(id: String): Default[default] = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[ScrollableAnchorProps]))
  }
  
  @JSImport("react-scrollable-anchor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ScrollableAnchorProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
