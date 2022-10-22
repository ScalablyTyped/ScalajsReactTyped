package typingsJapgolly.ecmarkup

import org.scalajs.dom.Document
import typingsJapgolly.ecmarkup.libSpecMod.Spec
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintCollectTagDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-tag-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectTagDiagnostics(report: js.Function1[/* e */ Warning, Unit], spec: Spec, document: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectTagDiagnostics")(report.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
