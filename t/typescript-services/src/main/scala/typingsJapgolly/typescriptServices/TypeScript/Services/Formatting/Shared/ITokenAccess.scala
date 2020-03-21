package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITokenAccess extends js.Object {
  def Contains(token: SyntaxKind): Boolean
  def GetTokens(): js.Array[SyntaxKind]
}

object ITokenAccess {
  @scala.inline
  def apply(Contains: SyntaxKind => CallbackTo[Boolean], GetTokens: CallbackTo[js.Array[SyntaxKind]]): ITokenAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Contains")(js.Any.fromFunction1((t0: typingsJapgolly.typescriptServices.TypeScript.SyntaxKind) => Contains(t0).runNow()))
    __obj.updateDynamic("GetTokens")(GetTokens.toJsFn)
    __obj.asInstanceOf[ITokenAccess]
  }
}

