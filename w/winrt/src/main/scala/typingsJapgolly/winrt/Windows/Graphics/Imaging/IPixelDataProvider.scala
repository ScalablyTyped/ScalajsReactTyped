package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelDataProvider extends StObject {
  
  def detachPixelData(): js.typedarray.Uint8Array
}
object IPixelDataProvider {
  
  inline def apply(detachPixelData: CallbackTo[js.typedarray.Uint8Array]): IPixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = detachPixelData.toJsFn)
    __obj.asInstanceOf[IPixelDataProvider]
  }
  
  extension [Self <: IPixelDataProvider](x: Self) {
    
    inline def setDetachPixelData(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "detachPixelData", value.toJsFn)
  }
}
