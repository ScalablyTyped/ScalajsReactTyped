package typingsJapgolly.reactNativeGoby.mod

import typingsJapgolly.reactNativeGoby.mod.Goby.DeploymentStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusReport extends StObject {
  
  /**
    * Details of the package that was deployed (or attempted to).
    */
  @JSName("package")
  var _package: js.UndefOr[Package] = js.undefined
  
  /**
    * The version of the app that was deployed (for a native app upgrade).
    */
  var appVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Deployment key used when deploying the previous package.
    */
  var previousDeploymentKey: js.UndefOr[String] = js.undefined
  
  /**
    * The label (v#) of the package that was upgraded from.
    */
  var previousLabelOrAppVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the deployment succeeded or failed.
    */
  var status: DeploymentStatus
}
object StatusReport {
  
  inline def apply(status: DeploymentStatus): StatusReport = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReport]
  }
  
  extension [Self <: StatusReport](x: Self) {
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setPreviousDeploymentKey(value: String): Self = StObject.set(x, "previousDeploymentKey", value.asInstanceOf[js.Any])
    
    inline def setPreviousDeploymentKeyUndefined: Self = StObject.set(x, "previousDeploymentKey", js.undefined)
    
    inline def setPreviousLabelOrAppVersion(value: String): Self = StObject.set(x, "previousLabelOrAppVersion", value.asInstanceOf[js.Any])
    
    inline def setPreviousLabelOrAppVersionUndefined: Self = StObject.set(x, "previousLabelOrAppVersion", js.undefined)
    
    inline def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
