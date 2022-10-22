package typingsJapgolly.reactLeaflet.mod

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "Map")
@js.native
open class Map[P /* <: MapProps */, E /* <: Map_ */] protected () extends MapEvented[P, E] {
  def this(props: P) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: P, context: Any) = this()
  
  def bindContainer(): Unit = js.native
  def bindContainer(container: HTMLDivElement): Unit = js.native
  
  var className: js.UndefOr[String | Null] = js.native
  
  var container: js.UndefOr[HTMLDivElement | Null] = js.native
  
  var contextValue: js.UndefOr[LeafletContext | Null] = js.native
  
  def createLeafletElement(props: P): E = js.native
  
  def onViewportChange(): Unit = js.native
  
  def onViewportChanged(): Unit = js.native
  
  def shouldUpdateBounds(next: LatLngBoundsExpression, prev: LatLngBoundsExpression): Boolean = js.native
  
  def shouldUpdateCenter(next: LatLngExpression, prev: LatLngExpression): Boolean = js.native
  
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
  
  var viewport: Viewport = js.native
}
