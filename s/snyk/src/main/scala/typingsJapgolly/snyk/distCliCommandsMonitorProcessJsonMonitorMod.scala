package typingsJapgolly.snyk

import typingsJapgolly.snyk.distCliCommandsMonitorTypesMod.BadResult
import typingsJapgolly.snyk.distCliCommandsMonitorTypesMod.GoodResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsMonitorProcessJsonMonitorMod {
  
  @JSImport("snyk/dist/cli/commands/monitor/process-json-monitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processJsonMonitorResponse(results: js.Array[GoodResult | BadResult]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("processJsonMonitorResponse")(results.asInstanceOf[js.Any]).asInstanceOf[String]
}
