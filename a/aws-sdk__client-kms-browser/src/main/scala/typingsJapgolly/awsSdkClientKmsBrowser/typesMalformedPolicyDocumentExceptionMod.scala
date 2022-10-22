package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMalformedPolicyDocumentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MalformedPolicyDocumentExceptionDetails> * / any */ trait MalformedPolicyDocumentException
    extends StObject
       with CreateKeyExceptionsUnion
       with PutKeyPolicyExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException
  }
  object MalformedPolicyDocumentException {
    
    inline def apply(): MalformedPolicyDocumentException = {
      val __obj = js.Dynamic.literal(name = "MalformedPolicyDocumentException")
      __obj.asInstanceOf[MalformedPolicyDocumentException]
    }
    
    extension [Self <: MalformedPolicyDocumentException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.MalformedPolicyDocumentException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MalformedPolicyDocumentExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object MalformedPolicyDocumentExceptionDetails {
    
    inline def apply(): MalformedPolicyDocumentExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MalformedPolicyDocumentExceptionDetails]
    }
    
    extension [Self <: MalformedPolicyDocumentExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
