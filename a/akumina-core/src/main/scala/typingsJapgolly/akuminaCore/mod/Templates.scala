package typingsJapgolly.akuminaCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Templates extends js.Object {
  /**
    * Bind error templates for widgets
    * @param errorObj
    */
  def BindErrorTemplateForWidgets(errorObj: js.Any): Unit
  def GetCoreTemplate(htmlFile: String): String
  def GetErrorTemplate(data: js.Object): js.Promise[_]
  def GetViewPrefix(): Unit
  def GetVirtualMasterTemplate(): String
  def ParseTemplate(url: String, data: js.Any): js.Promise[_]
  def RequestTemplateFromServer(url: String): js.Promise[_]
}

object Templates {
  @scala.inline
  def apply(
    BindErrorTemplateForWidgets: js.Any => Callback,
    GetCoreTemplate: String => CallbackTo[String],
    GetErrorTemplate: js.Object => CallbackTo[js.Promise[js.Any]],
    GetViewPrefix: Callback,
    GetVirtualMasterTemplate: CallbackTo[String],
    ParseTemplate: (String, js.Any) => CallbackTo[js.Promise[js.Any]],
    RequestTemplateFromServer: String => CallbackTo[js.Promise[js.Any]]
  ): Templates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BindErrorTemplateForWidgets")(js.Any.fromFunction1((t0: js.Any) => BindErrorTemplateForWidgets(t0).runNow()))
    __obj.updateDynamic("GetCoreTemplate")(js.Any.fromFunction1((t0: java.lang.String) => GetCoreTemplate(t0).runNow()))
    __obj.updateDynamic("GetErrorTemplate")(js.Any.fromFunction1((t0: js.Object) => GetErrorTemplate(t0).runNow()))
    __obj.updateDynamic("GetViewPrefix")(GetViewPrefix.toJsFn)
    __obj.updateDynamic("GetVirtualMasterTemplate")(GetVirtualMasterTemplate.toJsFn)
    __obj.updateDynamic("ParseTemplate")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => ParseTemplate(t0, t1).runNow()))
    __obj.updateDynamic("RequestTemplateFromServer")(js.Any.fromFunction1((t0: java.lang.String) => RequestTemplateFromServer(t0).runNow()))
    __obj.asInstanceOf[Templates]
  }
}

