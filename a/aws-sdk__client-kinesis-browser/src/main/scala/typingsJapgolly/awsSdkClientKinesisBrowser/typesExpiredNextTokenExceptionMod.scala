package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesListShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpiredNextTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ExpiredNextTokenExceptionDetails> * / any */ trait ExpiredNextTokenException
    extends StObject
       with ListShardsExceptionsUnion
       with ListStreamConsumersExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
  }
  object ExpiredNextTokenException {
    
    inline def apply(): ExpiredNextTokenException = {
      val __obj = js.Dynamic.literal(name = "ExpiredNextTokenException")
      __obj.asInstanceOf[ExpiredNextTokenException]
    }
    
    extension [Self <: ExpiredNextTokenException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpiredNextTokenExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ExpiredNextTokenExceptionDetails {
    
    inline def apply(): ExpiredNextTokenExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpiredNextTokenExceptionDetails]
    }
    
    extension [Self <: ExpiredNextTokenExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
