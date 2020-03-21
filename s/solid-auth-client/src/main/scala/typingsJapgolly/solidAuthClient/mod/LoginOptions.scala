package typingsJapgolly.solidAuthClient.mod

import org.scalajs.dom.raw.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions extends js.Object {
  var callbackUri: js.UndefOr[String] = js.undefined
  var popupUri: js.UndefOr[String] = js.undefined
  var storage: js.UndefOr[Storage | AsyncStorage] = js.undefined
}

object LoginOptions {
  @scala.inline
  def apply(callbackUri: String = null, popupUri: String = null, storage: Storage | AsyncStorage = null): LoginOptions = {
    val __obj = js.Dynamic.literal()
    if (callbackUri != null) __obj.updateDynamic("callbackUri")(callbackUri.asInstanceOf[js.Any])
    if (popupUri != null) __obj.updateDynamic("popupUri")(popupUri.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginOptions]
  }
}

