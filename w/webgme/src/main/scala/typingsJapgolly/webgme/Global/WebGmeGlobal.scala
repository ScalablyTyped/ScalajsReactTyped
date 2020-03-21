package typingsJapgolly.webgme.Global

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webgme.GmeConfig.GmeConfig
import typingsJapgolly.webgme.GmePanel.LayoutManager
import typingsJapgolly.webgme.GmePanel.PanelManager
import typingsJapgolly.webgme.Toolbar.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGmeGlobal extends js.Object {
  var GitHubVersion: js.UndefOr[String] = js.undefined
  var KeyboardManager: js.UndefOr[typingsJapgolly.webgme.Global.KeyboardManager] = js.undefined
  var LayoutManager: js.UndefOr[typingsJapgolly.webgme.GmePanel.LayoutManager] = js.undefined
  var NpmVersion: js.UndefOr[String] = js.undefined
  var PanelManager: js.UndefOr[typingsJapgolly.webgme.GmePanel.PanelManager] = js.undefined
  var State: js.UndefOr[typingsJapgolly.webgme.Global.State] = js.undefined
  var Toolbar: js.UndefOr[typingsJapgolly.webgme.Toolbar.Toolbar] = js.undefined
  var gmeConfig: GmeConfig
  var history: js.UndefOr[History] = js.undefined
  var userInfo: js.UndefOr[UserInfo] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  def getConfig(): GmeConfig
}

object WebGmeGlobal {
  @scala.inline
  def apply(
    getConfig: CallbackTo[GmeConfig],
    gmeConfig: GmeConfig,
    GitHubVersion: String = null,
    KeyboardManager: KeyboardManager = null,
    LayoutManager: LayoutManager = null,
    NpmVersion: String = null,
    PanelManager: PanelManager = null,
    State: State = null,
    Toolbar: Toolbar = null,
    history: History = null,
    userInfo: UserInfo = null,
    version: String = null
  ): WebGmeGlobal = {
    val __obj = js.Dynamic.literal(gmeConfig = gmeConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("getConfig")(getConfig.toJsFn)
    if (GitHubVersion != null) __obj.updateDynamic("GitHubVersion")(GitHubVersion.asInstanceOf[js.Any])
    if (KeyboardManager != null) __obj.updateDynamic("KeyboardManager")(KeyboardManager.asInstanceOf[js.Any])
    if (LayoutManager != null) __obj.updateDynamic("LayoutManager")(LayoutManager.asInstanceOf[js.Any])
    if (NpmVersion != null) __obj.updateDynamic("NpmVersion")(NpmVersion.asInstanceOf[js.Any])
    if (PanelManager != null) __obj.updateDynamic("PanelManager")(PanelManager.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Toolbar != null) __obj.updateDynamic("Toolbar")(Toolbar.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (userInfo != null) __obj.updateDynamic("userInfo")(userInfo.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGmeGlobal]
  }
}

