package typingsJapgolly.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.follow
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.error
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.manual
*/
trait RequestRedirect extends js.Object

object RequestRedirect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.error = this.cast("error")
  @scala.inline
  def follow: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.follow = this.cast("follow")
  @scala.inline
  def manual: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.manual = this.cast("manual")
}

