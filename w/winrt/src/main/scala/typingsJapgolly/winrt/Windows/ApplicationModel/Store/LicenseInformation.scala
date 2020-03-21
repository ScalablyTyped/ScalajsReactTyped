package typingsJapgolly.winrt.Windows.ApplicationModel.Store

import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Store.LicenseInformation")
@js.native
class LicenseInformation () extends ILicenseInformation {
  /* CompleteClass */
  override var expirationDate: js.Date = js.native
  /* CompleteClass */
  override var isActive: Boolean = js.native
  /* CompleteClass */
  override var isTrial: Boolean = js.native
  /* CompleteClass */
  override var onlicensechanged: js.Any = js.native
  /* CompleteClass */
  override var productLicenses: IMapView[String, ProductLicense] = js.native
}

