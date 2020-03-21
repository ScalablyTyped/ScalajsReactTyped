package typingsJapgolly.typescriptServices.TypeScript

import typingsJapgolly.typescriptServices.AnonAllowAutomaticSemicolonInsertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParseOptions")
@js.native
class ParseOptions protected () extends js.Object {
  def this(languageVersion: LanguageVersion, allowAutomaticSemicolonInsertion: Boolean) = this()
  var _allowAutomaticSemicolonInsertion: js.Any = js.native
  var _languageVersion: js.Any = js.native
  def allowAutomaticSemicolonInsertion(): Boolean = js.native
  def languageVersion(): LanguageVersion = js.native
  def toJSON(key: js.Any): AnonAllowAutomaticSemicolonInsertion = js.native
}

