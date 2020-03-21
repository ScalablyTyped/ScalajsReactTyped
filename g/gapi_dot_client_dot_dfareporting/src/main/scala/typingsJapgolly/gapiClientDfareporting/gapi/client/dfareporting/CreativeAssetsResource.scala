package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetsResource extends js.Object {
  /** Inserts a new creative asset. */
  def insert(request: AnonPrettyPrint): Request_[CreativeAssetMetadata]
}

object CreativeAssetsResource {
  @scala.inline
  def apply(insert: AnonPrettyPrint => CallbackTo[Request_[CreativeAssetMetadata]]): CreativeAssetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.asInstanceOf[CreativeAssetsResource]
  }
}

