package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceTypeDetailsRequest extends StObject {
  
  var DomainName: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  var EngineVersion: VersionString
  
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object ListInstanceTypeDetailsRequest {
  
  inline def apply(EngineVersion: VersionString): ListInstanceTypeDetailsRequest = {
    val __obj = js.Dynamic.literal(EngineVersion = EngineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceTypeDetailsRequest]
  }
  
  extension [Self <: ListInstanceTypeDetailsRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEngineVersion(value: VersionString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
