package typingsJapgolly.winrt.global.Windows

import typingsJapgolly.winrt.Windows.Management.Core.IApplicationDataManager
import typingsJapgolly.winrt.Windows.Management.Deployment.PackageInstallState
import typingsJapgolly.winrt.Windows.Storage.ApplicationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  object Core {
    
    @JSGlobal("Windows.Management.Core.ApplicationDataManager")
    @js.native
    open class ApplicationDataManager ()
      extends StObject
         with IApplicationDataManager
    /* static members */
    object ApplicationDataManager {
      
      @JSGlobal("Windows.Management.Core.ApplicationDataManager")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createForPackageFamily(packageFamilyName: String): ApplicationData = ^.asInstanceOf[js.Dynamic].applyDynamic("createForPackageFamily")(packageFamilyName.asInstanceOf[js.Any]).asInstanceOf[ApplicationData]
    }
  }
  
  object Deployment {
    
    @JSGlobal("Windows.Management.Deployment.DeploymentOptions")
    @js.native
    object DeploymentOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentOptions & Double] = js.native
      
      /* 2 */ val developmentMode: typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentOptions.developmentMode & Double = js.native
      
      /* 1 */ val forceApplicationShutdown: typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown & Double = js.native
      
      /* 0 */ val none: typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentOptions.none & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
    @js.native
    object DeploymentProgressState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentProgressState & Double
          ] = js.native
      
      /* 1 */ val processing: typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentProgressState.processing & Double = js.native
      
      /* 0 */ val queued: typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentProgressState.queued & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.DeploymentResult")
    @js.native
    open class DeploymentResult ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Management.Deployment.DeploymentResult {
      
      /* CompleteClass */
      var activityId: String = js.native
      
      /* CompleteClass */
      var errorText: String = js.native
      
      /* CompleteClass */
      var extendedErrorCode: Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageInstallState")
    @js.native
    object PackageInstallState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Management.Deployment.PackageInstallState & Double] = js.native
      
      /* 2 */ val installed: typingsJapgolly.winrt.Windows.Management.Deployment.PackageInstallState.installed & Double = js.native
      
      /* 0 */ val notInstalled: typingsJapgolly.winrt.Windows.Management.Deployment.PackageInstallState.notInstalled & Double = js.native
      
      /* 1 */ val staged: typingsJapgolly.winrt.Windows.Management.Deployment.PackageInstallState.staged & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageManager")
    @js.native
    open class PackageManager ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Management.Deployment.PackageManager
    
    @JSGlobal("Windows.Management.Deployment.PackageState")
    @js.native
    object PackageState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Management.Deployment.PackageState & Double] = js.native
      
      /* 1 */ val licenseInvalid: typingsJapgolly.winrt.Windows.Management.Deployment.PackageState.licenseInvalid & Double = js.native
      
      /* 2 */ val modified: typingsJapgolly.winrt.Windows.Management.Deployment.PackageState.modified & Double = js.native
      
      /* 0 */ val normal: typingsJapgolly.winrt.Windows.Management.Deployment.PackageState.normal & Double = js.native
      
      /* 3 */ val tampered: typingsJapgolly.winrt.Windows.Management.Deployment.PackageState.tampered & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageUserInformation")
    @js.native
    open class PackageUserInformation ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Management.Deployment.PackageUserInformation {
      
      /* CompleteClass */
      var installState: PackageInstallState = js.native
      
      /* CompleteClass */
      var userSecurityId: String = js.native
    }
  }
}
