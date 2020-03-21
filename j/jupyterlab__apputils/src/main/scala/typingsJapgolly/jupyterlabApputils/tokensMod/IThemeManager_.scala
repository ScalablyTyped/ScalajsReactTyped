package typingsJapgolly.jupyterlabApputils.tokensMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.tokensMod.IThemeManager.ITheme
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeManager_ extends js.Object {
  /**
    * Get the name of the current theme.
    */
  val theme: String | Null
  /**
    * A signal fired when the application theme changes.
    */
  val themeChanged: ISignal[this.type, IChangedArgs[String, String]]
  /**
    * The names of the registered themes.
    */
  val themes: js.Array[String]
  /**
    * Test whether a given theme is light.
    */
  def isLight(name: String): Boolean
  /**
    * Load a theme CSS file by path.
    *
    * @param path - The path of the file to load.
    */
  def loadCSS(path: String): js.Promise[Unit]
  /**
    * Register a theme with the theme manager.
    *
    * @param theme - The theme to register.
    *
    * @returns A disposable that can be used to unregister the theme.
    */
  def register(theme: ITheme): IDisposable
  /**
    * Set the current theme.
    */
  def setTheme(name: String): js.Promise[Unit]
  /**
    * Test whether a given theme styles scrollbars,
    * and if the user has scrollbar styling enabled.
    */
  def themeScrollbars(name: String): Boolean
}

object IThemeManager_ {
  @scala.inline
  def apply(
    isLight: String => CallbackTo[Boolean],
    loadCSS: String => CallbackTo[js.Promise[Unit]],
    register: ITheme => CallbackTo[IDisposable],
    setTheme: String => CallbackTo[js.Promise[Unit]],
    themeChanged: ISignal[IThemeManager_, IChangedArgs[String, String]],
    themeScrollbars: String => CallbackTo[Boolean],
    themes: js.Array[String],
    theme: String = null
  ): IThemeManager_ = {
    val __obj = js.Dynamic.literal(themeChanged = themeChanged.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
    __obj.updateDynamic("isLight")(js.Any.fromFunction1((t0: java.lang.String) => isLight(t0).runNow()))
    __obj.updateDynamic("loadCSS")(js.Any.fromFunction1((t0: java.lang.String) => loadCSS(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabApputils.tokensMod.IThemeManager.ITheme) => register(t0).runNow()))
    __obj.updateDynamic("setTheme")(js.Any.fromFunction1((t0: java.lang.String) => setTheme(t0).runNow()))
    __obj.updateDynamic("themeScrollbars")(js.Any.fromFunction1((t0: java.lang.String) => themeScrollbars(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeManager_]
  }
}

