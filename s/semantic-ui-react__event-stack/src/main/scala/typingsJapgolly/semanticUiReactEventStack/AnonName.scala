package typingsJapgolly.semanticUiReactEventStack

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /** An event name on which we will subscribe. */
  var name: Validator[String]
  /** An event handler or array of event handlers. */
  var on: Validator[
    (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
  ]
  /** A name of pool. */
  var pool: Requireable[String]
  /** A DOM element on which we will subscribe. */
  var target: Requireable[js.Object]
}

object AnonName {
  @scala.inline
  def apply(
    name: Validator[String],
    on: Validator[
      (js.Function1[/* repeated */ _, _]) | (js.Array[(js.Function1[/* repeated */ _, _]) | Null])
    ],
    pool: Requireable[String],
    target: Requireable[js.Object]
  ): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

