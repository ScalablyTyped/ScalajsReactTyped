package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared

import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Shared.TokenValuesAccess")
@js.native
class TokenValuesAccess protected () extends ITokenAccess {
  def this(tks: js.Array[SyntaxKind]) = this()
  var tokens: js.Any = js.native
  /* CompleteClass */
  override def Contains(token: SyntaxKind): Boolean = js.native
  /* CompleteClass */
  override def GetTokens(): js.Array[SyntaxKind] = js.native
}

