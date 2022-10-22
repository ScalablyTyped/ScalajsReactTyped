package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.DeclaredPredicate_
  - typingsJapgolly.babelTypes.mod.InferredPredicate_
*/
trait FlowPredicate
  extends StObject
     with _Node
object FlowPredicate {
  
  inline def DeclaredPredicate_(value: Flow): typingsJapgolly.babelTypes.mod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.DeclaredPredicate_]
  }
  
  inline def InferredPredicate_(): typingsJapgolly.babelTypes.mod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.InferredPredicate_]
  }
}
