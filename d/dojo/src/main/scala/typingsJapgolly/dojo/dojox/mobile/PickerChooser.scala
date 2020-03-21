package typingsJapgolly.dojo.dojox.mobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_PickerChooser.html
  *
  * This widget chooses a picker class according to the current theme.
  * Imports ValuePicker-based date/time picker when the current theme is "android".
  * Imports SpinWheel-based date/time picker otherwise.
  *
  */
trait PickerChooser extends js.Object {
  /**
    * Imports a picker class according to the current theme.
    *
    * @param id
    * @param parentRequire
    * @param loaded
    */
  def load(id: js.Any, parentRequire: js.Any, loaded: js.Any): Unit
}

object PickerChooser {
  @scala.inline
  def apply(load: (js.Any, js.Any, js.Any) => Callback): PickerChooser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => load(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PickerChooser]
  }
}

