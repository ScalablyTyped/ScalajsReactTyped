package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Node
     with Standardized
     with Statement
     with Terminatorless {
  
  var argument: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_ReturnStatement_ : ReturnStatement
}
object ReturnStatement_ {
  
  inline def apply(): ReturnStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement_]
  }
  
  extension [Self <: ReturnStatement_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setType(value: ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
