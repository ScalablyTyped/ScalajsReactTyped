package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.format.TopoJSONOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading data in the TopoJSON format.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.TopoJSON")
@js.native
/**
  * @classdesc
  * Feature format for reading data in the TopoJSON format.
  *
  * @param opt_options Options.
  * @api stable
  */
open class TopoJSON () extends JSONFeature {
  def this(opt_options: TopoJSONOptions) = this()
  
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a TopoJSON source.
    *
    * @param source Source.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  
  def readProjection(`object`: String): Projection = js.native
  /**
    * Read the projection from a TopoJSON source.
    *
    * @param object Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(`object`: Document): Projection = js.native
  def readProjection(`object`: Node): Projection = js.native
  def readProjection(`object`: GlobalObject): Projection = js.native
}
