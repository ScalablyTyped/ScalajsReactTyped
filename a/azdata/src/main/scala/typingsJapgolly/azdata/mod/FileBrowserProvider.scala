package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBrowserProvider extends DataProvider {
  def closeFileBrowser(ownerUri: String): Thenable[FileBrowserCloseResponse]
  def expandFolderNode(ownerUri: String, expandPath: String): Thenable[Boolean]
  def openFileBrowser(ownerUri: String, expandPath: String, fileFilters: js.Array[String], changeFilter: Boolean): Thenable[Boolean]
  def registerOnFileBrowserOpened(handler: js.Function1[/* response */ FileBrowserOpenedParams, _]): Unit
  def registerOnFilePathsValidated(handler: js.Function1[/* response */ FileBrowserValidatedParams, _]): Unit
  def registerOnFolderNodeExpanded(handler: js.Function1[/* response */ FileBrowserExpandedParams, _]): Unit
  def validateFilePaths(ownerUri: String, serviceType: String, selectedFiles: js.Array[String]): Thenable[Boolean]
}

object FileBrowserProvider {
  @scala.inline
  def apply(
    closeFileBrowser: String => CallbackTo[Thenable[FileBrowserCloseResponse]],
    expandFolderNode: (String, String) => CallbackTo[Thenable[Boolean]],
    openFileBrowser: (String, String, js.Array[String], Boolean) => CallbackTo[Thenable[Boolean]],
    providerId: String,
    registerOnFileBrowserOpened: js.Function1[/* response */ FileBrowserOpenedParams, js.Any] => Callback,
    registerOnFilePathsValidated: js.Function1[/* response */ FileBrowserValidatedParams, js.Any] => Callback,
    registerOnFolderNodeExpanded: js.Function1[/* response */ FileBrowserExpandedParams, js.Any] => Callback,
    validateFilePaths: (String, String, js.Array[String]) => CallbackTo[Thenable[Boolean]],
    handle: Int | Double = null
  ): FileBrowserProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("closeFileBrowser")(js.Any.fromFunction1((t0: java.lang.String) => closeFileBrowser(t0).runNow()))
    __obj.updateDynamic("expandFolderNode")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => expandFolderNode(t0, t1).runNow()))
    __obj.updateDynamic("openFileBrowser")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: js.Array[java.lang.String], t3: scala.Boolean) => openFileBrowser(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("registerOnFileBrowserOpened")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.FileBrowserOpenedParams, js.Any]) => registerOnFileBrowserOpened(t0).runNow()))
    __obj.updateDynamic("registerOnFilePathsValidated")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.FileBrowserValidatedParams, js.Any]) => registerOnFilePathsValidated(t0).runNow()))
    __obj.updateDynamic("registerOnFolderNodeExpanded")(js.Any.fromFunction1((t0: js.Function1[/* response */ typingsJapgolly.azdata.mod.FileBrowserExpandedParams, js.Any]) => registerOnFolderNodeExpanded(t0).runNow()))
    __obj.updateDynamic("validateFilePaths")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Array[java.lang.String]) => validateFilePaths(t0, t1, t2).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserProvider]
  }
}

