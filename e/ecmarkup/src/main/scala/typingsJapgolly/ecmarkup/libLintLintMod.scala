package typingsJapgolly.ecmarkup

import org.scalajs.dom.Document
import typingsJapgolly.ecmarkup.libSpecMod.Spec
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintLintMod {
  
  @JSImport("ecmarkup/lib/lint/lint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lint(report: js.Function1[/* err */ Warning, Unit], sourceText: String, spec: Spec, document: Document): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lint")(report.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
