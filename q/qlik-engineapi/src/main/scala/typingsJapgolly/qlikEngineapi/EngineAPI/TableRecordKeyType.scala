package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NOT_KEY
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.ANY_KEY
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.PRIMARY_KEY
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.PERFECT_KEY
*/
trait TableRecordKeyType extends js.Object

object TableRecordKeyType {
  @scala.inline
  def ANY_KEY: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.ANY_KEY = this.cast("ANY_KEY")
  @scala.inline
  def NOT_KEY: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.NOT_KEY = this.cast("NOT_KEY")
  @scala.inline
  def PERFECT_KEY: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.PERFECT_KEY = this.cast("PERFECT_KEY")
  @scala.inline
  def PRIMARY_KEY: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.PRIMARY_KEY = this.cast("PRIMARY_KEY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

