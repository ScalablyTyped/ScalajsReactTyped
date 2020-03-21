package typingsJapgolly.mochaccino.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mochaccino.mochaccinoStrings.document
import typingsJapgolly.mochaccino.mochaccinoStrings.navigator
import typingsJapgolly.mochaccino.mochaccinoStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dom_ extends js.Object {
  var exposedProperties: js.Tuple3[window, navigator, document]
  def clear(): Unit
  def create(): Unit
  def destroy(): Unit
}

object Dom_ {
  @scala.inline
  def apply(
    clear: Callback,
    create: Callback,
    destroy: Callback,
    exposedProperties: js.Tuple3[window, navigator, document]
  ): Dom_ = {
    val __obj = js.Dynamic.literal(exposedProperties = exposedProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[Dom_]
  }
}

