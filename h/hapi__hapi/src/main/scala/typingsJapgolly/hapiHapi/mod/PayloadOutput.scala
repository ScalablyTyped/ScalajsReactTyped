package typingsJapgolly.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiHapi.hapiHapiStrings.data
  - typingsJapgolly.hapiHapi.hapiHapiStrings.stream
  - typingsJapgolly.hapiHapi.hapiHapiStrings.file
*/
trait PayloadOutput extends js.Object

object PayloadOutput {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsJapgolly.hapiHapi.hapiHapiStrings.data = this.cast("data")
  @scala.inline
  def file: typingsJapgolly.hapiHapi.hapiHapiStrings.file = this.cast("file")
  @scala.inline
  def stream: typingsJapgolly.hapiHapi.hapiHapiStrings.stream = this.cast("stream")
}

