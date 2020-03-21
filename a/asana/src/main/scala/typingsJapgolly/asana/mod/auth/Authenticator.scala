package typingsJapgolly.asana.mod.auth

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layer to abstract the differences between using different types of
  * authentication (Oauth vs. Basic). The Authenticator is responsible for
  * establishing credentials and applying them to outgoing requests.
  * @constructor
  */
trait Authenticator extends js.Object {
  /**
    * Establishes credentials.
    *
    * @return {Promise} Resolves when initial credentials have been
    *     completed and `authenticateRequest` calls can expect to succeed.
    * @return
    */
  def establishCredentials(): typingsJapgolly.bluebird.mod.^[Unit]
  /**
    * Attempts to refresh credentials, if possible, given the current credentials.
    *
    * @return {Promise} Resolves to `true` if credentials have been successfully
    *     established and `authenticateRequests` can expect to succeed, else
    *     resolves to `false`.
    * @return
    */
  def refreshCredentials(): typingsJapgolly.bluebird.mod.^[Boolean]
}

object Authenticator {
  @scala.inline
  def apply(
    establishCredentials: CallbackTo[typingsJapgolly.bluebird.mod.^[Unit]],
    refreshCredentials: CallbackTo[typingsJapgolly.bluebird.mod.^[Boolean]]
  ): Authenticator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("establishCredentials")(establishCredentials.toJsFn)
    __obj.updateDynamic("refreshCredentials")(refreshCredentials.toJsFn)
    __obj.asInstanceOf[Authenticator]
  }
}

