package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationAction extends StObject {
  
  def action(): Unit
  
  var name: String
}
object ValidationAction {
  
  inline def apply(action: Callback, name: String): ValidationAction = {
    val __obj = js.Dynamic.literal(action = action.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationAction]
  }
  
  extension [Self <: ValidationAction](x: Self) {
    
    inline def setAction(value: Callback): Self = StObject.set(x, "action", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
