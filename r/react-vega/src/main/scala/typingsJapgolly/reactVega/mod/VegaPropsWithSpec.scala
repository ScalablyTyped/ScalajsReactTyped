package typingsJapgolly.reactVega.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVega.AnonBottom
import typingsJapgolly.std.Record
import typingsJapgolly.vegaTypings.mod.View
import typingsJapgolly.vegaTypings.runtimeMod.Item
import typingsJapgolly.vegaTypings.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VegaPropsWithSpec extends VegaPropsWithoutSpec {
  var spec: Spec
}

object VegaPropsWithSpec {
  @scala.inline
  def apply(
    spec: Spec,
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
  ): VegaPropsWithSpec = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[VegaPropsWithSpec]
  }
}

