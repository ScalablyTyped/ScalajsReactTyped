package typingsJapgolly.reactSketchapp.libModuleTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchDocument extends StObject {
  
  def documentData(): SketchDocumentData
  
  def showMessage(message: String): Unit
}
object SketchDocument {
  
  inline def apply(documentData: CallbackTo[SketchDocumentData], showMessage: String => Callback): SketchDocument = {
    val __obj = js.Dynamic.literal(documentData = documentData.toJsFn, showMessage = js.Any.fromFunction1((t0: String) => showMessage(t0).runNow()))
    __obj.asInstanceOf[SketchDocument]
  }
  
  extension [Self <: SketchDocument](x: Self) {
    
    inline def setDocumentData(value: CallbackTo[SketchDocumentData]): Self = StObject.set(x, "documentData", value.toJsFn)
    
    inline def setShowMessage(value: String => Callback): Self = StObject.set(x, "showMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
