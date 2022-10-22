package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIndexNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_IndexNotFoundExceptionDetails> * / any */ trait IndexNotFoundException
    extends StObject
       with UpdateGlobalTableSettingsExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.IndexNotFoundException
  }
  object IndexNotFoundException {
    
    inline def apply(): IndexNotFoundException = {
      val __obj = js.Dynamic.literal(name = "IndexNotFoundException")
      __obj.asInstanceOf[IndexNotFoundException]
    }
    
    extension [Self <: IndexNotFoundException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.IndexNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object IndexNotFoundExceptionDetails {
    
    inline def apply(): IndexNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndexNotFoundExceptionDetails]
    }
    
    extension [Self <: IndexNotFoundExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
