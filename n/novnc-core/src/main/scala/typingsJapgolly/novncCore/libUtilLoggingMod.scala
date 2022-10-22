package typingsJapgolly.novncCore

import typingsJapgolly.novncCore.novncCoreStrings.debug
import typingsJapgolly.novncCore.novncCoreStrings.error
import typingsJapgolly.novncCore.novncCoreStrings.info
import typingsJapgolly.novncCore.novncCoreStrings.none
import typingsJapgolly.novncCore.novncCoreStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilLoggingMod {
  
  @JSImport("novnc-core/lib/util/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogging(): debug | info | warn | error | none = ^.asInstanceOf[js.Dynamic].applyDynamic("get_logging")().asInstanceOf[debug | info | warn | error | none]
  
  inline def initLogging(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")().asInstanceOf[Unit]
  inline def initLogging(level: debug | info | warn | error | none): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init_logging")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
