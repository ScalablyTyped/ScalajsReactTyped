package typingsJapgolly.reactRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactRequest.reactRequestStrings.arrayBuffer
  - typingsJapgolly.reactRequest.reactRequestStrings.blob
  - typingsJapgolly.reactRequest.reactRequestStrings.formData
  - typingsJapgolly.reactRequest.reactRequestStrings.json
  - typingsJapgolly.reactRequest.reactRequestStrings.text
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def arrayBuffer: typingsJapgolly.reactRequest.reactRequestStrings.arrayBuffer = this.cast("arrayBuffer")
  @scala.inline
  def blob: typingsJapgolly.reactRequest.reactRequestStrings.blob = this.cast("blob")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def formData: typingsJapgolly.reactRequest.reactRequestStrings.formData = this.cast("formData")
  @scala.inline
  def json: typingsJapgolly.reactRequest.reactRequestStrings.json = this.cast("json")
  @scala.inline
  def text: typingsJapgolly.reactRequest.reactRequestStrings.text = this.cast("text")
}

