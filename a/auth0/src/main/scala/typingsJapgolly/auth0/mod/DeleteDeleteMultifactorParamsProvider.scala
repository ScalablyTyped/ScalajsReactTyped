package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.auth0.auth0Strings.duo
  - typingsJapgolly.auth0.auth0Strings.`google-authenticator`
*/
trait DeleteDeleteMultifactorParamsProvider extends js.Object

object DeleteDeleteMultifactorParamsProvider {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def duo: typingsJapgolly.auth0.auth0Strings.duo = this.cast("duo")
  @scala.inline
  def `google-authenticator`: typingsJapgolly.auth0.auth0Strings.`google-authenticator` = this.cast("google-authenticator")
}

