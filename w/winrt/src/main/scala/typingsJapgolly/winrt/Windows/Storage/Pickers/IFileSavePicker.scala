package typingsJapgolly.winrt.Windows.Storage.Pickers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePicker extends js.Object {
  var commitButtonText: String
  var continuationData: ValueSet
  var defaultFileExtension: String
  var fileTypeChoices: IMap[String, IVector[String]]
  var settingsIdentifier: String
  var suggestedFileName: String
  var suggestedSaveFile: StorageFile
  var suggestedStartLocation: PickerLocationId
  def pickSaveFileAndContinue(): Unit
  def pickSaveFileAsync(): IAsyncOperation[StorageFile]
}

object IFileSavePicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    defaultFileExtension: String,
    fileTypeChoices: IMap[String, IVector[String]],
    pickSaveFileAndContinue: Callback,
    pickSaveFileAsync: CallbackTo[IAsyncOperation[StorageFile]],
    settingsIdentifier: String,
    suggestedFileName: String,
    suggestedSaveFile: StorageFile,
    suggestedStartLocation: PickerLocationId
  ): IFileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], defaultFileExtension = defaultFileExtension.asInstanceOf[js.Any], fileTypeChoices = fileTypeChoices.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedFileName = suggestedFileName.asInstanceOf[js.Any], suggestedSaveFile = suggestedSaveFile.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("pickSaveFileAndContinue")(pickSaveFileAndContinue.toJsFn)
    __obj.updateDynamic("pickSaveFileAsync")(pickSaveFileAsync.toJsFn)
    __obj.asInstanceOf[IFileSavePicker]
  }
}

