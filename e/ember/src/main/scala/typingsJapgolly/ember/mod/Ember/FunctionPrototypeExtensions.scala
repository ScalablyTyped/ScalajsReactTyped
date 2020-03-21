package typingsJapgolly.ember.mod.Ember

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionPrototypeExtensions extends js.Object {
  /**
    * The `observes` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * true, which is the default.
    */
  def observes(args: java.lang.String*): this.type
  /**
    * The `on` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * true, which is the default.
    */
  def on(args: java.lang.String*): this.type
  /**
    * The `property` extension of Javascript's Function prototype is available
    * when `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Function` is
    * `true`, which is the default.
    */
  def property(args: java.lang.String*): ComputedProperty[_, _]
}

object FunctionPrototypeExtensions {
  @scala.inline
  def apply(
    observes: /* repeated */ java.lang.String => CallbackTo[FunctionPrototypeExtensions],
    on: /* repeated */ java.lang.String => CallbackTo[FunctionPrototypeExtensions],
    property: /* repeated */ java.lang.String => CallbackTo[ComputedProperty[js.Any, js.Any]]
  ): FunctionPrototypeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("observes")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => observes(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => on(t0).runNow()))
    __obj.updateDynamic("property")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => property(t0).runNow()))
    __obj.asInstanceOf[FunctionPrototypeExtensions]
  }
}

