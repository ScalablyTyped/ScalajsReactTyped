package typingsJapgolly.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCommentReactionInput extends StObject {
  
  /**
    * The ID of the comment to which you want to add or update a reaction.
    */
  var commentId: CommentId
  
  /**
    * The emoji reaction you want to add or update. To remove a reaction, provide a value of blank or null. You can also provide the value of none. For information about emoji reaction values supported in AWS CodeCommit, see the AWS CodeCommit User Guide.
    */
  var reactionValue: ReactionValue
}
object PutCommentReactionInput {
  
  inline def apply(commentId: CommentId, reactionValue: ReactionValue): PutCommentReactionInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], reactionValue = reactionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCommentReactionInput]
  }
  
  extension [Self <: PutCommentReactionInput](x: Self) {
    
    inline def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setReactionValue(value: ReactionValue): Self = StObject.set(x, "reactionValue", value.asInstanceOf[js.Any])
  }
}
