package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IASTSpan
import typingsJapgolly.typescriptServices.TypeScript.IParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ASTHelpers")
@js.native
object ASTHelpers extends js.Object {
  def docComments(ast: typingsJapgolly.typescriptServices.TypeScript.AST): js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment] = js.native
  def enumIsElided(declaration: typingsJapgolly.typescriptServices.TypeScript.EnumDeclaration): Boolean = js.native
  def getAstAtPosition(script: typingsJapgolly.typescriptServices.TypeScript.AST, pos: Double): typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typingsJapgolly.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  def getAstAtPosition(
    script: typingsJapgolly.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  def getEnclosingMemberVariableDeclaration(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclaration = js.native
  def getEnclosingModuleDeclaration(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration = js.native
  def getEnclosingParameterForInitializer(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.Parameter = js.native
  def getExtendsHeritageClause(clauses: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList2): typingsJapgolly.typescriptServices.TypeScript.HeritageClause = js.native
  def getImplementsHeritageClause(clauses: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList2): typingsJapgolly.typescriptServices.TypeScript.HeritageClause = js.native
  def getModuleDeclarationFromNameAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration = js.native
  def getModuleNames(name: typingsJapgolly.typescriptServices.TypeScript.AST): js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier] = js.native
  def getModuleNames(
    name: typingsJapgolly.typescriptServices.TypeScript.AST,
    result: js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier]
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier] = js.native
  def getNameOfIdenfierOrQualifiedName(name: typingsJapgolly.typescriptServices.TypeScript.AST): String = js.native
  def getParameterList(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.ParameterList = js.native
  def getType(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.AST = js.native
  def getVariableDeclaratorModifiers(variableDeclarator: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarator): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullElementFlags] = js.native
  def isCallExpression(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isCallExpressionTarget(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isDeclarationAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isDeclarationASTOrDeclarationNameAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isIntegerLiteralAST(expression: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isLastNameOfModule(
    ast: typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typingsJapgolly.typescriptServices.TypeScript.AST
  ): Boolean = js.native
  def isNameOfFunction(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberAccessExpression(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isNameOfMemberFunction(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isRightSideOfQualifiedName(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def isValidAstNode(ast: IASTSpan): Boolean = js.native
  def moduleIsElided(declaration: typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration): Boolean = js.native
  def parametersFromIdentifier(id: typingsJapgolly.typescriptServices.TypeScript.Identifier): IParameters = js.native
  def parametersFromParameter(parameter: typingsJapgolly.typescriptServices.TypeScript.Parameter): IParameters = js.native
  def parametersFromParameterList(list: typingsJapgolly.typescriptServices.TypeScript.ParameterList): IParameters = js.native
  def parentIsModuleDeclaration(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = js.native
  def scriptIsElided(sourceUnit: typingsJapgolly.typescriptServices.TypeScript.SourceUnit): Boolean = js.native
}

