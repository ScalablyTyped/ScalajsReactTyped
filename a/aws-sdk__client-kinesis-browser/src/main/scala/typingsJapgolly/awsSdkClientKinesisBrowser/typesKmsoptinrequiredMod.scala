package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionExceptionsUnionMod.StartStreamEncryptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKmsoptinrequiredMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_KMSOptInRequiredDetails> * / any */ trait KMSOptInRequired
    extends StObject
       with GetRecordsExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion
       with StartStreamEncryptionExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSOptInRequired
  }
  object KMSOptInRequired {
    
    inline def apply(): KMSOptInRequired = {
      val __obj = js.Dynamic.literal(name = "KMSOptInRequired")
      __obj.asInstanceOf[KMSOptInRequired]
    }
    
    extension [Self <: KMSOptInRequired](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMSOptInRequired
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait KMSOptInRequiredDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object KMSOptInRequiredDetails {
    
    inline def apply(): KMSOptInRequiredDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KMSOptInRequiredDetails]
    }
    
    extension [Self <: KMSOptInRequiredDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
