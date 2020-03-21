package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.windows
  - typingsJapgolly.fridaGum.fridaGumStrings.darwin
  - typingsJapgolly.fridaGum.fridaGumStrings.linux
  - typingsJapgolly.fridaGum.fridaGumStrings.qnx
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typingsJapgolly.fridaGum.fridaGumStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typingsJapgolly.fridaGum.fridaGumStrings.linux = this.cast("linux")
  @scala.inline
  def qnx: typingsJapgolly.fridaGum.fridaGumStrings.qnx = this.cast("qnx")
  @scala.inline
  def windows: typingsJapgolly.fridaGum.fridaGumStrings.windows = this.cast("windows")
}

