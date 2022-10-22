package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelDataProvider
  extends StObject
     with IPixelDataProvider
object PixelDataProvider {
  
  inline def apply(detachPixelData: CallbackTo[js.typedarray.Uint8Array]): PixelDataProvider = {
    val __obj = js.Dynamic.literal(detachPixelData = detachPixelData.toJsFn)
    __obj.asInstanceOf[PixelDataProvider]
  }
}
