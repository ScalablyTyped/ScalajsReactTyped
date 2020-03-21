package typingsJapgolly.tslint

import typingsJapgolly.typescript.mod.AccessorDeclaration
import typingsJapgolly.typescript.mod.ArrayLiteralExpression
import typingsJapgolly.typescript.mod.ArrayTypeNode
import typingsJapgolly.typescript.mod.ArrowFunction
import typingsJapgolly.typescript.mod.BinaryExpression
import typingsJapgolly.typescript.mod.BindingElement
import typingsJapgolly.typescript.mod.BindingPattern
import typingsJapgolly.typescript.mod.Block
import typingsJapgolly.typescript.mod.BreakOrContinueStatement
import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.CaseClause
import typingsJapgolly.typescript.mod.CatchClause
import typingsJapgolly.typescript.mod.ClassDeclaration
import typingsJapgolly.typescript.mod.ClassExpression
import typingsJapgolly.typescript.mod.ConditionalExpression
import typingsJapgolly.typescript.mod.ConstructSignatureDeclaration
import typingsJapgolly.typescript.mod.ConstructorDeclaration
import typingsJapgolly.typescript.mod.DefaultClause
import typingsJapgolly.typescript.mod.DoStatement
import typingsJapgolly.typescript.mod.ElementAccessExpression
import typingsJapgolly.typescript.mod.EnumDeclaration
import typingsJapgolly.typescript.mod.EnumMember
import typingsJapgolly.typescript.mod.ExportAssignment
import typingsJapgolly.typescript.mod.ExpressionStatement
import typingsJapgolly.typescript.mod.ForInStatement
import typingsJapgolly.typescript.mod.ForOfStatement
import typingsJapgolly.typescript.mod.ForStatement
import typingsJapgolly.typescript.mod.FunctionDeclaration
import typingsJapgolly.typescript.mod.FunctionExpression
import typingsJapgolly.typescript.mod.FunctionOrConstructorTypeNode
import typingsJapgolly.typescript.mod.Identifier
import typingsJapgolly.typescript.mod.IfStatement
import typingsJapgolly.typescript.mod.ImportDeclaration
import typingsJapgolly.typescript.mod.ImportEqualsDeclaration
import typingsJapgolly.typescript.mod.IndexSignatureDeclaration
import typingsJapgolly.typescript.mod.InterfaceDeclaration
import typingsJapgolly.typescript.mod.JsxAttribute
import typingsJapgolly.typescript.mod.JsxElement
import typingsJapgolly.typescript.mod.JsxExpression
import typingsJapgolly.typescript.mod.JsxSelfClosingElement
import typingsJapgolly.typescript.mod.JsxSpreadAttribute
import typingsJapgolly.typescript.mod.LabeledStatement
import typingsJapgolly.typescript.mod.MethodDeclaration
import typingsJapgolly.typescript.mod.ModuleDeclaration
import typingsJapgolly.typescript.mod.NamedImports
import typingsJapgolly.typescript.mod.NamespaceImport
import typingsJapgolly.typescript.mod.NewExpression
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.NonNullExpression
import typingsJapgolly.typescript.mod.NumericLiteral
import typingsJapgolly.typescript.mod.ObjectLiteralExpression
import typingsJapgolly.typescript.mod.ParameterDeclaration
import typingsJapgolly.typescript.mod.PostfixUnaryExpression
import typingsJapgolly.typescript.mod.PrefixUnaryExpression
import typingsJapgolly.typescript.mod.PropertyAccessExpression
import typingsJapgolly.typescript.mod.PropertyAssignment
import typingsJapgolly.typescript.mod.PropertyDeclaration
import typingsJapgolly.typescript.mod.ReturnStatement
import typingsJapgolly.typescript.mod.SignatureDeclaration
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Statement
import typingsJapgolly.typescript.mod.StringLiteral
import typingsJapgolly.typescript.mod.SwitchStatement
import typingsJapgolly.typescript.mod.TemplateExpression
import typingsJapgolly.typescript.mod.ThrowStatement
import typingsJapgolly.typescript.mod.TryStatement
import typingsJapgolly.typescript.mod.TupleTypeNode
import typingsJapgolly.typescript.mod.TypeAliasDeclaration
import typingsJapgolly.typescript.mod.TypeAssertion
import typingsJapgolly.typescript.mod.TypeLiteralNode
import typingsJapgolly.typescript.mod.TypeReferenceNode
import typingsJapgolly.typescript.mod.VariableDeclaration
import typingsJapgolly.typescript.mod.VariableDeclarationList
import typingsJapgolly.typescript.mod.VariableStatement
import typingsJapgolly.typescript.mod.WhileStatement
import typingsJapgolly.typescript.mod.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/syntaxWalker", JSImport.Namespace)
@js.native
object syntaxWalkerMod extends js.Object {
  @js.native
  class SyntaxWalker () extends js.Object {
    /* protected */ def visitAnyKeyword(node: Node): Unit = js.native
    /* protected */ def visitArrayLiteralExpression(node: ArrayLiteralExpression): Unit = js.native
    /* protected */ def visitArrayType(node: ArrayTypeNode): Unit = js.native
    /* protected */ def visitArrowFunction(node: ArrowFunction): Unit = js.native
    /* protected */ def visitBinaryExpression(node: BinaryExpression): Unit = js.native
    /* protected */ def visitBindingElement(node: BindingElement): Unit = js.native
    /* protected */ def visitBindingPattern(node: BindingPattern): Unit = js.native
    /* protected */ def visitBlock(node: Block): Unit = js.native
    /* protected */ def visitBreakStatement(node: BreakOrContinueStatement): Unit = js.native
    /* protected */ def visitCallExpression(node: CallExpression): Unit = js.native
    /* protected */ def visitCallSignature(node: SignatureDeclaration): Unit = js.native
    /* protected */ def visitCaseClause(node: CaseClause): Unit = js.native
    /* protected */ def visitCatchClause(node: CatchClause): Unit = js.native
    /* protected */ def visitClassDeclaration(node: ClassDeclaration): Unit = js.native
    /* protected */ def visitClassExpression(node: ClassExpression): Unit = js.native
    /* protected */ def visitConditionalExpression(node: ConditionalExpression): Unit = js.native
    /* protected */ def visitConstructSignature(node: ConstructSignatureDeclaration): Unit = js.native
    /* protected */ def visitConstructorDeclaration(node: ConstructorDeclaration): Unit = js.native
    /* protected */ def visitConstructorType(node: FunctionOrConstructorTypeNode): Unit = js.native
    /* protected */ def visitContinueStatement(node: BreakOrContinueStatement): Unit = js.native
    /* protected */ def visitDebuggerStatement(node: Statement): Unit = js.native
    /* protected */ def visitDefaultClause(node: DefaultClause): Unit = js.native
    /* protected */ def visitDoStatement(node: DoStatement): Unit = js.native
    /* protected */ def visitElementAccessExpression(node: ElementAccessExpression): Unit = js.native
    /* protected */ def visitEndOfFileToken(node: Node): Unit = js.native
    /* protected */ def visitEnumDeclaration(node: EnumDeclaration): Unit = js.native
    /* protected */ def visitEnumMember(node: EnumMember): Unit = js.native
    /* protected */ def visitExportAssignment(node: ExportAssignment): Unit = js.native
    /* protected */ def visitExpressionStatement(node: ExpressionStatement): Unit = js.native
    /* protected */ def visitForInStatement(node: ForInStatement): Unit = js.native
    /* protected */ def visitForOfStatement(node: ForOfStatement): Unit = js.native
    /* protected */ def visitForStatement(node: ForStatement): Unit = js.native
    /* protected */ def visitFunctionDeclaration(node: FunctionDeclaration): Unit = js.native
    /* protected */ def visitFunctionExpression(node: FunctionExpression): Unit = js.native
    /* protected */ def visitFunctionType(node: FunctionOrConstructorTypeNode): Unit = js.native
    /* protected */ def visitGetAccessor(node: AccessorDeclaration): Unit = js.native
    /* protected */ def visitIdentifier(node: Identifier): Unit = js.native
    /* protected */ def visitIfStatement(node: IfStatement): Unit = js.native
    /* protected */ def visitImportDeclaration(node: ImportDeclaration): Unit = js.native
    /* protected */ def visitImportEqualsDeclaration(node: ImportEqualsDeclaration): Unit = js.native
    /* protected */ def visitIndexSignatureDeclaration(node: IndexSignatureDeclaration): Unit = js.native
    /* protected */ def visitInterfaceDeclaration(node: InterfaceDeclaration): Unit = js.native
    /* protected */ def visitJsxAttribute(node: JsxAttribute): Unit = js.native
    /* protected */ def visitJsxElement(node: JsxElement): Unit = js.native
    /* protected */ def visitJsxExpression(node: JsxExpression): Unit = js.native
    /* protected */ def visitJsxSelfClosingElement(node: JsxSelfClosingElement): Unit = js.native
    /* protected */ def visitJsxSpreadAttribute(node: JsxSpreadAttribute): Unit = js.native
    /* protected */ def visitLabeledStatement(node: LabeledStatement): Unit = js.native
    /* protected */ def visitMethodDeclaration(node: MethodDeclaration): Unit = js.native
    /* protected */ def visitMethodSignature(node: SignatureDeclaration): Unit = js.native
    /* protected */ def visitModuleDeclaration(node: ModuleDeclaration): Unit = js.native
    /* protected */ def visitNamedImports(node: NamedImports): Unit = js.native
    /* protected */ def visitNamespaceImport(node: NamespaceImport): Unit = js.native
    /* protected */ def visitNewExpression(node: NewExpression): Unit = js.native
    /* protected */ def visitNode(node: Node): Unit = js.native
    /* protected */ def visitNonNullExpression(node: NonNullExpression): Unit = js.native
    /* protected */ def visitNumericLiteral(node: NumericLiteral): Unit = js.native
    /* protected */ def visitObjectLiteralExpression(node: ObjectLiteralExpression): Unit = js.native
    /* protected */ def visitParameterDeclaration(node: ParameterDeclaration): Unit = js.native
    /* protected */ def visitPostfixUnaryExpression(node: PostfixUnaryExpression): Unit = js.native
    /* protected */ def visitPrefixUnaryExpression(node: PrefixUnaryExpression): Unit = js.native
    /* protected */ def visitPropertyAccessExpression(node: PropertyAccessExpression): Unit = js.native
    /* protected */ def visitPropertyAssignment(node: PropertyAssignment): Unit = js.native
    /* protected */ def visitPropertyDeclaration(node: PropertyDeclaration): Unit = js.native
    /* protected */ def visitPropertySignature(node: Node): Unit = js.native
    /* protected */ def visitRegularExpressionLiteral(node: Node): Unit = js.native
    /* protected */ def visitReturnStatement(node: ReturnStatement): Unit = js.native
    /* protected */ def visitSetAccessor(node: AccessorDeclaration): Unit = js.native
    /* protected */ def visitSourceFile(node: SourceFile): Unit = js.native
    /* protected */ def visitStringLiteral(node: StringLiteral): Unit = js.native
    /* protected */ def visitSwitchStatement(node: SwitchStatement): Unit = js.native
    /* protected */ def visitTemplateExpression(node: TemplateExpression): Unit = js.native
    /* protected */ def visitThrowStatement(node: ThrowStatement): Unit = js.native
    /* protected */ def visitTryStatement(node: TryStatement): Unit = js.native
    /* protected */ def visitTupleType(node: TupleTypeNode): Unit = js.native
    /* protected */ def visitTypeAliasDeclaration(node: TypeAliasDeclaration): Unit = js.native
    /* protected */ def visitTypeAssertionExpression(node: TypeAssertion): Unit = js.native
    /* protected */ def visitTypeLiteral(node: TypeLiteralNode): Unit = js.native
    /* protected */ def visitTypeReference(node: TypeReferenceNode): Unit = js.native
    /* protected */ def visitVariableDeclaration(node: VariableDeclaration): Unit = js.native
    /* protected */ def visitVariableDeclarationList(node: VariableDeclarationList): Unit = js.native
    /* protected */ def visitVariableStatement(node: VariableStatement): Unit = js.native
    /* protected */ def visitWhileStatement(node: WhileStatement): Unit = js.native
    /* protected */ def visitWithStatement(node: WithStatement): Unit = js.native
    def walk(node: Node): Unit = js.native
    /* protected */ def walkChildren(node: Node): Unit = js.native
  }
  
}

