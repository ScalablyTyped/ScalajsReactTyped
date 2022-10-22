package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.anon.PartialInitialOptionsinde
import typingsJapgolly.typescript.mod.ObjectLiteralExpression
import typingsJapgolly.typescript.mod.PropertyAssignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsConfigFunctionsMod {
  
  @JSImport("@nrwl/jest/src/utils/config/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addOrUpdateProperty(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    `object`: ObjectLiteralExpression,
    properties: js.Array[String],
    value: Any,
    path: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrUpdateProperty")(tree.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], value.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def jestConfigObject(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String
  ): PartialInitialOptionsinde = (^.asInstanceOf[js.Dynamic].applyDynamic("jestConfigObject")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[PartialInitialOptionsinde]
  
  inline def jestConfigObjectAst(fileContent: String): ObjectLiteralExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("jestConfigObjectAst")(fileContent.asInstanceOf[js.Any]).asInstanceOf[ObjectLiteralExpression]
  
  inline def removeProperty(`object`: ObjectLiteralExpression, properties: js.Array[String]): PropertyAssignment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("removeProperty")(`object`.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[PropertyAssignment | Null]
}
