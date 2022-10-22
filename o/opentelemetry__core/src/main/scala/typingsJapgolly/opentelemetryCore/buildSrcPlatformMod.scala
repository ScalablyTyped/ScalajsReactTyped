package typingsJapgolly.opentelemetryCore

import typingsJapgolly.node.perfHooksMod.Performance_
import typingsJapgolly.node.timersMod.global.NodeJS.Timer
import typingsJapgolly.opentelemetryCore.buildSrcUtilsEnvironmentMod.ENVIRONMENT
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformMod {
  
  @JSImport("@opentelemetry/core/build/src/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typingsJapgolly.opentelemetryCore.buildSrcPlatformNodeMod.RandomIdGenerator
  
  inline def getEnv(): Required[ENVIRONMENT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[Required[ENVIRONMENT]]
  
  @JSImport("@opentelemetry/core/build/src/platform", "_globalThis")
  @js.native
  val globalThis: /* globalThis */ Any = js.native
  
  inline def hexToBase64(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBase64")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@opentelemetry/core/build/src/platform", "otperformance")
  @js.native
  val otperformance: Performance_ = js.native
  
  inline def unrefTimer(timer: Timer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefTimer")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
