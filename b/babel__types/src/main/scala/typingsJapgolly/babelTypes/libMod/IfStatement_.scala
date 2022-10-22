package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfStatement_
  extends StObject
     with BaseNode
     with Conditional
     with Node
     with Standardized
     with Statement {
  
  var alternate: js.UndefOr[Statement | Null] = js.undefined
  
  var consequent: Statement
  
  var test: Expression
  
  @JSName("type")
  var type_IfStatement_ : IfStatement
}
object IfStatement_ {
  
  inline def apply(consequent: Statement, test: Expression): IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[IfStatement_]
  }
  
  extension [Self <: IfStatement_](x: Self) {
    
    inline def setAlternate(value: Statement): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    inline def setConsequent(value: Statement): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
