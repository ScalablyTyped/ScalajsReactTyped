package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidAuthorArnExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidAuthorArnExceptionDetails> * / any */ trait InvalidAuthorArnException
    extends StObject
       with ListPullRequestsExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidAuthorArnException
  }
  object InvalidAuthorArnException {
    
    inline def apply(): InvalidAuthorArnException = {
      val __obj = js.Dynamic.literal(name = "InvalidAuthorArnException")
      __obj.asInstanceOf[InvalidAuthorArnException]
    }
    
    extension [Self <: InvalidAuthorArnException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidAuthorArnException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidAuthorArnExceptionDetails extends StObject
}
