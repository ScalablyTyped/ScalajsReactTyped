package typingsJapgolly.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.default
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-store`
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.reload
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cache`
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`force-cache`
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`only-if-cached`
*/
trait RequestCache extends js.Object

object RequestCache {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.default = this.cast("default")
  @scala.inline
  def `force-cache`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`force-cache` = this.cast("force-cache")
  @scala.inline
  def `no-cache`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cache` = this.cast("no-cache")
  @scala.inline
  def `no-store`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-store` = this.cast("no-store")
  @scala.inline
  def `only-if-cached`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`only-if-cached` = this.cast("only-if-cached")
  @scala.inline
  def reload: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.reload = this.cast("reload")
}

