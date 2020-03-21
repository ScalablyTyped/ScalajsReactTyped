package typingsJapgolly.winrt.Windows.ApplicationModel.Store

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
@js.native
class CurrentAppSimulator () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Store.CurrentAppSimulator")
@js.native
object CurrentAppSimulator extends js.Object {
  var appId: String = js.native
  var licenseInformation: LicenseInformation = js.native
  var linkUri: Uri = js.native
  def getAppReceiptAsync(): IAsyncOperation[String] = js.native
  def getProductReceiptAsync(productId: String): IAsyncOperation[String] = js.native
  def loadListingInformationAsync(): IAsyncOperation[ListingInformation] = js.native
  def reloadSimulatorAsync(simulatorSettingsFile: StorageFile): IAsyncAction = js.native
  def requestAppPurchaseAsync(includeReceipt: Boolean): IAsyncOperation[String] = js.native
  def requestProductPurchaseAsync(productId: String, includeReceipt: Boolean): IAsyncOperation[String] = js.native
}

