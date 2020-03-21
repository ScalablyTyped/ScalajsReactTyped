package typingsJapgolly.rfc6902.diffMod

import typingsJapgolly.rfc6902.rfc6902Strings.add
import typingsJapgolly.rfc6902.rfc6902Strings.copy
import typingsJapgolly.rfc6902.rfc6902Strings.move
import typingsJapgolly.rfc6902.rfc6902Strings.remove
import typingsJapgolly.rfc6902.rfc6902Strings.replace
import typingsJapgolly.rfc6902.rfc6902Strings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rfc6902.diffMod.AddOperation
  - typingsJapgolly.rfc6902.diffMod.RemoveOperation
  - typingsJapgolly.rfc6902.diffMod.ReplaceOperation
  - typingsJapgolly.rfc6902.diffMod.MoveOperation
  - typingsJapgolly.rfc6902.diffMod.CopyOperation
  - typingsJapgolly.rfc6902.diffMod.TestOperation
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  def MoveOperation(from: String, op: move, path: String): Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def RemoveOperation(op: remove, path: String): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def TestOperation(op: test, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def CopyOperation(from: String, op: copy, path: String): Operation = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def AddOperation(op: add, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  def ReplaceOperation(op: replace, path: String, value: js.Any): Operation = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Operation]
  }
}

