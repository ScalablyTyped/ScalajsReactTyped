package typingsJapgolly.brace.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer extends js.Object {
  /**
    * Returns an object containing two properties: `tokens`, which contains all the tokens; and `state`, the current state.
    **/
  def getLineTokens(): js.Any
}

@JSImport("brace", "Tokenizer")
@js.native
object Tokenizer
  extends /**
  * Constructs a new tokenizer based on the given rules and flags.
  * @param rules The highlighting rules
  * @param flag Any additional regular expression flags to pass (like "i" for case insensitive)
  **/
Instantiable2[/* rules */ js.Any, /* flag */ String, Tokenizer]

