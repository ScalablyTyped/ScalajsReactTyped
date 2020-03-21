package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationRule extends js.Object {
  var literal: js.Array[String]
  var new_category: String
  var old_category: String
  var predicate: Predicate
  @JSName("apply")
  def apply(tagged_sentence: js.Array[js.Array[String]], position: Double): Unit
}

object TransformationRule {
  @scala.inline
  def apply(
    apply: (js.Array[js.Array[String]], Double) => Callback,
    literal: js.Array[String],
    new_category: String,
    old_category: String,
    predicate: Predicate
  ): TransformationRule = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], new_category = new_category.asInstanceOf[js.Any], old_category = old_category.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction2((t0: js.Array[js.Array[java.lang.String]], t1: scala.Double) => apply(t0, t1).runNow()))
    __obj.asInstanceOf[TransformationRule]
  }
}

