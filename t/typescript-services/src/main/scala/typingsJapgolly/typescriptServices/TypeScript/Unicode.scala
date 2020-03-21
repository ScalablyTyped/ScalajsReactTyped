package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Unicode")
@js.native
class Unicode () extends js.Object

/* static members */
@JSGlobal("TypeScript.Unicode")
@js.native
object Unicode extends js.Object {
  var unicodeES3IdentifierPart: js.Array[Double] = js.native
  var unicodeES3IdentifierStart: js.Array[Double] = js.native
  var unicodeES5IdentifierPart: js.Array[Double] = js.native
  var unicodeES5IdentifierStart: js.Array[Double] = js.native
  def isIdentifierPart(code: Double, languageVersion: LanguageVersion): Boolean = js.native
  def isIdentifierStart(code: Double, languageVersion: LanguageVersion): Boolean = js.native
  def lookupInUnicodeMap(code: Double, map: js.Array[Double]): Boolean = js.native
}

