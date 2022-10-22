package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidReferenceNameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidReferenceNameExceptionDetails> * / any */ trait InvalidReferenceNameException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidReferenceNameException
  }
  object InvalidReferenceNameException {
    
    inline def apply(): InvalidReferenceNameException = {
      val __obj = js.Dynamic.literal(name = "InvalidReferenceNameException")
      __obj.asInstanceOf[InvalidReferenceNameException]
    }
    
    extension [Self <: InvalidReferenceNameException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidReferenceNameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidReferenceNameExceptionDetails extends StObject
}
