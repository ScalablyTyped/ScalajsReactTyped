package typingsJapgolly.zui

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCutter extends StObject {
  
  def getData(): ImageData
  
  def resetImage(img: String): Any
}
object ImageCutter {
  
  inline def apply(getData: CallbackTo[ImageData], resetImage: String => Any): ImageCutter = {
    val __obj = js.Dynamic.literal(getData = getData.toJsFn, resetImage = js.Any.fromFunction1(resetImage))
    __obj.asInstanceOf[ImageCutter]
  }
  
  extension [Self <: ImageCutter](x: Self) {
    
    inline def setGetData(value: CallbackTo[ImageData]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setResetImage(value: String => Any): Self = StObject.set(x, "resetImage", js.Any.fromFunction1(value))
  }
}
