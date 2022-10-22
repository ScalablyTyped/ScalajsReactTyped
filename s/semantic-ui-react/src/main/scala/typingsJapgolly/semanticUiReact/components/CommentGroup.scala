package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsCommentCommentGroupMod.CommentGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CommentGroup {
  
  @JSImport("semantic-ui-react", "CommentGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CommentGroup.type): SharedBuilder_CommentGroupProps464793707 = new SharedBuilder_CommentGroupProps464793707(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommentGroupProps): SharedBuilder_CommentGroupProps464793707 = new SharedBuilder_CommentGroupProps464793707(js.Array(this.component, p.asInstanceOf[js.Any]))
}
