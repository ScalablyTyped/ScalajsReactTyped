package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPullRequestAlreadyClosedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PullRequestAlreadyClosedExceptionDetails> * / any */ trait PullRequestAlreadyClosedException
    extends StObject
       with MergePullRequestByFastForwardExceptionsUnion
       with UpdatePullRequestDescriptionExceptionsUnion
       with UpdatePullRequestTitleExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException
  }
  object PullRequestAlreadyClosedException {
    
    inline def apply(): PullRequestAlreadyClosedException = {
      val __obj = js.Dynamic.literal(name = "PullRequestAlreadyClosedException")
      __obj.asInstanceOf[PullRequestAlreadyClosedException]
    }
    
    extension [Self <: PullRequestAlreadyClosedException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PullRequestAlreadyClosedExceptionDetails extends StObject
}
