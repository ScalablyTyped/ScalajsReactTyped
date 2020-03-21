package typingsJapgolly.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/comments", JSImport.Namespace)
@js.native
object serializersCommentsMod extends js.Object {
  @js.native
  class CommentSerializer ()
    extends typingsJapgolly.typedoc.serializersCommentsCommentMod.CommentSerializer
  
  @js.native
  class CommentTagSerializer ()
    extends typingsJapgolly.typedoc.commentTagMod.CommentTagSerializer
  
  /* static members */
  @js.native
  object CommentSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
  /* static members */
  @js.native
  object CommentTagSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

