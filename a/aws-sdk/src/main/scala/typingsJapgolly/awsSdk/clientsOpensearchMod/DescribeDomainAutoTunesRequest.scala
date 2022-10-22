package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainAutoTunesRequest extends StObject {
  
  /**
    * The domain name for which you want Auto-Tune action details.
    */
  var DomainName: typingsJapgolly.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * NextToken is sent in case the earlier API call results contain the NextToken. Used for pagination.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object DescribeDomainAutoTunesRequest {
  
  inline def apply(DomainName: DomainName): DescribeDomainAutoTunesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainAutoTunesRequest]
  }
  
  extension [Self <: DescribeDomainAutoTunesRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
