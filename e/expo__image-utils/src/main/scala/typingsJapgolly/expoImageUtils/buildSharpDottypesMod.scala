package typingsJapgolly.expoImageUtils

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoImageUtils.buildImageDottypesMod.ImageFormat
import typingsJapgolly.expoImageUtils.buildImageDottypesMod.ResizeMode
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings._empty
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.cubic
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.flatten
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.lanczos2
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.lanczos3
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.mitchell
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.nearest
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.removeAlpha
import typingsJapgolly.expoImageUtils.expoImageUtilsStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSharpDottypesMod {
  
  trait FlattenOptions
    extends StObject
       with SharpCommandOptions {
    
    var background: String
    
    var operation: flatten
  }
  object FlattenOptions {
    
    inline def apply(background: String): FlattenOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], operation = "flatten")
      __obj.asInstanceOf[FlattenOptions]
    }
    
    extension [Self <: FlattenOptions](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: flatten): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = js.Object | (StringDictionary[js.UndefOr[Boolean | Double | String]])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.center
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.centre
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.north
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.east
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.south
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.west
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.northeast
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.southeast
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.southwest
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.northwest
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.top
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.right
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.bottom
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.left
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`right top`
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`right bottom`
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`left bottom`
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`left top`
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.entropy
    - typingsJapgolly.expoImageUtils.expoImageUtilsStrings.attention
  */
  trait Position extends StObject
  object Position {
    
    inline def attention: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.attention = "attention".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.attention]
    
    inline def bottom: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.bottom]
    
    inline def center: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.center = "center".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.center]
    
    inline def centre: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.centre = "centre".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.centre]
    
    inline def east: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.east = "east".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.east]
    
    inline def entropy: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.entropy = "entropy".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.entropy]
    
    inline def left: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.left = "left".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.left]
    
    inline def `left bottom`: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`left bottom` = ("left bottom").asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`left bottom`]
    
    inline def `left top`: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`left top` = ("left top").asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`left top`]
    
    inline def north: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.north = "north".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.north]
    
    inline def northeast: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.northeast = "northeast".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.northeast]
    
    inline def northwest: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.northwest = "northwest".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.northwest]
    
    inline def right: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.right = "right".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.right]
    
    inline def `right bottom`: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`right bottom` = ("right bottom").asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`right bottom`]
    
    inline def `right top`: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`right top` = ("right top").asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.`right top`]
    
    inline def south: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.south = "south".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.south]
    
    inline def southeast: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.southeast = "southeast".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.southeast]
    
    inline def southwest: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.southwest = "southwest".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.southwest]
    
    inline def top: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.top = "top".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.top]
    
    inline def west: typingsJapgolly.expoImageUtils.expoImageUtilsStrings.west = "west".asInstanceOf[typingsJapgolly.expoImageUtils.expoImageUtilsStrings.west]
  }
  
  trait RemoveAlphaOptions
    extends StObject
       with SharpCommandOptions {
    
    var operation: removeAlpha
  }
  object RemoveAlphaOptions {
    
    inline def apply(): RemoveAlphaOptions = {
      val __obj = js.Dynamic.literal(operation = "removeAlpha")
      __obj.asInstanceOf[RemoveAlphaOptions]
    }
    
    extension [Self <: RemoveAlphaOptions](x: Self) {
      
      inline def setOperation(value: removeAlpha): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeOptions
    extends StObject
       with SharpCommandOptions {
    
    var background: js.UndefOr[String] = js.undefined
    
    var fastShrinkOnLoad: js.UndefOr[Boolean] = js.undefined
    
    var fit: js.UndefOr[ResizeMode] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var kernel: js.UndefOr[nearest | cubic | mitchell | lanczos2 | lanczos3] = js.undefined
    
    var operation: resize
    
    var position: js.UndefOr[Position] = js.undefined
    
    var width: Double
    
    var withoutEnlargement: js.UndefOr[Boolean] = js.undefined
  }
  object ResizeOptions {
    
    inline def apply(width: Double): ResizeOptions = {
      val __obj = js.Dynamic.literal(operation = "resize", width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeOptions]
    }
    
    extension [Self <: ResizeOptions](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setFastShrinkOnLoad(value: Boolean): Self = StObject.set(x, "fastShrinkOnLoad", value.asInstanceOf[js.Any])
      
      inline def setFastShrinkOnLoadUndefined: Self = StObject.set(x, "fastShrinkOnLoad", js.undefined)
      
      inline def setFit(value: ResizeMode): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKernel(value: nearest | cubic | mitchell | lanczos2 | lanczos3): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
      
      inline def setOperation(value: resize): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWithoutEnlargement(value: Boolean): Self = StObject.set(x, "withoutEnlargement", value.asInstanceOf[js.Any])
      
      inline def setWithoutEnlargementUndefined: Self = StObject.set(x, "withoutEnlargement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoImageUtils.buildSharpDottypesMod.RemoveAlphaOptions
    - typingsJapgolly.expoImageUtils.buildSharpDottypesMod.ResizeOptions
    - typingsJapgolly.expoImageUtils.buildSharpDottypesMod.FlattenOptions
  */
  trait SharpCommandOptions extends StObject
  object SharpCommandOptions {
    
    inline def FlattenOptions(background: String): typingsJapgolly.expoImageUtils.buildSharpDottypesMod.FlattenOptions = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], operation = "flatten")
      __obj.asInstanceOf[typingsJapgolly.expoImageUtils.buildSharpDottypesMod.FlattenOptions]
    }
    
    inline def RemoveAlphaOptions(): typingsJapgolly.expoImageUtils.buildSharpDottypesMod.RemoveAlphaOptions = {
      val __obj = js.Dynamic.literal(operation = "removeAlpha")
      __obj.asInstanceOf[typingsJapgolly.expoImageUtils.buildSharpDottypesMod.RemoveAlphaOptions]
    }
    
    inline def ResizeOptions(width: Double): typingsJapgolly.expoImageUtils.buildSharpDottypesMod.ResizeOptions = {
      val __obj = js.Dynamic.literal(operation = "resize", width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.expoImageUtils.buildSharpDottypesMod.ResizeOptions]
    }
  }
  
  trait SharpGlobalOptions
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null]] {
    
    var compressionLevel: js.UndefOr[_empty] = js.undefined
    
    var format: js.UndefOr[ImageFormat] = js.undefined
    
    var input: String
    
    var limitInputPixels: js.UndefOr[Double] = js.undefined
    
    var output: String
    
    var progressive: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var withMetadata: js.UndefOr[Boolean] = js.undefined
  }
  object SharpGlobalOptions {
    
    inline def apply(input: String, output: String): SharpGlobalOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharpGlobalOptions]
    }
    
    extension [Self <: SharpGlobalOptions](x: Self) {
      
      inline def setCompressionLevel(value: _empty): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
      
      inline def setFormat(value: ImageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLimitInputPixels(value: Double): Self = StObject.set(x, "limitInputPixels", value.asInstanceOf[js.Any])
      
      inline def setLimitInputPixelsUndefined: Self = StObject.set(x, "limitInputPixels", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setWithMetadata(value: Boolean): Self = StObject.set(x, "withMetadata", value.asInstanceOf[js.Any])
      
      inline def setWithMetadataUndefined: Self = StObject.set(x, "withMetadata", js.undefined)
    }
  }
}
