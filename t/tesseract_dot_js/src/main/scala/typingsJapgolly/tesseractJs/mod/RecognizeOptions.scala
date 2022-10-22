package typingsJapgolly.tesseractJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeOptions extends StObject {
  
  var rectangle: Rectangle
}
object RecognizeOptions {
  
  inline def apply(rectangle: Rectangle): RecognizeOptions = {
    val __obj = js.Dynamic.literal(rectangle = rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeOptions]
  }
  
  extension [Self <: RecognizeOptions](x: Self) {
    
    inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
  }
}
