package typingsJapgolly.wdioUtils

import typingsJapgolly.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typingsJapgolly.wdioTypes.buildOptionsMod.Testrunner
import typingsJapgolly.wdioTypes.buildServicesMod.ServiceInstance
import typingsJapgolly.wdioUtils.anon.IgnoredWorkerServices
import typingsJapgolly.wdioUtils.anon.OmitTestrunnercapabilitie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInitialiseServicesMod {
  
  @JSImport("@wdio/utils/build/initialiseServices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initialiseLauncherService(config: OmitTestrunnercapabilitie, caps: DesiredCapabilities): IgnoredWorkerServices = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseLauncherService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[IgnoredWorkerServices]
  
  inline def initialiseWorkerService(config: Testrunner, caps: DesiredCapabilities): js.Array[ServiceInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[js.Array[ServiceInstance]]
  inline def initialiseWorkerService(config: Testrunner, caps: DesiredCapabilities, ignoredWorkerServices: js.Array[String]): js.Array[ServiceInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any], ignoredWorkerServices.asInstanceOf[js.Any])).asInstanceOf[js.Array[ServiceInstance]]
}
