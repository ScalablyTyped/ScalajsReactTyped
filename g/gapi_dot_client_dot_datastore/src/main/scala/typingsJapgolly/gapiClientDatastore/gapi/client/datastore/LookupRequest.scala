package typingsJapgolly.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupRequest extends js.Object {
  /** Keys of entities to look up. */
  var keys: js.UndefOr[js.Array[Key]] = js.undefined
  /** The options for this lookup request. */
  var readOptions: js.UndefOr[ReadOptions] = js.undefined
}

object LookupRequest {
  @scala.inline
  def apply(keys: js.Array[Key] = null, readOptions: ReadOptions = null): LookupRequest = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (readOptions != null) __obj.updateDynamic("readOptions")(readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupRequest]
  }
}

