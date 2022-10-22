package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.srcGeneratorsJestProjectSchemaMod.JestProjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsJestProjectJestProjectMod {
  
  @JSImport("@nrwl/jest/src/generators/jest-project/jest-project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jestProjectGenerator(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    schema: JestProjectSchema
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_devkit.GeneratorCallback */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("jestProjectGenerator")(tree.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_devkit.GeneratorCallback */ Any
  ]]
  
  inline def jestProjectSchematic(generatorOptions: JestProjectSchema): js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("jestProjectSchematic")(generatorOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]]
}
