package typingsJapgolly.jsonPatch.mod

import typingsJapgolly.jsonPatch.jsonPatchStrings.add
import typingsJapgolly.jsonPatch.jsonPatchStrings.copy
import typingsJapgolly.jsonPatch.jsonPatchStrings.move
import typingsJapgolly.jsonPatch.jsonPatchStrings.remove
import typingsJapgolly.jsonPatch.jsonPatchStrings.replace
import typingsJapgolly.jsonPatch.jsonPatchStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsonPatch.mod.AddPatch
  - typingsJapgolly.jsonPatch.mod.RemovePatch
  - typingsJapgolly.jsonPatch.mod.ReplacePatch
  - typingsJapgolly.jsonPatch.mod.MovePatch
  - typingsJapgolly.jsonPatch.mod.CopyPatch
  - typingsJapgolly.jsonPatch.mod.TestPatch
*/
trait OpPatch extends js.Object

object OpPatch {
  @scala.inline
  def AddPatch(op: add, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def TestPatch(op: test, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def RemovePatch(op: remove, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def CopyPatch(from: String, op: copy, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def ReplacePatch(op: replace, path: String, value: js.Any): OpPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
  @scala.inline
  def MovePatch(from: String, op: move, path: String): OpPatch = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpPatch]
  }
}

