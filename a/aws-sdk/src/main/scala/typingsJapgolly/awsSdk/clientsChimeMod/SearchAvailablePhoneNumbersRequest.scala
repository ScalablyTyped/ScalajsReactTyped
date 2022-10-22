package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAvailablePhoneNumbersRequest extends StObject {
  
  /**
    * The area code used to filter results. Only applies to the US.
    */
  var AreaCode: js.UndefOr[String] = js.undefined
  
  /**
    * The city used to filter results. Only applies to the US.
    */
  var City: js.UndefOr[String] = js.undefined
  
  /**
    * The country used to filter results. Defaults to the US Format: ISO 3166-1 alpha-2.
    */
  var Country: js.UndefOr[Alpha2CountryCode] = js.undefined
  
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined
  
  /**
    * The token used to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number type used to filter results. Required for non-US numbers.
    */
  var PhoneNumberType: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.PhoneNumberType] = js.undefined
  
  /**
    * The state used to filter results. Required only if you provide City. Only applies to the US.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The toll-free prefix that you use to filter results. Only applies to the US.
    */
  var TollFreePrefix: js.UndefOr[typingsJapgolly.awsSdk.clientsChimeMod.TollFreePrefix] = js.undefined
}
object SearchAvailablePhoneNumbersRequest {
  
  inline def apply(): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
  
  extension [Self <: SearchAvailablePhoneNumbersRequest](x: Self) {
    
    inline def setAreaCode(value: String): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
    
    inline def setAreaCodeUndefined: Self = StObject.set(x, "AreaCode", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: Alpha2CountryCode): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setMaxResults(value: PhoneNumberMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypeUndefined: Self = StObject.set(x, "PhoneNumberType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTollFreePrefix(value: TollFreePrefix): Self = StObject.set(x, "TollFreePrefix", value.asInstanceOf[js.Any])
    
    inline def setTollFreePrefixUndefined: Self = StObject.set(x, "TollFreePrefix", js.undefined)
  }
}
