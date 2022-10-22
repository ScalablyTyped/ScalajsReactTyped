package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashComponentsPanel extends StObject {
  
  def addItemToDocument(): Any
  
  def reload(): Any
}
object FlashComponentsPanel {
  
  inline def apply(addItemToDocument: CallbackTo[Any], reload: CallbackTo[Any]): FlashComponentsPanel = {
    val __obj = js.Dynamic.literal(addItemToDocument = addItemToDocument.toJsFn, reload = reload.toJsFn)
    __obj.asInstanceOf[FlashComponentsPanel]
  }
  
  extension [Self <: FlashComponentsPanel](x: Self) {
    
    inline def setAddItemToDocument(value: CallbackTo[Any]): Self = StObject.set(x, "addItemToDocument", value.toJsFn)
    
    inline def setReload(value: CallbackTo[Any]): Self = StObject.set(x, "reload", value.toJsFn)
  }
}
