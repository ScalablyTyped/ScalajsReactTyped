package typingsJapgolly.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.proxyLists.proxyListsStrings.http
  - typingsJapgolly.proxyLists.proxyListsStrings.https
  - typingsJapgolly.proxyLists.proxyListsStrings.socks5
  - typingsJapgolly.proxyLists.proxyListsStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsJapgolly.proxyLists.proxyListsStrings.http = this.cast("http")
  @scala.inline
  def https: typingsJapgolly.proxyLists.proxyListsStrings.https = this.cast("https")
  @scala.inline
  def socks4: typingsJapgolly.proxyLists.proxyListsStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typingsJapgolly.proxyLists.proxyListsStrings.socks5 = this.cast("socks5")
}

