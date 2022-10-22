package typingsJapgolly.reachWindowSize.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reachWindowSize.anon.Height
import typingsJapgolly.reachWindowSize.mod.WindowSizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowSize {
  
  inline def apply(children: Height => Element): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[WindowSizeProps]))
  }
  
  @JSImport("@reach/window-size", "WindowSize")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: WindowSizeProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
