package typingsJapgolly.natural.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Predicate extends js.Object {
  var function: js.UndefOr[
    js.Function3[
      /* tagged_sentence */ js.Array[js.Array[String]], 
      /* i */ Double, 
      /* parameter */ String, 
      Boolean
    ]
  ] = js.undefined
  var name: String
  var parameter1: String
  var parameter2: js.UndefOr[String] = js.undefined
  def evaluate(tagged_sentence: js.Array[js.Array[String]], position: Double): Boolean
}

object Predicate {
  @scala.inline
  def apply(
    evaluate: (js.Array[js.Array[String]], Double) => CallbackTo[Boolean],
    name: String,
    parameter1: String,
    function: (/* tagged_sentence */ js.Array[js.Array[String]], /* i */ Double, /* parameter */ String) => CallbackTo[Boolean] = null,
    parameter2: String = null
  ): Predicate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameter1 = parameter1.asInstanceOf[js.Any])
    __obj.updateDynamic("evaluate")(js.Any.fromFunction2((t0: js.Array[js.Array[java.lang.String]], t1: scala.Double) => evaluate(t0, t1).runNow()))
    if (function != null) __obj.updateDynamic("function")(js.Any.fromFunction3((t0: /* tagged_sentence */ js.Array[js.Array[java.lang.String]], t1: /* i */ scala.Double, t2: /* parameter */ java.lang.String) => function(t0, t1, t2).runNow()))
    if (parameter2 != null) __obj.updateDynamic("parameter2")(parameter2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Predicate]
  }
}

