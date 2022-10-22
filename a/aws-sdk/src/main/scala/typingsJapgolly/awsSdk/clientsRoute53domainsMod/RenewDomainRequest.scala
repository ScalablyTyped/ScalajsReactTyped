package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenewDomainRequest extends StObject {
  
  /**
    * The year when the registration for the domain is set to expire. This value must match the current expiration date for the domain.
    */
  var CurrentExpiryYear: typingsJapgolly.awsSdk.clientsRoute53domainsMod.CurrentExpiryYear
  
  /**
    * The name of the domain that you want to renew.
    */
  var DomainName: typingsJapgolly.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    * The number of years that you want to renew the domain for. The maximum number of years depends on the top-level domain. For the range of valid values for your domain, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. Default: 1
    */
  var DurationInYears: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53domainsMod.DurationInYears] = js.undefined
}
object RenewDomainRequest {
  
  inline def apply(CurrentExpiryYear: CurrentExpiryYear, DomainName: DomainName): RenewDomainRequest = {
    val __obj = js.Dynamic.literal(CurrentExpiryYear = CurrentExpiryYear.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewDomainRequest]
  }
  
  extension [Self <: RenewDomainRequest](x: Self) {
    
    inline def setCurrentExpiryYear(value: CurrentExpiryYear): Self = StObject.set(x, "CurrentExpiryYear", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDurationInYears(value: DurationInYears): Self = StObject.set(x, "DurationInYears", value.asInstanceOf[js.Any])
    
    inline def setDurationInYearsUndefined: Self = StObject.set(x, "DurationInYears", js.undefined)
  }
}
