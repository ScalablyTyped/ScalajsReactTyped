package typingsJapgolly.asana.mod.auth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flow extends js.Object {
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  def authorizeUrl(): String
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  def run(): Unit
}

object Flow {
  @scala.inline
  def apply(authorizeUrl: CallbackTo[String], run: Callback): Flow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizeUrl")(authorizeUrl.toJsFn)
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[Flow]
  }
}

