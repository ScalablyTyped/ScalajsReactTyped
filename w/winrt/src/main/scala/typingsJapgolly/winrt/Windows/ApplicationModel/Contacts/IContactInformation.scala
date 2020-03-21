package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactInformation extends js.Object {
  var customFields: IVectorView[ContactField]
  var emails: IVectorView[ContactField]
  var instantMessages: IVectorView[ContactInstantMessageField]
  var locations: IVectorView[ContactLocationField]
  var name: String
  var phoneNumbers: IVectorView[ContactField]
  def getThumbnailAsync(): IAsyncOperation[IRandomAccessStreamWithContentType]
  def queryCustomFields(customName: String): IVectorView[ContactField]
}

object IContactInformation {
  @scala.inline
  def apply(
    customFields: IVectorView[ContactField],
    emails: IVectorView[ContactField],
    getThumbnailAsync: CallbackTo[IAsyncOperation[IRandomAccessStreamWithContentType]],
    instantMessages: IVectorView[ContactInstantMessageField],
    locations: IVectorView[ContactLocationField],
    name: String,
    phoneNumbers: IVectorView[ContactField],
    queryCustomFields: String => CallbackTo[IVectorView[ContactField]]
  ): IContactInformation = {
    val __obj = js.Dynamic.literal(customFields = customFields.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], instantMessages = instantMessages.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any])
    __obj.updateDynamic("getThumbnailAsync")(getThumbnailAsync.toJsFn)
    __obj.updateDynamic("queryCustomFields")(js.Any.fromFunction1((t0: java.lang.String) => queryCustomFields(t0).runNow()))
    __obj.asInstanceOf[IContactInformation]
  }
}

