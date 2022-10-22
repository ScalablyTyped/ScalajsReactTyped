package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesExceptionsUnionMod.SetIdentityPoolRolesExceptionsUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConcurrentModificationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ConcurrentModificationExceptionDetails> * / any */ trait ConcurrentModificationException
    extends StObject
       with SetIdentityPoolRolesExceptionsUnion
       with UpdateIdentityPoolExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
  }
  object ConcurrentModificationException {
    
    inline def apply(): ConcurrentModificationException = {
      val __obj = js.Dynamic.literal(name = "ConcurrentModificationException")
      __obj.asInstanceOf[ConcurrentModificationException]
    }
    
    extension [Self <: ConcurrentModificationException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.ConcurrentModificationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConcurrentModificationExceptionDetails extends StObject {
    
    /**
      * <p>The message returned by a ConcurrentModificationException.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ConcurrentModificationExceptionDetails {
    
    inline def apply(): ConcurrentModificationExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcurrentModificationExceptionDetails]
    }
    
    extension [Self <: ConcurrentModificationExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
