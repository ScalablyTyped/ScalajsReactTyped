package typingsJapgolly.ecmarkup

import org.scalajs.dom.Document
import typingsJapgolly.ecmarkup.anon.Alg
import typingsJapgolly.ecmarkup.anon.ContentsElement
import typingsJapgolly.ecmarkup.anon.Element
import typingsJapgolly.ecmarkup.anon.Grammar
import typingsJapgolly.ecmarkup.anon.Source
import typingsJapgolly.ecmarkup.libSpecMod.Spec
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintCollectNodesMod {
  
  @JSImport("ecmarkup/lib/lint/collect-nodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectNodes(report: js.Function1[/* e */ Warning, Unit], mainSource: String, spec: Spec, document: Document): CollectNodesReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("collectNodes")(report.asInstanceOf[js.Any], mainSource.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[CollectNodesReturnType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ecmarkup.anon.Algorithms
    - typingsJapgolly.ecmarkup.anon.Success
  */
  trait CollectNodesReturnType extends StObject
  object CollectNodesReturnType {
    
    inline def Algorithms(
      algorithms: js.Array[Element],
      earlyErrors: js.Array[Grammar],
      headers: js.Array[ContentsElement],
      mainGrammar: js.Array[Source],
      sdos: js.Array[Alg]
    ): typingsJapgolly.ecmarkup.anon.Algorithms = {
      val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], earlyErrors = earlyErrors.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mainGrammar = mainGrammar.asInstanceOf[js.Any], sdos = sdos.asInstanceOf[js.Any], success = true)
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.Algorithms]
    }
    
    inline def Success(): typingsJapgolly.ecmarkup.anon.Success = {
      val __obj = js.Dynamic.literal(success = false)
      __obj.asInstanceOf[typingsJapgolly.ecmarkup.anon.Success]
    }
  }
}
