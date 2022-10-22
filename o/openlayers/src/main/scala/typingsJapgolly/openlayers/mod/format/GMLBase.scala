package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.format.GMLOptions
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Feature base format for reading and writing data in the GML format.
  * This class cannot be instantiated, it contains only base content that
  * is shared with versioned format classes ol.format.GML2 and
  * ol.format.GML3.
  *
  * @param opt_options
  *     Optional configuration object.
  */
@JSImport("openlayers", "format.GMLBase")
@js.native
/**
  * @classdesc
  * Abstract base class; normally only used for creating subclasses and not
  * instantiated in apps.
  * Feature base format for reading and writing data in the GML format.
  * This class cannot be instantiated, it contains only base content that
  * is shared with versioned format classes ol.format.GML2 and
  * ol.format.GML3.
  *
  * @param opt_options
  *     Optional configuration object.
  */
open class GMLBase () extends XMLFeature {
  def this(opt_options: GMLOptions) = this()
  
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a GML FeatureCollection.
    *
    * @param source Source.
    * @param opt_options Options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
}
