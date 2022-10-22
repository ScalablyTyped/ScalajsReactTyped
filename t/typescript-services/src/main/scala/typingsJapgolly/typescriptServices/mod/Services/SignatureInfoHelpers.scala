package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.ICallExpression
import typingsJapgolly.typescriptServices.TypeScript.PositionedToken
import typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
import typingsJapgolly.typescriptServices.TypeScript.PullSymbol
import typingsJapgolly.typescriptServices.TypeScript.Services.IPartiallyWrittenTypeArgumentListInformation
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import typingsJapgolly.typescriptServices.TypeScript.SyntaxTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.SignatureInfoHelpers")
@js.native
open class SignatureInfoHelpers ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.SignatureInfoHelpers
object SignatureInfoHelpers {
  
  @JSImport("typescript-services", "Services.SignatureInfoHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getActualSignatureInfoFromCallExpression(
    ast: ICallExpression,
    caretPosition: Double,
    typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
  ): typingsJapgolly.typescriptServices.TypeScript.Services.ActualSignatureInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getActualSignatureInfoFromCallExpression")(ast.asInstanceOf[js.Any], caretPosition.asInstanceOf[js.Any], typeParameterInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.ActualSignatureInfo]
  
  /* static member */
  inline def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typingsJapgolly.typescriptServices.TypeScript.Services.ActualSignatureInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getActualSignatureInfoFromPartiallyWritenGenericExpression")(caretPosition.asInstanceOf[js.Any], typeParameterInformation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.Services.ActualSignatureInfo]
  
  /* static member */
  inline def getSignatureInfoFromGenericSymbol(
    symbol: PullSymbol,
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsJapgolly.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureInfoFromGenericSymbol")(symbol.asInstanceOf[js.Any], enclosingScopeSymbol.asInstanceOf[js.Any], compilerState.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.FormalSignatureItemInfo]]
  
  /* static member */
  inline def getSignatureInfoFromSignatureSymbol(
    symbol: PullSymbol,
    signatures: js.Array[PullSignatureSymbol],
    enclosingScopeSymbol: PullSymbol,
    compilerState: typingsJapgolly.typescriptServices.TypeScript.Services.LanguageServiceCompiler
  ): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.FormalSignatureItemInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignatureInfoFromSignatureSymbol")(symbol.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], enclosingScopeSymbol.asInstanceOf[js.Any], compilerState.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.FormalSignatureItemInfo]]
  
  /* static member */
  inline def isInPartiallyWrittenTypeArgumentList(syntaxTree: SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("isInPartiallyWrittenTypeArgumentList")(syntaxTree.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[IPartiallyWrittenTypeArgumentListInformation]
  
  /* static member */
  inline def isSignatureHelpBlocker(sourceUnit: SourceUnitSyntax, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignatureHelpBlocker")(sourceUnit.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def isTargetOfObjectCreationExpression(positionedToken: PositionedToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTargetOfObjectCreationExpression")(positionedToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def moveBackUpTillMatchingTokenKind(token: Any, tokenKind: Any, matchingTokenKind: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("moveBackUpTillMatchingTokenKind")(token.asInstanceOf[js.Any], tokenKind.asInstanceOf[js.Any], matchingTokenKind.asInstanceOf[js.Any])).asInstanceOf[Any]
}
