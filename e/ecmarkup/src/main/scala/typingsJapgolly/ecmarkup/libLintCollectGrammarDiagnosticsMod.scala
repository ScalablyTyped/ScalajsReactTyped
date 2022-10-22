package typingsJapgolly.ecmarkup

import typingsJapgolly.ecmarkup.anon.Alg
import typingsJapgolly.ecmarkup.anon.Grammar
import typingsJapgolly.ecmarkup.anon.OneOffGrammars
import typingsJapgolly.ecmarkup.anon.Source
import typingsJapgolly.ecmarkup.libSpecMod.Spec
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintCollectGrammarDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-grammar-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectGrammarDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    mainGrammar: js.Array[Source],
    sdos: js.Array[Alg],
    earlyErrors: js.Array[Grammar]
  ): js.Promise[OneOffGrammars] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectGrammarDiagnostics")(report.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], mainSource.asInstanceOf[js.Any], mainGrammar.asInstanceOf[js.Any], sdos.asInstanceOf[js.Any], earlyErrors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OneOffGrammars]]
}
