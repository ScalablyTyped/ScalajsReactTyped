package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclarator
  extends StObject
     with BaseNode {
  
  var id: Pattern
  
  var init: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_VariableDeclarator: typingsJapgolly.estree.estreeStrings.VariableDeclarator
}
object VariableDeclarator {
  
  inline def apply(id: Pattern): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[VariableDeclarator]
  }
  
  extension [Self <: VariableDeclarator](x: Self) {
    
    inline def setId(value: Pattern): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitNull: Self = StObject.set(x, "init", null)
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setType(value: typingsJapgolly.estree.estreeStrings.VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
