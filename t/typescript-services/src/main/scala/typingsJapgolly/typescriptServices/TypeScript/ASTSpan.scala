package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTSpan
  extends StObject
     with IASTSpan
object ASTSpan {
  
  inline def apply(_end: Double, _start: Double, end: CallbackTo[Double], start: CallbackTo[Double]): ASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = end.toJsFn, start = start.toJsFn)
    __obj.asInstanceOf[ASTSpan]
  }
}
