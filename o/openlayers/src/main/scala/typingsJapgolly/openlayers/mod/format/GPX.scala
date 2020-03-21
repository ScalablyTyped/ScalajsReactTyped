package typingsJapgolly.openlayers.mod.format

import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.format.GPXOptions
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
  * Feature format for reading and writing data in the GPX format.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.GPX")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the GPX format.
  *
  * @param opt_options Options.
  * @api stable
  */
class GPX () extends XMLFeature {
  def this(opt_options: GPXOptions) = this()
  def readFeature(source: String): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  /**
    * Read the first feature from a GPX source.
    * Routes (`<rte>`) are converted into LineString geometries, and tracks (`<trk>`)
    * into MultiLineString. Any properties on route and track waypoints are ignored.
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
    * Read all features from a GPX source.
    * Routes (`<rte>`) are converted into LineString geometries, and tracks (`<trk>`)
    * into MultiLineString. Any properties on route and track waypoints are ignored.
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
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * Read the projection from a GPX source.
    *
    * @param source Source.
    * @return Projection.
    * @api stable
    */
  def readProjection(source: Document_): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  /**
    * Encode an array of features in the GPX format.
    * LineString geometries are output as routes (`<rte>`), and MultiLineString
    * as tracks (`<trk>`).
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return Result.
    * @api stable
    */
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  /**
    * Encode an array of features in the GPX format as an XML node.
    * LineString geometries are output as routes (`<rte>`), and MultiLineString
    * as tracks (`<trk>`).
    *
    * @param features Features.
    * @param opt_options Options.
    * @return Node.
    * @api
    */
  def writeFeaturesNode(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): org.scalajs.dom.raw.Node = js.native
  def writeFeaturesNode(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): org.scalajs.dom.raw.Node = js.native
}

