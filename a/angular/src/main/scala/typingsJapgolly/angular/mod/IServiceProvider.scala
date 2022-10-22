package typingsJapgolly.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// All service providers extend this interface
trait IServiceProvider extends StObject {
  
  @JSName("$get")
  var $get: Any
}
object IServiceProvider {
  
  inline def apply($get: Any): IServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceProvider]
  }
  
  extension [Self <: IServiceProvider](x: Self) {
    
    inline def set$get(value: Any): Self = StObject.set(x, "$get", value.asInstanceOf[js.Any])
  }
}
