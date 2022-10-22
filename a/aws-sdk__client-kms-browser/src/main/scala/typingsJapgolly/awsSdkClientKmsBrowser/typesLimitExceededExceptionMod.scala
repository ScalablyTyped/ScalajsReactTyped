package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesCreateGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesEnableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesPutKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_LimitExceededExceptionDetails> * / any */ trait LimitExceededException
    extends StObject
       with CreateAliasExceptionsUnion
       with CreateGrantExceptionsUnion
       with CreateKeyExceptionsUnion
       with EnableKeyExceptionsUnion
       with PutKeyPolicyExceptionsUnion
       with TagResourceExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException
  }
  object LimitExceededException {
    
    inline def apply(): LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[LimitExceededException]
    }
    
    extension [Self <: LimitExceededException](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait LimitExceededExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object LimitExceededExceptionDetails {
    
    inline def apply(): LimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitExceededExceptionDetails]
    }
    
    extension [Self <: LimitExceededExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
