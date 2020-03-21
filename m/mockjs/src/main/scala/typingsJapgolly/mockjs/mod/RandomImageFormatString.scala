package typingsJapgolly.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Image
// see https://github.com/nuysoft/Mock/wiki/Image
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mockjs.mockjsStrings.png
  - typingsJapgolly.mockjs.mockjsStrings.gif
  - typingsJapgolly.mockjs.mockjsStrings.jpg
*/
trait RandomImageFormatString extends js.Object

object RandomImageFormatString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gif: typingsJapgolly.mockjs.mockjsStrings.gif = this.cast("gif")
  @scala.inline
  def jpg: typingsJapgolly.mockjs.mockjsStrings.jpg = this.cast("jpg")
  @scala.inline
  def png: typingsJapgolly.mockjs.mockjsStrings.png = this.cast("png")
}

