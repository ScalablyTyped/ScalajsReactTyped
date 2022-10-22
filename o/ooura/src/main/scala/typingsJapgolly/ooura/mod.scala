package typingsJapgolly.ooura

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ooura.oouraStrings.complex
import typingsJapgolly.ooura.oouraStrings.real
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ooura", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Ooura {
    def this(size: Double) = this()
    def this(size: Double, info: Info) = this()
    
    /* CompleteClass */
    override def fft(
      dataBuffer: js.typedarray.ArrayBuffer,
      reBuffer: js.typedarray.ArrayBuffer,
      imBuffer: js.typedarray.ArrayBuffer
    ): Unit = js.native
    /* CompleteClass */
    override def fft(
      reIpBuffer: js.typedarray.ArrayBuffer,
      imIpBuffer: js.typedarray.ArrayBuffer,
      reOpBuffer: js.typedarray.ArrayBuffer,
      imOpBuffer: js.typedarray.ArrayBuffer
    ): Unit = js.native
    
    /* CompleteClass */
    override def fftInPlace(dataBuffer: js.typedarray.ArrayBuffer): Unit = js.native
    
    /* CompleteClass */
    @JSName("fft")
    var fft_Original: complexFFT & realFFT = js.native
    
    /* CompleteClass */
    override def ifft(
      dataBuffer: js.typedarray.ArrayBuffer,
      reBuffer: js.typedarray.ArrayBuffer,
      imBuffer: js.typedarray.ArrayBuffer
    ): Unit = js.native
    /* CompleteClass */
    override def ifft(
      reIpBuffer: js.typedarray.ArrayBuffer,
      imIpBuffer: js.typedarray.ArrayBuffer,
      reOpBuffer: js.typedarray.ArrayBuffer,
      imOpBuffer: js.typedarray.ArrayBuffer
    ): Unit = js.native
    
    /* CompleteClass */
    override def ifftInPlace(dataBuffer: js.typedarray.ArrayBuffer): Unit = js.native
    
    /* CompleteClass */
    @JSName("ifft")
    var ifft_Original: complexFFT & realFFT = js.native
    
    /* CompleteClass */
    override def scalarArrayFactory(): js.typedarray.Float64Array = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def vectorArrayFactory(): js.typedarray.Float64Array = js.native
  }
  
  trait Info extends StObject {
    
    var radix: Double
    
    var `type`: real | complex
  }
  object Info {
    
    inline def apply(radix: Double, `type`: real | complex): Info = {
      val __obj = js.Dynamic.literal(radix = radix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setRadix(value: Double): Self = StObject.set(x, "radix", value.asInstanceOf[js.Any])
      
      inline def setType(value: real | complex): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ooura extends StObject {
    
    def fft(
      dataBuffer: js.typedarray.ArrayBuffer,
      reBuffer: js.typedarray.ArrayBuffer,
      imBuffer: js.typedarray.ArrayBuffer
    ): Unit
    def fft(
      reIpBuffer: js.typedarray.ArrayBuffer,
      imIpBuffer: js.typedarray.ArrayBuffer,
      reOpBuffer: js.typedarray.ArrayBuffer,
      imOpBuffer: js.typedarray.ArrayBuffer
    ): Unit
    
    def fftInPlace(dataBuffer: js.typedarray.ArrayBuffer): Unit
    
    @JSName("fft")
    var fft_Original: complexFFT & realFFT
    
    def ifft(
      dataBuffer: js.typedarray.ArrayBuffer,
      reBuffer: js.typedarray.ArrayBuffer,
      imBuffer: js.typedarray.ArrayBuffer
    ): Unit
    def ifft(
      reIpBuffer: js.typedarray.ArrayBuffer,
      imIpBuffer: js.typedarray.ArrayBuffer,
      reOpBuffer: js.typedarray.ArrayBuffer,
      imOpBuffer: js.typedarray.ArrayBuffer
    ): Unit
    
    def ifftInPlace(dataBuffer: js.typedarray.ArrayBuffer): Unit
    
    @JSName("ifft")
    var ifft_Original: complexFFT & realFFT
    
    def scalarArrayFactory(): js.typedarray.Float64Array
    
    var size: Double
    
    def vectorArrayFactory(): js.typedarray.Float64Array
  }
  object Ooura {
    
    inline def apply(
      fft: complexFFT & realFFT,
      fftInPlace: js.typedarray.ArrayBuffer => Callback,
      ifft: complexFFT & realFFT,
      ifftInPlace: js.typedarray.ArrayBuffer => Callback,
      scalarArrayFactory: CallbackTo[js.typedarray.Float64Array],
      size: Double,
      vectorArrayFactory: CallbackTo[js.typedarray.Float64Array]
    ): Ooura = {
      val __obj = js.Dynamic.literal(fft = fft.asInstanceOf[js.Any], fftInPlace = js.Any.fromFunction1((t0: js.typedarray.ArrayBuffer) => fftInPlace(t0).runNow()), ifft = ifft.asInstanceOf[js.Any], ifftInPlace = js.Any.fromFunction1((t0: js.typedarray.ArrayBuffer) => ifftInPlace(t0).runNow()), scalarArrayFactory = scalarArrayFactory.toJsFn, size = size.asInstanceOf[js.Any], vectorArrayFactory = vectorArrayFactory.toJsFn)
      __obj.asInstanceOf[Ooura]
    }
    
    extension [Self <: Ooura](x: Self) {
      
      inline def setFft(value: complexFFT & realFFT): Self = StObject.set(x, "fft", value.asInstanceOf[js.Any])
      
      inline def setFftInPlace(value: js.typedarray.ArrayBuffer => Callback): Self = StObject.set(x, "fftInPlace", js.Any.fromFunction1((t0: js.typedarray.ArrayBuffer) => value(t0).runNow()))
      
      inline def setIfft(value: complexFFT & realFFT): Self = StObject.set(x, "ifft", value.asInstanceOf[js.Any])
      
      inline def setIfftInPlace(value: js.typedarray.ArrayBuffer => Callback): Self = StObject.set(x, "ifftInPlace", js.Any.fromFunction1((t0: js.typedarray.ArrayBuffer) => value(t0).runNow()))
      
      inline def setScalarArrayFactory(value: CallbackTo[js.typedarray.Float64Array]): Self = StObject.set(x, "scalarArrayFactory", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setVectorArrayFactory(value: CallbackTo[js.typedarray.Float64Array]): Self = StObject.set(x, "vectorArrayFactory", value.toJsFn)
    }
  }
  
  type complexFFT = js.Function4[
    /* reIpBuffer */ js.typedarray.ArrayBuffer, 
    /* imIpBuffer */ js.typedarray.ArrayBuffer, 
    /* reOpBuffer */ js.typedarray.ArrayBuffer, 
    /* imOpBuffer */ js.typedarray.ArrayBuffer, 
    Unit
  ]
  
  type realFFT = js.Function3[
    /* dataBuffer */ js.typedarray.ArrayBuffer, 
    /* reBuffer */ js.typedarray.ArrayBuffer, 
    /* imBuffer */ js.typedarray.ArrayBuffer, 
    Unit
  ]
}
