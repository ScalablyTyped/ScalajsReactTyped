package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidDeletionParameterExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidDeletionParameterExceptionDetails> * / any */ trait InvalidDeletionParameterException
    extends StObject
       with PutFileExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDeletionParameterException
  }
  object InvalidDeletionParameterException {
    
    inline def apply(): InvalidDeletionParameterException = {
      val __obj = js.Dynamic.literal(name = "InvalidDeletionParameterException")
      __obj.asInstanceOf[InvalidDeletionParameterException]
    }
    
    extension [Self <: InvalidDeletionParameterException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDeletionParameterException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidDeletionParameterExceptionDetails extends StObject
}
