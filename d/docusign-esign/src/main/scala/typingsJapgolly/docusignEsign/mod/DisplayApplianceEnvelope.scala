package typingsJapgolly.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayApplianceEnvelope extends StObject {
  
  var addDemoStamp: js.UndefOr[Boolean] = js.undefined
  
  var allowMultipleAttachments: js.UndefOr[Boolean] = js.undefined
  
  var burnDefaultTabData: js.UndefOr[Boolean] = js.undefined
  
  var convertPdfFields: js.UndefOr[
    /*Boolean that specifies whether to enable PDF form fields to
    get converted to DocuSign secure fields when the document is added or
    uploaded to an envelope.*/ Boolean
  ] = js.undefined
  
  var envelopeId: js.UndefOr[
    /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec` */ String
  ] = js.undefined
  
  var envelopeType: js.UndefOr[String] = js.undefined
  
  var includeSigsBeforeComplete: js.UndefOr[Boolean] = js.undefined
  
  var isConcatMode: js.UndefOr[Boolean] = js.undefined
  
  var isEnvelopeIDStampingEnabled: js.UndefOr[Boolean] = js.undefined
  
  var pdfFormConversionFontScale100: js.UndefOr[Boolean] = js.undefined
  
  var shouldFlatten: js.UndefOr[Boolean] = js.undefined
  
  var showEnvelopeChanges: js.UndefOr[Boolean] = js.undefined
  
  var signOnline: js.UndefOr[Boolean] = js.undefined
  
  var status: js.UndefOr[/*The status of the item. */ String] = js.undefined
  
  var userId: js.UndefOr[
    /*The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    `userId` can represent another user whom the Administrator is accessing. */ String
  ] = js.undefined
}
object DisplayApplianceEnvelope {
  
  inline def apply(): DisplayApplianceEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayApplianceEnvelope]
  }
  
  extension [Self <: DisplayApplianceEnvelope](x: Self) {
    
    inline def setAddDemoStamp(value: Boolean): Self = StObject.set(x, "addDemoStamp", value.asInstanceOf[js.Any])
    
    inline def setAddDemoStampUndefined: Self = StObject.set(x, "addDemoStamp", js.undefined)
    
    inline def setAllowMultipleAttachments(value: Boolean): Self = StObject.set(x, "allowMultipleAttachments", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleAttachmentsUndefined: Self = StObject.set(x, "allowMultipleAttachments", js.undefined)
    
    inline def setBurnDefaultTabData(value: Boolean): Self = StObject.set(x, "burnDefaultTabData", value.asInstanceOf[js.Any])
    
    inline def setBurnDefaultTabDataUndefined: Self = StObject.set(x, "burnDefaultTabData", js.undefined)
    
    inline def setConvertPdfFields(
      value: /*Boolean that specifies whether to enable PDF form fields to
      get converted to DocuSign secure fields when the document is added or
      uploaded to an envelope.*/ Boolean
    ): Self = StObject.set(x, "convertPdfFields", value.asInstanceOf[js.Any])
    
    inline def setConvertPdfFieldsUndefined: Self = StObject.set(x, "convertPdfFields", js.undefined)
    
    inline def setEnvelopeId(value: /*The envelope's GUID. \n\nExample: `93be49ab-afa0-4adf-933c-f752070d71ec` */ String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setEnvelopeType(value: String): Self = StObject.set(x, "envelopeType", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeTypeUndefined: Self = StObject.set(x, "envelopeType", js.undefined)
    
    inline def setIncludeSigsBeforeComplete(value: Boolean): Self = StObject.set(x, "includeSigsBeforeComplete", value.asInstanceOf[js.Any])
    
    inline def setIncludeSigsBeforeCompleteUndefined: Self = StObject.set(x, "includeSigsBeforeComplete", js.undefined)
    
    inline def setIsConcatMode(value: Boolean): Self = StObject.set(x, "isConcatMode", value.asInstanceOf[js.Any])
    
    inline def setIsConcatModeUndefined: Self = StObject.set(x, "isConcatMode", js.undefined)
    
    inline def setIsEnvelopeIDStampingEnabled(value: Boolean): Self = StObject.set(x, "isEnvelopeIDStampingEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnvelopeIDStampingEnabledUndefined: Self = StObject.set(x, "isEnvelopeIDStampingEnabled", js.undefined)
    
    inline def setPdfFormConversionFontScale100(value: Boolean): Self = StObject.set(x, "pdfFormConversionFontScale100", value.asInstanceOf[js.Any])
    
    inline def setPdfFormConversionFontScale100Undefined: Self = StObject.set(x, "pdfFormConversionFontScale100", js.undefined)
    
    inline def setShouldFlatten(value: Boolean): Self = StObject.set(x, "shouldFlatten", value.asInstanceOf[js.Any])
    
    inline def setShouldFlattenUndefined: Self = StObject.set(x, "shouldFlatten", js.undefined)
    
    inline def setShowEnvelopeChanges(value: Boolean): Self = StObject.set(x, "showEnvelopeChanges", value.asInstanceOf[js.Any])
    
    inline def setShowEnvelopeChangesUndefined: Self = StObject.set(x, "showEnvelopeChanges", js.undefined)
    
    inline def setSignOnline(value: Boolean): Self = StObject.set(x, "signOnline", value.asInstanceOf[js.Any])
    
    inline def setSignOnlineUndefined: Self = StObject.set(x, "signOnline", js.undefined)
    
    inline def setStatus(value: /*The status of the item. */ String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUserId(
      value: /*The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
      `userId` can represent another user whom the Administrator is accessing. */ String
    ): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
