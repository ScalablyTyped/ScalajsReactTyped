package typingsJapgolly.validator

import typingsJapgolly.validator.mod.validator.AlphaLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isAlpha", JSImport.Namespace)
@js.native
object isAlphaMod extends js.Object {
  /**
    * Check if the string contains only letters (a-zA-Z).
    *
    * @param [locale] - AlphaLocale
    */
  def default(str: String): Boolean = js.native
  def default(str: String, locale: AlphaLocale): Boolean = js.native
}

