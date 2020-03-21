package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.MFExtApplicationPlatform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultCustomApplicationManagementOperationsAsync extends js.Object {
  def DownloadCustomApplicationBlock(DownloadID: Double, BlockSize: Double, Offset: Double): Unit = js.native
  def DownloadCustomApplicationBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlockBegin(ApplicationID: String): Unit = js.native
  def DownloadCustomApplicationBlockBegin(ApplicationID: String, successCallback: js.Function1[/* result */ IFileDownloadSession, Unit]): Unit = js.native
  def DownloadCustomApplicationBlockBegin(
    ApplicationID: String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlockBegin(
    ApplicationID: String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: String): Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(ApplicationID: String, successCallback: js.Function1[/* result */ IFileDownloadSession, Unit]): Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(
    ApplicationID: String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlockBegin_32bit(
    ApplicationID: String,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): Unit = js.native
  def DownloadCustomApplicationBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadCustomApplicationBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def EnableCustomApplication(ApplicationID: String, Enabled: Boolean): Unit = js.native
  def EnableCustomApplication(ApplicationID: String, Enabled: Boolean, successCallback: js.Function0[Unit]): Unit = js.native
  def EnableCustomApplication(
    ApplicationID: String,
    Enabled: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def EnableCustomApplication(
    ApplicationID: String,
    Enabled: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetCustomApplication(ApplicationID: String): Unit = js.native
  def GetCustomApplication(ApplicationID: String, successCallback: js.Function1[/* result */ ICustomApplication, Unit]): Unit = js.native
  def GetCustomApplication(
    ApplicationID: String,
    successCallback: js.Function1[/* result */ ICustomApplication, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetCustomApplication(
    ApplicationID: String,
    successCallback: js.Function1[/* result */ ICustomApplication, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetCustomApplications(): Unit = js.native
  def GetCustomApplications(successCallback: js.Function1[/* result */ ICustomApplications, Unit]): Unit = js.native
  def GetCustomApplications(
    successCallback: js.Function1[/* result */ ICustomApplications, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetCustomApplications(
    successCallback: js.Function1[/* result */ ICustomApplications, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetCustomApplicationsEx(Platform: MFExtApplicationPlatform): Unit = js.native
  def GetCustomApplicationsEx(
    Platform: MFExtApplicationPlatform,
    successCallback: js.Function1[/* result */ ICustomApplications, Unit]
  ): Unit = js.native
  def GetCustomApplicationsEx(
    Platform: MFExtApplicationPlatform,
    successCallback: js.Function1[/* result */ ICustomApplications, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetCustomApplicationsEx(
    Platform: MFExtApplicationPlatform,
    successCallback: js.Function1[/* result */ ICustomApplications, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def InstallCustomApplication(File: String): Unit = js.native
  def InstallCustomApplication(File: String, successCallback: js.Function0[Unit]): Unit = js.native
  def InstallCustomApplication(
    File: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def InstallCustomApplication(
    File: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UninstallCustomApplication(ApplicationID: String): Unit = js.native
  def UninstallCustomApplication(ApplicationID: String, successCallback: js.Function0[Unit]): Unit = js.native
  def UninstallCustomApplication(
    ApplicationID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UninstallCustomApplication(
    ApplicationID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

