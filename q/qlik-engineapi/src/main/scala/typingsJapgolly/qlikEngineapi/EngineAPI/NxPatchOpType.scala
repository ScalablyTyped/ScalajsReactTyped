package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.Add
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.Remove
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.Replace
*/
trait NxPatchOpType extends js.Object

object NxPatchOpType {
  @scala.inline
  def Add: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.Add = this.cast("Add")
  @scala.inline
  def Remove: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.Remove = this.cast("Remove")
  @scala.inline
  def Replace: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.Replace = this.cast("Replace")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

