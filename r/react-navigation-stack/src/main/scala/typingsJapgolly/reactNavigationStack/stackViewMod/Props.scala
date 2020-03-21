package typingsJapgolly.reactNavigationStack.stackViewMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackConfig
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import typingsJapgolly.reactNavigationStack.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var descriptors: SceneDescriptorMap
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var navigationConfig: NavigationStackConfig
  var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var screenProps: js.UndefOr[js.Any] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    navigationConfig: NavigationStackConfig,
    onGestureBegin: js.UndefOr[Callback] = js.undefined,
    onGestureCanceled: js.UndefOr[Callback] = js.undefined,
    onGestureEnd: js.UndefOr[Callback] = js.undefined,
    onTransitionStart: js.UndefOr[Callback] = js.undefined,
    screenProps: js.Any = null
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    onGestureBegin.foreach(p => __obj.updateDynamic("onGestureBegin")(p.toJsFn))
    onGestureCanceled.foreach(p => __obj.updateDynamic("onGestureCanceled")(p.toJsFn))
    onGestureEnd.foreach(p => __obj.updateDynamic("onGestureEnd")(p.toJsFn))
    onTransitionStart.foreach(p => __obj.updateDynamic("onTransitionStart")(p.toJsFn))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

