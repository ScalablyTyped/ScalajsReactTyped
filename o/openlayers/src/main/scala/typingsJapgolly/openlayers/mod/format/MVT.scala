package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.olx.format.MVTOptions
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class MVT () extends Feature {
  def this(opt_options: MVTOptions) = this()
  
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: js.typedarray.ArrayBuffer): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * @inheritDoc
    * @api
    */
  def readFeatures(source: Document): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  
  def readProjection(source: String): Projection = js.native
  /**
    * @inheritDoc
    * @api
    */
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  
  /**
    * Sets the layers that features will be read from.
    * @param layers Layers.
    * @api
    */
  def setLayers(layers: js.Array[String]): Unit = js.native
}
