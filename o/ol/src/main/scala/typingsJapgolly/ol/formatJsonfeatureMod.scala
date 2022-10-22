package typingsJapgolly.ol

import typingsJapgolly.ol.formatFeatureMod.ReadOptions
import typingsJapgolly.ol.formatFeatureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatJsonfeatureMod {
  
  /* note: abstract class */ @JSImport("ol/format/JSONFeature", JSImport.Default)
  @js.native
  open class default () extends JSONFeature
  
  @js.native
  trait JSONFeature
    extends typingsJapgolly.ol.formatFeatureMod.default {
    
    /**
      * Read a feature.  Only works for a single feature. Use readFeatures to
      * read a feature collection.
      */
    def readFeature(source: js.typedarray.ArrayBuffer): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    def readFeature(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readFeatureFromObject(`object`: Any): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: Any, opt_options: ReadOptions): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromObject(`object`: Any): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    /* protected */ def readFeaturesFromObject(`object`: Any, opt_options: ReadOptions): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /**
      * Read a geometry.
      */
    def readGeometry(source: js.typedarray.ArrayBuffer): typingsJapgolly.ol.geomGeometryMod.default = js.native
    def readGeometry(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    
    /* protected */ def readGeometryFromObject(`object`: Any): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: Any, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    
    /**
      * Read the projection.
      */
    def readProjection(source: js.typedarray.ArrayBuffer): typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /* protected */ def readProjectionFromObject(`object`: Any): typingsJapgolly.ol.projProjectionMod.default = js.native
    
    def writeFeatureObject(feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]): Any = js.native
    def writeFeatureObject(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): Any = js.native
    
    def writeFeaturesObject(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
    ): Any = js.native
    def writeFeaturesObject(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ],
      opt_options: WriteOptions
    ): Any = js.native
    
    def writeGeometryObject(geometry: typingsJapgolly.ol.geomGeometryMod.default): Any = js.native
    def writeGeometryObject(geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_options: WriteOptions): Any = js.native
  }
}
