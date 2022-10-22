package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.srcGeneratorsJestProjectSchemaMod.JestProjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsJestProjectLibUpdateWorkspaceMod {
  
  @JSImport("@nrwl/jest/src/generators/jest-project/lib/update-workspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateWorkspace(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    options: JestProjectSchema
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspace")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
