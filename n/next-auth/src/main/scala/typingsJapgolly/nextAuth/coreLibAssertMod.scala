package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.Options
import typingsJapgolly.nextAuth.utilsLoggerMod.WarningCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibAssertMod {
  
  @JSImport("next-auth/core/lib/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertConfig(params: Options): ConfigError | js.Array[WarningCode] = ^.asInstanceOf[js.Dynamic].applyDynamic("assertConfig")(params.asInstanceOf[js.Any]).asInstanceOf[ConfigError | js.Array[WarningCode]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nextAuth.coreErrorsMod.MissingAPIRoute
    - typingsJapgolly.nextAuth.coreErrorsMod.MissingSecret
    - typingsJapgolly.nextAuth.coreErrorsMod.UnsupportedStrategy
    - typingsJapgolly.nextAuth.coreErrorsMod.MissingAuthorize
    - typingsJapgolly.nextAuth.coreErrorsMod.MissingAdapter
  */
  trait ConfigError extends StObject
}
