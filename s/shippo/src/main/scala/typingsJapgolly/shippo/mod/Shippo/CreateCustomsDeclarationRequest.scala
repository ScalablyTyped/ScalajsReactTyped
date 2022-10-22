package typingsJapgolly.shippo.mod.Shippo

import typingsJapgolly.shippo.shippoStrings.ABANDON
import typingsJapgolly.shippo.shippoStrings.AES_ITN
import typingsJapgolly.shippo.shippoStrings.DDP
import typingsJapgolly.shippo.shippoStrings.DDU
import typingsJapgolly.shippo.shippoStrings.DOCUMENTS
import typingsJapgolly.shippo.shippoStrings.GIFT
import typingsJapgolly.shippo.shippoStrings.HUMANITARIAN_DONATION
import typingsJapgolly.shippo.shippoStrings.MERCHANDISE
import typingsJapgolly.shippo.shippoStrings.NOEEI_30_36
import typingsJapgolly.shippo.shippoStrings.NOEEI_30_37_a
import typingsJapgolly.shippo.shippoStrings.NOEEI_30_37_h
import typingsJapgolly.shippo.shippoStrings.OTHER
import typingsJapgolly.shippo.shippoStrings.RETURN
import typingsJapgolly.shippo.shippoStrings.RETURN_MERCHANDISE
import typingsJapgolly.shippo.shippoStrings.SAMPLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomsDeclarationRequest extends StObject {
  
  var certify: Boolean
  
  var certify_signer: String
  
  var contents_explanation: js.UndefOr[String] = js.undefined
  
  var contents_type: DOCUMENTS | GIFT | SAMPLE | MERCHANDISE | HUMANITARIAN_DONATION | RETURN_MERCHANDISE | OTHER | String
  
  var eel_pfc: js.UndefOr[NOEEI_30_37_a | NOEEI_30_37_h | NOEEI_30_36 | AES_ITN] = js.undefined
  
  var incoterm: js.UndefOr[DDP | DDU] = js.undefined
  
  var items: js.Array[CreateCustomsItemRequest]
  
  var non_delivery_option: ABANDON | RETURN | String
}
object CreateCustomsDeclarationRequest {
  
  inline def apply(
    certify: Boolean,
    certify_signer: String,
    contents_type: DOCUMENTS | GIFT | SAMPLE | MERCHANDISE | HUMANITARIAN_DONATION | RETURN_MERCHANDISE | OTHER | String,
    items: js.Array[CreateCustomsItemRequest],
    non_delivery_option: ABANDON | RETURN | String
  ): CreateCustomsDeclarationRequest = {
    val __obj = js.Dynamic.literal(certify = certify.asInstanceOf[js.Any], certify_signer = certify_signer.asInstanceOf[js.Any], contents_type = contents_type.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], non_delivery_option = non_delivery_option.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomsDeclarationRequest]
  }
  
  extension [Self <: CreateCustomsDeclarationRequest](x: Self) {
    
    inline def setCertify(value: Boolean): Self = StObject.set(x, "certify", value.asInstanceOf[js.Any])
    
    inline def setCertify_signer(value: String): Self = StObject.set(x, "certify_signer", value.asInstanceOf[js.Any])
    
    inline def setContents_explanation(value: String): Self = StObject.set(x, "contents_explanation", value.asInstanceOf[js.Any])
    
    inline def setContents_explanationUndefined: Self = StObject.set(x, "contents_explanation", js.undefined)
    
    inline def setContents_type(
      value: DOCUMENTS | GIFT | SAMPLE | MERCHANDISE | HUMANITARIAN_DONATION | RETURN_MERCHANDISE | OTHER | String
    ): Self = StObject.set(x, "contents_type", value.asInstanceOf[js.Any])
    
    inline def setEel_pfc(value: NOEEI_30_37_a | NOEEI_30_37_h | NOEEI_30_36 | AES_ITN): Self = StObject.set(x, "eel_pfc", value.asInstanceOf[js.Any])
    
    inline def setEel_pfcUndefined: Self = StObject.set(x, "eel_pfc", js.undefined)
    
    inline def setIncoterm(value: DDP | DDU): Self = StObject.set(x, "incoterm", value.asInstanceOf[js.Any])
    
    inline def setIncotermUndefined: Self = StObject.set(x, "incoterm", js.undefined)
    
    inline def setItems(value: js.Array[CreateCustomsItemRequest]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CreateCustomsItemRequest*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNon_delivery_option(value: ABANDON | RETURN | String): Self = StObject.set(x, "non_delivery_option", value.asInstanceOf[js.Any])
  }
}
