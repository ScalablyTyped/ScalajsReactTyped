package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.geom.Geometry
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import typingsJapgolly.openlayers.mod.olx.format.WKTOptions
import typingsJapgolly.openlayers.mod.olx.format.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Geometry format for reading and writing data in the `WellKnownText` (WKT)
  * format.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSImport("openlayers", "format.WKT")
@js.native
/**
  * @classdesc
  * Geometry format for reading and writing data in the `WellKnownText` (WKT)
  * format.
  *
  * @param opt_options Options.
  * @api stable
  */
open class WKT () extends TextFeature {
  def this(opt_options: WKTOptions) = this()
  
  def readFeature(source: String): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  /**
    * Read a feature from a WKT source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api stable
    */
  def readFeature(source: Document): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Document, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Node): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Node, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a WKT source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api stable
    */
  def readFeatures(source: Document): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  
  def readGeometry(source: String): Geometry = js.native
  def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
  /**
    * Read a single geometry from a WKT source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Geometry.
    * @api stable
    */
  def readGeometry(source: Document): Geometry = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: Node): Geometry = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: GlobalObject): Geometry = js.native
  def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
  
  /**
    * Encode a feature as a WKT string.
    *
    * @param feature Feature.
    * @param opt_options Write options.
    * @return WKT string.
    * @api stable
    */
  def writeFeature(feature: typingsJapgolly.openlayers.mod.Feature): String = js.native
  def writeFeature(feature: typingsJapgolly.openlayers.mod.Feature, opt_options: WriteOptions): String = js.native
  
  /**
    * Encode an array of features as a WKT string.
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return WKT string.
    * @api stable
    */
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  
  /**
    * Write a single geometry as a WKT string.
    *
    * @param geometry Geometry.
    * @return WKT string.
    * @api stable
    */
  def writeGeometry(geometry: Geometry): String = js.native
}
