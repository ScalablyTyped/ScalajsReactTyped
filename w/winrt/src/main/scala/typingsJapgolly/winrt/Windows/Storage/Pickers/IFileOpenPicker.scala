package typingsJapgolly.winrt.Windows.Storage.Pickers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPicker extends js.Object {
  var commitButtonText: String
  var continuationData: ValueSet
  var fileTypeFilter: IVector[String]
  var settingsIdentifier: String
  var suggestedStartLocation: PickerLocationId
  var viewMode: PickerViewMode
  def pickMultipleFilesAndContinue(): Unit
  def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]]
  def pickSingleFileAndContinue(): Unit
  def pickSingleFileAsync(): IAsyncOperation[StorageFile]
}

object IFileOpenPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickMultipleFilesAndContinue: Callback,
    pickMultipleFilesAsync: CallbackTo[IAsyncOperation[IVectorView[StorageFile]]],
    pickSingleFileAndContinue: Callback,
    pickSingleFileAsync: CallbackTo[IAsyncOperation[StorageFile]],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFileOpenPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.updateDynamic("pickMultipleFilesAndContinue")(pickMultipleFilesAndContinue.toJsFn)
    __obj.updateDynamic("pickMultipleFilesAsync")(pickMultipleFilesAsync.toJsFn)
    __obj.updateDynamic("pickSingleFileAndContinue")(pickSingleFileAndContinue.toJsFn)
    __obj.updateDynamic("pickSingleFileAsync")(pickSingleFileAsync.toJsFn)
    __obj.asInstanceOf[IFileOpenPicker]
  }
}

