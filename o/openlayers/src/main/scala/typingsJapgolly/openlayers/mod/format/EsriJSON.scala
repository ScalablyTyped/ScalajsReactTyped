package typingsJapgolly.openlayers.mod.format

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.geom.Geometry
import typingsJapgolly.openlayers.mod.olx.format.EsriJSONOptions
import typingsJapgolly.openlayers.mod.olx.format.ReadOptions
import typingsJapgolly.openlayers.mod.olx.format.WriteOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the EsriJSON format.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "format.EsriJSON")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the EsriJSON format.
  *
  * @param opt_options Options.
  * @api
  */
open class EsriJSON () extends JSONFeature {
  def this(opt_options: EsriJSONOptions) = this()
  
  def readFeature(source: String): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: String, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  /**
    * Read a feature from a EsriJSON Feature source.  Only works for Feature,
    * use `readFeatures` to read FeatureCollection source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Feature.
    * @api
    */
  def readFeature(source: js.typedarray.ArrayBuffer): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Document): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Document, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Node): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: Node, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject): typingsJapgolly.openlayers.mod.Feature = js.native
  def readFeature(source: GlobalObject, opt_options: ReadOptions): typingsJapgolly.openlayers.mod.Feature = js.native
  
  def readFeatures(source: String): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  /**
    * Read all features from a EsriJSON source.  Works with both Feature and
    * FeatureCollection sources.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Features.
    * @api
    */
  def readFeatures(source: js.typedarray.ArrayBuffer): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Document, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  def readFeatures(source: GlobalObject, opt_options: ReadOptions): js.Array[typingsJapgolly.openlayers.mod.Feature] = js.native
  
  def readGeometry(source: String): Geometry = js.native
  def readGeometry(source: String, opt_options: ReadOptions): Geometry = js.native
  /**
    * Read a geometry from a EsriJSON source.
    *
    * @param source Source.
    * @param opt_options Read options.
    * @return Geometry.
    * @api
    */
  def readGeometry(source: js.typedarray.ArrayBuffer): Geometry = js.native
  def readGeometry(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: Document): Geometry = js.native
  def readGeometry(source: Document, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: Node): Geometry = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): Geometry = js.native
  def readGeometry(source: GlobalObject): Geometry = js.native
  def readGeometry(source: GlobalObject, opt_options: ReadOptions): Geometry = js.native
  
  def readProjection(source: String): Projection = js.native
  /**
    * Read the projection from a EsriJSON source.
    *
    * @param source Source.
    * @return Projection.
    * @api
    */
  def readProjection(source: js.typedarray.ArrayBuffer): Projection = js.native
  def readProjection(source: Document): Projection = js.native
  def readProjection(source: Node): Projection = js.native
  def readProjection(source: GlobalObject): Projection = js.native
  
  /**
    * Encode a feature as a EsriJSON Feature string.
    *
    * @param feature Feature.
    * @param opt_options Write options.
    * @return EsriJSON.
    * @api
    */
  def writeFeature(feature: typingsJapgolly.openlayers.mod.Feature): String = js.native
  def writeFeature(feature: typingsJapgolly.openlayers.mod.Feature, opt_options: WriteOptions): String = js.native
  
  /**
    * Encode a feature as a esriJSON Feature object.
    *
    * @param feature Feature.
    * @param opt_options Write options.
    * @return Object.
    * @api
    */
  def writeFeatureObject(feature: typingsJapgolly.openlayers.mod.Feature): GlobalObject = js.native
  def writeFeatureObject(feature: typingsJapgolly.openlayers.mod.Feature, opt_options: WriteOptions): GlobalObject = js.native
  
  /**
    * Encode an array of features as EsriJSON.
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return EsriJSON.
    * @api
    */
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): String = js.native
  def writeFeatures(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): String = js.native
  
  /**
    * Encode an array of features as a EsriJSON object.
    *
    * @param features Features.
    * @param opt_options Write options.
    * @return EsriJSON Object.
    * @api
    */
  def writeFeaturesObject(features: js.Array[typingsJapgolly.openlayers.mod.Feature]): GlobalObject = js.native
  def writeFeaturesObject(features: js.Array[typingsJapgolly.openlayers.mod.Feature], opt_options: WriteOptions): GlobalObject = js.native
  
  /**
    * Encode a geometry as a EsriJSON string.
    *
    * @param geometry Geometry.
    * @param opt_options Write options.
    * @return EsriJSON.
    * @api
    */
  def writeGeometry(geometry: Geometry): String = js.native
  def writeGeometry(geometry: Geometry, opt_options: WriteOptions): String = js.native
  
  /**
    * Encode a geometry as a EsriJSON object.
    *
    * @param geometry Geometry.
    * @param opt_options Write options.
    * @return Object.
    * @api
    */
  def writeGeometryObject(geometry: Geometry): EsriJSONGeometry = js.native
  def writeGeometryObject(geometry: Geometry, opt_options: WriteOptions): EsriJSONGeometry = js.native
}
