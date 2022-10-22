package typingsJapgolly.winrtUwp.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the pixel data from a bitmap frame. */
trait PixelDataProvider extends StObject {
  
  /**
    * Returns the internally-stored pixel data.
    * @return The pixel data.
    */
  def detachPixelData(): js.Array[Double]
}
object PixelDataProvider {
  
  inline def apply(detachPixelData: CallbackTo[js.Array[Double]]): PixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = detachPixelData.toJsFn)
    __obj.asInstanceOf[PixelDataProvider]
  }
  
  extension [Self <: PixelDataProvider](x: Self) {
    
    inline def setDetachPixelData(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "detachPixelData", value.toJsFn)
  }
}
