package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugTrace
  extends StObject
     with EmbindObject[DebugTrace] {
  
  def writeTrace(): String
}
object DebugTrace {
  
  inline def apply(
    delete: Callback,
    deleteLater: Callback,
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean],
    writeTrace: CallbackTo[String]
  ): DebugTrace = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn, writeTrace = writeTrace.toJsFn)
    __obj.asInstanceOf[DebugTrace]
  }
  
  extension [Self <: DebugTrace](x: Self) {
    
    inline def setWriteTrace(value: CallbackTo[String]): Self = StObject.set(x, "writeTrace", value.toJsFn)
  }
}
