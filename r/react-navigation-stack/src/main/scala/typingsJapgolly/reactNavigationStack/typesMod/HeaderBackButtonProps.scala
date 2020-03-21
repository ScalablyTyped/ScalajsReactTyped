package typingsJapgolly.reactNavigationStack.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNavigationStack.AnonTintColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderBackButtonProps extends js.Object {
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var backImage: js.UndefOr[js.Function1[/* props */ AnonTintColor, Node]] = js.undefined
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var layoutPreset: HeaderLayoutPreset
  var pressColorAndroid: js.UndefOr[String] = js.undefined
  var scene: Scene
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Null] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var truncatedTitle: js.UndefOr[String | Null] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  def onPress(): Unit
}

object HeaderBackButtonProps {
  @scala.inline
  def apply(
    layoutPreset: HeaderLayoutPreset,
    onPress: Callback,
    scene: Scene,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    backImage: /* props */ AnonTintColor => CallbackTo[Node] = null,
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    pressColorAndroid: String = null,
    tintColor: String = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    truncatedTitle: String = null,
    width: Int | Double = null
  ): HeaderBackButtonProps = {
    val __obj = js.Dynamic.literal(layoutPreset = layoutPreset.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (backImage != null) __obj.updateDynamic("backImage")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.AnonTintColor) => backImage(t0).runNow()))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (truncatedTitle != null) __obj.updateDynamic("truncatedTitle")(truncatedTitle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderBackButtonProps]
  }
}

