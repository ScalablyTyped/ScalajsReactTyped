package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  def getImageSize(): Size
  
  def setImageSize(size: Size): Unit
}
object Icon {
  
  inline def apply(getImageSize: CallbackTo[Size], setImageSize: Size => Callback): Icon = {
    val __obj = js.Dynamic.literal(getImageSize = getImageSize.toJsFn, setImageSize = js.Any.fromFunction1((t0: Size) => setImageSize(t0).runNow()))
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setGetImageSize(value: CallbackTo[Size]): Self = StObject.set(x, "getImageSize", value.toJsFn)
    
    inline def setSetImageSize(value: Size => Callback): Self = StObject.set(x, "setImageSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
  }
}
