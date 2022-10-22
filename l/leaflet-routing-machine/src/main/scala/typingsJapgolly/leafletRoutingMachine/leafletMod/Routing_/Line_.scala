package typingsJapgolly.leafletRoutingMachine.leafletMod.Routing_

import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Line")
@js.native
open class Line_ protected () extends LayerGroup_[Any] {
  def this(route: IRoute) = this()
  def this(route: IRoute, options: LineOptions) = this()
  
  def getBounds(): LatLngBounds_ = js.native
}
