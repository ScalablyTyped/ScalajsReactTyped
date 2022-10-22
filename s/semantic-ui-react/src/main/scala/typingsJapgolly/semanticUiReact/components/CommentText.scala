package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentTextMod.CommentTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CommentText {
  
  @JSImport("semantic-ui-react", "CommentText")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CommentText.type): SharedBuilder_CommentTextProps_1826269331 = new SharedBuilder_CommentTextProps_1826269331(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommentTextProps): SharedBuilder_CommentTextProps_1826269331 = new SharedBuilder_CommentTextProps_1826269331(js.Array(this.component, p.asInstanceOf[js.Any]))
}
