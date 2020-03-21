package typingsJapgolly.semanticUiReact.responsiveResponsiveMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveOnUpdateData extends ResponsiveProps {
  var width: Double
}

object ResponsiveOnUpdateData {
  @scala.inline
  def apply(
    width: Double,
    as: js.Any = null,
    children: VdomNode = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ ReactEventFrom[HTMLElement], /* data */ ResponsiveOnUpdateData) => Callback = null
  ): ResponsiveOnUpdateData = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    getWidth.foreach(p => __obj.updateDynamic("getWidth")(p.toJsFn))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticUiReact.responsiveResponsiveMod.ResponsiveOnUpdateData) => onUpdate(t0, t1).runNow()))
    __obj.asInstanceOf[ResponsiveOnUpdateData]
  }
}

