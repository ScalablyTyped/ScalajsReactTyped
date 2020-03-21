package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.ISimpleText
import typingsJapgolly.typescriptServices.TypeScript.ISyntaxTriviaList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Scanner")
@js.native
class Scanner protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Scanner {
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typingsJapgolly.typescriptServices.TypeScript.LanguageVersion
  ) = this()
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typingsJapgolly.typescriptServices.TypeScript.LanguageVersion,
    window: js.Array[Double]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(text: ISimpleText, languageVersion: typingsJapgolly.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = js.native
}

