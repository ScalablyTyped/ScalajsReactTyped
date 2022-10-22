package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.DeclaredPredicate_
  - typingsJapgolly.babelTypes.libMod.InferredPredicate_
*/
trait FlowPredicate extends StObject
object FlowPredicate {
  
  inline def DeclaredPredicate_(value: Flow): typingsJapgolly.babelTypes.libMod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.DeclaredPredicate_]
  }
  
  inline def InferredPredicate_(): typingsJapgolly.babelTypes.libMod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.InferredPredicate_]
  }
}
