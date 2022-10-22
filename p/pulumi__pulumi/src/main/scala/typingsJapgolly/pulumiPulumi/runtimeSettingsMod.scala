package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeSettingsMod {
  
  @JSImport("@pulumi/pulumi/runtime/settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cacheDynamicProviders(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheDynamicProviders")().asInstanceOf[Boolean]
  
  inline def disconnect(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[js.Promise[Unit]]
  
  inline def disconnectSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectSync")().asInstanceOf[Unit]
  
  @JSImport("@pulumi/pulumi/runtime/settings", "excessiveDebugOutput")
  @js.native
  val excessiveDebugOutput: Boolean = js.native
  
  inline def getEngine(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")().asInstanceOf[js.UndefOr[js.Object]]
  
  inline def getMaximumListeners(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumListeners")().asInstanceOf[Double]
  
  inline def getMonitor(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonitor")().asInstanceOf[js.UndefOr[js.Object]]
  
  inline def getOrganization(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrganization")().asInstanceOf[String]
  
  inline def getProject(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProject")().asInstanceOf[String]
  
  inline def getStack(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")().asInstanceOf[String]
  
  inline def hasEngine(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEngine")().asInstanceOf[Boolean]
  
  inline def hasMonitor(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMonitor")().asInstanceOf[Boolean]
  
  inline def isDryRun(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDryRun")().asInstanceOf[Boolean]
  
  inline def isLegacyApplyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyApplyEnabled")().asInstanceOf[Boolean]
  
  inline def isQueryMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQueryMode")().asInstanceOf[Boolean]
  
  inline def monitorSupportsFeature(feature: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsFeature")(feature.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def monitorSupportsOutputValues(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsOutputValues")().asInstanceOf[js.Promise[Boolean]]
  
  inline def monitorSupportsResourceReferences(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsResourceReferences")().asInstanceOf[js.Promise[Boolean]]
  
  inline def monitorSupportsSecrets(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsSecrets")().asInstanceOf[js.Promise[Boolean]]
  
  inline def resetOptions(
    project: String,
    stack: String,
    parallel: Double,
    engineAddr: String,
    monitorAddr: String,
    preview: Boolean,
    organization: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetOptions")(project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], parallel.asInstanceOf[js.Any], engineAddr.asInstanceOf[js.Any], monitorAddr.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rpcKeepAlive(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcKeepAlive")().asInstanceOf[js.Function0[Unit]]
  
  inline def serialize(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[Boolean]
  
  inline def setMockOptions(mockMonitor: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: Unit, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: Unit, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: Unit, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: Unit, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setRootResource(res: ComponentResource[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootResource")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def terminateRpcs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("terminateRpcs")().asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    val cacheDynamicProviders: js.UndefOr[Boolean] = js.undefined
    
    val dryRun: js.UndefOr[Boolean] = js.undefined
    
    val engineAddr: js.UndefOr[String] = js.undefined
    
    val legacyApply: js.UndefOr[Boolean] = js.undefined
    
    val monitorAddr: js.UndefOr[String] = js.undefined
    
    val organization: js.UndefOr[String] = js.undefined
    
    val parallel: js.UndefOr[Double] = js.undefined
    
    val project: js.UndefOr[String] = js.undefined
    
    val queryMode: js.UndefOr[Boolean] = js.undefined
    
    val stack: js.UndefOr[String] = js.undefined
    
    /**
      * Directory containing the send/receive files for making synchronous invokes to the engine.
      */
    val syncDir: js.UndefOr[String] = js.undefined
    
    val testModeEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCacheDynamicProviders(value: Boolean): Self = StObject.set(x, "cacheDynamicProviders", value.asInstanceOf[js.Any])
      
      inline def setCacheDynamicProvidersUndefined: Self = StObject.set(x, "cacheDynamicProviders", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setEngineAddr(value: String): Self = StObject.set(x, "engineAddr", value.asInstanceOf[js.Any])
      
      inline def setEngineAddrUndefined: Self = StObject.set(x, "engineAddr", js.undefined)
      
      inline def setLegacyApply(value: Boolean): Self = StObject.set(x, "legacyApply", value.asInstanceOf[js.Any])
      
      inline def setLegacyApplyUndefined: Self = StObject.set(x, "legacyApply", js.undefined)
      
      inline def setMonitorAddr(value: String): Self = StObject.set(x, "monitorAddr", value.asInstanceOf[js.Any])
      
      inline def setMonitorAddrUndefined: Self = StObject.set(x, "monitorAddr", js.undefined)
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setQueryMode(value: Boolean): Self = StObject.set(x, "queryMode", value.asInstanceOf[js.Any])
      
      inline def setQueryModeUndefined: Self = StObject.set(x, "queryMode", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setSyncDir(value: String): Self = StObject.set(x, "syncDir", value.asInstanceOf[js.Any])
      
      inline def setSyncDirUndefined: Self = StObject.set(x, "syncDir", js.undefined)
      
      inline def setTestModeEnabled(value: Boolean): Self = StObject.set(x, "testModeEnabled", value.asInstanceOf[js.Any])
      
      inline def setTestModeEnabledUndefined: Self = StObject.set(x, "testModeEnabled", js.undefined)
    }
  }
}
