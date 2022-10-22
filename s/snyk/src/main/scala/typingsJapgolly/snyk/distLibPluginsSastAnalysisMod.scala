package typingsJapgolly.snyk

import typingsJapgolly.sarif.mod.Log
import typingsJapgolly.snyk.distLibPluginsSastTypesMod.SastSettings
import typingsJapgolly.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastAnalysisMod {
  
  @JSImport("snyk/dist/lib/plugins/sast/analysis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCodeAnalysisAndParseResults(root: String, options: Options, sastSettings: SastSettings, requestId: String): js.Promise[Log | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCodeAnalysisAndParseResults")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], sastSettings.asInstanceOf[js.Any], requestId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Log | Null]]
}
