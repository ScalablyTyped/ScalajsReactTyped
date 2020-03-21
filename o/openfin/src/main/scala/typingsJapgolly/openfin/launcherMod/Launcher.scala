package typingsJapgolly.openfin.launcherMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Launcher extends js.Object {
  var Installer_Work_Dir: String
  var OpenFin_Installer: String
  var Security_Realm_Config_Key: String
  var macLaunch: js.Any
  var nixConfig: js.UndefOr[js.Any] = js.undefined
  var os: js.Any
  var winLaunch: js.Any
  def launch(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess]
}

object Launcher {
  @scala.inline
  def apply(
    Installer_Work_Dir: String,
    OpenFin_Installer: String,
    Security_Realm_Config_Key: String,
    launch: (ConfigWithRuntime, String, String) => CallbackTo[js.Promise[ChildProcess]],
    macLaunch: js.Any,
    os: js.Any,
    winLaunch: js.Any,
    nixConfig: js.Any = null
  ): Launcher = {
    val __obj = js.Dynamic.literal(Installer_Work_Dir = Installer_Work_Dir.asInstanceOf[js.Any], OpenFin_Installer = OpenFin_Installer.asInstanceOf[js.Any], Security_Realm_Config_Key = Security_Realm_Config_Key.asInstanceOf[js.Any], macLaunch = macLaunch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], winLaunch = winLaunch.asInstanceOf[js.Any])
    __obj.updateDynamic("launch")(js.Any.fromFunction3((t0: typingsJapgolly.openfin.wireMod.ConfigWithRuntime, t1: java.lang.String, t2: java.lang.String) => launch(t0, t1, t2).runNow()))
    if (nixConfig != null) __obj.updateDynamic("nixConfig")(nixConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Launcher]
  }
}

