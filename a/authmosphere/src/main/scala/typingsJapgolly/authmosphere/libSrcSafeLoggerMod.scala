package typingsJapgolly.authmosphere

import typingsJapgolly.authmosphere.libSrcTypesLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcSafeLoggerMod {
  
  @JSImport("authmosphere/lib/src/safe-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def safeLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLogger")().asInstanceOf[Logger]
  inline def safeLogger(logger: Logger): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Logger]
}
