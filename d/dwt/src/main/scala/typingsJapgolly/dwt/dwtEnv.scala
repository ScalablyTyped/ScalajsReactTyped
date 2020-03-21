package typingsJapgolly.dwt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dwtEnv extends js.Object {
  var ActiveXInstallWithCAB: Boolean
  var ActiveXVersion: String
  var AutoLoad: Boolean
  var Containers: js.Array[Container]
  var CustomizableDisplayInfo: js.Any
  var Debug: Boolean
  var DynamicContainers: js.Array[String]
  var IfAddMD5InUploadHeader: Boolean
  var IfConfineMaskWithinTheViewer: Boolean
  var IfInstallDWTModuleWithZIP: Boolean
  var IfUseActiveXForIE10Plus: Boolean
  /*ignored
    OnWebTwainReady
    */
  var JSVersion: String
  var PluginVersion: String
  var ProductKey: String
  var ResourcesPath: String
  var ServerVersionInfo: String
  var Trial: Boolean
  var UseDefaultInstallUI: Boolean
  var initQueue: js.Array[_]
  var inited: Boolean
  def CloseDialog(): Unit
  def CreateDWTObject(
    newObjID: String,
    successFn: js.Function1[/* dwtObject */ WebTwain, Unit],
    failurefn: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit
  def DeleteDWTObject(objID: String): Unit
  def GetWebTwain(cid: String): WebTwain
  def Load(): Unit
  /*ignored
    OnWebTwainInitMessage  OnWebTwainNeedUpgrade  OnWebTwainNeedUpgradeWebJavascript  OnWebTwainNotFound  OnWebTwainOldPluginNotAllowed
    */
  def OnWebTwainPostExecute(): Unit
  def OnWebTwainPreExecute(): Unit
  def RegisterEvent(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit
  def RemoveAllAuthorizations(): Unit
  def ShowDialog(
    _dialogWidth: Double,
    _dialogHeight: Double,
    _strDialogMessageWithHtmlFormat: String,
    _bChangeImage: Boolean,
    bHideCloseButton: Boolean
  ): Unit
  def Unload(): Unit
}

object dwtEnv {
  @scala.inline
  def apply(
    ActiveXInstallWithCAB: Boolean,
    ActiveXVersion: String,
    AutoLoad: Boolean,
    CloseDialog: Callback,
    Containers: js.Array[Container],
    CreateDWTObject: (String, js.Function1[/* dwtObject */ WebTwain, Unit], js.Function1[/* repeated */ js.Any, Unit]) => Callback,
    CustomizableDisplayInfo: js.Any,
    Debug: Boolean,
    DeleteDWTObject: String => Callback,
    DynamicContainers: js.Array[String],
    GetWebTwain: String => CallbackTo[WebTwain],
    IfAddMD5InUploadHeader: Boolean,
    IfConfineMaskWithinTheViewer: Boolean,
    IfInstallDWTModuleWithZIP: Boolean,
    IfUseActiveXForIE10Plus: Boolean,
    JSVersion: String,
    Load: Callback,
    OnWebTwainPostExecute: Callback,
    OnWebTwainPreExecute: Callback,
    PluginVersion: String,
    ProductKey: String,
    RegisterEvent: (String, js.Function1[/* repeated */ js.Any, Unit]) => Callback,
    RemoveAllAuthorizations: Callback,
    ResourcesPath: String,
    ServerVersionInfo: String,
    ShowDialog: (Double, Double, String, Boolean, Boolean) => Callback,
    Trial: Boolean,
    Unload: Callback,
    UseDefaultInstallUI: Boolean,
    initQueue: js.Array[_],
    inited: Boolean
  ): dwtEnv = {
    val __obj = js.Dynamic.literal(ActiveXInstallWithCAB = ActiveXInstallWithCAB.asInstanceOf[js.Any], ActiveXVersion = ActiveXVersion.asInstanceOf[js.Any], AutoLoad = AutoLoad.asInstanceOf[js.Any], Containers = Containers.asInstanceOf[js.Any], CustomizableDisplayInfo = CustomizableDisplayInfo.asInstanceOf[js.Any], Debug = Debug.asInstanceOf[js.Any], DynamicContainers = DynamicContainers.asInstanceOf[js.Any], IfAddMD5InUploadHeader = IfAddMD5InUploadHeader.asInstanceOf[js.Any], IfConfineMaskWithinTheViewer = IfConfineMaskWithinTheViewer.asInstanceOf[js.Any], IfInstallDWTModuleWithZIP = IfInstallDWTModuleWithZIP.asInstanceOf[js.Any], IfUseActiveXForIE10Plus = IfUseActiveXForIE10Plus.asInstanceOf[js.Any], JSVersion = JSVersion.asInstanceOf[js.Any], PluginVersion = PluginVersion.asInstanceOf[js.Any], ProductKey = ProductKey.asInstanceOf[js.Any], ResourcesPath = ResourcesPath.asInstanceOf[js.Any], ServerVersionInfo = ServerVersionInfo.asInstanceOf[js.Any], Trial = Trial.asInstanceOf[js.Any], UseDefaultInstallUI = UseDefaultInstallUI.asInstanceOf[js.Any], initQueue = initQueue.asInstanceOf[js.Any], inited = inited.asInstanceOf[js.Any])
    __obj.updateDynamic("CloseDialog")(CloseDialog.toJsFn)
    __obj.updateDynamic("CreateDWTObject")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function1[/* dwtObject */ typingsJapgolly.dwt.WebTwain, scala.Unit], t2: js.Function1[/* repeated */ js.Any, scala.Unit]) => CreateDWTObject(t0, t1, t2).runNow()))
    __obj.updateDynamic("DeleteDWTObject")(js.Any.fromFunction1((t0: java.lang.String) => DeleteDWTObject(t0).runNow()))
    __obj.updateDynamic("GetWebTwain")(js.Any.fromFunction1((t0: java.lang.String) => GetWebTwain(t0).runNow()))
    __obj.updateDynamic("Load")(Load.toJsFn)
    __obj.updateDynamic("OnWebTwainPostExecute")(OnWebTwainPostExecute.toJsFn)
    __obj.updateDynamic("OnWebTwainPreExecute")(OnWebTwainPreExecute.toJsFn)
    __obj.updateDynamic("RegisterEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => RegisterEvent(t0, t1).runNow()))
    __obj.updateDynamic("RemoveAllAuthorizations")(RemoveAllAuthorizations.toJsFn)
    __obj.updateDynamic("ShowDialog")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: java.lang.String, t3: scala.Boolean, t4: scala.Boolean) => ShowDialog(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("Unload")(Unload.toJsFn)
    __obj.asInstanceOf[dwtEnv]
  }
}

