package typingsJapgolly.typescriptServices.mod.Services.Formatting

import typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
class RuleDescriptor protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
  def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
}

/* static members */
@JSImport("typescript-services", "Services.Formatting.RuleDescriptor")
@js.native
object RuleDescriptor extends js.Object {
  def create1(left: SyntaxKind, right: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create2(left: TokenRange, right: SyntaxKind): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create3(left: SyntaxKind, right: TokenRange): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  def create4(left: TokenRange, right: TokenRange): typingsJapgolly.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
}

