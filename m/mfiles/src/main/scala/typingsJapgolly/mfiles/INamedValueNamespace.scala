package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamedValueNamespace extends StObject {
  
  def Clone(): INamedValueNamespace
  
  var NamedValues: INamedValues
  
  var NamespaceName: String
}
object INamedValueNamespace {
  
  inline def apply(Clone: CallbackTo[INamedValueNamespace], NamedValues: INamedValues, NamespaceName: String): INamedValueNamespace = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, NamedValues = NamedValues.asInstanceOf[js.Any], NamespaceName = NamespaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedValueNamespace]
  }
  
  extension [Self <: INamedValueNamespace](x: Self) {
    
    inline def setClone(value: CallbackTo[INamedValueNamespace]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setNamedValues(value: INamedValues): Self = StObject.set(x, "NamedValues", value.asInstanceOf[js.Any])
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "NamespaceName", value.asInstanceOf[js.Any])
  }
}
