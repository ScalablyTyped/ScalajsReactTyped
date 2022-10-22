package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a texture that can be written to or read from. Can be accessed using Texture.control on a Procedural Texture. */
trait ProceduralTextureProvider
  extends StObject
     with TextureProvider {
  
  /**
    * Returns a Uint8 array containing the pixel values in a region of the texture. The region starts at the pixel coordinates x, y, and extends rightward by width and upward by height. Values
    * returned are integers ranging from 0 to 255.
    */
  def getPixels(x: Double, y: Double, width: Double, height: Double, data: js.typedarray.Uint8Array): Unit
  
  /**
    * Sets a region of pixels on the texture. The region starts at the pixel coordinates x, y, and extends rightward by width and upward by height. Uses the values of the passed in Uint8Array data,
    * which should be integer values ranging from 0 to 255.
    */
  def setPixels(x: Double, y: Double, width: Double, height: Double, data: js.typedarray.Uint8Array): Unit
}
object ProceduralTextureProvider {
  
  inline def apply(
    getAspect: CallbackTo[Double],
    getHeight: CallbackTo[Double],
    getPixels: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Callback,
    getTypeName: CallbackTo[String],
    getWidth: CallbackTo[Double],
    isOfType: String => Boolean,
    setPixels: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Callback
  ): ProceduralTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = getAspect.toJsFn, getHeight = getHeight.toJsFn, getPixels = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.typedarray.Uint8Array) => (getPixels(t0, t1, t2, t3, t4)).runNow()), getTypeName = getTypeName.toJsFn, getWidth = getWidth.toJsFn, isOfType = js.Any.fromFunction1(isOfType), setPixels = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.typedarray.Uint8Array) => (setPixels(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[ProceduralTextureProvider]
  }
  
  extension [Self <: ProceduralTextureProvider](x: Self) {
    
    inline def setGetPixels(value: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Callback): Self = StObject.set(x, "getPixels", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.typedarray.Uint8Array) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setSetPixels(value: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Callback): Self = StObject.set(x, "setPixels", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.typedarray.Uint8Array) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
