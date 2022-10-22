package typingsJapgolly.reactLeaflet.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.reactLeaflet.mod.LeafletContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LeafletConsumer {
  
  inline def apply(children: LeafletContext => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[LeafletContext]]))
  }
  
  @JSImport("react-leaflet", "LeafletConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[LeafletContext]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
