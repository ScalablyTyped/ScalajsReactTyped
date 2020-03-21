package typingsJapgolly.tetherDrop.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Event_
import typingsJapgolly.tether.mod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropOptions extends js.Object {
  var beforeClose: js.UndefOr[js.Function2[/* event */ Event_, /* drop */ Drop, Boolean]] = js.undefined
  var blurDelay: js.UndefOr[Double] = js.undefined
  var classes: js.UndefOr[String] = js.undefined
  var closeDelay: js.UndefOr[Double] = js.undefined
  var constrainToScrollParent: js.UndefOr[Boolean] = js.undefined
  var constrainToWindow: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[Element | String | (js.Function1[js.UndefOr[Drop], Element | String])] = js.undefined
  var focusDelay: js.UndefOr[Double] = js.undefined
  var hoverCloseDelay: js.UndefOr[Double] = js.undefined
  var hoverOpenDelay: js.UndefOr[Double] = js.undefined
  var openDelay: js.UndefOr[Double] = js.undefined
  var openOn: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var tetherOptions: js.UndefOr[ITetherOptions] = js.undefined
}

object IDropOptions {
  @scala.inline
  def apply(
    beforeClose: (/* event */ Event_, /* drop */ Drop) => CallbackTo[Boolean] = null,
    blurDelay: Int | Double = null,
    classes: String = null,
    closeDelay: Int | Double = null,
    constrainToScrollParent: js.UndefOr[Boolean] = js.undefined,
    constrainToWindow: js.UndefOr[Boolean] = js.undefined,
    content: Element | String | (js.Function1[js.UndefOr[Drop], Element | String]) = null,
    focusDelay: Int | Double = null,
    hoverCloseDelay: Int | Double = null,
    hoverOpenDelay: Int | Double = null,
    openDelay: Int | Double = null,
    openOn: String = null,
    position: String = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    target: Element = null,
    tetherOptions: ITetherOptions = null
  ): IDropOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* drop */ typingsJapgolly.tetherDrop.mod.Drop) => beforeClose(t0, t1).runNow()))
    if (blurDelay != null) __obj.updateDynamic("blurDelay")(blurDelay.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (closeDelay != null) __obj.updateDynamic("closeDelay")(closeDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainToScrollParent)) __obj.updateDynamic("constrainToScrollParent")(constrainToScrollParent.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainToWindow)) __obj.updateDynamic("constrainToWindow")(constrainToWindow.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (focusDelay != null) __obj.updateDynamic("focusDelay")(focusDelay.asInstanceOf[js.Any])
    if (hoverCloseDelay != null) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.asInstanceOf[js.Any])
    if (hoverOpenDelay != null) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.asInstanceOf[js.Any])
    if (openDelay != null) __obj.updateDynamic("openDelay")(openDelay.asInstanceOf[js.Any])
    if (openOn != null) __obj.updateDynamic("openOn")(openOn.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tetherOptions != null) __obj.updateDynamic("tetherOptions")(tetherOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropOptions]
  }
}

