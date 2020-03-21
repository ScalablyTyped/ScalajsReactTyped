package typingsJapgolly.typescriptServices.TypeScript.PullHelpers

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol
import typingsJapgolly.typescriptServices.TypeScript.PullSymbol
import typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullTypeSymbolStructureWalker extends js.Object {
  def callSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
  def constructSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
  def indexSignatureWalk(signatureSymbol: PullSignatureSymbol): Boolean
  def memberSymbolWalk(memberSymbol: PullSymbol): Boolean
  def signatureParameterWalk(parameterSymbol: PullSymbol): Boolean
  def signatureReturnTypeWalk(returnType: PullTypeSymbol): Boolean
}

object PullTypeSymbolStructureWalker {
  @scala.inline
  def apply(
    callSignatureWalk: PullSignatureSymbol => CallbackTo[Boolean],
    constructSignatureWalk: PullSignatureSymbol => CallbackTo[Boolean],
    indexSignatureWalk: PullSignatureSymbol => CallbackTo[Boolean],
    memberSymbolWalk: PullSymbol => CallbackTo[Boolean],
    signatureParameterWalk: PullSymbol => CallbackTo[Boolean],
    signatureReturnTypeWalk: PullTypeSymbol => CallbackTo[Boolean]
  ): PullTypeSymbolStructureWalker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callSignatureWalk")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol) => callSignatureWalk(t0).runNow()))
    __obj.updateDynamic("constructSignatureWalk")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol) => constructSignatureWalk(t0).runNow()))
    __obj.updateDynamic("indexSignatureWalk")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol) => indexSignatureWalk(t0).runNow()))
    __obj.updateDynamic("memberSymbolWalk")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.PullSymbol) => memberSymbolWalk(t0).runNow()))
    __obj.updateDynamic("signatureParameterWalk")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.PullSymbol) => signatureParameterWalk(t0).runNow()))
    __obj.updateDynamic("signatureReturnTypeWalk")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol) => signatureReturnTypeWalk(t0).runNow()))
    __obj.asInstanceOf[PullTypeSymbolStructureWalker]
  }
}

