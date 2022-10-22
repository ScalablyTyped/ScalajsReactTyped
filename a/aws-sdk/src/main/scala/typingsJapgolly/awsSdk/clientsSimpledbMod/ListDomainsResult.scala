package typingsJapgolly.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsResult extends StObject {
  
  /**
    * A list of domain names that match the expression.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.undefined
  
  /**
    * An opaque token indicating that there are more domains than the specified MaxNumberOfDomains still available.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDomainsResult {
  
  inline def apply(): ListDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsResult]
  }
  
  extension [Self <: ListDomainsResult](x: Self) {
    
    inline def setDomainNames(value: DomainNameList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    inline def setDomainNamesUndefined: Self = StObject.set(x, "DomainNames", js.undefined)
    
    inline def setDomainNamesVarargs(value: String*): Self = StObject.set(x, "DomainNames", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
