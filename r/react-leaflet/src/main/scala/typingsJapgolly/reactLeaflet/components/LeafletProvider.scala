package typingsJapgolly.reactLeaflet.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactLeaflet.mod.LeafletContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LeafletProvider {
  
  inline def apply(value: LeafletContext): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[LeafletContext]]))
  }
  
  @JSImport("react-leaflet", "LeafletProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[LeafletContext]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
