package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsReconfigMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/reconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readTsconfig(tsconfigPath: String): js.Promise[ParsedConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTsconfig")(tsconfigPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedConfiguration]]
  inline def readTsconfig(tsconfigPath: String, workspaceRoot: String): js.Promise[ParsedConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("readTsconfig")(tsconfigPath.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParsedConfiguration]]
}
