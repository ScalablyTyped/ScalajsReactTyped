package typingsJapgolly.openlayers.mod.format

import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.format.IGCOptions
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for `*.igc` flight recording files.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.IGC")
@js.native
/**
  * @classdesc
  * Feature format for `*.igc` flight recording files.
  *
  * @param opt_options Options.
  * @api
  */
class IGC () extends TextFeature {
  def this(opt_options: IGCOptions) = this()
  def readFeature(source: String): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  /**
    * Read the feature from the IGC source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api
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
    * Read the feature from the source. As IGC sources contain a single
    * feature, this will return the feature in an array.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api
    */
  def readFeatures(source: Document_): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document_, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * Read the projection from the IGC source.
    *
    * @param source Source.
    * @return Projection.
    * @api
    */
  def readProjection(source: Document_): Projection = js.native
  def readProjection(source: Node): Projection = js.native
}

