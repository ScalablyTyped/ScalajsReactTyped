package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSAMLProviderTagsRequest extends StObject {
  
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  
  /**
    * The ARN of the Security Assertion Markup Language (SAML) identity provider whose tags you want to see. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var SAMLProviderArn: arnType
}
object ListSAMLProviderTagsRequest {
  
  inline def apply(SAMLProviderArn: arnType): ListSAMLProviderTagsRequest = {
    val __obj = js.Dynamic.literal(SAMLProviderArn = SAMLProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSAMLProviderTagsRequest]
  }
  
  extension [Self <: ListSAMLProviderTagsRequest](x: Self) {
    
    inline def setMarker(value: markerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: maxItemsType): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setSAMLProviderArn(value: arnType): Self = StObject.set(x, "SAMLProviderArn", value.asInstanceOf[js.Any])
  }
}
