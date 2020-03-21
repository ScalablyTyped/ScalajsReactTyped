package typingsJapgolly.naverWhale.whale.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSetting extends js.Object {
  /** Fired after the setting changes. */
  var onChange: typingsJapgolly.chrome.chrome.types.ChromeSettingChangedEvent = js.native
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    * @param callback Optional. Called at the completion of the clear operation.
    */
  def clear(details: typingsJapgolly.chrome.chrome.types.ChromeSettingClearDetails): Unit = js.native
  def clear(details: typingsJapgolly.chrome.chrome.types.ChromeSettingClearDetails, callback: js.Function): Unit = js.native
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: typingsJapgolly.chrome.chrome.types.ChromeSettingGetDetails): Unit = js.native
  def get(
    details: typingsJapgolly.chrome.chrome.types.ChromeSettingGetDetails,
    callback: typingsJapgolly.chrome.chrome.types.DetailsCallback
  ): Unit = js.native
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    * @param callback Optional. Called at the completion of the set operation.
    */
  def set(details: typingsJapgolly.chrome.chrome.types.ChromeSettingSetDetails): Unit = js.native
  def set(details: typingsJapgolly.chrome.chrome.types.ChromeSettingSetDetails, callback: js.Function): Unit = js.native
}

