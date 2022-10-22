package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Scope Options for Model.scope
*/
trait ScopeOptions extends StObject {
  
  /**
    * The scope(s) to apply. Scopes can either be passed as consecutive arguments, or as an array of arguments.
    * To apply simple scopes and scope functions with no arguments, pass them as strings. For scope function,
    * pass an object, with a `method` property. The value can either be a string, if the method does not take
    * any arguments, or an array, where the first element is the name of the method, and consecutive elements
    * are arguments to that method. Pass null to remove all scopes, including the default.
    */
  var method: String | js.Array[Any]
}
object ScopeOptions {
  
  inline def apply(method: String | js.Array[Any]): ScopeOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeOptions]
  }
  
  extension [Self <: ScopeOptions](x: Self) {
    
    inline def setMethod(value: String | js.Array[Any]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodVarargs(value: Any*): Self = StObject.set(x, "method", js.Array(value*))
  }
}
