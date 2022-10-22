package typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeeredDnsDomain extends StObject {
  
  /** The DNS domain name suffix e.g. `example.com.`. Cloud DNS requires that a DNS suffix ends with a trailing dot. */
  var dnsSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * User assigned name for this resource. Must be unique within the consumer network. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and
    * only contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String] = js.undefined
}
object PeeredDnsDomain {
  
  inline def apply(): PeeredDnsDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeredDnsDomain]
  }
  
  extension [Self <: PeeredDnsDomain](x: Self) {
    
    inline def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    inline def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
