package typingsJapgolly.pngJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.pngJs.pngJsInts.`0`
import typingsJapgolly.pngJs.pngJsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("png.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PNGReader {
    def this(bytes: String) = this()
    def this(bytes: js.typedarray.ArrayBuffer) = this()
    def this(bytes: js.typedarray.Uint8Array) = this()
    def this(bytes: Buffer) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pngJs.pngJsInts.`2`
    - typingsJapgolly.pngJs.pngJsInts.`4`
    - typingsJapgolly.pngJs.pngJsInts.`8`
    - typingsJapgolly.pngJs.pngJsInts.`16`
  */
  trait BitDepth extends StObject
  object BitDepth {
    
    inline def `16`: typingsJapgolly.pngJs.pngJsInts.`16` = 16.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`16`]
    
    inline def `2`: typingsJapgolly.pngJs.pngJsInts.`2` = 2.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`2`]
    
    inline def `4`: typingsJapgolly.pngJs.pngJsInts.`4` = 4.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`4`]
    
    inline def `8`: typingsJapgolly.pngJs.pngJsInts.`8` = 8.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pngJs.pngJsInts.`0`
    - typingsJapgolly.pngJs.pngJsInts.`2`
    - typingsJapgolly.pngJs.pngJsInts.`3`
    - typingsJapgolly.pngJs.pngJsInts.`4`
    - typingsJapgolly.pngJs.pngJsInts.`6`
  */
  trait ColorType extends StObject
  object ColorType {
    
    inline def `0`: typingsJapgolly.pngJs.pngJsInts.`0` = 0.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`0`]
    
    inline def `2`: typingsJapgolly.pngJs.pngJsInts.`2` = 2.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`2`]
    
    inline def `3`: typingsJapgolly.pngJs.pngJsInts.`3` = 3.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`3`]
    
    inline def `4`: typingsJapgolly.pngJs.pngJsInts.`4` = 4.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`4`]
    
    inline def `6`: typingsJapgolly.pngJs.pngJsInts.`6` = 6.asInstanceOf[typingsJapgolly.pngJs.pngJsInts.`6`]
  }
  
  trait PNG extends StObject {
    
    var alpha: Boolean
    
    var bitDepth: BitDepth
    
    var colorType: ColorType
    
    var colors: Double
    
    var compressionMethod: `0`
    
    var filterMethod: `0`
    
    def getBitDepth(): BitDepth
    
    def getColorType(): ColorType
    
    def getCompressionMethod(): `0`
    
    def getFilterMethod(): `0`
    
    def getHeight(): Double
    
    def getInterlaceMethod(): `0` | `1`
    
    def getPalette(): js.Array[Double]
    
    def getPixel(x: Double, y: Double): js.Tuple4[Double, Double, Double, Double]
    
    def getWidth(): Double
    
    var height: Double
    
    var interlaceMethod: `0` | `1`
    
    var palette: js.Array[Double] | Null
    
    var pixelBits: Double
    
    var pixels: Buffer | Null
    
    def setBitDepth(bitDepth: BitDepth): Unit
    
    def setColorType(colorType: ColorType): Unit
    
    @JSName("setCompressionMethod")
    def setCompressionMethod_0(compressionMethod: `0`): Unit
    
    @JSName("setFilterMethod")
    def setFilterMethod_0(filterMethod: `0`): Unit
    
    def setHeight(height: Double): Unit
    
    def setInterlaceMethod(interlaceMethod: `0` | `1`): Unit
    
    def setPalette(palette: js.Array[Double]): Unit
    
    def setWidth(width: Double): Unit
    
    var width: Double
  }
  object PNG {
    
    inline def apply(
      alpha: Boolean,
      bitDepth: BitDepth,
      colorType: ColorType,
      colors: Double,
      getBitDepth: CallbackTo[BitDepth],
      getColorType: CallbackTo[ColorType],
      getCompressionMethod: CallbackTo[`0`],
      getFilterMethod: CallbackTo[`0`],
      getHeight: CallbackTo[Double],
      getInterlaceMethod: CallbackTo[`0` | `1`],
      getPalette: CallbackTo[js.Array[Double]],
      getPixel: (Double, Double) => js.Tuple4[Double, Double, Double, Double],
      getWidth: CallbackTo[Double],
      height: Double,
      interlaceMethod: `0` | `1`,
      pixelBits: Double,
      setBitDepth: BitDepth => Callback,
      setColorType: ColorType => Callback,
      setCompressionMethod: `0` => Callback,
      setFilterMethod: `0` => Callback,
      setHeight: Double => Callback,
      setInterlaceMethod: `0` | `1` => Callback,
      setPalette: js.Array[Double] => Callback,
      setWidth: Double => Callback,
      width: Double
    ): PNG = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bitDepth = bitDepth.asInstanceOf[js.Any], colorType = colorType.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compressionMethod = 0, filterMethod = 0, getBitDepth = getBitDepth.toJsFn, getColorType = getColorType.toJsFn, getCompressionMethod = getCompressionMethod.toJsFn, getFilterMethod = getFilterMethod.toJsFn, getHeight = getHeight.toJsFn, getInterlaceMethod = getInterlaceMethod.toJsFn, getPalette = getPalette.toJsFn, getPixel = js.Any.fromFunction2(getPixel), getWidth = getWidth.toJsFn, height = height.asInstanceOf[js.Any], interlaceMethod = interlaceMethod.asInstanceOf[js.Any], pixelBits = pixelBits.asInstanceOf[js.Any], setBitDepth = js.Any.fromFunction1((t0: BitDepth) => setBitDepth(t0).runNow()), setColorType = js.Any.fromFunction1((t0: ColorType) => setColorType(t0).runNow()), setCompressionMethod = js.Any.fromFunction1((t0: `0`) => setCompressionMethod(t0).runNow()), setFilterMethod = js.Any.fromFunction1((t0: `0`) => setFilterMethod(t0).runNow()), setHeight = js.Any.fromFunction1((t0: Double) => setHeight(t0).runNow()), setInterlaceMethod = js.Any.fromFunction1((t0: `0` | `1`) => setInterlaceMethod(t0).runNow()), setPalette = js.Any.fromFunction1((t0: js.Array[Double]) => setPalette(t0).runNow()), setWidth = js.Any.fromFunction1((t0: Double) => setWidth(t0).runNow()), width = width.asInstanceOf[js.Any], palette = null, pixels = null)
      __obj.asInstanceOf[PNG]
    }
    
    extension [Self <: PNG](x: Self) {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBitDepth(value: BitDepth): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      inline def setColorType(value: ColorType): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
      
      inline def setColors(value: Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setCompressionMethod(value: `0`): Self = StObject.set(x, "compressionMethod", value.asInstanceOf[js.Any])
      
      inline def setFilterMethod(value: `0`): Self = StObject.set(x, "filterMethod", value.asInstanceOf[js.Any])
      
      inline def setGetBitDepth(value: CallbackTo[BitDepth]): Self = StObject.set(x, "getBitDepth", value.toJsFn)
      
      inline def setGetColorType(value: CallbackTo[ColorType]): Self = StObject.set(x, "getColorType", value.toJsFn)
      
      inline def setGetCompressionMethod(value: CallbackTo[`0`]): Self = StObject.set(x, "getCompressionMethod", value.toJsFn)
      
      inline def setGetFilterMethod(value: CallbackTo[`0`]): Self = StObject.set(x, "getFilterMethod", value.toJsFn)
      
      inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
      
      inline def setGetInterlaceMethod(value: CallbackTo[`0` | `1`]): Self = StObject.set(x, "getInterlaceMethod", value.toJsFn)
      
      inline def setGetPalette(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getPalette", value.toJsFn)
      
      inline def setGetPixel(value: (Double, Double) => js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "getPixel", js.Any.fromFunction2(value))
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInterlaceMethod(value: `0` | `1`): Self = StObject.set(x, "interlaceMethod", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: js.Array[Double]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteNull: Self = StObject.set(x, "palette", null)
      
      inline def setPaletteVarargs(value: Double*): Self = StObject.set(x, "palette", js.Array(value*))
      
      inline def setPixelBits(value: Double): Self = StObject.set(x, "pixelBits", value.asInstanceOf[js.Any])
      
      inline def setPixels(value: Buffer): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
      
      inline def setPixelsNull: Self = StObject.set(x, "pixels", null)
      
      inline def setSetBitDepth(value: BitDepth => Callback): Self = StObject.set(x, "setBitDepth", js.Any.fromFunction1((t0: BitDepth) => value(t0).runNow()))
      
      inline def setSetColorType(value: ColorType => Callback): Self = StObject.set(x, "setColorType", js.Any.fromFunction1((t0: ColorType) => value(t0).runNow()))
      
      inline def setSetCompressionMethod(value: `0` => Callback): Self = StObject.set(x, "setCompressionMethod", js.Any.fromFunction1((t0: `0`) => value(t0).runNow()))
      
      inline def setSetFilterMethod(value: `0` => Callback): Self = StObject.set(x, "setFilterMethod", js.Any.fromFunction1((t0: `0`) => value(t0).runNow()))
      
      inline def setSetHeight(value: Double => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetInterlaceMethod(value: `0` | `1` => Callback): Self = StObject.set(x, "setInterlaceMethod", js.Any.fromFunction1((t0: `0` | `1`) => value(t0).runNow()))
      
      inline def setSetPalette(value: js.Array[Double] => Callback): Self = StObject.set(x, "setPalette", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
      
      inline def setSetWidth(value: Double => Callback): Self = StObject.set(x, "setWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PNGReader extends StObject {
    
    var bytes: js.typedarray.Uint8Array | js.Array[Double] | Buffer = js.native
    
    var dataChunks: js.Array[js.Array[Double]] = js.native
    
    var i: Double = js.native
    
    def parse(callback: ParseCallback): Unit = js.native
    def parse(options: ParseOptions, callback: ParseCallback): Unit = js.native
    
    var png: PNG = js.native
  }
  
  type ParseCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* png */ PNG, Unit]
  
  trait ParseOptions extends StObject {
    
    var data: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
