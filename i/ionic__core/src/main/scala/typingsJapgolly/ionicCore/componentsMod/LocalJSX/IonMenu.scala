package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenu extends js.Object {
  /**
    * The content's id the menu should use.
    */
  var contentId: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the menu is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The edge threshold for dragging the menu open. If a drag/swipe happens over this value, the menu is not triggered.
    */
  var maxEdgeStart: js.UndefOr[Double] = js.undefined
  /**
    * An id for the menu.
    */
  var menuId: js.UndefOr[String] = js.undefined
  /**
    * Emitted when the menu is closed.
    */
  var onIonDidClose: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the menu is open.
    */
  var onIonDidOpen: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the menu is about to be closed.
    */
  var onIonWillClose: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the menu is about to be opened.
    */
  var onIonWillOpen: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Which side of the view the menu should be placed.
    */
  var side: js.UndefOr[Side] = js.undefined
  /**
    * If `true`, swiping the menu is enabled.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.undefined
  /**
    * The display type of the menu. Available options: `"overlay"`, `"reveal"`, `"push"`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IonMenu {
  @scala.inline
  def apply(
    contentId: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maxEdgeStart: Int | Double = null,
    menuId: String = null,
    onIonDidClose: /* event */ CustomEvent => Callback = null,
    onIonDidOpen: /* event */ CustomEvent => Callback = null,
    onIonWillClose: /* event */ CustomEvent => Callback = null,
    onIonWillOpen: /* event */ CustomEvent => Callback = null,
    side: Side = null,
    swipeGesture: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): IonMenu = {
    val __obj = js.Dynamic.literal()
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maxEdgeStart != null) __obj.updateDynamic("maxEdgeStart")(maxEdgeStart.asInstanceOf[js.Any])
    if (menuId != null) __obj.updateDynamic("menuId")(menuId.asInstanceOf[js.Any])
    if (onIonDidClose != null) __obj.updateDynamic("onIonDidClose")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonDidClose(t0).runNow()))
    if (onIonDidOpen != null) __obj.updateDynamic("onIonDidOpen")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonDidOpen(t0).runNow()))
    if (onIonWillClose != null) __obj.updateDynamic("onIonWillClose")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonWillClose(t0).runNow()))
    if (onIonWillOpen != null) __obj.updateDynamic("onIonWillOpen")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonWillOpen(t0).runNow()))
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeGesture)) __obj.updateDynamic("swipeGesture")(swipeGesture.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenu]
  }
}

