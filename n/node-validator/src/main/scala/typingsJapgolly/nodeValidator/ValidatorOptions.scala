package typingsJapgolly.nodeValidator

import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorOptions {
  
  trait IsDateOptions
    extends StObject
       with Options {
    
    var format: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object IsDateOptions {
    
    inline def apply(): IsDateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsDateOptions]
    }
    
    extension [Self <: IsDateOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait IsNumberOptions
    extends StObject
       with Options {
    
    var max: js.UndefOr[Number] = js.undefined
    
    var min: js.UndefOr[Number] = js.undefined
  }
  object IsNumberOptions {
    
    inline def apply(): IsNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsNumberOptions]
    }
    
    extension [Self <: IsNumberOptions](x: Self) {
      
      inline def setMax(value: Number): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Number): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  trait IsStringOptions
    extends StObject
       with Options {
    
    var message: js.UndefOr[String] = js.undefined
    
    var regex: js.UndefOr[js.RegExp] = js.undefined
  }
  object IsStringOptions {
    
    inline def apply(): IsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsStringOptions]
    }
    
    extension [Self <: IsStringOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeValidator.ValidatorOptions.IsStringOptions
    - typingsJapgolly.nodeValidator.ValidatorOptions.IsNumberOptions
    - typingsJapgolly.nodeValidator.ValidatorOptions.IsDateOptions
  */
  trait Options extends StObject
  object Options {
    
    inline def IsDateOptions(): typingsJapgolly.nodeValidator.ValidatorOptions.IsDateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.nodeValidator.ValidatorOptions.IsDateOptions]
    }
    
    inline def IsNumberOptions(): typingsJapgolly.nodeValidator.ValidatorOptions.IsNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.nodeValidator.ValidatorOptions.IsNumberOptions]
    }
    
    inline def IsStringOptions(): typingsJapgolly.nodeValidator.ValidatorOptions.IsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.nodeValidator.ValidatorOptions.IsStringOptions]
    }
  }
}
