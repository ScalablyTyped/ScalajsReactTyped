package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiHapi.hapiHapiStrings.peek
  - typingsJapgolly.hapiHapi.hapiHapiStrings.finish
  - typingsJapgolly.hapiHapi.hapiHapiStrings.disconnect
*/
trait RequestEventType extends js.Object

object RequestEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typingsJapgolly.hapiHapi.hapiHapiStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def finish: typingsJapgolly.hapiHapi.hapiHapiStrings.finish = this.cast("finish")
  @scala.inline
  def peek: typingsJapgolly.hapiHapi.hapiHapiStrings.peek = this.cast("peek")
}

