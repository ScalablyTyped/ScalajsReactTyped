package typingsJapgolly.axios.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.axios.axiosStrings.arraybuffer
  - typings.axios.axiosStrings.blob
  - typings.axios.axiosStrings.document
  - typings.axios.axiosStrings.json
  - typings.axios.axiosStrings.text
  - typings.axios.axiosStrings.stream
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def arraybuffer: typingsJapgolly.axios.axiosStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def blob: typingsJapgolly.axios.axiosStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typingsJapgolly.axios.axiosStrings.document = this.cast("document")
  @scala.inline
  def json: typingsJapgolly.axios.axiosStrings.json = this.cast("json")
  @scala.inline
  def stream: typingsJapgolly.axios.axiosStrings.stream = this.cast("stream")
  @scala.inline
  def text: typingsJapgolly.axios.axiosStrings.text = this.cast("text")
}

