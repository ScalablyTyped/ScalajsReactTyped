package typingsJapgolly.nodeFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeFetch.nodeFetchStrings.default
  - typingsJapgolly.nodeFetch.nodeFetchStrings.`force-cache`
  - typingsJapgolly.nodeFetch.nodeFetchStrings.`no-cache`
  - typingsJapgolly.nodeFetch.nodeFetchStrings.`no-store`
  - typingsJapgolly.nodeFetch.nodeFetchStrings.`only-if-cached`
  - typingsJapgolly.nodeFetch.nodeFetchStrings.reload
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.nodeFetch.nodeFetchStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typingsJapgolly.nodeFetch.nodeFetchStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typingsJapgolly.nodeFetch.nodeFetchStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typingsJapgolly.nodeFetch.nodeFetchStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typingsJapgolly.nodeFetch.nodeFetchStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typingsJapgolly.nodeFetch.nodeFetchStrings.reload = this.cast("reload")
}

