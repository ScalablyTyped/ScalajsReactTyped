package typingsJapgolly.pusherJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pusherJs.pusherJsStrings.ws
  - typingsJapgolly.pusherJs.pusherJsStrings.wss
  - typingsJapgolly.pusherJs.pusherJsStrings.xhr_streaming
  - typingsJapgolly.pusherJs.pusherJsStrings.xhr_polling
  - typingsJapgolly.pusherJs.pusherJsStrings.sockjs
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sockjs: typingsJapgolly.pusherJs.pusherJsStrings.sockjs = this.cast("sockjs")
  @scala.inline
  def ws: typingsJapgolly.pusherJs.pusherJsStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typingsJapgolly.pusherJs.pusherJsStrings.wss = this.cast("wss")
  @scala.inline
  def xhr_polling: typingsJapgolly.pusherJs.pusherJsStrings.xhr_polling = this.cast("xhr_polling")
  @scala.inline
  def xhr_streaming: typingsJapgolly.pusherJs.pusherJsStrings.xhr_streaming = this.cast("xhr_streaming")
}

