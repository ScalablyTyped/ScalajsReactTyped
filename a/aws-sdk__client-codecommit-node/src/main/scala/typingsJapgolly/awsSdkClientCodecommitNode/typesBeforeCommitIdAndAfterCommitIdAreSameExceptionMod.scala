package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBeforeCommitIdAndAfterCommitIdAreSameExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails> * / any */ trait BeforeCommitIdAndAfterCommitIdAreSameException
    extends StObject
       with PostCommentForComparedCommitExceptionsUnion
       with PostCommentForPullRequestExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
  }
  object BeforeCommitIdAndAfterCommitIdAreSameException {
    
    inline def apply(): BeforeCommitIdAndAfterCommitIdAreSameException = {
      val __obj = js.Dynamic.literal(name = "BeforeCommitIdAndAfterCommitIdAreSameException")
      __obj.asInstanceOf[BeforeCommitIdAndAfterCommitIdAreSameException]
    }
    
    extension [Self <: BeforeCommitIdAndAfterCommitIdAreSameException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails extends StObject
}
