package typingsJapgolly.dynatable

import japgolly.scalajs.react.Callback
import typingsJapgolly.dynatable.JQueryDynatable.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static members of jQuery (those on $ and jQuery themselves) */
trait JQueryStatic extends js.Object {
  /**
    * Global dynatable plugin setting defaults
    *
    * @param options The configuration options to be set globally
    */
  def dynatableSetup(options: Options): Unit
}

object JQueryStatic {
  @scala.inline
  def apply(dynatableSetup: Options => Callback): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dynatableSetup")(js.Any.fromFunction1((t0: typingsJapgolly.dynatable.JQueryDynatable.Options) => dynatableSetup(t0).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
}

