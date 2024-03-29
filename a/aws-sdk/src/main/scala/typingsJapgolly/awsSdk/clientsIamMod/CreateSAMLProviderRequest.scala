package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSAMLProviderRequest extends StObject {
  
  /**
    * The name of the provider to create. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var Name: SAMLProviderNameType
  
  /**
    * An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization's IdP. For more information, see About SAML 2.0-based federation in the IAM User Guide 
    */
  var SAMLMetadataDocument: SAMLMetadataDocumentType
  
  /**
    * A list of tags that you want to attach to the new IAM SAML provider. Each tag consists of a key name and an associated value. For more information about tagging, see Tagging IAM resources in the IAM User Guide.  If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. 
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}
object CreateSAMLProviderRequest {
  
  inline def apply(Name: SAMLProviderNameType, SAMLMetadataDocument: SAMLMetadataDocumentType): CreateSAMLProviderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SAMLMetadataDocument = SAMLMetadataDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSAMLProviderRequest]
  }
  
  extension [Self <: CreateSAMLProviderRequest](x: Self) {
    
    inline def setName(value: SAMLProviderNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSAMLMetadataDocument(value: SAMLMetadataDocumentType): Self = StObject.set(x, "SAMLMetadataDocument", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
