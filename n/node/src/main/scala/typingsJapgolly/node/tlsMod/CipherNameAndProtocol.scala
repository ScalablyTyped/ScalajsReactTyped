package typingsJapgolly.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherNameAndProtocol extends StObject {
  
  /**
    * The cipher name.
    */
  var name: String
  
  /**
    * IETF name for the cipher suite.
    */
  var standardName: String
  
  /**
    * SSL/TLS protocol version.
    */
  var version: String
}
object CipherNameAndProtocol {
  
  inline def apply(name: String, standardName: String, version: String): CipherNameAndProtocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], standardName = standardName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherNameAndProtocol]
  }
  
  extension [Self <: CipherNameAndProtocol](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStandardName(value: String): Self = StObject.set(x, "standardName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
