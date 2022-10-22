package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbindObject[T /* <: EmbindObject[T] */] extends StObject {
  
  def delete(): Unit
  
  def deleteLater(): Unit
  
  def isAliasOf(other: Any): Boolean
  
  def isDeleted(): Boolean
}
object EmbindObject {
  
  inline def apply[T /* <: EmbindObject[T] */](delete: Callback, deleteLater: Callback, isAliasOf: Any => Boolean, isDeleted: CallbackTo[Boolean]): EmbindObject[T] = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn)
    __obj.asInstanceOf[EmbindObject[T]]
  }
  
  extension [Self <: EmbindObject[?], T /* <: EmbindObject[T] */](x: Self & EmbindObject[T]) {
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "delete", value.toJsFn)
    
    inline def setDeleteLater(value: Callback): Self = StObject.set(x, "deleteLater", value.toJsFn)
    
    inline def setIsAliasOf(value: Any => Boolean): Self = StObject.set(x, "isAliasOf", js.Any.fromFunction1(value))
    
    inline def setIsDeleted(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDeleted", value.toJsFn)
  }
}
