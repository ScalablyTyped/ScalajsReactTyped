package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library_ extends js.Object {
  def add(definitions: IconDefinitionOrPack*): Unit
  def reset(): Unit
}

object Library_ {
  @scala.inline
  def apply(add: /* repeated */ IconDefinitionOrPack => Callback, reset: Callback): Library_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.fortawesomeFontawesomeSvgCore.mod.IconDefinitionOrPack) => add(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[Library_]
  }
}

