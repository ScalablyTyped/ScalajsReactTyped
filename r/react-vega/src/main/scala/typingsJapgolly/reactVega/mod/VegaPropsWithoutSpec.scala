package typingsJapgolly.reactVega.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVega.AnonBottom
import typingsJapgolly.std.Record
import typingsJapgolly.vegaTypings.mod.View
import typingsJapgolly.vegaTypings.runtimeMod.Item
import typingsJapgolly.vegaTypings.runtimeMod.TooltipHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VegaPropsWithoutSpec extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[Record[String, js.Array[_]]] = js.undefined
  var enableHover: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var logLevel: js.UndefOr[Double] = js.undefined
  var onNewView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  var onParseError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var padding: js.UndefOr[Double | AnonBottom] = js.undefined
  var renderer: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tooltip: js.UndefOr[TooltipHandler] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object VegaPropsWithoutSpec {
  @scala.inline
  def apply(
    background: String = null,
    className: String = null,
    data: Record[String, js.Array[_]] = null,
    enableHover: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    logLevel: Int | Double = null,
    onNewView: /* view */ View => Callback = null,
    onParseError: /* error */ js.Error => Callback = null,
    padding: Double | AnonBottom = null,
    renderer: String = null,
    style: CSSProperties = null,
    tooltip: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Callback = null,
    width: Int | Double = null
  ): VegaPropsWithoutSpec = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHover)) __obj.updateDynamic("enableHover")(enableHover.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (onNewView != null) __obj.updateDynamic("onNewView")(js.Any.fromFunction1((t0: /* view */ typingsJapgolly.vegaTypings.mod.View) => onNewView(t0).runNow()))
    if (onParseError != null) __obj.updateDynamic("onParseError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onParseError(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction4((t0: /* handler */ js.Any, t1: /* event */ org.scalajs.dom.raw.MouseEvent, t2: /* item */ typingsJapgolly.vegaTypings.runtimeMod.Item[js.Any], t3: /* value */ js.Any) => tooltip(t0, t1, t2, t3).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VegaPropsWithoutSpec]
  }
}

