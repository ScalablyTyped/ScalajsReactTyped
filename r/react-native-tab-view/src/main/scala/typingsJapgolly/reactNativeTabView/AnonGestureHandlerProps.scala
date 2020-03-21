package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNativeTabView.pagerMod.Props
import typingsJapgolly.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGestureHandlerProps extends js.Object {
  var keyboardDismissMode: String
  var `lazy`: Boolean
  var lazyPreloadDistance: Double
  var removeClippedSubviews: Boolean
  var swipeEnabled: Boolean
  var tabBarPosition: String
  def renderLazyPlaceholder(): Null
  def renderPager(props: Props[_]): Element
  def renderTabBar[P /* <: Route */](props: typingsJapgolly.reactNativeTabView.tabBarMod.Props[P]): Element
}

object AnonGestureHandlerProps {
  @scala.inline
  def apply(
    keyboardDismissMode: String,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    removeClippedSubviews: Boolean,
    renderLazyPlaceholder: CallbackTo[Null],
    renderPager: Props[js.Any] => CallbackTo[Element],
    renderTabBar: typingsJapgolly.reactNativeTabView.tabBarMod.Props[js.Any] => CallbackTo[Element],
    swipeEnabled: Boolean,
    tabBarPosition: String
  ): AnonGestureHandlerProps = {
    val __obj = js.Dynamic.literal(keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], removeClippedSubviews = removeClippedSubviews.asInstanceOf[js.Any], swipeEnabled = swipeEnabled.asInstanceOf[js.Any], tabBarPosition = tabBarPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.updateDynamic("renderLazyPlaceholder")(renderLazyPlaceholder.toJsFn)
    __obj.updateDynamic("renderPager")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.pagerMod.Props[js.Any]) => renderPager(t0).runNow()))
    __obj.updateDynamic("renderTabBar")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.tabBarMod.Props[js.Any]) => renderTabBar(t0).runNow()))
    __obj.asInstanceOf[AnonGestureHandlerProps]
  }
}

