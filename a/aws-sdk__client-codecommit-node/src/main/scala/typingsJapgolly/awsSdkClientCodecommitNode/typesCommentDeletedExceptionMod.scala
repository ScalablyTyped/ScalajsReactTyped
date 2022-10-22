package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentExceptionsUnionMod.DeleteCommentContentExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentExceptionsUnionMod.GetCommentExceptionsUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommentDeletedExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CommentDeletedExceptionDetails> * / any */ trait CommentDeletedException
    extends StObject
       with DeleteCommentContentExceptionsUnion
       with GetCommentExceptionsUnion
       with UpdateCommentExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDeletedException
  }
  object CommentDeletedException {
    
    inline def apply(): CommentDeletedException = {
      val __obj = js.Dynamic.literal(name = "CommentDeletedException")
      __obj.asInstanceOf[CommentDeletedException]
    }
    
    extension [Self <: CommentDeletedException](x: Self) {
      
      inline def setName(
        value: typingsJapgolly.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CommentDeletedException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommentDeletedExceptionDetails extends StObject
}
