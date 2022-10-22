package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestValidateCredentialsMod {
  
  @JSImport("snyk/dist/cli/commands/test/validate-credentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateCredentials(options: Options & TestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCredentials")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
