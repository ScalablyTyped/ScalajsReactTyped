package typingsJapgolly.socks.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.socks.socksStrings.connect
  - typingsJapgolly.socks.socksStrings.bind
  - typingsJapgolly.socks.socksStrings.associate
*/
trait SocksCommandOption extends js.Object

object SocksCommandOption {
  @scala.inline
  def associate: typingsJapgolly.socks.socksStrings.associate = this.cast("associate")
  @scala.inline
  def bind: typingsJapgolly.socks.socksStrings.bind = this.cast("bind")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connect: typingsJapgolly.socks.socksStrings.connect = this.cast("connect")
}

