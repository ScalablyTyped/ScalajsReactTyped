package typingsJapgolly.jsSpec.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec_ extends js.Object {
  /**
    * The name of the spec, displayed in explain() results.
    */
  val name: String
  /**
    * Data necessary to check values for conformity.
    */
  val options: js.Object
  /**
    * Returns the conformed value to this spec.
    * @param value the value to test for conformance
    * @returns if the value does not conform to the spec, or the value if it does.
    */
  def conform(value: js.Any): js.Any
  /**
    * Explain why a value does not conform to this spec.
    * @param path the path to the value
    * @param via the containing specs, if any
    * @param value the value to examine
    * @returns list of problems or null if none
    */
  def explain(path: js.Array[String], via: js.Array[String], value: js.Any): js.Array[Problem]
}

object Spec_ {
  @scala.inline
  def apply(
    conform: js.Any => CallbackTo[js.Any],
    explain: (js.Array[String], js.Array[String], js.Any) => CallbackTo[js.Array[Problem]],
    name: String,
    options: js.Object
  ): Spec_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("conform")(js.Any.fromFunction1((t0: js.Any) => conform(t0).runNow()))
    __obj.updateDynamic("explain")(js.Any.fromFunction3((t0: js.Array[java.lang.String], t1: js.Array[java.lang.String], t2: js.Any) => explain(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Spec_]
  }
}

