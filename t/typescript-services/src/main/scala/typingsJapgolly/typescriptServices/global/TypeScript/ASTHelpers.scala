package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IASTSpan
import typingsJapgolly.typescriptServices.TypeScript.IParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ASTHelpers {
  
  @JSGlobal("TypeScript.ASTHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def docComments(ast: typingsJapgolly.typescriptServices.TypeScript.AST): js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment] = ^.asInstanceOf[js.Dynamic].applyDynamic("docComments")(ast.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.Comment]]
  
  inline def enumIsElided(declaration: typingsJapgolly.typescriptServices.TypeScript.EnumDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enumIsElided")(declaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAstAtPosition(script: typingsJapgolly.typescriptServices.TypeScript.AST, pos: Double): typingsJapgolly.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.AST]
  inline def getAstAtPosition(
    script: typingsJapgolly.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], useTrailingTriviaAsLimChar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.AST]
  inline def getAstAtPosition(
    script: typingsJapgolly.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Boolean,
    forceInclusive: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], useTrailingTriviaAsLimChar.asInstanceOf[js.Any], forceInclusive.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.AST]
  inline def getAstAtPosition(
    script: typingsJapgolly.typescriptServices.TypeScript.AST,
    pos: Double,
    useTrailingTriviaAsLimChar: Unit,
    forceInclusive: Boolean
  ): typingsJapgolly.typescriptServices.TypeScript.AST = (^.asInstanceOf[js.Dynamic].applyDynamic("getAstAtPosition")(script.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], useTrailingTriviaAsLimChar.asInstanceOf[js.Any], forceInclusive.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.AST]
  
  inline def getEnclosingMemberVariableDeclaration(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingMemberVariableDeclaration")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.MemberVariableDeclaration]
  
  inline def getEnclosingModuleDeclaration(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingModuleDeclaration")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration]
  
  inline def getEnclosingParameterForInitializer(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnclosingParameterForInitializer")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Parameter]
  
  inline def getExtendsHeritageClause(clauses: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList2): typingsJapgolly.typescriptServices.TypeScript.HeritageClause = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtendsHeritageClause")(clauses.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.HeritageClause]
  
  inline def getImplementsHeritageClause(clauses: typingsJapgolly.typescriptServices.TypeScript.ISyntaxList2): typingsJapgolly.typescriptServices.TypeScript.HeritageClause = ^.asInstanceOf[js.Dynamic].applyDynamic("getImplementsHeritageClause")(clauses.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.HeritageClause]
  
  inline def getModuleDeclarationFromNameAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleDeclarationFromNameAST")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration]
  
  inline def getModuleNames(name: typingsJapgolly.typescriptServices.TypeScript.AST): js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleNames")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier]]
  inline def getModuleNames(
    name: typingsJapgolly.typescriptServices.TypeScript.AST,
    result: js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier]
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleNames")(name.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.Identifier]]
  
  inline def getNameOfIdenfierOrQualifiedName(name: typingsJapgolly.typescriptServices.TypeScript.AST): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameOfIdenfierOrQualifiedName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getParameterList(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.ParameterList = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterList")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.ParameterList]
  
  inline def getType(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.AST = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.AST]
  
  inline def getVariableDeclaratorModifiers(variableDeclarator: typingsJapgolly.typescriptServices.TypeScript.VariableDeclarator): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullElementFlags] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVariableDeclaratorModifiers")(variableDeclarator.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.PullElementFlags]]
  
  inline def isCallExpression(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCallExpressionTarget(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpressionTarget")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDeclarationAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclarationAST")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDeclarationASTOrDeclarationNameAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeclarationASTOrDeclarationNameAST")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIntegerLiteralAST(expression: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerLiteralAST")(expression.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLastNameOfModule(
    ast: typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration,
    astName: typingsJapgolly.typescriptServices.TypeScript.AST
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLastNameOfModule")(ast.asInstanceOf[js.Any], astName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNameOfFunction(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameOfFunction")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameOfMemberAccessExpression(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameOfMemberAccessExpression")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNameOfMemberFunction(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNameOfMemberFunction")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRightSideOfQualifiedName(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRightSideOfQualifiedName")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidAstNode(ast: IASTSpan): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAstNode")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def moduleIsElided(declaration: typingsJapgolly.typescriptServices.TypeScript.ModuleDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("moduleIsElided")(declaration.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parametersFromIdentifier(id: typingsJapgolly.typescriptServices.TypeScript.Identifier): IParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parametersFromIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[IParameters]
  
  inline def parametersFromParameter(parameter: typingsJapgolly.typescriptServices.TypeScript.Parameter): IParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parametersFromParameter")(parameter.asInstanceOf[js.Any]).asInstanceOf[IParameters]
  
  inline def parametersFromParameterList(list: typingsJapgolly.typescriptServices.TypeScript.ParameterList): IParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("parametersFromParameterList")(list.asInstanceOf[js.Any]).asInstanceOf[IParameters]
  
  inline def parentIsModuleDeclaration(ast: typingsJapgolly.typescriptServices.TypeScript.AST): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parentIsModuleDeclaration")(ast.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def scriptIsElided(sourceUnit: typingsJapgolly.typescriptServices.TypeScript.SourceUnit): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("scriptIsElided")(sourceUnit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
