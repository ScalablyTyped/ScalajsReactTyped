package typingsJapgolly.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapi.hapiStrings.data
  - typingsJapgolly.hapi.hapiStrings.stream
  - typingsJapgolly.hapi.hapiStrings.file
*/
trait PayloadOutput extends js.Object

object PayloadOutput {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsJapgolly.hapi.hapiStrings.data = this.cast("data")
  @scala.inline
  def file: typingsJapgolly.hapi.hapiStrings.file = this.cast("file")
  @scala.inline
  def stream: typingsJapgolly.hapi.hapiStrings.stream = this.cast("stream")
}

