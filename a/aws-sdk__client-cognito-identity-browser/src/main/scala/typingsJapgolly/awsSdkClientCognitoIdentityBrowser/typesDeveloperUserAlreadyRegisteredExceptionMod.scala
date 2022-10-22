package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityExceptionsUnionMod.GetOpenIdTokenForDeveloperIdentityExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeveloperUserAlreadyRegisteredExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_DeveloperUserAlreadyRegisteredExceptionDetails> * / any */ trait DeveloperUserAlreadyRegisteredException
    extends StObject
       with GetOpenIdTokenForDeveloperIdentityExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
  }
  object DeveloperUserAlreadyRegisteredException {
    
    inline def apply(): DeveloperUserAlreadyRegisteredException = {
      val __obj = js.Dynamic.literal(name = "DeveloperUserAlreadyRegisteredException")
      __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
    }
    
    extension [Self <: DeveloperUserAlreadyRegisteredException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.DeveloperUserAlreadyRegisteredException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeveloperUserAlreadyRegisteredExceptionDetails extends StObject {
    
    /**
      * <p>This developer user identifier is already registered with Cognito.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object DeveloperUserAlreadyRegisteredExceptionDetails {
    
    inline def apply(): DeveloperUserAlreadyRegisteredExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeveloperUserAlreadyRegisteredExceptionDetails]
    }
    
    extension [Self <: DeveloperUserAlreadyRegisteredExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
