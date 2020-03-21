package typingsJapgolly.entriaRelayExperimental.queryResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only`
  - typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network`
  - typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network`
  - typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only`
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network` = this.cast("store-and-network")
  @scala.inline
  def `store-only`: typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only` = this.cast("store-only")
  @scala.inline
  def `store-or-network`: typingsJapgolly.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network` = this.cast("store-or-network")
}

