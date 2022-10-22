package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of results to return per page. The default MaxResult size is 100.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCodes: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.PhoneNumberCountryCodes] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberTypes: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.PhoneNumberTypes] = js.undefined
}
object ListPhoneNumbersRequest {
  
  inline def apply(InstanceId: InstanceId): ListPhoneNumbersRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersRequest]
  }
  
  extension [Self <: ListPhoneNumbersRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberCountryCodes(value: PhoneNumberCountryCodes): Self = StObject.set(x, "PhoneNumberCountryCodes", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCodesUndefined: Self = StObject.set(x, "PhoneNumberCountryCodes", js.undefined)
    
    inline def setPhoneNumberCountryCodesVarargs(value: PhoneNumberCountryCode*): Self = StObject.set(x, "PhoneNumberCountryCodes", js.Array(value*))
    
    inline def setPhoneNumberTypes(value: PhoneNumberTypes): Self = StObject.set(x, "PhoneNumberTypes", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypesUndefined: Self = StObject.set(x, "PhoneNumberTypes", js.undefined)
    
    inline def setPhoneNumberTypesVarargs(value: PhoneNumberType*): Self = StObject.set(x, "PhoneNumberTypes", js.Array(value*))
  }
}
