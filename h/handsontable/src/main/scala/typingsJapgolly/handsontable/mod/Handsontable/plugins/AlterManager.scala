package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterManager extends js.Object {
  var dataProvider: DataProvider
  var hot: Core
  var matrix: Matrix
  var sheet: Sheet
  def destroy(): Unit
  def prepareAlter(action: String, args: js.Any): Unit
  def triggerAlter(action: String, args: js.Any): Unit
}

object AlterManager {
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    destroy: Callback,
    hot: Core,
    matrix: Matrix,
    prepareAlter: (String, js.Any) => Callback,
    sheet: Sheet,
    triggerAlter: (String, js.Any) => Callback
  ): AlterManager = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("prepareAlter")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => prepareAlter(t0, t1).runNow()))
    __obj.updateDynamic("triggerAlter")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => triggerAlter(t0, t1).runNow()))
    __obj.asInstanceOf[AlterManager]
  }
}

