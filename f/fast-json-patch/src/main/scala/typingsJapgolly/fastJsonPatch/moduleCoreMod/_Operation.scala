package typingsJapgolly.fastJsonPatch.moduleCoreMod

import typingsJapgolly.fastJsonPatch.fastJsonPatchStrings.copy
import typingsJapgolly.fastJsonPatch.fastJsonPatchStrings.move
import typingsJapgolly.fastJsonPatch.fastJsonPatchStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Operation extends js.Object

object _Operation {
  @scala.inline
  def RemoveOperation(op: remove, path: String): _Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Operation]
  }
  @scala.inline
  def MoveOperation(from: String, op: move, path: String): _Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Operation]
  }
  @scala.inline
  def CopyOperation(from: String, op: copy, path: String): _Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Operation]
  }
}

