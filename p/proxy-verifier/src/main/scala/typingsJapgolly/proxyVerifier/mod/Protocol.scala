package typingsJapgolly.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.proxyVerifier.proxyVerifierStrings.http
  - typingsJapgolly.proxyVerifier.proxyVerifierStrings.https
  - typingsJapgolly.proxyVerifier.proxyVerifierStrings.socks5
  - typingsJapgolly.proxyVerifier.proxyVerifierStrings.socks4
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsJapgolly.proxyVerifier.proxyVerifierStrings.http = this.cast("http")
  @scala.inline
  def https: typingsJapgolly.proxyVerifier.proxyVerifierStrings.https = this.cast("https")
  @scala.inline
  def socks4: typingsJapgolly.proxyVerifier.proxyVerifierStrings.socks4 = this.cast("socks4")
  @scala.inline
  def socks5: typingsJapgolly.proxyVerifier.proxyVerifierStrings.socks5 = this.cast("socks5")
}

