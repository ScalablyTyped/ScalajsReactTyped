package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import typingsJapgolly.electron.electronStrings.left
import typingsJapgolly.electron.electronStrings.overlay
import typingsJapgolly.electron.electronStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarButtonConstructorOptions extends js.Object {
  /**
    * Button background color in hex format, i.e #ABCDEF.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Function to call when the button is clicked.
    */
  var click: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Button icon.
    */
  var icon: js.UndefOr[NativeImage_] = js.undefined
  /**
    * Can be left, right or overlay.
    */
  var iconPosition: js.UndefOr[left | right | overlay] = js.undefined
  /**
    * Button text.
    */
  var label: js.UndefOr[String] = js.undefined
}

object TouchBarButtonConstructorOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    click: js.UndefOr[Callback] = js.undefined,
    icon: NativeImage_ = null,
    iconPosition: left | right | overlay = null,
    label: String = null
  ): TouchBarButtonConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    click.foreach(p => __obj.updateDynamic("click")(p.toJsFn))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarButtonConstructorOptions]
  }
}

