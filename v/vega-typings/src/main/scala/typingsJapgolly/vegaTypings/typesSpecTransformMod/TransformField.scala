package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecExprMod.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.FieldParam
  - typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef
*/
trait TransformField extends StObject
object TransformField {
  
  inline def ExprRef(expr: Expr): typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef]
  }
  
  inline def FieldParam(field: String): typingsJapgolly.vegaTypings.typesSpecTransformMod.FieldParam = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.FieldParam]
  }
  
  inline def SignalRef(signal: String): typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef]
  }
}
