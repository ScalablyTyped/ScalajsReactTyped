package typingsJapgolly.ecmarkup

import org.scalajs.dom.Element
import typingsJapgolly.ecmarkup.libLintAlgorithmErrorReporterTypeMod.Reporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintRulesAlgorithmStepLabelsMod {
  
  @JSImport("ecmarkup/lib/lint/rules/algorithm-step-labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(report: Reporter, node: Element, algorithmSource: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(report.asInstanceOf[js.Any], node.asInstanceOf[js.Any], algorithmSource.asInstanceOf[js.Any])).asInstanceOf[Any]
}
