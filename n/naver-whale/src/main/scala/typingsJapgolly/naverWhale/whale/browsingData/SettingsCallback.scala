package typingsJapgolly.naverWhale.whale.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsCallback extends js.Object {
  /** All of the types will be present in the result, with values of true if they are permitted to be removed (e.g., by enterprise policy) and false if not. */
  var dataRemovalPermitted: typingsJapgolly.chrome.chrome.browsingData.DataTypeSet
  /** All of the types will be present in the result, with values of true if they are both selected to be removed and permitted to be removed, otherwise false. */
  var dataToRemove: typingsJapgolly.chrome.chrome.browsingData.DataTypeSet
  var options: typingsJapgolly.chrome.chrome.browsingData.RemovalOptions
}

object SettingsCallback {
  @scala.inline
  def apply(
    dataRemovalPermitted: typingsJapgolly.chrome.chrome.browsingData.DataTypeSet,
    dataToRemove: typingsJapgolly.chrome.chrome.browsingData.DataTypeSet,
    options: typingsJapgolly.chrome.chrome.browsingData.RemovalOptions
  ): SettingsCallback = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SettingsCallback]
  }
}

