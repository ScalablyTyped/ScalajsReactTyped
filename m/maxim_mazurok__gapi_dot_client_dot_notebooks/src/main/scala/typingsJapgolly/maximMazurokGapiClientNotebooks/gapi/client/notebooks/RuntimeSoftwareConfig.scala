package typingsJapgolly.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeSoftwareConfig extends StObject {
  
  /** Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll automatically choose from official GPU drivers. */
  var customGpuDriverPath: js.UndefOr[String] = js.undefined
  
  /** Bool indicating whether JupyterLab terminal will be available or not. Default: False */
  var disableTerminal: js.UndefOr[Boolean] = js.undefined
  
  /** Verifies core internal services are running. Default: True */
  var enableHealthMonitoring: js.UndefOr[Boolean] = js.undefined
  
  /** Runtime will automatically shutdown after idle_shutdown_time. Default: True */
  var idleShutdown: js.UndefOr[Boolean] = js.undefined
  
  /** Time in minutes to wait before shutting down runtime. Default: 180 minutes */
  var idleShutdownTimeout: js.UndefOr[Double] = js.undefined
  
  /** Install Nvidia Driver automatically. Default: True */
  var installGpuDriver: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Use a list of container images to use as Kernels in the notebook instance. */
  var kernels: js.UndefOr[js.Array[ContainerImage]] = js.undefined
  
  /** Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron). */
  var notebookUpgradeSchedule: js.UndefOr[String] = js.undefined
  
  /** Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`). */
  var postStartupScript: js.UndefOr[String] = js.undefined
  
  /** Behavior for the post startup script. */
  var postStartupScriptBehavior: js.UndefOr[String] = js.undefined
  
  /** Output only. Bool indicating whether an newer image is available in an image family. */
  var upgradeable: js.UndefOr[Boolean] = js.undefined
}
object RuntimeSoftwareConfig {
  
  inline def apply(): RuntimeSoftwareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeSoftwareConfig]
  }
  
  extension [Self <: RuntimeSoftwareConfig](x: Self) {
    
    inline def setCustomGpuDriverPath(value: String): Self = StObject.set(x, "customGpuDriverPath", value.asInstanceOf[js.Any])
    
    inline def setCustomGpuDriverPathUndefined: Self = StObject.set(x, "customGpuDriverPath", js.undefined)
    
    inline def setDisableTerminal(value: Boolean): Self = StObject.set(x, "disableTerminal", value.asInstanceOf[js.Any])
    
    inline def setDisableTerminalUndefined: Self = StObject.set(x, "disableTerminal", js.undefined)
    
    inline def setEnableHealthMonitoring(value: Boolean): Self = StObject.set(x, "enableHealthMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnableHealthMonitoringUndefined: Self = StObject.set(x, "enableHealthMonitoring", js.undefined)
    
    inline def setIdleShutdown(value: Boolean): Self = StObject.set(x, "idleShutdown", value.asInstanceOf[js.Any])
    
    inline def setIdleShutdownTimeout(value: Double): Self = StObject.set(x, "idleShutdownTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleShutdownTimeoutUndefined: Self = StObject.set(x, "idleShutdownTimeout", js.undefined)
    
    inline def setIdleShutdownUndefined: Self = StObject.set(x, "idleShutdown", js.undefined)
    
    inline def setInstallGpuDriver(value: Boolean): Self = StObject.set(x, "installGpuDriver", value.asInstanceOf[js.Any])
    
    inline def setInstallGpuDriverUndefined: Self = StObject.set(x, "installGpuDriver", js.undefined)
    
    inline def setKernels(value: js.Array[ContainerImage]): Self = StObject.set(x, "kernels", value.asInstanceOf[js.Any])
    
    inline def setKernelsUndefined: Self = StObject.set(x, "kernels", js.undefined)
    
    inline def setKernelsVarargs(value: ContainerImage*): Self = StObject.set(x, "kernels", js.Array(value*))
    
    inline def setNotebookUpgradeSchedule(value: String): Self = StObject.set(x, "notebookUpgradeSchedule", value.asInstanceOf[js.Any])
    
    inline def setNotebookUpgradeScheduleUndefined: Self = StObject.set(x, "notebookUpgradeSchedule", js.undefined)
    
    inline def setPostStartupScript(value: String): Self = StObject.set(x, "postStartupScript", value.asInstanceOf[js.Any])
    
    inline def setPostStartupScriptBehavior(value: String): Self = StObject.set(x, "postStartupScriptBehavior", value.asInstanceOf[js.Any])
    
    inline def setPostStartupScriptBehaviorUndefined: Self = StObject.set(x, "postStartupScriptBehavior", js.undefined)
    
    inline def setPostStartupScriptUndefined: Self = StObject.set(x, "postStartupScript", js.undefined)
    
    inline def setUpgradeable(value: Boolean): Self = StObject.set(x, "upgradeable", value.asInstanceOf[js.Any])
    
    inline def setUpgradeableUndefined: Self = StObject.set(x, "upgradeable", js.undefined)
  }
}
