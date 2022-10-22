package typingsJapgolly.ckeditor4.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveListener extends StObject {
  
  def removeListener(): Unit
}
object RemoveListener {
  
  inline def apply(removeListener: japgolly.scalajs.react.Callback): RemoveListener = {
    val __obj = js.Dynamic.literal(removeListener = removeListener.toJsFn)
    __obj.asInstanceOf[RemoveListener]
  }
  
  extension [Self <: RemoveListener](x: Self) {
    
    inline def setRemoveListener(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeListener", value.toJsFn)
  }
}
