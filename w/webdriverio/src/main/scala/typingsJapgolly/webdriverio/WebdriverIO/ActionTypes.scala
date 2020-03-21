package typingsJapgolly.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webdriverio.webdriverioStrings.press
  - typingsJapgolly.webdriverio.webdriverioStrings.longPress
  - typingsJapgolly.webdriverio.webdriverioStrings.tap
  - typingsJapgolly.webdriverio.webdriverioStrings.moveTo
  - typingsJapgolly.webdriverio.webdriverioStrings.wait
  - typingsJapgolly.webdriverio.webdriverioStrings.release
*/
trait ActionTypes extends js.Object

object ActionTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def longPress: typingsJapgolly.webdriverio.webdriverioStrings.longPress = this.cast("longPress")
  @scala.inline
  def moveTo: typingsJapgolly.webdriverio.webdriverioStrings.moveTo = this.cast("moveTo")
  @scala.inline
  def press: typingsJapgolly.webdriverio.webdriverioStrings.press = this.cast("press")
  @scala.inline
  def release: typingsJapgolly.webdriverio.webdriverioStrings.release = this.cast("release")
  @scala.inline
  def tap: typingsJapgolly.webdriverio.webdriverioStrings.tap = this.cast("tap")
}

