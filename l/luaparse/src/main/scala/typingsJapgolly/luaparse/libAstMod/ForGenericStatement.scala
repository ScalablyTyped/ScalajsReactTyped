package typingsJapgolly.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForGenericStatement
  extends StObject
     with Base[typingsJapgolly.luaparse.luaparseStrings.ForGenericStatement]
     with _Statement {
  
  var body: js.Array[Statement]
  
  var iterators: js.Array[Expression]
  
  var variables: js.Array[Identifier]
}
object ForGenericStatement {
  
  inline def apply(body: js.Array[Statement], iterators: js.Array[Expression], variables: js.Array[Identifier]): ForGenericStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForGenericStatement")
    __obj.asInstanceOf[ForGenericStatement]
  }
  
  extension [Self <: ForGenericStatement](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setIterators(value: js.Array[Expression]): Self = StObject.set(x, "iterators", value.asInstanceOf[js.Any])
    
    inline def setIteratorsVarargs(value: Expression*): Self = StObject.set(x, "iterators", js.Array(value*))
    
    inline def setVariables(value: js.Array[Identifier]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: Identifier*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
