package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsI18nOptionsMod.I18nOptions
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsOutputPathsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/output-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureOutputPaths(baseOutputPath: String, i18n: I18nOptions): Map[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureOutputPaths")(baseOutputPath.asInstanceOf[js.Any], i18n.asInstanceOf[js.Any])).asInstanceOf[Map[String, String]]
}
