package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  def onClick(): String
}
object OnClick {
  
  inline def apply(onClick: CallbackTo[String]): OnClick = {
    val __obj = js.Dynamic.literal(onClick = onClick.toJsFn)
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setOnClick(value: CallbackTo[String]): Self = StObject.set(x, "onClick", value.toJsFn)
  }
}
