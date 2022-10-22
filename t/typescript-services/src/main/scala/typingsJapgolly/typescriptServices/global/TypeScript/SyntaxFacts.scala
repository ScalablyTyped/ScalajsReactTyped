package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SyntaxFacts {
  
  @JSGlobal("TypeScript.SyntaxFacts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBinaryExpressionFromOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinaryExpressionFromOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxKind]
  
  inline def getOperatorTokenFromBinaryExpression(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getOperatorTokenFromBinaryExpression")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxKind]
  
  inline def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getPostfixUnaryExpressionFromOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxKind]
  
  inline def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefixUnaryExpressionFromOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxKind]
  
  inline def getText(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTokenKind(text: String): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenKind")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.SyntaxKind]
  
  inline def isAnyDivideOrRegularExpressionToken(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyDivideOrRegularExpressionToken")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAnyDivideToken(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyDivideToken")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAnyKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAnyPunctuation(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnyPunctuation")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBinaryExpressionOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpressionOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectivePrologueElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFutureReservedKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFutureReservedKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFutureReservedStrictKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFutureReservedStrictKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierNameOrAnyKeyword")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPrefixUnaryExpressionOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixUnaryExpressionOperatorToken")(tokenKind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isStandardKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStandardKeyword")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTokenKind(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUseStrictDirective")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
