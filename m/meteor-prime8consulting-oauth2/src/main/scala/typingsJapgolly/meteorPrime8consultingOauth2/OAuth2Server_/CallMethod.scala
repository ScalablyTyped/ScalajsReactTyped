package typingsJapgolly.meteorPrime8consultingOauth2.OAuth2Server_

import japgolly.scalajs.react.Callback
import typingsJapgolly.meteor.Meteor.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallMethod extends js.Object {
  /**
    * Wrapper for Meteor.method to create an authorization code. This is an async function and a callback must be provided to be of any use.
    */
  def authCodeGrant(
    client_id: String,
    redirect_uri: String,
    response_type: String,
    scope: js.Array[String],
    state: String,
    callback: js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]
  ): Unit
}

object CallMethod {
  @scala.inline
  def apply(
    authCodeGrant: (String, String, String, js.Array[String], String, js.Function2[/* err */ Error, /* authCodeGrantResult */ AuthCodeGrantResult, Unit]) => Callback
  ): CallMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authCodeGrant")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: js.Array[java.lang.String], t4: java.lang.String, t5: js.Function2[
  /* err */ typingsJapgolly.meteor.Meteor.Error, 
  /* authCodeGrantResult */ typingsJapgolly.meteorPrime8consultingOauth2.OAuth2Server_.AuthCodeGrantResult, 
  scala.Unit]) => authCodeGrant(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[CallMethod]
  }
}

