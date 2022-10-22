package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentController extends StObject {
  
  /**
    * Optional commenting range provider. Provide a list {@link Range ranges} which support commenting to any given resource uri.
    *
    * If not provided, users cannot leave any comments.
    */
  var commentingRangeProvider: js.UndefOr[CommentingRangeProvider] = js.undefined
  
  /**
    * Create a {@link CommentThread comment thread}. The comment thread will be displayed in visible text editors (if the resource matches)
    * and Comments Panel once created.
    *
    * @param uri The uri of the document the thread has been created on.
    * @param range The range the comment thread is located within the document.
    * @param comments The ordered comments of the thread.
    */
  def createCommentThread(uri: Uri, range: Range, comments: js.Array[Comment]): CommentThread
  
  /**
    * Dispose this comment controller.
    *
    * Once disposed, all {@link CommentThread comment threads} created by this comment controller will also be removed from the editor
    * and Comments Panel.
    */
  def dispose(): Unit
  
  /**
    * The id of this comment controller.
    */
  val id: String
  
  /**
    * The human-readable label of this comment controller.
    */
  val label: String
  
  /**
    * Comment controller options
    */
  var options: js.UndefOr[CommentOptions] = js.undefined
  
  /**
    * Optional reaction handler for creating and deleting reactions on a {@link Comment}.
    */
  var reactionHandler: js.UndefOr[
    js.Function2[/* comment */ Comment, /* reaction */ CommentReaction, Thenable[Unit]]
  ] = js.undefined
}
object CommentController {
  
  inline def apply(
    createCommentThread: (Uri, Range, js.Array[Comment]) => CommentThread,
    dispose: Callback,
    id: String,
    label: String
  ): CommentController = {
    val __obj = js.Dynamic.literal(createCommentThread = js.Any.fromFunction3(createCommentThread), dispose = dispose.toJsFn, id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentController]
  }
  
  extension [Self <: CommentController](x: Self) {
    
    inline def setCommentingRangeProvider(value: CommentingRangeProvider): Self = StObject.set(x, "commentingRangeProvider", value.asInstanceOf[js.Any])
    
    inline def setCommentingRangeProviderUndefined: Self = StObject.set(x, "commentingRangeProvider", js.undefined)
    
    inline def setCreateCommentThread(value: (Uri, Range, js.Array[Comment]) => CommentThread): Self = StObject.set(x, "createCommentThread", js.Any.fromFunction3(value))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: CommentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReactionHandler(value: (/* comment */ Comment, /* reaction */ CommentReaction) => Thenable[Unit]): Self = StObject.set(x, "reactionHandler", js.Any.fromFunction2(value))
    
    inline def setReactionHandlerUndefined: Self = StObject.set(x, "reactionHandler", js.undefined)
  }
}
