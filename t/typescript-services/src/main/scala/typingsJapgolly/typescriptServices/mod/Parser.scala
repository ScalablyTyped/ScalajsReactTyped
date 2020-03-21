package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Parser")
@js.native
object Parser extends js.Object {
  def incrementalParse(
    oldSyntaxTree: typingsJapgolly.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typingsJapgolly.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typingsJapgolly.typescriptServices.TypeScript.SyntaxTree = js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typingsJapgolly.typescriptServices.TypeScript.ParseOptions
  ): typingsJapgolly.typescriptServices.TypeScript.SyntaxTree = js.native
}

