package typingsJapgolly.nrwlJest

import typingsJapgolly.angularDevkitSchematics.mod.Tree
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsTestingMod {
  
  @JSImport("@nrwl/jest/src/utils/testing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callRule(rule: Rule, tree: Tree): js.Promise[typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree] = (^.asInstanceOf[js.Dynamic].applyDynamic("callRule")(rule.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.angularDevkitSchematics.srcTreeInterfaceMod.Tree]]
  
  inline def runMigration[T /* <: js.Object */](migrationName: String, options: T, tree: Tree): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_testing.UnitTestTree */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runMigration")(migrationName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_testing.UnitTestTree */ Any
  ]]
  
  inline def runSchematic[T /* <: js.Object */](schematicName: String, options: T, tree: Tree): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_testing.UnitTestTree */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runSchematic")(schematicName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], tree.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_testing.UnitTestTree */ Any
  ]]
}
