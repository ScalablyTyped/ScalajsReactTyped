package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptFunctionsMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isFunctionLikeDeclaration(node: Node): /* is typescript.typescript.FunctionLikeDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionLikeDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.FunctionLikeDeclaration */ Boolean]
  
  inline def unwrapExpression(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
  inline def unwrapExpression(node: ParenthesizedExpression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
}
