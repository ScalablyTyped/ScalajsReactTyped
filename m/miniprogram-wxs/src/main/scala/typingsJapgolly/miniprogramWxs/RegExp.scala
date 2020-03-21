package typingsJapgolly.miniprogramWxs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExp extends js.Object {
  /** Returns a Boolean value indicating the state of the global flag (g) used with a regular expression. Default is false. Read-only. */
  val global: scala.Boolean
  /** Returns a Boolean value indicating the state of the ignoreCase flag (i) used with a regular expression. Default is false. Read-only. */
  val ignoreCase: scala.Boolean
  var lastIndex: Double
  /** Returns a Boolean value indicating the state of the multiline flag (m) used with a regular expression. Default is false. Read-only. */
  val multiline: scala.Boolean
  /** Returns a copy of the text of the regular expression pattern. Read-only. The regExp argument is a Regular expression object. It can be a variable name or a literal. */
  val source: java.lang.String
  // Non-standard extensions
  def compile(): this.type
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  def exec(string: java.lang.String): RegExpExecArray | Null
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  def test(string: java.lang.String): scala.Boolean
}

object RegExp {
  @scala.inline
  def apply(
    compile: CallbackTo[RegExp],
    exec: java.lang.String => CallbackTo[RegExpExecArray | Null],
    global: scala.Boolean,
    ignoreCase: scala.Boolean,
    lastIndex: Double,
    multiline: scala.Boolean,
    source: java.lang.String,
    test: java.lang.String => CallbackTo[scala.Boolean]
  ): RegExp = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("compile")(compile.toJsFn)
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: java.lang.String) => exec(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: java.lang.String) => test(t0).runNow()))
    __obj.asInstanceOf[RegExp]
  }
}

