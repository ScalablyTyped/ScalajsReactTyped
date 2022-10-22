package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsWebpackDiagnosticsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/webpack-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addError(compilation: Compilation, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addError")(compilation.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addWarning(compilation: Compilation, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWarning")(compilation.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
