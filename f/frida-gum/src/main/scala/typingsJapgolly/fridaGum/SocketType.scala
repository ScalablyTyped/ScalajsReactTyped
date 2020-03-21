package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.fridaGumStrings.tcp
  - typingsJapgolly.fridaGum.fridaGumStrings.udp
  - typingsJapgolly.fridaGum.fridaGumStrings.tcp6
  - typingsJapgolly.fridaGum.fridaGumStrings.udp6
  - typingsJapgolly.fridaGum.fridaGumStrings.unixColonstream
  - typingsJapgolly.fridaGum.fridaGumStrings.unixColondgram
*/
trait SocketType extends js.Object

object SocketType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tcp: typingsJapgolly.fridaGum.fridaGumStrings.tcp = this.cast("tcp")
  @scala.inline
  def tcp6: typingsJapgolly.fridaGum.fridaGumStrings.tcp6 = this.cast("tcp6")
  @scala.inline
  def udp: typingsJapgolly.fridaGum.fridaGumStrings.udp = this.cast("udp")
  @scala.inline
  def udp6: typingsJapgolly.fridaGum.fridaGumStrings.udp6 = this.cast("udp6")
  @scala.inline
  def unixColondgram: typingsJapgolly.fridaGum.fridaGumStrings.unixColondgram = this.cast("unix:dgram")
  @scala.inline
  def unixColonstream: typingsJapgolly.fridaGum.fridaGumStrings.unixColonstream = this.cast("unix:stream")
}

