package typingsJapgolly.reactRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactRelay.reactRelayStrings.`store-and-network`
  - typingsJapgolly.reactRelay.reactRelayStrings.`network-only`
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typingsJapgolly.reactRelay.reactRelayStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typingsJapgolly.reactRelay.reactRelayStrings.`store-and-network` = this.cast("store-and-network")
}

