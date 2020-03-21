package typingsJapgolly.reactNativeNavigation.touchablePreviewMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.TouchableHighlight
import typingsJapgolly.reactNative.mod.TouchableNativeFeedback
import typingsJapgolly.reactNative.mod.TouchableOpacity
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedback
import typingsJapgolly.reactNativeNavigation.AnonReactTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: Node
  var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* payload */ AnonReactTag, Unit]] = js.undefined
  var touchableComponent: js.UndefOr[
    TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | Node
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: VdomNode = null,
    onPeekIn: js.UndefOr[Callback] = js.undefined,
    onPeekOut: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onPressIn: /* payload */ AnonReactTag => Callback = null,
    touchableComponent: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | Node = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    onPeekIn.foreach(p => __obj.updateDynamic("onPeekIn")(p.toJsFn))
    onPeekOut.foreach(p => __obj.updateDynamic("onPeekOut")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: /* payload */ typingsJapgolly.reactNativeNavigation.AnonReactTag) => onPressIn(t0).runNow()))
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

