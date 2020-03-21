package typingsJapgolly.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.broFs.broFsStrings.Text
  - typingsJapgolly.broFs.broFsStrings.BinaryString
  - typingsJapgolly.broFs.broFsStrings.DataURL
*/
trait TextType extends js.Object

object TextType {
  @scala.inline
  def BinaryString: typingsJapgolly.broFs.broFsStrings.BinaryString = this.cast("BinaryString")
  @scala.inline
  def DataURL: typingsJapgolly.broFs.broFsStrings.DataURL = this.cast("DataURL")
  @scala.inline
  def Text: typingsJapgolly.broFs.broFsStrings.Text = this.cast("Text")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

