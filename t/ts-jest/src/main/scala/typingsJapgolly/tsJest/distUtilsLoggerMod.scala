package typingsJapgolly.tsJest

import typingsJapgolly.bsLogger.distLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsLoggerMod {
  
  @JSImport("ts-jest/dist/utils/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-jest/dist/utils/logger", "rootLogger")
  @js.native
  def rootLogger: Logger = js.native
  inline def rootLogger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootLogger")(x.asInstanceOf[js.Any])
}
