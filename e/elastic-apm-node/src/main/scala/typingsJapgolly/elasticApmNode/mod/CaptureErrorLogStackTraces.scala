package typingsJapgolly.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.never
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.messages
  - typingsJapgolly.elasticApmNode.elasticApmNodeStrings.always
*/
trait CaptureErrorLogStackTraces extends js.Object

object CaptureErrorLogStackTraces {
  @scala.inline
  def always: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messages: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.messages = this.cast("messages")
  @scala.inline
  def never: typingsJapgolly.elasticApmNode.elasticApmNodeStrings.never = this.cast("never")
}

