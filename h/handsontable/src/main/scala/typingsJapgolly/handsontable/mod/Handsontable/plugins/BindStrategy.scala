package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindStrategy extends js.Object {
  var strategy: String | Unit
  def clearMap(): Unit
  def createMap(length: Double): Unit
  def createRow(params: js.Any): Unit
  def destroy(): Unit
  def klass(): Unit
  def removeRow(params: js.Any): Unit
  def setStrategy(name: String): Unit
  def translate(params: js.Any): Unit
}

object BindStrategy {
  @scala.inline
  def apply(
    clearMap: Callback,
    createMap: Double => Callback,
    createRow: js.Any => Callback,
    destroy: Callback,
    klass: Callback,
    removeRow: js.Any => Callback,
    setStrategy: String => Callback,
    strategy: String | Unit,
    translate: js.Any => Callback
  ): BindStrategy = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.updateDynamic("clearMap")(clearMap.toJsFn)
    __obj.updateDynamic("createMap")(js.Any.fromFunction1((t0: scala.Double) => createMap(t0).runNow()))
    __obj.updateDynamic("createRow")(js.Any.fromFunction1((t0: js.Any) => createRow(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("klass")(klass.toJsFn)
    __obj.updateDynamic("removeRow")(js.Any.fromFunction1((t0: js.Any) => removeRow(t0).runNow()))
    __obj.updateDynamic("setStrategy")(js.Any.fromFunction1((t0: java.lang.String) => setStrategy(t0).runNow()))
    __obj.updateDynamic("translate")(js.Any.fromFunction1((t0: js.Any) => translate(t0).runNow()))
    __obj.asInstanceOf[BindStrategy]
  }
}

