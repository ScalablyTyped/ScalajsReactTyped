package typingsJapgolly.openlayers.mod.format

import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.format.KMLOptions
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import typingsJapgolly.openlayers.mod.olx.format.WriteOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for reading and writing data in the KML format.
  *
  * Note that the KML format uses the URL() constructor. Older browsers such as IE
  * which do not support this will need a URL polyfill to be loaded before use.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.KML")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the KML format.
  *
  * Note that the KML format uses the URL() constructor. Older browsers such as IE
  * which do not support this will need a URL polyfill to be loaded before use.
  *
  * @param opt_options Options.
  * @api stable
  */
class KML () extends XMLFeature {
  def this(opt_options: KMLOptions) = this()
  def readFeature(source: String): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  /**
    * Read the first feature from a KML source. MultiGeometries are converted into
    * GeometryCollections if they are a mix of geometry types, and into MultiPoint/
    * MultiLineString/MultiPolygon if they are all of the same type.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api stable
    */
  def readFeature(source: Document_): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Document_, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Node): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Node, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a KML source. MultiGeometries are converted into
    * GeometryCollections if they are a mix of geometry types, and into MultiPoint/
    * MultiLineString/MultiPolygon if they are all of the same type.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document_): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document_, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readName(source: String): String = js.native
  /**
    * Read the name of the KML.
    *
    * @param source Souce.
    * @return Name.
    * @api stable
    */
  def readName(source: Document_): String = js.native
  def readName(source: Node): String = js.native
  def readNetworkLinks(source: String): js.Array[GlobalObject] = js.native
  /**
    * Read the network links of the KML.
    *
    * @param source Source.
    * @return Network links.
    * @api
    */
  def readNetworkLinks(source: Document_): js.Array[GlobalObject] = js.native
  def readNetworkLinks(source: Node): js.Array[GlobalObject] = js.native
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * Read the projection from a KML source.
    *
    * @param source Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(source: Document_): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  /**
    * Encode an array of features in the KML format. GeometryCollections, MultiPoints,
    * MultiLineStrings, and MultiPolygons are output as MultiGeometries.
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Result.
    * @api stable
    */
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  /**
    * Encode an array of features in the KML format as an XML node. GeometryCollections,
    * MultiPoints, MultiLineStrings, and MultiPolygons are output as MultiGeometries.
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Node.
    * @api
    */
  def writeFeaturesNode(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): org.scalajs.dom.raw.Node = js.native
  def writeFeaturesNode(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): org.scalajs.dom.raw.Node = js.native
}

