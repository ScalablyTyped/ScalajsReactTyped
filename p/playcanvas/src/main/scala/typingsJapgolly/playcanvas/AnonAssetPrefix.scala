package typingsJapgolly.playcanvas

import typingsJapgolly.playcanvas.pc.ElementInput
import typingsJapgolly.playcanvas.pc.GamePads
import typingsJapgolly.playcanvas.pc.Keyboard
import typingsJapgolly.playcanvas.pc.Mouse
import typingsJapgolly.playcanvas.pc.TouchDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetPrefix extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var elementInput: js.UndefOr[ElementInput] = js.undefined
  var gamepads: js.UndefOr[GamePads] = js.undefined
  var graphicsDeviceOptions: js.UndefOr[js.Any] = js.undefined
  var keyboard: js.UndefOr[Keyboard] = js.undefined
  var mouse: js.UndefOr[Mouse] = js.undefined
  var scriptPrefix: js.UndefOr[String] = js.undefined
  var scriptsOrder: js.UndefOr[js.Array[String]] = js.undefined
  var touch: js.UndefOr[TouchDevice] = js.undefined
}

object AnonAssetPrefix {
  @scala.inline
  def apply(
    assetPrefix: String = null,
    elementInput: ElementInput = null,
    gamepads: GamePads = null,
    graphicsDeviceOptions: js.Any = null,
    keyboard: Keyboard = null,
    mouse: Mouse = null,
    scriptPrefix: String = null,
    scriptsOrder: js.Array[String] = null,
    touch: TouchDevice = null
  ): AnonAssetPrefix = {
    val __obj = js.Dynamic.literal()
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (elementInput != null) __obj.updateDynamic("elementInput")(elementInput.asInstanceOf[js.Any])
    if (gamepads != null) __obj.updateDynamic("gamepads")(gamepads.asInstanceOf[js.Any])
    if (graphicsDeviceOptions != null) __obj.updateDynamic("graphicsDeviceOptions")(graphicsDeviceOptions.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (scriptPrefix != null) __obj.updateDynamic("scriptPrefix")(scriptPrefix.asInstanceOf[js.Any])
    if (scriptsOrder != null) __obj.updateDynamic("scriptsOrder")(scriptsOrder.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssetPrefix]
  }
}

