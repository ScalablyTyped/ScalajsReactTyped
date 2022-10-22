package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeValueReference
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.TypeChecker
import typingsJapgolly.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscReflectionSrcTypeToValueMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection/src/type_to_value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def typeNodeToValueExpr(node: TypeNode): Expression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("typeNodeToValueExpr")(node.asInstanceOf[js.Any]).asInstanceOf[Expression | Null]
  
  inline def typeToValue(typeNode: Null, checker: TypeChecker): TypeValueReference = (^.asInstanceOf[js.Dynamic].applyDynamic("typeToValue")(typeNode.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[TypeValueReference]
  inline def typeToValue(typeNode: TypeNode, checker: TypeChecker): TypeValueReference = (^.asInstanceOf[js.Dynamic].applyDynamic("typeToValue")(typeNode.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[TypeValueReference]
}
