package typingsJapgolly.antDesignReactNative.stepsItemMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsItemProps extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[Node] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var errorTail: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[Node] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var renderIcon: js.UndefOr[js.Function1[/* params */ RenderIconParams, Node]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StepsItemProps {
  @scala.inline
  def apply(
    current: Int | Double = null,
    description: VdomNode = null,
    direction: String = null,
    errorTail: Int | Double = null,
    icon: VdomNode = null,
    index: Int | Double = null,
    last: js.UndefOr[Boolean] = js.undefined,
    renderIcon: /* params */ RenderIconParams => CallbackTo[Node] = null,
    size: String = null,
    status: String = null,
    styles: js.Any = null,
    title: VdomNode = null,
    width: Int | Double = null
  ): StepsItemProps = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (errorTail != null) __obj.updateDynamic("errorTail")(errorTail.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawNode.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antDesignReactNative.stepsItemMod.RenderIconParams) => renderIcon(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsItemProps]
  }
}

