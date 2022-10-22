package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.srcGeneratorsJestProjectSchemaMod.JestProjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsJestProjectLibCheckForTestTargetMod {
  
  @JSImport("@nrwl/jest/src/generators/jest-project/lib/check-for-test-target", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkForTestTarget(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    options: JestProjectSchema
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkForTestTarget")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
