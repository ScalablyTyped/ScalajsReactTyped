package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelAuthMod.ConfigInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilEmulatorMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/util/emulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emulatorUrl(config: ConfigInternal): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_emulatorUrl")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def emulatorUrl(config: ConfigInternal, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_emulatorUrl")(config.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
}
