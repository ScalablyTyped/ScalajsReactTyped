package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISemanticAliases extends StObject {
  
  def Clone(): ISemanticAliases
  
  var Value: String
}
object ISemanticAliases {
  
  inline def apply(Clone: CallbackTo[ISemanticAliases], Value: String): ISemanticAliases = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticAliases]
  }
  
  extension [Self <: ISemanticAliases](x: Self) {
    
    inline def setClone(value: CallbackTo[ISemanticAliases]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
