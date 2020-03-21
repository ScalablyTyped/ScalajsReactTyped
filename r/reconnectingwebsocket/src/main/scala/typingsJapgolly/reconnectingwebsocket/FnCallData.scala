package typingsJapgolly.reconnectingwebsocket

import typingsJapgolly.std.ArrayBufferLike
import typingsJapgolly.std.ArrayBufferView
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallData extends js.Object {
  def apply(data: String): Unit = js.native
  def apply(data: ArrayBufferLike): Unit = js.native
  def apply(data: ArrayBufferView): Unit = js.native
  def apply(data: Blob): Unit = js.native
}

