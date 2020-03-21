package typingsJapgolly.openlayers.mod.format

import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.format.MVTOptions
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Feature format for reading data in the Mapbox MVT format.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.MVT")
@js.native
/**
  * @classdesc
  * Feature format for reading data in the Mapbox MVT format.
  *
  * @param opt_options Options.
  * @api
  */
class MVT () extends Feature {
  def this(opt_options: MVTOptions) = this()
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: ArrayBuffer): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * @inheritDoc
    * @api
    */
  def readFeatures(source: Document_): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document_, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readProjection(source: String): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  /**
    * @inheritDoc
    * @api
    */
  def readProjection(source: Document_): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  /**
    * Sets the layers that features will be read from.
    * @param layers Layers.
    * @api
    */
  def setLayers(layers: js.Array[String]): Unit = js.native
}

