package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.CallExpressionargumentsId
import typingsJapgolly.typescript.mod.BinaryExpression
import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.ExpressionStatement
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NodeArray
import typingsJapgolly.typescript.mod.PropertyAccessExpression
import typingsJapgolly.typescript.mod.Statement
import typingsJapgolly.typescript.mod.StringLiteral
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcHostCommonjsUmdUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractGetterFnExpression(statement: DefinePropertyReexportStatement): Expression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractGetterFnExpression")(statement.asInstanceOf[js.Any]).asInstanceOf[Expression | Null]
  
  inline def findNamespaceOfIdentifier(id: Identifier): Identifier | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findNamespaceOfIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[Identifier | Null]
  
  inline def findRequireCallReference(id: Identifier, checker: TypeChecker): RequireCall | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findRequireCallReference")(id.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[RequireCall | Null]
  
  inline def isDefinePropertyReexportStatement(stmt: Statement): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.DefinePropertyReexportStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinePropertyReexportStatement")(stmt.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.DefinePropertyReexportStatement */ Boolean]
  
  inline def isExportsAssignment(expr: Node): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.ExportsAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportsAssignment")(expr.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.ExportsAssignment */ Boolean]
  
  inline def isExportsDeclaration(expr: Node): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.ExportsDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportsDeclaration")(expr.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.ExportsDeclaration */ Boolean]
  
  inline def isExportsStatement(stmt: Node): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.ExportsStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportsStatement")(stmt.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.ExportsStatement */ Boolean]
  
  inline def isExternalImport(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalImport")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRequireCall(node: Node): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.RequireCall */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequireCall")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.RequireCall */ Boolean]
  
  inline def isWildcardReexportStatement(stmt: Statement): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.WildcardReexportStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWildcardReexportStatement")(stmt.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/host/commonjs_umd_utils.WildcardReexportStatement */ Boolean]
  
  inline def skipAliases(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("skipAliases")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  @js.native
  trait DefinePropertyReexportStatement
    extends StObject
       with ExpressionStatement {
    
    @JSName("expression")
    var expression_DefinePropertyReexportStatement: CallExpressionargumentsId = js.native
  }
  
  trait ExportDeclaration extends StObject {
    
    var declaration: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
    
    var name: String
  }
  object ExportDeclaration {
    
    inline def apply(
      declaration: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration],
      name: String
    ): ExportDeclaration = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportDeclaration]
    }
    
    extension [Self <: ExportDeclaration](x: Self) {
      
      inline def setDeclaration(value: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExportsAssignment
    extends StObject
       with BinaryExpression {
    
    @JSName("left")
    var left_ExportsAssignment: ExportsDeclaration = js.native
  }
  
  @js.native
  trait ExportsDeclaration
    extends StObject
       with PropertyAccessExpression {
    
    @JSName("expression")
    var expression_ExportsDeclaration: Identifier = js.native
    
    @JSName("name")
    var name_ExportsDeclaration: Identifier = js.native
    
    @JSName("parent")
    var parent_ExportsDeclaration: ExportsAssignment = js.native
  }
  
  @js.native
  trait ExportsStatement
    extends StObject
       with ExpressionStatement {
    
    @JSName("expression")
    var expression_ExportsStatement: ExportsAssignment = js.native
  }
  
  @js.native
  trait RequireCall
    extends StObject
       with CallExpression {
    
    @JSName("arguments")
    var arguments_RequireCall: NodeArray[Expression] & js.Array[StringLiteral] = js.native
  }
  
  @js.native
  trait WildcardReexportStatement
    extends StObject
       with ExpressionStatement {
    
    @JSName("expression")
    var expression_WildcardReexportStatement: CallExpression = js.native
  }
}
