package typingsJapgolly.ol

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.formatFormatTypeMod.FormatType
import typingsJapgolly.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFeatureMod {
  
  @JSImport("ol/format/Feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("ol/format/Feature", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FeatureFormat
  
  inline def transformExtentWithOptions(extent: Extent): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("transformExtentWithOptions")(extent.asInstanceOf[js.Any]).asInstanceOf[Extent]
  inline def transformExtentWithOptions(extent: Extent, opt_options: ReadOptions): Extent = (^.asInstanceOf[js.Dynamic].applyDynamic("transformExtentWithOptions")(extent.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Extent]
  
  inline def transformGeometryWithOptions(geometry: typingsJapgolly.ol.geomGeometryMod.default, write: Boolean): typingsJapgolly.ol.geomGeometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.geomGeometryMod.default]
  inline def transformGeometryWithOptions(geometry: typingsJapgolly.ol.geomGeometryMod.default, write: Boolean, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.geomGeometryMod.default]
  inline def transformGeometryWithOptions(geometry: typingsJapgolly.ol.geomGeometryMod.default, write: Boolean, opt_options: WriteOptions): typingsJapgolly.ol.geomGeometryMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("transformGeometryWithOptions")(geometry.asInstanceOf[js.Any], write.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.geomGeometryMod.default]
  
  @js.native
  trait FeatureFormat extends StObject {
    
    /**
      * Sets the dataProjection on the options, if no dataProjection
      * is set.
      */
    /* protected */ def adaptOptions(): js.UndefOr[WriteOptions | ReadOptions] = js.native
    /* protected */ def adaptOptions(options: ReadOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
    /* protected */ def adaptOptions(options: WriteOptions): js.UndefOr[WriteOptions | ReadOptions] = js.native
    
    /* protected */ var dataProjection: typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /* protected */ var defaultFeatureProjection: typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /* protected */ def getReadOptions(source: String): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: js.Object): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /**
      * Adds the data projection to the read options.
      */
    /* protected */ def getReadOptions(source: Document): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Document, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Element): js.UndefOr[ReadOptions] = js.native
    /* protected */ def getReadOptions(source: Element, opt_options: ReadOptions): js.UndefOr[ReadOptions] = js.native
    
    def getType(): FormatType = js.native
    
    def readFeature(source: String): FeatureLike = js.native
    def readFeature(source: String, opt_options: ReadOptions): FeatureLike = js.native
    def readFeature(source: js.Object): FeatureLike = js.native
    def readFeature(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
    /**
      * Read a single feature from a source.
      */
    def readFeature(source: Document): FeatureLike = js.native
    def readFeature(source: Document, opt_options: ReadOptions): FeatureLike = js.native
    def readFeature(source: Element): FeatureLike = js.native
    def readFeature(source: Element, opt_options: ReadOptions): FeatureLike = js.native
    
    def readFeatures(source: String): js.Array[FeatureLike] = js.native
    def readFeatures(source: String, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.Object): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.Object, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.typedarray.ArrayBuffer): js.Array[FeatureLike] = js.native
    def readFeatures(source: js.typedarray.ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    /**
      * Read all features from a source.
      */
    def readFeatures(source: Document): js.Array[FeatureLike] = js.native
    def readFeatures(source: Document, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    def readFeatures(source: Element): js.Array[FeatureLike] = js.native
    def readFeatures(source: Element, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
    
    def readGeometry(source: String): typingsJapgolly.ol.geomGeometryMod.default = js.native
    def readGeometry(source: String, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    def readGeometry(source: js.Object): typingsJapgolly.ol.geomGeometryMod.default = js.native
    def readGeometry(source: js.Object, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /**
      * Read a single geometry from a source.
      */
    def readGeometry(source: Document): typingsJapgolly.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Document, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Element): typingsJapgolly.ol.geomGeometryMod.default = js.native
    def readGeometry(source: Element, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    
    def readProjection(source: String): typingsJapgolly.ol.projProjectionMod.default = js.native
    def readProjection(source: js.Object): typingsJapgolly.ol.projProjectionMod.default = js.native
    /**
      * Read the projection from a source.
      */
    def readProjection(source: Document): typingsJapgolly.ol.projProjectionMod.default = js.native
    def readProjection(source: Element): typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /**
      * Encode a feature in this format.
      */
    def writeFeature(feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]): String = js.native
    def writeFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): String = js.native
    
    /**
      * Encode an array of features in this format.
      */
    def writeFeatures(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
    ): String = js.native
    def writeFeatures(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ],
      opt_options: WriteOptions
    ): String = js.native
    
    /**
      * Write a single geometry in this format.
      */
    def writeGeometry(geometry: typingsJapgolly.ol.geomGeometryMod.default): String = js.native
    def writeGeometry(geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_options: WriteOptions): String = js.native
  }
  
  trait ReadOptions extends StObject {
    
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    extension [Self <: ReadOptions](x: Self) {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
    }
  }
  
  trait WriteOptions extends StObject {
    
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var decimals: js.UndefOr[Double] = js.undefined
    
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var rightHanded: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    extension [Self <: WriteOptions](x: Self) {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
      
      inline def setRightHanded(value: Boolean): Self = StObject.set(x, "rightHanded", value.asInstanceOf[js.Any])
      
      inline def setRightHandedUndefined: Self = StObject.set(x, "rightHanded", js.undefined)
    }
  }
}
