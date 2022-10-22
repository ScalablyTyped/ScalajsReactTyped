package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFExtApplicationPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultCustomApplicationManagementOperations extends StObject {
  
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
  
  inline def apply(
    DownloadCustomApplicationBlock: (Double, Double, Double) => js.Array[Double],
    DownloadCustomApplicationBlockBegin: String => IFileDownloadSession,
    DownloadCustomApplicationBlockBegin_32bit: String => IFileDownloadSession,
    DownloadCustomApplicationBlock_32bit: (Double, Double, Double) => js.Array[Double],
    EnableCustomApplication: (String, Boolean) => Callback,
    GetCustomApplication: String => ICustomApplication,
    GetCustomApplications: CallbackTo[ICustomApplications],
    GetCustomApplicationsEx: MFExtApplicationPlatform => ICustomApplications,
    InstallCustomApplication: String => Callback,
    UninstallCustomApplication: String => Callback
  ): IVaultCustomApplicationManagementOperations = {
    val __obj = js.Dynamic.literal(DownloadCustomApplicationBlock = js.Any.fromFunction3(DownloadCustomApplicationBlock), DownloadCustomApplicationBlockBegin = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin), DownloadCustomApplicationBlockBegin_32bit = js.Any.fromFunction1(DownloadCustomApplicationBlockBegin_32bit), DownloadCustomApplicationBlock_32bit = js.Any.fromFunction3(DownloadCustomApplicationBlock_32bit), EnableCustomApplication = js.Any.fromFunction2((t0: String, t1: Boolean) => (EnableCustomApplication(t0, t1)).runNow()), GetCustomApplication = js.Any.fromFunction1(GetCustomApplication), GetCustomApplications = GetCustomApplications.toJsFn, GetCustomApplicationsEx = js.Any.fromFunction1(GetCustomApplicationsEx), InstallCustomApplication = js.Any.fromFunction1((t0: String) => InstallCustomApplication(t0).runNow()), UninstallCustomApplication = js.Any.fromFunction1((t0: String) => UninstallCustomApplication(t0).runNow()))
    __obj.asInstanceOf[IVaultCustomApplicationManagementOperations]
  }
  
  extension [Self <: IVaultCustomApplicationManagementOperations](x: Self) {
    
    inline def setDownloadCustomApplicationBlock(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadCustomApplicationBlock", js.Any.fromFunction3(value))
    
    inline def setDownloadCustomApplicationBlockBegin(value: String => IFileDownloadSession): Self = StObject.set(x, "DownloadCustomApplicationBlockBegin", js.Any.fromFunction1(value))
    
    inline def setDownloadCustomApplicationBlockBegin_32bit(value: String => IFileDownloadSession): Self = StObject.set(x, "DownloadCustomApplicationBlockBegin_32bit", js.Any.fromFunction1(value))
    
    inline def setDownloadCustomApplicationBlock_32bit(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadCustomApplicationBlock_32bit", js.Any.fromFunction3(value))
    
    inline def setEnableCustomApplication(value: (String, Boolean) => Callback): Self = StObject.set(x, "EnableCustomApplication", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setGetCustomApplication(value: String => ICustomApplication): Self = StObject.set(x, "GetCustomApplication", js.Any.fromFunction1(value))
    
    inline def setGetCustomApplications(value: CallbackTo[ICustomApplications]): Self = StObject.set(x, "GetCustomApplications", value.toJsFn)
    
    inline def setGetCustomApplicationsEx(value: MFExtApplicationPlatform => ICustomApplications): Self = StObject.set(x, "GetCustomApplicationsEx", js.Any.fromFunction1(value))
    
    inline def setInstallCustomApplication(value: String => Callback): Self = StObject.set(x, "InstallCustomApplication", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUninstallCustomApplication(value: String => Callback): Self = StObject.set(x, "UninstallCustomApplication", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
