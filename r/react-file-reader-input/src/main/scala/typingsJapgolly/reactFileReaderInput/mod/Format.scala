package typingsJapgolly.reactFileReaderInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.buffer
  - typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.binary
  - typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.url
  - typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.text
*/
trait Format extends js.Object

object Format {
  @scala.inline
  def binary: typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.binary = this.cast("binary")
  @scala.inline
  def buffer: typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def text: typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.text = this.cast("text")
  @scala.inline
  def url: typingsJapgolly.reactFileReaderInput.reactFileReaderInputStrings.url = this.cast("url")
}

