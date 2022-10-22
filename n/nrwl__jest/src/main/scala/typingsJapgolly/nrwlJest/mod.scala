package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.anon.ValueAsString
import typingsJapgolly.nrwlJest.srcGeneratorsInitSchemaMod.JestInitSchema
import typingsJapgolly.nrwlJest.srcGeneratorsJestProjectSchemaMod.JestProjectSchema
import typingsJapgolly.typescript.mod.ObjectLiteralExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nrwl/jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPropertyToJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String,
    propertyName: String,
    value: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addPropertyToJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String,
    propertyName: String,
    value: Any,
    options: ValueAsString
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getJestProjects(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestProjects")().asInstanceOf[js.Array[String]]
  
  inline def jestConfigObjectAst(fileContent: String): ObjectLiteralExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("jestConfigObjectAst")(fileContent.asInstanceOf[js.Any]).asInstanceOf[ObjectLiteralExpression]
  
  inline def jestInitGenerator(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    schema: JestInitSchema
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("jestInitGenerator")(tree.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def jestProjectGenerator(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    schema: JestProjectSchema
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_devkit.GeneratorCallback */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("jestProjectGenerator")(tree.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_devkit.GeneratorCallback */ Any
  ]]
  
  inline def removePropertyFromJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String,
    propertyName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePropertyFromJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
