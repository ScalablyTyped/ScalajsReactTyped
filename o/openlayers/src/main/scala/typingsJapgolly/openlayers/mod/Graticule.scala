package typingsJapgolly.openlayers.mod

import typingsJapgolly.openlayers.mod.geom.LineString
import typingsJapgolly.openlayers.mod.olx.GraticuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "Graticule")
@js.native
/**
  * Render a grid for a coordinate system on a map.
  * @param opt_options Options.
  * @api
  */
open class Graticule () extends StObject {
  def this(opt_options: GraticuleOptions) = this()
  
  /**
    * Get the map associated with this graticule.
    * @return The map.
    * @api
    */
  def getMap(): Map = js.native
  
  /**
    * Get the list of meridians.  Meridians are lines of equal longitude.
    * @return The meridians.
    * @api
    */
  def getMeridians(): js.Array[LineString] = js.native
  
  /**
    * Get the list of parallels.  Pallels are lines of equal latitude.
    * @return The parallels.
    * @api
    */
  def getParallels(): js.Array[LineString] = js.native
  
  /**
    * Set the map for this graticule.  The graticule will be rendered on the
    * provided map.
    * @param map Map.
    * @api
    */
  def setMap(map: Map): Unit = js.native
}
