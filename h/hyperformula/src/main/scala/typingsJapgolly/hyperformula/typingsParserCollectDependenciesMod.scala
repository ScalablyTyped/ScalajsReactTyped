package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserCollectDependenciesMod {
  
  @JSImport("hyperformula/typings/parser/collectDependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectDependencies(ast: Ast, functionRegistry: FunctionRegistry): js.Array[RelativeDependency] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectDependencies")(ast.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any])).asInstanceOf[js.Array[RelativeDependency]]
}
