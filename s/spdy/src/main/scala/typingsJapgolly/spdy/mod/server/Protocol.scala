package typingsJapgolly.spdy.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spdy.spdyStrings.h2
  - typingsJapgolly.spdy.spdyStrings.spdySlash3Dot1
  - typingsJapgolly.spdy.spdyStrings.spdySlash3
  - typingsJapgolly.spdy.spdyStrings.spdySlash2
  - typingsJapgolly.spdy.spdyStrings.httpSlash1Dot1
  - typingsJapgolly.spdy.spdyStrings.httpSlash1Dot0
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def h2: typingsJapgolly.spdy.spdyStrings.h2 = this.cast("h2")
  @scala.inline
  def httpSlash1Dot0: typingsJapgolly.spdy.spdyStrings.httpSlash1Dot0 = this.cast("http/1.0")
  @scala.inline
  def httpSlash1Dot1: typingsJapgolly.spdy.spdyStrings.httpSlash1Dot1 = this.cast("http/1.1")
  @scala.inline
  def spdySlash2: typingsJapgolly.spdy.spdyStrings.spdySlash2 = this.cast("spdy/2")
  @scala.inline
  def spdySlash3: typingsJapgolly.spdy.spdyStrings.spdySlash3 = this.cast("spdy/3")
  @scala.inline
  def spdySlash3Dot1: typingsJapgolly.spdy.spdyStrings.spdySlash3Dot1 = this.cast("spdy/3.1")
}

