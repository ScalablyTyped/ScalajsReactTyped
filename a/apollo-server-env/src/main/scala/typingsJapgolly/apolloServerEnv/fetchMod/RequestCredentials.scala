package typingsJapgolly.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.omit
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.include
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.include = this.cast("include")
  @scala.inline
  def omit: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
}

