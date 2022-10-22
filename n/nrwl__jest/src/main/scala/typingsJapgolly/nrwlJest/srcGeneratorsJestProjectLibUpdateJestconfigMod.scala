package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.srcGeneratorsJestProjectSchemaMod.JestProjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsJestProjectLibUpdateJestconfigMod {
  
  @JSImport("@nrwl/jest/src/generators/jest-project/lib/update-jestconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    options: JestProjectSchema
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateJestConfig")(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
