package typingsJapgolly.openlayers.global.ol

import typingsJapgolly.openlayers.mod.olx.AttributionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Attribution")
@js.native
open class Attribution protected ()
  extends typingsJapgolly.openlayers.mod.Attribution {
  /**
    * @classdesc
    * An attribution for a layer source.
    *
    * Example:
    *
    *     source: new ol.source.OSM({
    *       attributions: [
    *         new ol.Attribution({
    *           html: 'All maps &copy; ' +
    *               '<a href="http://www.opencyclemap.org/">OpenCycleMap</a>'
    *         }),
    *         ol.source.OSM.ATTRIBUTION
    *       ],
    *     ..
    *
    * @param options Attribution options.
    * @struct
    * @api stable
    */
  def this(options: AttributionOptions) = this()
}
