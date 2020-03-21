package typingsJapgolly.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken
import typingsJapgolly.gapiClientBigquerydatatransfer.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourcesResource extends js.Object {
  /**
    * Returns true if valid credentials exist for the given data source and
    * requesting user.
    * Some data sources doesn't support service account, so we need to talk to
    * them on behalf of the end user. This API just checks whether we have OAuth
    * token for the particular user, which is a pre-requisite before user can
    * create a transfer config.
    */
  def checkValidCreds(request: AnonAccesstoken): Request_[CheckValidCredsResponse]
  /**
    * Retrieves a supported data source and returns its settings,
    * which can be used for UI rendering.
    */
  def get(request: AnonAccesstoken): Request_[DataSource]
  /**
    * Lists supported data sources and returns their settings,
    * which can be used for UI rendering.
    */
  def list(request: AnonAlt): Request_[ListDataSourcesResponse]
}

object DataSourcesResource {
  @scala.inline
  def apply(
    checkValidCreds: AnonAccesstoken => CallbackTo[Request_[CheckValidCredsResponse]],
    get: AnonAccesstoken => CallbackTo[Request_[DataSource]],
    list: AnonAlt => CallbackTo[Request_[ListDataSourcesResponse]]
  ): DataSourcesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkValidCreds")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken) => checkValidCreds(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBigquerydatatransfer.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[DataSourcesResource]
  }
}

