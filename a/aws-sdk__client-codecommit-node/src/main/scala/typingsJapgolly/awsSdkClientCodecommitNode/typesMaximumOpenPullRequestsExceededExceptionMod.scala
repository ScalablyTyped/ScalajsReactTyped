package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMaximumOpenPullRequestsExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MaximumOpenPullRequestsExceededExceptionDetails> * / any */ trait MaximumOpenPullRequestsExceededException
    extends StObject
       with CreatePullRequestExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException
  }
  object MaximumOpenPullRequestsExceededException {
    
    inline def apply(): MaximumOpenPullRequestsExceededException = {
      val __obj = js.Dynamic.literal(name = "MaximumOpenPullRequestsExceededException")
      __obj.asInstanceOf[MaximumOpenPullRequestsExceededException]
    }
    
    extension [Self <: MaximumOpenPullRequestsExceededException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaximumOpenPullRequestsExceededExceptionDetails extends StObject
}
