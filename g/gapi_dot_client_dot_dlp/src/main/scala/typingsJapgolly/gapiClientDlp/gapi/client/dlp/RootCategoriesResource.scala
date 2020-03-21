package typingsJapgolly.gapiClientDlp.gapi.client.dlp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDlp.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCategoriesResource extends js.Object {
  var infoTypes: InfoTypesResource
  /** Returns the list of root categories of sensitive information. */
  def list(request: AnonFields): Request_[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
}

object RootCategoriesResource {
  @scala.inline
  def apply(
    infoTypes: InfoTypesResource,
    list: AnonFields => CallbackTo[Request_[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]]
  ): RootCategoriesResource = {
    val __obj = js.Dynamic.literal(infoTypes = infoTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDlp.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[RootCategoriesResource]
  }
}

