package typingsJapgolly.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryKeys extends StObject {
  
  var POSITION: String
}
object RegistryKeys {
  
  inline def apply(POSITION: String): RegistryKeys = {
    val __obj = js.Dynamic.literal(POSITION = POSITION.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryKeys]
  }
  
  extension [Self <: RegistryKeys](x: Self) {
    
    inline def setPOSITION(value: String): Self = StObject.set(x, "POSITION", value.asInstanceOf[js.Any])
  }
}
