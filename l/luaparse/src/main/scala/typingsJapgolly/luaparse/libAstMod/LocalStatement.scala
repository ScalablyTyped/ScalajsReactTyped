package typingsJapgolly.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStatement
  extends StObject
     with Base[typingsJapgolly.luaparse.luaparseStrings.LocalStatement]
     with _Statement {
  
  var init: js.Array[Expression]
  
  var variables: js.Array[Identifier]
}
object LocalStatement {
  
  inline def apply(init: js.Array[Expression], variables: js.Array[Identifier]): LocalStatement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LocalStatement")
    __obj.asInstanceOf[LocalStatement]
  }
  
  extension [Self <: LocalStatement](x: Self) {
    
    inline def setInit(value: js.Array[Expression]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitVarargs(value: Expression*): Self = StObject.set(x, "init", js.Array(value*))
    
    inline def setVariables(value: js.Array[Identifier]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: Identifier*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
