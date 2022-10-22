package typingsJapgolly.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIssueIssueSeverityMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-severity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIssueSeverities")(severityA.asInstanceOf[js.Any], severityB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isIssueSeverity(value: Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue-severity.IssueSeverity */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIssueSeverity")(value.asInstanceOf[js.Any]).asInstanceOf[/* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/issue-severity.IssueSeverity */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
    - typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning
  */
  trait IssueSeverity extends StObject
  object IssueSeverity {
    
    inline def error: typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error = "error".asInstanceOf[typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error]
    
    inline def warning: typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning = "warning".asInstanceOf[typingsJapgolly.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning]
  }
}
