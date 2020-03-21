package typingsJapgolly.apolloServerEnv.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.navigate
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cors`
  - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin` = this.cast("same-origin")
}

