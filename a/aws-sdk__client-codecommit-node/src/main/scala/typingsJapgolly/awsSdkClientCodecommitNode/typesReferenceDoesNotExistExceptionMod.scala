package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReferenceDoesNotExistExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ReferenceDoesNotExistExceptionDetails> * / any */ trait ReferenceDoesNotExistException
    extends StObject
       with CreatePullRequestExceptionsUnion
       with MergePullRequestByFastForwardExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
  }
  object ReferenceDoesNotExistException {
    
    inline def apply(): ReferenceDoesNotExistException = {
      val __obj = js.Dynamic.literal(name = "ReferenceDoesNotExistException")
      __obj.asInstanceOf[ReferenceDoesNotExistException]
    }
    
    extension [Self <: ReferenceDoesNotExistException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.ReferenceDoesNotExistException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceDoesNotExistExceptionDetails extends StObject
}
