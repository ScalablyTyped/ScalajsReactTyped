package typingsJapgolly.ecmarkup

import typingsJapgolly.ecmarkup.anon.Element
import typingsJapgolly.ecmarkup.libSpecMod.Spec
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintCollectAlgorithmDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-algorithm-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectAlgorithmDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    algorithms: js.Array[Element]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAlgorithmDiagnostics")(report.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], mainSource.asInstanceOf[js.Any], algorithms.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
