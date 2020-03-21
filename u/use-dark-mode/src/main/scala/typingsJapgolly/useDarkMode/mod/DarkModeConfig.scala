package typingsJapgolly.useDarkMode.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.WindowLocalStorage
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkModeConfig extends js.Object {
  var classNameDark: js.UndefOr[String] = js.undefined
   // A className to set "dark mode". Default = "dark-mode".
  var classNameLight: js.UndefOr[String] = js.undefined
   // A className to set "light mode". Default = "light-mode".
  var element: js.UndefOr[HTMLElement] = js.undefined
   // A storage provider. Default = `localStorage`.
  var global: js.UndefOr[Window_] = js.undefined
   // The element to apply the className. Default = `document.body`
  var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[Boolean], Unit]] = js.undefined
   // Overide the default className handler with a custom callback.
  var storageKey: js.UndefOr[String] = js.undefined
   // Specify the `localStorage` key. Default = "darkMode". Sewt to `null` to disable persistent storage.
  var storageProvider: js.UndefOr[WindowLocalStorage] = js.undefined
}

object DarkModeConfig {
  @scala.inline
  def apply(
    classNameDark: String = null,
    classNameLight: String = null,
    element: HTMLElement = null,
    global: Window_ = null,
    onChange: /* val */ js.UndefOr[Boolean] => Callback = null,
    storageKey: String = null,
    storageProvider: WindowLocalStorage = null
  ): DarkModeConfig = {
    val __obj = js.Dynamic.literal()
    if (classNameDark != null) __obj.updateDynamic("classNameDark")(classNameDark.asInstanceOf[js.Any])
    if (classNameLight != null) __obj.updateDynamic("classNameLight")(classNameLight.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* val */ js.UndefOr[scala.Boolean]) => onChange(t0).runNow()))
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    if (storageProvider != null) __obj.updateDynamic("storageProvider")(storageProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkModeConfig]
  }
}

