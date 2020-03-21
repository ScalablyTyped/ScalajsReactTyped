package typingsJapgolly.jupyterlabConsole.panelMod.ConsolePanel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsJapgolly.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole.IModelFactory
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsJapgolly.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a console panel.
  */
trait IOptions extends js.Object {
  /**
    * The base path for a new console.
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * The content factory for the panel.
    */
  var contentFactory: IContentFactory
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
  /**
    * The service manager used by the panel.
    */
  var manager: IManager
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService
  /**
    * The model factory for the console widget.
    */
  var modelFactory: js.UndefOr[IModelFactory] = js.undefined
  /**
    * The name of the console.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The path of an existing console.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The rendermime instance used by the panel.
    */
  var rendermime: IRenderMimeRegistry
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory,
    manager: IManager,
    mimeTypeService: IEditorMimeTypeService,
    rendermime: IRenderMimeRegistry,
    basePath: String = null,
    kernelPreference: IKernelPreference = null,
    modelFactory: IModelFactory = null,
    name: String = null,
    path: String = null,
    setBusy: js.UndefOr[CallbackTo[IDisposable]] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (kernelPreference != null) __obj.updateDynamic("kernelPreference")(kernelPreference.asInstanceOf[js.Any])
    if (modelFactory != null) __obj.updateDynamic("modelFactory")(modelFactory.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    setBusy.foreach(p => __obj.updateDynamic("setBusy")(p.toJsFn))
    __obj.asInstanceOf[IOptions]
  }
}

