package typingsJapgolly.payuEmeaSdk

import typingsJapgolly.payuEmeaSdk.payu.SecureFormErrorMessage
import typingsJapgolly.payuEmeaSdk.payu.fontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: String
  }
  object Error {
    
    inline def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontColor extends StObject {
    
    var fontColor: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[typingsJapgolly.payuEmeaSdk.payu.fontWeight] = js.undefined
    
    var letterSpacing: js.UndefOr[String] = js.undefined
  }
  object FontColor {
    
    inline def apply(): FontColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontColor]
    }
    
    extension [Self <: FontColor](x: Self) {
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: fontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    }
  }
  
  trait FontWeight extends StObject {
    
    var fontColor: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[typingsJapgolly.payuEmeaSdk.payu.fontWeight] = js.undefined
  }
  object FontWeight {
    
    inline def apply(): FontWeight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontWeight]
    }
    
    extension [Self <: FontWeight](x: Self) {
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setFontWeight(value: fontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  trait Mask extends StObject {
    
    var mask: String
    
    var token: String
  }
  object Mask {
    
    inline def apply(mask: String, token: String): Mask = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mask]
    }
    
    extension [Self <: Mask](x: Self) {
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Messages extends StObject {
    
    var messages: js.Array[SecureFormErrorMessage]
  }
  object Messages {
    
    inline def apply(messages: js.Array[SecureFormErrorMessage]): Messages = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    extension [Self <: Messages](x: Self) {
      
      inline def setMessages(value: js.Array[SecureFormErrorMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: SecureFormErrorMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    }
  }
}
