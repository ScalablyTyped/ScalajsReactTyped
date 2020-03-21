package typingsJapgolly.amcharts.exportSettingsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  var config: js.Any
  var enabled: Boolean
  var libs: js.Object
  var menu: js.Object
  def capture(config: js.Any, callback: js.Function0[Unit]): js.Any
  def toArray(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toBlob(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toCSV(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toCanvas(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toImage(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toJPG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toJSON(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toPDF(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toPNG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toSVG(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
  def toXLSX(options: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Any
}

object ExportSettings {
  @scala.inline
  def apply(
    capture: (js.Any, js.Function0[Unit]) => CallbackTo[js.Any],
    config: js.Any,
    enabled: Boolean,
    libs: js.Object,
    menu: js.Object,
    toArray: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toBlob: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toCSV: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toCanvas: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toImage: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toJPG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toJSON: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toPDF: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toPNG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toSVG: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any],
    toXLSX: (js.Any, js.Function1[/* data */ js.Any, Unit]) => CallbackTo[js.Any]
  ): ExportSettings = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], libs = libs.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
    __obj.updateDynamic("capture")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => capture(t0, t1).runNow()))
    __obj.updateDynamic("toArray")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toArray(t0, t1).runNow()))
    __obj.updateDynamic("toBlob")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toBlob(t0, t1).runNow()))
    __obj.updateDynamic("toCSV")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toCSV(t0, t1).runNow()))
    __obj.updateDynamic("toCanvas")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toCanvas(t0, t1).runNow()))
    __obj.updateDynamic("toImage")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toImage(t0, t1).runNow()))
    __obj.updateDynamic("toJPG")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toJPG(t0, t1).runNow()))
    __obj.updateDynamic("toJSON")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toJSON(t0, t1).runNow()))
    __obj.updateDynamic("toPDF")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toPDF(t0, t1).runNow()))
    __obj.updateDynamic("toPNG")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toPNG(t0, t1).runNow()))
    __obj.updateDynamic("toSVG")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toSVG(t0, t1).runNow()))
    __obj.updateDynamic("toXLSX")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* data */ js.Any, scala.Unit]) => toXLSX(t0, t1).runNow()))
    __obj.asInstanceOf[ExportSettings]
  }
}

