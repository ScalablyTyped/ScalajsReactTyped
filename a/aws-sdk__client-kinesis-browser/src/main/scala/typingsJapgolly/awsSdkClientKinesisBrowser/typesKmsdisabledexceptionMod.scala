package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsdisabledexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSDisabledExceptionDetails> * / any */ trait KMSDisabledException
    extends StObject
       with GetRecordsExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion
       with StartStreamEncryptionExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSDisabledException
  }
  object KMSDisabledException {
    
    inline def apply(): KMSDisabledException = {
      val __obj = js.Dynamic.literal(name = "KMSDisabledException")
      __obj.asInstanceOf[KMSDisabledException]
    }
    
    extension [Self <: KMSDisabledException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSDisabledException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSDisabledExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KMSDisabledExceptionDetails {
    
    inline def apply(): KMSDisabledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSDisabledExceptionDetails]
    }
    
    extension [Self <: KMSDisabledExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
