package typingsJapgolly.angularCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  def text(): js.Promise[String]
}
object Text {
  
  inline def apply(text: CallbackTo[js.Promise[String]]): Text = {
    val __obj = js.Dynamic.literal(text = text.toJsFn)
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
  }
}
