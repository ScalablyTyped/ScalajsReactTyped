package typingsJapgolly.animatedGif

import org.scalajs.dom.Blob
import org.scalajs.dom.ImageData
import typingsJapgolly.std.CanvasImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("animated_gif", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AnimatedGIF {
    def this(options: typingsJapgolly.animatedGif.mod.options) = this()
  }
  
  @js.native
  trait AnimatedGIF extends StObject {
    
    def addFrame(element: CanvasImageSource): Unit = js.native
    
    def addFrameImageData(imageData: ImageData): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getBase64GIF(callback: js.Function1[/* gifBase64 */ String, Unit]): Unit = js.native
    
    def getBlobGIF(callback: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
    
    def isRendering(): Boolean = js.native
    
    def onRenderProgress(callback: js.Function1[/* percent */ Double, Unit]): Unit = js.native
    
    def setDelay(delay: Double): Unit = js.native
    
    def setRepeat(): Unit = js.native
    def setRepeat(repeat: Double): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.animatedGif.animatedGifStrings.bayer
    - typingsJapgolly.animatedGif.animatedGifStrings.floyd
    - typingsJapgolly.animatedGif.animatedGifStrings.closest
  */
  trait DitheringMethod extends StObject
  object DitheringMethod {
    
    inline def bayer: typingsJapgolly.animatedGif.animatedGifStrings.bayer = "bayer".asInstanceOf[typingsJapgolly.animatedGif.animatedGifStrings.bayer]
    
    inline def closest: typingsJapgolly.animatedGif.animatedGifStrings.closest = "closest".asInstanceOf[typingsJapgolly.animatedGif.animatedGifStrings.closest]
    
    inline def floyd: typingsJapgolly.animatedGif.animatedGifStrings.floyd = "floyd".asInstanceOf[typingsJapgolly.animatedGif.animatedGifStrings.floyd]
  }
  
  trait options extends StObject {
    
    var dithering: js.UndefOr[DitheringMethod] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var numWorkers: js.UndefOr[Double] = js.undefined
    
    var palette: js.UndefOr[js.Array[Double]] = js.undefined
    
    var sampleInterval: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setDithering(value: DitheringMethod): Self = StObject.set(x, "dithering", value.asInstanceOf[js.Any])
      
      inline def setDitheringUndefined: Self = StObject.set(x, "dithering", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
      
      inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      inline def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
