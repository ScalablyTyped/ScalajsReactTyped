package typingsJapgolly.winrt.Windows.Storage.Pickers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderPicker extends js.Object {
  var commitButtonText: String
  var continuationData: ValueSet
  var fileTypeFilter: IVector[String]
  var settingsIdentifier: String
  var suggestedStartLocation: PickerLocationId
  var viewMode: PickerViewMode
  def pickFolderAndContinue(): Unit
  def pickSingleFolderAsync(): IAsyncOperation[StorageFolder]
}

object IFolderPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickFolderAndContinue: Callback,
    pickSingleFolderAsync: CallbackTo[IAsyncOperation[StorageFolder]],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFolderPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.updateDynamic("pickFolderAndContinue")(pickFolderAndContinue.toJsFn)
    __obj.updateDynamic("pickSingleFolderAsync")(pickSingleFolderAsync.toJsFn)
    __obj.asInstanceOf[IFolderPicker]
  }
}

