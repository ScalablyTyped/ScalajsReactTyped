package typingsJapgolly.reactD3Graph.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from scala.Any because couldn't resolve ClassTree. */
object Link {
  
  def apply(p: Any): Default[typingsJapgolly.reactD3Graph.mod.Link] = new Default[typingsJapgolly.reactD3Graph.mod.Link](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-d3-graph", "Link")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Link.type): Default[typingsJapgolly.reactD3Graph.mod.Link] = new Default[typingsJapgolly.reactD3Graph.mod.Link](js.Array(this.component, js.Dictionary.empty))()
}
