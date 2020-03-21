package typingsJapgolly.json8Patch.mod

import typingsJapgolly.json8Patch.json8PatchStrings.add
import typingsJapgolly.json8Patch.json8PatchStrings.copy
import typingsJapgolly.json8Patch.json8PatchStrings.move
import typingsJapgolly.json8Patch.json8PatchStrings.remove
import typingsJapgolly.json8Patch.json8PatchStrings.replace
import typingsJapgolly.json8Patch.json8PatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.json8Patch.mod.AddOperation
  - typingsJapgolly.json8Patch.mod.RemoveOperation
  - typingsJapgolly.json8Patch.mod.ReplaceOperation
  - typingsJapgolly.json8Patch.mod.MoveOperation
  - typingsJapgolly.json8Patch.mod.CopyOperation
  - typingsJapgolly.json8Patch.mod.TestOperation
*/
trait JsonPatchOperation extends js.Object

object JsonPatchOperation {
  @scala.inline
  def AddOperation(op: add, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def CopyOperation(from: js.Any, op: copy, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def ReplaceOperation(op: replace, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def RemoveOperation(op: remove, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def MoveOperation(from: js.Any, op: move, path: String): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
  @scala.inline
  def TestOperation(op: test, path: String, value: js.Any): JsonPatchOperation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonPatchOperation]
  }
}

