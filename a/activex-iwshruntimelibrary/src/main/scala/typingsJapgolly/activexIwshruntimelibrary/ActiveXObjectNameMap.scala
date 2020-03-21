package typingsJapgolly.activexIwshruntimelibrary

import typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
import typingsJapgolly.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShell
import typingsJapgolly.activexIwshruntimelibrary.ScriptSigner.Signer
import typingsJapgolly.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("Scripting.Signer")
  var ScriptingDotSigner: Signer
  var WSHController: typingsJapgolly.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
  @JSName("WScript.Network")
  var WScriptDotNetwork: WshNetwork
  @JSName("WScript.Shell")
  var WScriptDotShell: WshShell
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    ScriptingDotSigner: Signer,
    WSHController: WSHController,
    WScriptDotNetwork: WshNetwork,
    WScriptDotShell: WshShell
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(WSHController = WSHController.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.Signer")(ScriptingDotSigner.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Network")(WScriptDotNetwork.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Shell")(WScriptDotShell.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

