package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBlob
  extends StObject
     with EmbindObject[TextBlob]
object TextBlob {
  
  inline def apply(delete: Callback, deleteLater: Callback, isAliasOf: Any => Boolean, isDeleted: CallbackTo[Boolean]): TextBlob = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn)
    __obj.asInstanceOf[TextBlob]
  }
}
