package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props
import typingsJapgolly.reactNativeTabView.typesMod.Route
import typingsJapgolly.reactNativeTabView.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAccessibilityLabel extends js.Object {
  def getAccessibilityLabel(hasRoute: Scene[Route]): js.UndefOr[String]
  def getAccessible(hasRoute: Scene[Route]): Boolean
  def getLabelText(hasRoute: Scene[Route]): js.UndefOr[String]
  def getTestID(hasRoute: Scene[Route]): js.UndefOr[String]
  def renderIndicator(props: Props[Route]): Element
}

object AnonGetAccessibilityLabel {
  @scala.inline
  def apply(
    getAccessibilityLabel: Scene[Route] => CallbackTo[js.UndefOr[String]],
    getAccessible: Scene[Route] => CallbackTo[Boolean],
    getLabelText: Scene[Route] => CallbackTo[js.UndefOr[String]],
    getTestID: Scene[Route] => CallbackTo[js.UndefOr[String]],
    renderIndicator: Props[Route] => CallbackTo[Element]
  ): AnonGetAccessibilityLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[typingsJapgolly.reactNativeTabView.typesMod.Route]) => getAccessibilityLabel(t0).runNow()))
    __obj.updateDynamic("getAccessible")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[typingsJapgolly.reactNativeTabView.typesMod.Route]) => getAccessible(t0).runNow()))
    __obj.updateDynamic("getLabelText")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[typingsJapgolly.reactNativeTabView.typesMod.Route]) => getLabelText(t0).runNow()))
    __obj.updateDynamic("getTestID")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.typesMod.Scene[typingsJapgolly.reactNativeTabView.typesMod.Route]) => getTestID(t0).runNow()))
    __obj.updateDynamic("renderIndicator")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeTabView.tabBarIndicatorMod.Props[typingsJapgolly.reactNativeTabView.typesMod.Route]) => renderIndicator(t0).runNow()))
    __obj.asInstanceOf[AnonGetAccessibilityLabel]
  }
}

