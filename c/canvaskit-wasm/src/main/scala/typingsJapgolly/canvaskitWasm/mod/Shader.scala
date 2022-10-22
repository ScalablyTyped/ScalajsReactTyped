package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shader
  extends StObject
     with EmbindObject[Shader]
object Shader {
  
  inline def apply(delete: Callback, deleteLater: Callback, isAliasOf: Any => Boolean, isDeleted: CallbackTo[Boolean]): Shader = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn)
    __obj.asInstanceOf[Shader]
  }
}
