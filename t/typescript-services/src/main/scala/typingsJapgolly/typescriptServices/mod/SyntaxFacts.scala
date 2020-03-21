package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISyntaxNodeOrToken
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SyntaxFacts")
@js.native
object SyntaxFacts extends js.Object {
  def getBinaryExpressionFromOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  def getOperatorTokenFromBinaryExpression(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  def getPostfixUnaryExpressionFromOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  def getPrefixUnaryExpressionFromOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  def getText(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): String = js.native
  def getTokenKind(text: String): typingsJapgolly.typescriptServices.TypeScript.SyntaxKind = js.native
  def isAnyDivideOrRegularExpressionToken(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyDivideToken(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isAnyPunctuation(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isBinaryExpressionOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isDirectivePrologueElement(node: ISyntaxNodeOrToken): Boolean = js.native
  def isFutureReservedKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isFutureReservedStrictKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isIdentifierNameOrAnyKeyword(token: ISyntaxToken): Boolean = js.native
  def isPrefixUnaryExpressionOperatorToken(tokenKind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isStandardKeyword(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isTokenKind(kind: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind): Boolean = js.native
  def isUseStrictDirective(node: ISyntaxNodeOrToken): Boolean = js.native
}

