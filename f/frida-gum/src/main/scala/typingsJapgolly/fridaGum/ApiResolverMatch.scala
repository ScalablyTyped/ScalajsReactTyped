package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiResolverMatch extends StObject {
  
  /**
    * Memory address that the given function is loaded at.
    */
  var address: NativePointer
  
  /**
    * Canonical name of the function that was found.
    */
  var name: String
}
object ApiResolverMatch {
  
  inline def apply(address: NativePointer, name: String): ApiResolverMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResolverMatch]
  }
  
  extension [Self <: ApiResolverMatch](x: Self) {
    
    inline def setAddress(value: NativePointer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
