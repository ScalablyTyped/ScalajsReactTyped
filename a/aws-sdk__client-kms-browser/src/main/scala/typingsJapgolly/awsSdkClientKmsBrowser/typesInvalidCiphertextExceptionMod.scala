package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.typesDecryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesImportKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesReEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidCiphertextExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidCiphertextExceptionDetails> * / any */ trait InvalidCiphertextException
    extends StObject
       with DecryptExceptionsUnion
       with ImportKeyMaterialExceptionsUnion
       with ReEncryptExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException
  }
  object InvalidCiphertextException {
    
    inline def apply(): InvalidCiphertextException = {
      val __obj = js.Dynamic.literal(name = "InvalidCiphertextException")
      __obj.asInstanceOf[InvalidCiphertextException]
    }
    
    extension [Self <: InvalidCiphertextException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidCiphertextException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidCiphertextExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidCiphertextExceptionDetails {
    
    inline def apply(): InvalidCiphertextExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidCiphertextExceptionDetails]
    }
    
    extension [Self <: InvalidCiphertextExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
