package typingsJapgolly.validator

import typingsJapgolly.validator.mod.validator.IsByteLengthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isByteLength", JSImport.Namespace)
@js.native
object isByteLengthMod extends js.Object {
  /**
    * Check if the string's length (in UTF-8 bytes) falls in a range.
    *
    * @param [options] - Options
    */
  def default(str: String): Boolean = js.native
  def default(str: String, options: IsByteLengthOptions): Boolean = js.native
}

