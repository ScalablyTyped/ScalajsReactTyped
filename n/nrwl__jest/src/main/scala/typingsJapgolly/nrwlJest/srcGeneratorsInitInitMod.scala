package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.srcGeneratorsInitSchemaMod.JestInitSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeneratorsInitInitMod {
  
  @JSImport("@nrwl/jest/src/generators/init/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    schema: JestInitSchema
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tree.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def jestInitGenerator(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    schema: JestInitSchema
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jestInitGenerator")(tree.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def jestInitSchematic(generatorOptions: JestInitSchema): js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("jestInitSchematic")(generatorOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* tree */ Any, /* context */ Any, js.Promise[Any]]]
}
