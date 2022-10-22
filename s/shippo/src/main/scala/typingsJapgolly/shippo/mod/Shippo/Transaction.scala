package typingsJapgolly.shippo.mod.Shippo

import typingsJapgolly.shippo.shippoStrings.DELIVERED
import typingsJapgolly.shippo.shippoStrings.ERROR
import typingsJapgolly.shippo.shippoStrings.FAILURE
import typingsJapgolly.shippo.shippoStrings.INVALID
import typingsJapgolly.shippo.shippoStrings.PDF
import typingsJapgolly.shippo.shippoStrings.PDF_2Dot3x7Dot5
import typingsJapgolly.shippo.shippoStrings.PDF_4x6
import typingsJapgolly.shippo.shippoStrings.PDF_4x8
import typingsJapgolly.shippo.shippoStrings.PDF_A4
import typingsJapgolly.shippo.shippoStrings.PDF_A6
import typingsJapgolly.shippo.shippoStrings.PNG
import typingsJapgolly.shippo.shippoStrings.PNG_2Dot3x7Dot5
import typingsJapgolly.shippo.shippoStrings.QUEUED
import typingsJapgolly.shippo.shippoStrings.REFUNDED
import typingsJapgolly.shippo.shippoStrings.REFUNDPENDING
import typingsJapgolly.shippo.shippoStrings.REFUNDREJECTED
import typingsJapgolly.shippo.shippoStrings.RETURNED
import typingsJapgolly.shippo.shippoStrings.SUCCESS
import typingsJapgolly.shippo.shippoStrings.TRANSIT
import typingsJapgolly.shippo.shippoStrings.UNKNOWN
import typingsJapgolly.shippo.shippoStrings.VALID
import typingsJapgolly.shippo.shippoStrings.WAITING
import typingsJapgolly.shippo.shippoStrings.ZPLII
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction
  extends StObject
     with Metadata {
  
  var commercial_invoice_url: String
  
  var eta: String
  
  var label_file_type: PNG | PNG_2Dot3x7Dot5 | PDF | PDF_2Dot3x7Dot5 | PDF_4x6 | PDF_4x8 | PDF_A4 | PDF_A6 | ZPLII
  
  var label_url: String
  
  var messages: js.Array[Message]
  
  var metadata: String
  
  var object_state: VALID | INVALID
  
  var qr_code_url: String
  
  var rate: Rate
  
  var status: WAITING | QUEUED | SUCCESS | ERROR | REFUNDED | REFUNDPENDING | REFUNDREJECTED
  
  var test: Boolean
  
  var tracking_number: String
  
  var tracking_status: UNKNOWN | DELIVERED | TRANSIT | FAILURE | RETURNED
  
  var tracking_url_provider: String
}
object Transaction {
  
  inline def apply(
    commercial_invoice_url: String,
    eta: String,
    label_file_type: PNG | PNG_2Dot3x7Dot5 | PDF | PDF_2Dot3x7Dot5 | PDF_4x6 | PDF_4x8 | PDF_A4 | PDF_A6 | ZPLII,
    label_url: String,
    messages: js.Array[Message],
    metadata: String,
    object_created: String,
    object_id: String,
    object_owner: String,
    object_state: VALID | INVALID,
    object_updated: String,
    qr_code_url: String,
    rate: Rate,
    status: WAITING | QUEUED | SUCCESS | ERROR | REFUNDED | REFUNDPENDING | REFUNDREJECTED,
    test: Boolean,
    tracking_number: String,
    tracking_status: UNKNOWN | DELIVERED | TRANSIT | FAILURE | RETURNED,
    tracking_url_provider: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(commercial_invoice_url = commercial_invoice_url.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], label_file_type = label_file_type.asInstanceOf[js.Any], label_url = label_url.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_state = object_state.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], qr_code_url = qr_code_url.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], tracking_number = tracking_number.asInstanceOf[js.Any], tracking_status = tracking_status.asInstanceOf[js.Any], tracking_url_provider = tracking_url_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setCommercial_invoice_url(value: String): Self = StObject.set(x, "commercial_invoice_url", value.asInstanceOf[js.Any])
    
    inline def setEta(value: String): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setLabel_file_type(value: PNG | PNG_2Dot3x7Dot5 | PDF | PDF_2Dot3x7Dot5 | PDF_4x6 | PDF_4x8 | PDF_A4 | PDF_A6 | ZPLII): Self = StObject.set(x, "label_file_type", value.asInstanceOf[js.Any])
    
    inline def setLabel_url(value: String): Self = StObject.set(x, "label_url", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject_state(value: VALID | INVALID): Self = StObject.set(x, "object_state", value.asInstanceOf[js.Any])
    
    inline def setQr_code_url(value: String): Self = StObject.set(x, "qr_code_url", value.asInstanceOf[js.Any])
    
    inline def setRate(value: Rate): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WAITING | QUEUED | SUCCESS | ERROR | REFUNDED | REFUNDPENDING | REFUNDREJECTED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTracking_number(value: String): Self = StObject.set(x, "tracking_number", value.asInstanceOf[js.Any])
    
    inline def setTracking_status(value: UNKNOWN | DELIVERED | TRANSIT | FAILURE | RETURNED): Self = StObject.set(x, "tracking_status", value.asInstanceOf[js.Any])
    
    inline def setTracking_url_provider(value: String): Self = StObject.set(x, "tracking_url_provider", value.asInstanceOf[js.Any])
  }
}
