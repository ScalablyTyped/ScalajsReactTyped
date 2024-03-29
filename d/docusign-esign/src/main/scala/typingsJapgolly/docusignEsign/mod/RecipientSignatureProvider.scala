package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientSignatureProvider extends StObject {
  
  /**
    * By default, electronic seals apply on all documents in an envelope. If any of the documents has a `signHere` tab,
    * then a visual representation of the electronic seal will show up in the final document. If not, the electronic seal will be visible
    * in the metadata but not in the content of the document.
    *
    * To apply electronic seals on specific documents only, you must enable the  `sealDocumentsWithTabsOnly` parameter.
    * In this case, Electronic Seal applies only on documents that have `signHere` tabs set for the Electronic Seal recipient. Other documents won't be sealed.
    */
  var sealDocumentsWithTabsOnly: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the name of the electronic seal to apply on documents.
    *
    */
  var sealName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of an Electronic or Standards Based Signature (digital signature) provider for the signer to use.
    * For details, see [the current provider list](https://developers.docusign.com/esign-rest-api/guides/standards-based-signatures).
    * You can also retrieve the list by using the
    * [AccountSignatureProviders::List](https://developers.docusign.com/esign-rest-api/reference/Accounts/AccountSignatureProviders/list/) method.
    *
    * Example: `universalsignaturepen_default`
    *
    *
    */
  var signatureProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signatureProviderName` property is editable.
    *
    */
  var signatureProviderNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Not applicable for this object.
    */
  var signatureProviderOptions: js.UndefOr[RecipientSignatureProviderOptions] = js.undefined
}
object RecipientSignatureProvider {
  
  inline def apply(): RecipientSignatureProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientSignatureProvider]
  }
  
  extension [Self <: RecipientSignatureProvider](x: Self) {
    
    inline def setSealDocumentsWithTabsOnly(value: String): Self = StObject.set(x, "sealDocumentsWithTabsOnly", value.asInstanceOf[js.Any])
    
    inline def setSealDocumentsWithTabsOnlyUndefined: Self = StObject.set(x, "sealDocumentsWithTabsOnly", js.undefined)
    
    inline def setSealName(value: String): Self = StObject.set(x, "sealName", value.asInstanceOf[js.Any])
    
    inline def setSealNameUndefined: Self = StObject.set(x, "sealName", js.undefined)
    
    inline def setSignatureProviderName(value: String): Self = StObject.set(x, "signatureProviderName", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signatureProviderNameMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderNameMetadataUndefined: Self = StObject.set(x, "signatureProviderNameMetadata", js.undefined)
    
    inline def setSignatureProviderNameUndefined: Self = StObject.set(x, "signatureProviderName", js.undefined)
    
    inline def setSignatureProviderOptions(value: RecipientSignatureProviderOptions): Self = StObject.set(x, "signatureProviderOptions", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderOptionsUndefined: Self = StObject.set(x, "signatureProviderOptions", js.undefined)
  }
}
