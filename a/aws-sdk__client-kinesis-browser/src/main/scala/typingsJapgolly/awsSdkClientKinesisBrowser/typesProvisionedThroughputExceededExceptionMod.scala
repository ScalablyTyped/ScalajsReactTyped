package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetShardIteratorExceptionsUnionMod.GetShardIteratorExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedThroughputExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ProvisionedThroughputExceededExceptionDetails> * / any */ trait ProvisionedThroughputExceededException
    extends StObject
       with GetRecordsExceptionsUnion
       with GetShardIteratorExceptionsUnion
       with PutRecordExceptionsUnion
       with PutRecordsExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException
  }
  object ProvisionedThroughputExceededException {
    
    inline def apply(): ProvisionedThroughputExceededException = {
      val __obj = js.Dynamic.literal(name = "ProvisionedThroughputExceededException")
      __obj.asInstanceOf[ProvisionedThroughputExceededException]
    }
    
    extension [Self <: ProvisionedThroughputExceededException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvisionedThroughputExceededExceptionDetails extends StObject {
    
    /**
      * <p>A message that provides information about the error.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ProvisionedThroughputExceededExceptionDetails {
    
    inline def apply(): ProvisionedThroughputExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputExceededExceptionDetails]
    }
    
    extension [Self <: ProvisionedThroughputExceededExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
