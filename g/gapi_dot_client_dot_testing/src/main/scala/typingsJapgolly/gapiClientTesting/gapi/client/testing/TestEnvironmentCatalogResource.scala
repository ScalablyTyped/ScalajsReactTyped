package typingsJapgolly.gapiClientTesting.gapi.client.testing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTesting.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnvironmentCatalogResource extends js.Object {
  /**
    * Get the catalog of supported test environments.
    *
    * May return any of the following canonical error codes:
    *
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the environment type does not exist
    * - INTERNAL - if an internal error occurred
    */
  def get(request: AnonBearertoken): Request_[TestEnvironmentCatalog]
}

object TestEnvironmentCatalogResource {
  @scala.inline
  def apply(get: AnonBearertoken => CallbackTo[Request_[TestEnvironmentCatalog]]): TestEnvironmentCatalogResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTesting.AnonBearertoken) => get(t0).runNow()))
    __obj.asInstanceOf[TestEnvironmentCatalogResource]
  }
}

