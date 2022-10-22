package typingsJapgolly.imageminWebp

import typingsJapgolly.imagemin.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imagemin-webp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: Options): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait Crop
    extends StObject
       with Resize {
    
    var x: Double
    
    var y: Double
  }
  object Crop {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Crop = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crop]
    }
    
    extension [Self <: Crop](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imageminWebp.imageminWebpStrings.all
    - typingsJapgolly.imageminWebp.imageminWebpStrings.none
    - typingsJapgolly.imageminWebp.imageminWebpStrings.exif
    - typingsJapgolly.imageminWebp.imageminWebpStrings.icc
    - typingsJapgolly.imageminWebp.imageminWebpStrings.xmp
  */
  trait Metadata extends StObject
  object Metadata {
    
    inline def all: typingsJapgolly.imageminWebp.imageminWebpStrings.all = "all".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.all]
    
    inline def exif: typingsJapgolly.imageminWebp.imageminWebpStrings.exif = "exif".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.exif]
    
    inline def icc: typingsJapgolly.imageminWebp.imageminWebpStrings.icc = "icc".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.icc]
    
    inline def none: typingsJapgolly.imageminWebp.imageminWebpStrings.none = "none".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.none]
    
    inline def xmp: typingsJapgolly.imageminWebp.imageminWebpStrings.xmp = "xmp".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.xmp]
  }
  
  trait Options extends StObject {
    
    /**
      * Set transparency-compression quality between 0 and 100.
      * @default 100
      */
    var alphaQuality: js.UndefOr[Double] = js.undefined
    
    /**
      * Adjust filter strength automatically.
      * @default false
      */
    var autoFilter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Crop the image.
      */
    var crop: js.UndefOr[Crop] = js.undefined
    
    /**
      * Set deblocking filter strength between 0 (off) and 100.
      */
    var filter: js.UndefOr[Double] = js.undefined
    
    /**
      * Encode images losslessly.
      * @default false
      */
    var lossless: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A list of metadata to copy from the input to the output if present.
      */
    var metadata: js.UndefOr[Metadata | js.Array[Metadata]] = js.undefined
    
    /**
      * Specify the compression method to use,
      * between 0 (fastest) and 6 (slowest).
      * This parameter controls the trade off between encoding speed
      * and the compressed file size and quality.
      * @default 4
      */
    var method: js.UndefOr[Double] = js.undefined
    
    /**
      * Encode losslessly with an additional lossy pre-processing step,
      * with a quality factor between
      * 0 (maximum pre-processing) and 100 (same as lossless).
      * @default 100
      */
    var nearLossless: js.UndefOr[Double] = js.undefined
    
    /**
      * Preset setting.
      * @default default
      */
    var preset: js.UndefOr[Preset] = js.undefined
    
    /**
      * Set quality factor between 0 and 100.
      * @default 75
      */
    var quality: js.UndefOr[Double] = js.undefined
    
    /**
      * Resize the image. Happens after crop.
      */
    var resize: js.UndefOr[Resize] = js.undefined
    
    /**
      * Set filter sharpness between 0 (sharpest) and 7 (least sharp).
      * @default 0
      */
    var sharpness: js.UndefOr[Double] = js.undefined
    
    /**
      * Set target size in bytes.
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Set the amplitude of spatial noise shaping between 0 and 100.
      * @default 80
      */
    var sns: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlphaQuality(value: Double): Self = StObject.set(x, "alphaQuality", value.asInstanceOf[js.Any])
      
      inline def setAlphaQualityUndefined: Self = StObject.set(x, "alphaQuality", js.undefined)
      
      inline def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
      
      inline def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
      
      inline def setCrop(value: Crop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setFilter(value: Double): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
      
      inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
      
      inline def setMetadata(value: Metadata | js.Array[Metadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMetadataVarargs(value: Metadata*): Self = StObject.set(x, "metadata", js.Array(value*))
      
      inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNearLossless(value: Double): Self = StObject.set(x, "nearLossless", value.asInstanceOf[js.Any])
      
      inline def setNearLosslessUndefined: Self = StObject.set(x, "nearLossless", js.undefined)
      
      inline def setPreset(value: Preset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setResize(value: Resize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSharpness(value: Double): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
      
      inline def setSharpnessUndefined: Self = StObject.set(x, "sharpness", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSns(value: Double): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
      
      inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imageminWebp.imageminWebpStrings.default
    - typingsJapgolly.imageminWebp.imageminWebpStrings.photo
    - typingsJapgolly.imageminWebp.imageminWebpStrings.picture
    - typingsJapgolly.imageminWebp.imageminWebpStrings.drawing
    - typingsJapgolly.imageminWebp.imageminWebpStrings.icon
    - typingsJapgolly.imageminWebp.imageminWebpStrings.text
  */
  trait Preset extends StObject
  object Preset {
    
    inline def default: typingsJapgolly.imageminWebp.imageminWebpStrings.default = "default".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.default]
    
    inline def drawing: typingsJapgolly.imageminWebp.imageminWebpStrings.drawing = "drawing".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.drawing]
    
    inline def icon: typingsJapgolly.imageminWebp.imageminWebpStrings.icon = "icon".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.icon]
    
    inline def photo: typingsJapgolly.imageminWebp.imageminWebpStrings.photo = "photo".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.photo]
    
    inline def picture: typingsJapgolly.imageminWebp.imageminWebpStrings.picture = "picture".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.picture]
    
    inline def text: typingsJapgolly.imageminWebp.imageminWebpStrings.text = "text".asInstanceOf[typingsJapgolly.imageminWebp.imageminWebpStrings.text]
  }
  
  trait Resize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Resize {
    
    inline def apply(height: Double, width: Double): Resize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    extension [Self <: Resize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
