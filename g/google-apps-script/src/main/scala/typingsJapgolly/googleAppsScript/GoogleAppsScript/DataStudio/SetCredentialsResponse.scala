package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a setCredentials() response for your script project.
  *
  *     function setCredentials(request) {
  *       var isValid = checkForValidCreds(request);
  *
  *       if (isValid) {
  *         // store the creds somewhere.
  *       }
  *
  *       return cc.newSetCredentialsResponse()
  *         .setIsValid(isValid)
  *         .build();
  *     }
  */
trait SetCredentialsResponse extends js.Object {
  def build(): js.Any
  def printJson(): String
  def setIsValid(isValid: Boolean): SetCredentialsResponse
}

object SetCredentialsResponse {
  @scala.inline
  def apply(
    build: CallbackTo[js.Any],
    printJson: CallbackTo[String],
    setIsValid: Boolean => CallbackTo[SetCredentialsResponse]
  ): SetCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("setIsValid")(js.Any.fromFunction1((t0: scala.Boolean) => setIsValid(t0).runNow()))
    __obj.asInstanceOf[SetCredentialsResponse]
  }
}

