package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NORMAL
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.AND
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NOT
*/
trait FieldSelectionModeType extends js.Object

object FieldSelectionModeType {
  @scala.inline
  def AND: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.AND = this.cast("AND")
  @scala.inline
  def NORMAL: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NORMAL = this.cast("NORMAL")
  @scala.inline
  def NOT: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NOT = this.cast("NOT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

