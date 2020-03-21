package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactPicker extends js.Object {
  var commitButtonText: String
  var desiredFields: IVector[String]
  var selectionMode: ContactSelectionMode
  def pickMultipleContactsAsync(): IAsyncOperation[IVectorView[ContactInformation]]
  def pickSingleContactAsync(): IAsyncOperation[ContactInformation]
}

object IContactPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    pickMultipleContactsAsync: CallbackTo[IAsyncOperation[IVectorView[ContactInformation]]],
    pickSingleContactAsync: CallbackTo[IAsyncOperation[ContactInformation]],
    selectionMode: ContactSelectionMode
  ): IContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("pickMultipleContactsAsync")(pickMultipleContactsAsync.toJsFn)
    __obj.updateDynamic("pickSingleContactAsync")(pickSingleContactAsync.toJsFn)
    __obj.asInstanceOf[IContactPicker]
  }
}

