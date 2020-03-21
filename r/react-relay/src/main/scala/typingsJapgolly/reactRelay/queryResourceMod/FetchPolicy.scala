package typingsJapgolly.reactRelay.queryResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactRelay.reactRelayStrings.`store-only`
  - typingsJapgolly.reactRelay.reactRelayStrings.`store-or-network`
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
  @scala.inline
  def `store-only`: typingsJapgolly.reactRelay.reactRelayStrings.`store-only` = this.cast("store-only")
  @scala.inline
  def `store-or-network`: typingsJapgolly.reactRelay.reactRelayStrings.`store-or-network` = this.cast("store-or-network")
}

