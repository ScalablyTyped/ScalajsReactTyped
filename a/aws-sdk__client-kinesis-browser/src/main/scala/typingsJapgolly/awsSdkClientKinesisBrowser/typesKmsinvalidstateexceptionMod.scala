package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsinvalidstateexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSInvalidStateExceptionDetails> * / any */ trait KMSInvalidStateException
    extends StObject
       with GetRecordsExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion
       with StartStreamEncryptionExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSInvalidStateException
  }
  object KMSInvalidStateException {
    
    inline def apply(): KMSInvalidStateException = {
      val __obj = js.Dynamic.literal(name = "KMSInvalidStateException")
      __obj.asInstanceOf[KMSInvalidStateException]
    }
    
    extension [Self <: KMSInvalidStateException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSInvalidStateException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSInvalidStateExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KMSInvalidStateExceptionDetails {
    
    inline def apply(): KMSInvalidStateExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSInvalidStateExceptionDetails]
    }
    
    extension [Self <: KMSInvalidStateExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
