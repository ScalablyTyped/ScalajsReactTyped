package typingsJapgolly.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTwimlFaxResponseMod {
  
  @JSImport("twilio/lib/twiml/FaxResponse", JSImport.Namespace)
  @js.native
  /**
    * <Response> TwiML for Faxes
    */
  open class ^ ()
    extends StObject
       with FaxResponse
  
  @js.native
  trait FaxResponse extends StObject {
    
    /**
      * <Receive> TwiML Verb
      *
      * @param attributes - TwiML attributes
      */
    def receive(): Unit = js.native
    def receive(attributes: ReceiveAttributes): Unit = js.native
  }
  
  trait ReceiveAttributes extends StObject {
    
    var action: js.UndefOr[String] = js.undefined
    
    var mediaType: js.UndefOr[ReceiveMediaType] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var pageSize: js.UndefOr[ReceivePageSize] = js.undefined
    
    var storeMedia: js.UndefOr[Boolean] = js.undefined
  }
  object ReceiveAttributes {
    
    inline def apply(): ReceiveAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReceiveAttributes]
    }
    
    extension [Self <: ReceiveAttributes](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setMediaType(value: ReceiveMediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPageSize(value: ReceivePageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setStoreMedia(value: Boolean): Self = StObject.set(x, "storeMedia", value.asInstanceOf[js.Any])
      
      inline def setStoreMediaUndefined: Self = StObject.set(x, "storeMedia", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.twilio.twilioStrings.applicationSlashpdf
    - typingsJapgolly.twilio.twilioStrings.imageSlashtiff
  */
  trait ReceiveMediaType extends StObject
  object ReceiveMediaType {
    
    inline def applicationSlashpdf: typingsJapgolly.twilio.twilioStrings.applicationSlashpdf = "application/pdf".asInstanceOf[typingsJapgolly.twilio.twilioStrings.applicationSlashpdf]
    
    inline def imageSlashtiff: typingsJapgolly.twilio.twilioStrings.imageSlashtiff = "image/tiff".asInstanceOf[typingsJapgolly.twilio.twilioStrings.imageSlashtiff]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.twilio.twilioStrings.letter
    - typingsJapgolly.twilio.twilioStrings.legal
    - typingsJapgolly.twilio.twilioStrings.a4
  */
  trait ReceivePageSize extends StObject
  object ReceivePageSize {
    
    inline def a4: typingsJapgolly.twilio.twilioStrings.a4 = "a4".asInstanceOf[typingsJapgolly.twilio.twilioStrings.a4]
    
    inline def legal: typingsJapgolly.twilio.twilioStrings.legal = "legal".asInstanceOf[typingsJapgolly.twilio.twilioStrings.legal]
    
    inline def letter: typingsJapgolly.twilio.twilioStrings.letter = "letter".asInstanceOf[typingsJapgolly.twilio.twilioStrings.letter]
  }
}
