package typingsJapgolly.slateReact.mod

import typingsJapgolly.slate.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorState extends js.Object {
  var value: Value
}

object EditorState {
  @scala.inline
  def apply(value: Value): EditorState = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorState]
  }
}

