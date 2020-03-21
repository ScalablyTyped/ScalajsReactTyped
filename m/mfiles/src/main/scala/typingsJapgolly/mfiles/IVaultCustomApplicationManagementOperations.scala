package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFExtApplicationPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultCustomApplicationManagementOperations extends js.Object {
  def DownloadCustomApplicationBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def DownloadCustomApplicationBlockBegin(ApplicationID: String): IFileDownloadSession
  def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: String): IFileDownloadSession
  def DownloadCustomApplicationBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def EnableCustomApplication(ApplicationID: String, Enabled: Boolean): Unit
  def GetCustomApplication(ApplicationID: String): ICustomApplication
  def GetCustomApplications(): ICustomApplications
  def GetCustomApplicationsEx(Platform: MFExtApplicationPlatform): ICustomApplications
  def InstallCustomApplication(File: String): Unit
  def UninstallCustomApplication(ApplicationID: String): Unit
}

object IVaultCustomApplicationManagementOperations {
  @scala.inline
  def apply(
    DownloadCustomApplicationBlock: (Double, Double, Double) => CallbackTo[js.Array[Double]],
    DownloadCustomApplicationBlockBegin: String => CallbackTo[IFileDownloadSession],
    DownloadCustomApplicationBlockBegin_32bit: String => CallbackTo[IFileDownloadSession],
    DownloadCustomApplicationBlock_32bit: (Double, Double, Double) => CallbackTo[js.Array[Double]],
    EnableCustomApplication: (String, Boolean) => Callback,
    GetCustomApplication: String => CallbackTo[ICustomApplication],
    GetCustomApplications: CallbackTo[ICustomApplications],
    GetCustomApplicationsEx: MFExtApplicationPlatform => CallbackTo[ICustomApplications],
    InstallCustomApplication: String => Callback,
    UninstallCustomApplication: String => Callback
  ): IVaultCustomApplicationManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DownloadCustomApplicationBlock")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => DownloadCustomApplicationBlock(t0, t1, t2).runNow()))
    __obj.updateDynamic("DownloadCustomApplicationBlockBegin")(js.Any.fromFunction1((t0: java.lang.String) => DownloadCustomApplicationBlockBegin(t0).runNow()))
    __obj.updateDynamic("DownloadCustomApplicationBlockBegin_32bit")(js.Any.fromFunction1((t0: java.lang.String) => DownloadCustomApplicationBlockBegin_32bit(t0).runNow()))
    __obj.updateDynamic("DownloadCustomApplicationBlock_32bit")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => DownloadCustomApplicationBlock_32bit(t0, t1, t2).runNow()))
    __obj.updateDynamic("EnableCustomApplication")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => EnableCustomApplication(t0, t1).runNow()))
    __obj.updateDynamic("GetCustomApplication")(js.Any.fromFunction1((t0: java.lang.String) => GetCustomApplication(t0).runNow()))
    __obj.updateDynamic("GetCustomApplications")(GetCustomApplications.toJsFn)
    __obj.updateDynamic("GetCustomApplicationsEx")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFExtApplicationPlatform) => GetCustomApplicationsEx(t0).runNow()))
    __obj.updateDynamic("InstallCustomApplication")(js.Any.fromFunction1((t0: java.lang.String) => InstallCustomApplication(t0).runNow()))
    __obj.updateDynamic("UninstallCustomApplication")(js.Any.fromFunction1((t0: java.lang.String) => UninstallCustomApplication(t0).runNow()))
    __obj.asInstanceOf[IVaultCustomApplicationManagementOperations]
  }
}

