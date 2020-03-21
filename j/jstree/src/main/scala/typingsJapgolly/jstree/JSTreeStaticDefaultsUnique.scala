package typingsJapgolly.jstree

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsUnique extends js.Object {
  /**
    * Indicates if the comparison should be case sensitive. Default is `false`.
    * @name $.jstree.defaults.unique.case_sensitive
    * @plugin unique
    */
  var case_sensitive: Boolean
  /**
    * Indicates if white space should be trimmed before the comparison. Default is `false`.
    * @name $.jstree.defaults.unique.trim_whitespace
    * @plugin unique
    */
  var trim_whitespace: Boolean
  /**
    * A callback executed in the instance's scope when a new node is created
    * and the name is already taken, the two arguments are the conflicting name and the counter.
    * The default will produce results like `New node (2)`.
    * @name $.jstree.defaults.unique.duplicate
    * @plugin unique
    */
  def duplicate(name: String, counter: Double): String
}

object JSTreeStaticDefaultsUnique {
  @scala.inline
  def apply(
    case_sensitive: Boolean,
    duplicate: (String, Double) => CallbackTo[String],
    trim_whitespace: Boolean
  ): JSTreeStaticDefaultsUnique = {
    val __obj = js.Dynamic.literal(case_sensitive = case_sensitive.asInstanceOf[js.Any], trim_whitespace = trim_whitespace.asInstanceOf[js.Any])
    __obj.updateDynamic("duplicate")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => duplicate(t0, t1).runNow()))
    __obj.asInstanceOf[JSTreeStaticDefaultsUnique]
  }
}

