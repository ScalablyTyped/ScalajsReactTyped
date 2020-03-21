package typingsJapgolly.winrt.Windows.ApplicationModel.Store

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrentAppSimulator extends js.Object {
  var appId: String
  var licenseInformation: LicenseInformation
  var linkUri: Uri
  def getAppReceiptAsync(): IAsyncOperation[String]
  def getProductReceiptAsync(productId: String): IAsyncOperation[String]
  def loadListingInformationAsync(): IAsyncOperation[ListingInformation]
  def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction
  def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String]
  def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String]
}

object ICurrentAppSimulator {
  @scala.inline
  def apply(
    appId: String,
    getAppReceiptAsync: CallbackTo[IAsyncOperation[String]],
    getProductReceiptAsync: String => CallbackTo[IAsyncOperation[String]],
    licenseInformation: LicenseInformation,
    linkUri: Uri,
    loadListingInformationAsync: CallbackTo[IAsyncOperation[ListingInformation]],
    reloadSimulatorAsync: StorageFile => CallbackTo[IAsyncAction],
    requestAppPurchaseAsync: Boolean => CallbackTo[IAsyncOperation[String]],
    requestProductPurchaseAsync: (String, Boolean) => CallbackTo[IAsyncOperation[String]]
  ): ICurrentAppSimulator = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], licenseInformation = licenseInformation.asInstanceOf[js.Any], linkUri = linkUri.asInstanceOf[js.Any])
    __obj.updateDynamic("getAppReceiptAsync")(getAppReceiptAsync.toJsFn)
    __obj.updateDynamic("getProductReceiptAsync")(js.Any.fromFunction1((t0: java.lang.String) => getProductReceiptAsync(t0).runNow()))
    __obj.updateDynamic("loadListingInformationAsync")(loadListingInformationAsync.toJsFn)
    __obj.updateDynamic("reloadSimulatorAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.StorageFile) => reloadSimulatorAsync(t0).runNow()))
    __obj.updateDynamic("requestAppPurchaseAsync")(js.Any.fromFunction1((t0: scala.Boolean) => requestAppPurchaseAsync(t0).runNow()))
    __obj.updateDynamic("requestProductPurchaseAsync")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => requestProductPurchaseAsync(t0, t1).runNow()))
    __obj.asInstanceOf[ICurrentAppSimulator]
  }
}

