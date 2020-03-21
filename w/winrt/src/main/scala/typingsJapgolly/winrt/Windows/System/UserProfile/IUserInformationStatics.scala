package typingsJapgolly.winrt.Windows.System.UserProfile

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserInformationStatics extends js.Object {
  var accountPictureChangeEnabled: Boolean
  var nameAccessAllowed: Boolean
  var onaccountpicturechanged: js.Any
  def getAccountPicture(kind: AccountPictureKind): IStorageFile
  def getDisplayNameAsync(): IAsyncOperation[String]
  def getDomainNameAsync(): IAsyncOperation[String]
  def getFirstNameAsync(): IAsyncOperation[String]
  def getLastNameAsync(): IAsyncOperation[String]
  def getPrincipalNameAsync(): IAsyncOperation[String]
  def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri]
  def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult]
  def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult]
  def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult]
  def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult]
}

object IUserInformationStatics {
  @scala.inline
  def apply(
    accountPictureChangeEnabled: Boolean,
    getAccountPicture: AccountPictureKind => CallbackTo[IStorageFile],
    getDisplayNameAsync: CallbackTo[IAsyncOperation[String]],
    getDomainNameAsync: CallbackTo[IAsyncOperation[String]],
    getFirstNameAsync: CallbackTo[IAsyncOperation[String]],
    getLastNameAsync: CallbackTo[IAsyncOperation[String]],
    getPrincipalNameAsync: CallbackTo[IAsyncOperation[String]],
    getSessionInitiationProtocolUriAsync: CallbackTo[IAsyncOperation[Uri]],
    nameAccessAllowed: Boolean,
    onaccountpicturechanged: js.Any,
    setAccountPictureAsync: IStorageFile => CallbackTo[IAsyncOperation[SetAccountPictureResult]],
    setAccountPictureFromStreamAsync: IRandomAccessStream => CallbackTo[IAsyncOperation[SetAccountPictureResult]],
    setAccountPicturesAsync: (IStorageFile, IStorageFile, IStorageFile) => CallbackTo[IAsyncOperation[SetAccountPictureResult]],
    setAccountPicturesFromStreamsAsync: (IRandomAccessStream, IRandomAccessStream, IRandomAccessStream) => CallbackTo[IAsyncOperation[SetAccountPictureResult]]
  ): IUserInformationStatics = {
    val __obj = js.Dynamic.literal(accountPictureChangeEnabled = accountPictureChangeEnabled.asInstanceOf[js.Any], nameAccessAllowed = nameAccessAllowed.asInstanceOf[js.Any], onaccountpicturechanged = onaccountpicturechanged.asInstanceOf[js.Any])
    __obj.updateDynamic("getAccountPicture")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.System.UserProfile.AccountPictureKind) => getAccountPicture(t0).runNow()))
    __obj.updateDynamic("getDisplayNameAsync")(getDisplayNameAsync.toJsFn)
    __obj.updateDynamic("getDomainNameAsync")(getDomainNameAsync.toJsFn)
    __obj.updateDynamic("getFirstNameAsync")(getFirstNameAsync.toJsFn)
    __obj.updateDynamic("getLastNameAsync")(getLastNameAsync.toJsFn)
    __obj.updateDynamic("getPrincipalNameAsync")(getPrincipalNameAsync.toJsFn)
    __obj.updateDynamic("getSessionInitiationProtocolUriAsync")(getSessionInitiationProtocolUriAsync.toJsFn)
    __obj.updateDynamic("setAccountPictureAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => setAccountPictureAsync(t0).runNow()))
    __obj.updateDynamic("setAccountPictureFromStreamAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => setAccountPictureFromStreamAsync(t0).runNow()))
    __obj.updateDynamic("setAccountPicturesAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile, t1: typingsJapgolly.winrt.Windows.Storage.IStorageFile, t2: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => setAccountPicturesAsync(t0, t1, t2).runNow()))
    __obj.updateDynamic("setAccountPicturesFromStreamsAsync")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => setAccountPicturesFromStreamsAsync(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IUserInformationStatics]
  }
}

