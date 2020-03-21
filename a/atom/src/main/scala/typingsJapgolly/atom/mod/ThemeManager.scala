package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeManager extends js.Object {
  // Managing Enabled Themes
  /** Returns an Array of strings all the active theme names. */
  def getActiveThemeNames(): js.UndefOr[js.Array[String]]
  /** Returns an Array of all the active themes. */
  def getActiveThemes(): js.UndefOr[js.Array[Package]]
  // Managing Enabled Themes
  /** Get the enabled theme names from the config. */
  def getEnabledThemeNames(): js.Array[String]
  // Accessing Loaded Themes
  /** Returns an Array of strings of all the loaded theme names. */
  def getLoadedThemeNames(): js.UndefOr[js.Array[String]]
  /** Returns an Array of all the loaded themes. */
  def getLoadedThemes(): js.UndefOr[js.Array[Package]]
  // Event Subscription
  /**
    *  Invoke callback when style sheet changes associated with updating the
    *  list of active themes have completed.
    */
  def onDidChangeActiveThemes(callback: js.Function0[Unit]): Disposable
}

object ThemeManager {
  @scala.inline
  def apply(
    getActiveThemeNames: CallbackTo[js.UndefOr[js.Array[String]]],
    getActiveThemes: CallbackTo[js.UndefOr[js.Array[Package]]],
    getEnabledThemeNames: CallbackTo[js.Array[String]],
    getLoadedThemeNames: CallbackTo[js.UndefOr[js.Array[String]]],
    getLoadedThemes: CallbackTo[js.UndefOr[js.Array[Package]]],
    onDidChangeActiveThemes: js.Function0[Unit] => CallbackTo[Disposable]
  ): ThemeManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getActiveThemeNames")(getActiveThemeNames.toJsFn)
    __obj.updateDynamic("getActiveThemes")(getActiveThemes.toJsFn)
    __obj.updateDynamic("getEnabledThemeNames")(getEnabledThemeNames.toJsFn)
    __obj.updateDynamic("getLoadedThemeNames")(getLoadedThemeNames.toJsFn)
    __obj.updateDynamic("getLoadedThemes")(getLoadedThemes.toJsFn)
    __obj.updateDynamic("onDidChangeActiveThemes")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDidChangeActiveThemes(t0).runNow()))
    __obj.asInstanceOf[ThemeManager]
  }
}

