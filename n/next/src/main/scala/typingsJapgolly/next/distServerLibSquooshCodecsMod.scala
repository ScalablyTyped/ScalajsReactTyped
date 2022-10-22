package typingsJapgolly.next

import typingsJapgolly.next.EmscriptenWasm.Module
import typingsJapgolly.next.anon.AutoOptimize
import typingsJapgolly.next.anon.Dec
import typingsJapgolly.next.anon.DefaultEncoderOptions
import typingsJapgolly.next.anon.DefaultOptions
import typingsJapgolly.next.anon.Description
import typingsJapgolly.next.anon.Detectors
import typingsJapgolly.next.distServerLibSquooshImageDataMod.default
import typingsJapgolly.next.nextStrings.catrom
import typingsJapgolly.next.nextStrings.lanczos3
import typingsJapgolly.next.nextStrings.mitchell
import typingsJapgolly.next.nextStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibSquooshCodecsMod {
  
  object codecs {
    
    @JSImport("next/dist/server/lib/squoosh/codecs", "codecs.avif")
    @js.native
    val avif: DefaultEncoderOptions = js.native
    
    @JSImport("next/dist/server/lib/squoosh/codecs", "codecs.mozjpeg")
    @js.native
    val mozjpeg: AutoOptimize = js.native
    
    @JSImport("next/dist/server/lib/squoosh/codecs", "codecs.oxipng")
    @js.native
    val oxipng: Detectors = js.native
    
    @JSImport("next/dist/server/lib/squoosh/codecs", "codecs.webp")
    @js.native
    val webp: Dec = js.native
  }
  
  object preprocessors {
    
    @JSImport("next/dist/server/lib/squoosh/codecs", "preprocessors.resize")
    @js.native
    val resize: DefaultOptions = js.native
    
    @JSImport("next/dist/server/lib/squoosh/codecs", "preprocessors.rotate")
    @js.native
    val rotate: Description = js.native
  }
  
  @js.native
  trait DecodeModule
    extends StObject
       with Module {
    
    def decode(data: js.typedarray.Uint8Array): default = js.native
  }
  
  trait ResizeOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var linearRGB: Boolean
    
    var method: triangle | catrom | mitchell | lanczos3
    
    var premultiply: Boolean
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ResizeOptions {
    
    inline def apply(linearRGB: Boolean, method: triangle | catrom | mitchell | lanczos3, premultiply: Boolean): ResizeOptions = {
      val __obj = js.Dynamic.literal(linearRGB = linearRGB.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], premultiply = premultiply.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeOptions]
    }
    
    extension [Self <: ResizeOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLinearRGB(value: Boolean): Self = StObject.set(x, "linearRGB", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: triangle | catrom | mitchell | lanczos3): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPremultiply(value: Boolean): Self = StObject.set(x, "premultiply", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RotateOptions extends StObject {
    
    var numRotations: Double
  }
  object RotateOptions {
    
    inline def apply(numRotations: Double): RotateOptions = {
      val __obj = js.Dynamic.literal(numRotations = numRotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotateOptions]
    }
    
    extension [Self <: RotateOptions](x: Self) {
      
      inline def setNumRotations(value: Double): Self = StObject.set(x, "numRotations", value.asInstanceOf[js.Any])
    }
  }
}
