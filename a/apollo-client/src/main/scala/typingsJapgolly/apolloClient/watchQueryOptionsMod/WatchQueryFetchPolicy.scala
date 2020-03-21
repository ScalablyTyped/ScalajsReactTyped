package typingsJapgolly.apolloClient.watchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloClient.apolloClientStrings.`cache-and-network`
  - typingsJapgolly.apolloClient.apolloClientStrings.`cache-first`
  - typingsJapgolly.apolloClient.apolloClientStrings.`network-only`
  - typingsJapgolly.apolloClient.apolloClientStrings.`cache-only`
  - typingsJapgolly.apolloClient.apolloClientStrings.`no-cache`
  - typingsJapgolly.apolloClient.apolloClientStrings.standby
*/
trait WatchQueryFetchPolicy extends js.Object

object WatchQueryFetchPolicy {
  @scala.inline
  def `cache-and-network`: typingsJapgolly.apolloClient.apolloClientStrings.`cache-and-network` = this.cast("cache-and-network")
  @scala.inline
  def `cache-first`: typingsJapgolly.apolloClient.apolloClientStrings.`cache-first` = this.cast("cache-first")
  @scala.inline
  def `cache-only`: typingsJapgolly.apolloClient.apolloClientStrings.`cache-only` = this.cast("cache-only")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typingsJapgolly.apolloClient.apolloClientStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `no-cache`: typingsJapgolly.apolloClient.apolloClientStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def standby: typingsJapgolly.apolloClient.apolloClientStrings.standby = this.cast("standby")
}

