package typingsJapgolly.typeahead.Bloodhound

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Build-in tokenization methods.
  */
trait Tokenizers extends js.Object {
  /**
    * Instances of the build-in tokenization methods.
    */
  var obj: ObjTokenizer
  /**
    * Split a given string on non-word characters.
    */
  def nonword(str: String): js.Array[String]
  /**
    * Split a given string on whitespace characters.
    */
  def whitespace(str: String): js.Array[String]
}

object Tokenizers {
  @scala.inline
  def apply(
    nonword: String => CallbackTo[js.Array[String]],
    obj: ObjTokenizer,
    whitespace: String => CallbackTo[js.Array[String]]
  ): Tokenizers = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.updateDynamic("nonword")(js.Any.fromFunction1((t0: java.lang.String) => nonword(t0).runNow()))
    __obj.updateDynamic("whitespace")(js.Any.fromFunction1((t0: java.lang.String) => whitespace(t0).runNow()))
    __obj.asInstanceOf[Tokenizers]
  }
}

