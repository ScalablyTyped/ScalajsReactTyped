package typingsJapgolly.he.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encode extends js.Object {
  var options: EncodeOptions = js.native
  /**
    * Encode a string of text
    *
    * This function takes a string of text and encodes (by default) any symbols
    * that aren’t printable ASCII symbols and &, <, >, ", ', and `, replacing
    * them with character references.
    *
    * As long as the input string contains allowed code points only, the return
    * value of this function is always valid HTML. Any (invalid) code points
    * that cannot be represented using a character reference in the input are
    * not encoded.
    */
  def apply(text: String): String = js.native
  def apply(text: String, options: EncodeOptions): String = js.native
}

