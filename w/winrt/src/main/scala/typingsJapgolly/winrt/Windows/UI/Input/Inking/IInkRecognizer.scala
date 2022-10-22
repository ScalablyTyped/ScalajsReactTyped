package typingsJapgolly.winrt.Windows.UI.Input.Inking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkRecognizer extends StObject {
  
  var name: String
}
object IInkRecognizer {
  
  inline def apply(name: String): IInkRecognizer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkRecognizer]
  }
  
  extension [Self <: IInkRecognizer](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
