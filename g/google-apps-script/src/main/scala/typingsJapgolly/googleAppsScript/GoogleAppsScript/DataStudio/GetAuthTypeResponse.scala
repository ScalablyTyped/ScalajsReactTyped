package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a getAuthType() response for your script project.
  *
  *     function getAuthType() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *       var authTypes = cc.AuthType;
  *
  *       return cc.newGetAuthTypeResponse()
  *         .setAuthType(authTypes.USER_PASS)
  *         .setHelpUrl("https://www.example.org/connector-auth-help")
  *         .build();
  *     }
  */
trait GetAuthTypeResponse extends js.Object {
  def build(): GetAuthTypeResponse
  def printJson(): String
  def setAuthType(authType: AuthType): GetAuthTypeResponse
  def setHelpUrl(helpUrl: String): GetAuthTypeResponse
}

object GetAuthTypeResponse {
  @scala.inline
  def apply(
    build: CallbackTo[GetAuthTypeResponse],
    printJson: CallbackTo[String],
    setAuthType: AuthType => CallbackTo[GetAuthTypeResponse],
    setHelpUrl: String => CallbackTo[GetAuthTypeResponse]
  ): GetAuthTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.updateDynamic("setAuthType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio.AuthType) => setAuthType(t0).runNow()))
    __obj.updateDynamic("setHelpUrl")(js.Any.fromFunction1((t0: java.lang.String) => setHelpUrl(t0).runNow()))
    __obj.asInstanceOf[GetAuthTypeResponse]
  }
}

