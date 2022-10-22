package typingsJapgolly.reactNativeFirebase.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFieldPath extends StObject {
  
  /* static member */
  def documentId(): FieldPath
}
object TypeofFieldPath {
  
  inline def apply(documentId: CallbackTo[FieldPath]): TypeofFieldPath = {
    val __obj = js.Dynamic.literal(documentId = documentId.toJsFn)
    __obj.asInstanceOf[TypeofFieldPath]
  }
  
  extension [Self <: TypeofFieldPath](x: Self) {
    
    inline def setDocumentId(value: CallbackTo[FieldPath]): Self = StObject.set(x, "documentId", value.toJsFn)
  }
}
