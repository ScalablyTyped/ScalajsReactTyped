package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallabilityErrorArgument extends StObject {
  
  /**
    * Argument name (e.g. name:'minimum-icon-size-in-pixels').
    */
  var name: String
  
  /**
    * Argument value (e.g. value:'64').
    */
  var value: String
}
object InstallabilityErrorArgument {
  
  inline def apply(name: String, value: String): InstallabilityErrorArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallabilityErrorArgument]
  }
  
  extension [Self <: InstallabilityErrorArgument](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
