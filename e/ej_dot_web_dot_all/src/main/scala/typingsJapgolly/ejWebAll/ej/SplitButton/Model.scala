package typingsJapgolly.ejWebAll.ej.SplitButton

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.ej.ArrowPosition
import typingsJapgolly.ejWebAll.ej.ButtonMode
import typingsJapgolly.ejWebAll.ej.ButtonSize
import typingsJapgolly.ejWebAll.ej.ContentType
import typingsJapgolly.ejWebAll.ej.ImagePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the arrowPosition of the Split or Dropdown Button.See arrowPosition
    * @Default {ej.ArrowPosition.Right}
    */
  var arrowPosition: js.UndefOr[String | ArrowPosition] = js.undefined
  /** Fires before menu of the split button control is opened.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** Specifies the buttonMode like Split or Dropdown Button.See ButtonMode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[String | ButtonMode] = js.undefined
  /** Fires when Button control is clicked successfully
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Fires before the list content of Button control is closed
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Specifies the contentType of the Split Button.See ContentType
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[String | ContentType] = js.undefined
  /** Fires after Split Button control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Set the root class for Split Button control theme
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when the Split Button is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the enableRTL property for Split Button while initialization.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies the disabling of Split Button if enabled is set to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height of the Split Button.
    * @Default {â€œâ€}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Specifies the HTML Attributes of the Split Button.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the imagePosition of the Split Button.See imagePositions
    * @Default {ej.ImagePosition.ImageRight}
    */
  var imagePosition: js.UndefOr[String | ImagePosition] = js.undefined
  /** Fires when a menu item is Hovered out successfully
    */
  var itemMouseOut: js.UndefOr[js.Function1[/* e */ ItemMouseOutEventArgs, Unit]] = js.undefined
  /** Fires when a menu item is Hovered in successfully
    */
  var itemMouseOver: js.UndefOr[js.Function1[/* e */ ItemMouseOverEventArgs, Unit]] = js.undefined
  /** Fires when a menu item is clicked successfully
    */
  var itemSelected: js.UndefOr[js.Function1[/* e */ ItemSelectedEventArgs, Unit]] = js.undefined
  /** Fires before the list content of Button control is opened
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Specifies the image content for Split Button while initialization.
    */
  var prefixIcon: js.UndefOr[String] = js.undefined
  /** Specifies the showRoundedCorner property for Split Button while initialization.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the size of the Button. See ButtonSize
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[String | ButtonSize] = js.undefined
  /** Specifies the image content for Split Button while initialization.
    */
  var suffixIcon: js.UndefOr[String] = js.undefined
  /** Specifies the target of splitbutton menu while initialization with ID or class as a selector.
    */
  var target: js.UndefOr[String] = js.undefined
  /** Specifies the list content for Split Button while initialization
    */
  var targetID: js.UndefOr[String] = js.undefined
  /** Specifies the text content for Split Button while initialization.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the width of the Split Button.
    * @Default {â€œâ€}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    arrowPosition: String | ArrowPosition = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Callback = null,
    buttonMode: String | ButtonMode = null,
    click: /* e */ ClickEventArgs => Callback = null,
    close: /* e */ CloseEventArgs => Callback = null,
    contentType: String | ContentType = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    htmlAttributes: js.Any = null,
    imagePosition: String | ImagePosition = null,
    itemMouseOut: /* e */ ItemMouseOutEventArgs => Callback = null,
    itemMouseOver: /* e */ ItemMouseOverEventArgs => Callback = null,
    itemSelected: /* e */ ItemSelectedEventArgs => Callback = null,
    open: /* e */ OpenEventArgs => Callback = null,
    prefixIcon: String = null,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    size: String | ButtonSize = null,
    suffixIcon: String = null,
    target: String = null,
    targetID: String = null,
    text: String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (arrowPosition != null) __obj.updateDynamic("arrowPosition")(arrowPosition.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.BeforeOpenEventArgs) => beforeOpen(t0).runNow()))
    if (buttonMode != null) __obj.updateDynamic("buttonMode")(buttonMode.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.ClickEventArgs) => click(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.CloseEventArgs) => close(t0).runNow()))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.DestroyEventArgs) => destroy(t0).runNow()))
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (imagePosition != null) __obj.updateDynamic("imagePosition")(imagePosition.asInstanceOf[js.Any])
    if (itemMouseOut != null) __obj.updateDynamic("itemMouseOut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.ItemMouseOutEventArgs) => itemMouseOut(t0).runNow()))
    if (itemMouseOver != null) __obj.updateDynamic("itemMouseOver")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.ItemMouseOverEventArgs) => itemMouseOver(t0).runNow()))
    if (itemSelected != null) __obj.updateDynamic("itemSelected")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.ItemSelectedEventArgs) => itemSelected(t0).runNow()))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.SplitButton.OpenEventArgs) => open(t0).runNow()))
    if (prefixIcon != null) __obj.updateDynamic("prefixIcon")(prefixIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetID != null) __obj.updateDynamic("targetID")(targetID.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

