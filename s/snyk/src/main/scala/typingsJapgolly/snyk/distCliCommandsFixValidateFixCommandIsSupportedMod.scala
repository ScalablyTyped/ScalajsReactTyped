package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsFixValidateFixCommandIsSupportedMod {
  
  @JSImport("snyk/dist/cli/commands/fix/validate-fix-command-is-supported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateFixCommandIsSupported(options: Options & TestOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateFixCommandIsSupported")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
