package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.ICallExpression
import typingsJapgolly.typescriptServices.TypeScript.PositionedToken
import typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
import typingsJapgolly.typescriptServices.TypeScript.PullSymbol
import typingsJapgolly.typescriptServices.TypeScript.Services.IPartiallyWrittenTypeArgumentListInformation
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
class SignatureInfoHelpers ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.SignatureInfoHelpers

/* static members */
@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
object SignatureInfoHelpers extends js.Object {
  def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): typingsJapgolly.typescriptServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typingsJapgolly.typescriptServices.TypeScript.Services.ActualSignatureInfo = js.native
  def getSignatureInfoFromGenericSymbol(
    symbol: PullSymbol,
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsJapgolly.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def getSignatureInfoFromSignatureSymbol(
    symbol: PullSymbol,
    signatures: js.Array[PullSignatureSymbol],
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsJapgolly.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = js.native
  def isInPartiallyWrittenTypeArgumentList(syntaxTree: SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
  def isSignatureHelpBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = js.native
  def isTargetOfObjectCreationExpression(positionedToken: PositionedToken): Boolean = js.native
  /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
}

