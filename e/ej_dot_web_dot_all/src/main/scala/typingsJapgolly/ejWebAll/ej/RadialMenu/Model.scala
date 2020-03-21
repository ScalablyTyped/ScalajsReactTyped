package typingsJapgolly.ejWebAll.ej.RadialMenu

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** To show the Radial in initial render.
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  /** Renders the back button Image for Radial using class.
    */
  var backImageClass: js.UndefOr[String] = js.undefined
  /** Event triggers when we click an item.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Event triggers when the menu is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Sets the root class for RadialMenu theme. This cssClass API helps to use custom skinning option for RadialMenu control. By defining the root class using this API, we need to
    * include this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** To enable Animation for Radial Menu.
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Renders the Image for Radial using Class.
    */
  var imageClass: js.UndefOr[String] = js.undefined
  /** Specify the items of radial menu
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  /** Event triggers when the menu is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** To set radial render position.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** Specifies the radius of radial menu
    */
  var radius: js.UndefOr[Double] = js.undefined
  /** To show the Radial while clicking given target element.
    */
  var targetElementId: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    backImageClass: String = null,
    click: /* e */ ClickEventArgs => Callback = null,
    close: /* e */ CloseEventArgs => Callback = null,
    cssClass: String = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    imageClass: String = null,
    items: js.Array[Item] = null,
    open: /* e */ OpenEventArgs => Callback = null,
    position: js.Any = null,
    radius: Int | Double = null,
    targetElementId: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.asInstanceOf[js.Any])
    if (backImageClass != null) __obj.updateDynamic("backImageClass")(backImageClass.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.RadialMenu.ClickEventArgs) => click(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.RadialMenu.CloseEventArgs) => close(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.RadialMenu.OpenEventArgs) => open(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (targetElementId != null) __obj.updateDynamic("targetElementId")(targetElementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

