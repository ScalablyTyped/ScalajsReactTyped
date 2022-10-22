package typingsJapgolly.sharepoint.global.SP.UI

import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.SP.UI.DialogReturnValueCallback
import typingsJapgolly.sharepoint.SP.UI.IDialogOptions
import typingsJapgolly.std.HTMLFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a modal dialog */
@JSGlobal("SP.UI.ModalDialog")
@js.native
open class ModalDialog ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.UI.ModalDialog {
  
  /* CompleteClass */
  override def autoSize(): Unit = js.native
  
  /* CompleteClass */
  override def autoSizeSuppressScrollbar(resizePageCallBack: Any): Unit = js.native
  
  /** Closes the dialog using the specified dialog result. */
  /* CompleteClass */
  override def close(dialogResult: typingsJapgolly.sharepoint.SP.UI.DialogResult): Unit = js.native
  
  /* CompleteClass */
  override def get_allowMaximize(): Boolean = js.native
  
  /* CompleteClass */
  override def get_args(): Any = js.native
  
  /* CompleteClass */
  override def get_closed(): Boolean = js.native
  
  /* CompleteClass */
  override def get_dialogElement(): HTMLElement = js.native
  
  /* CompleteClass */
  override def get_firstTabStop(): HTMLElement = js.native
  
  /* CompleteClass */
  override def get_frameElement(): HTMLFrameElement = js.native
  
  /* CompleteClass */
  override def get_html(): String = js.native
  
  /* CompleteClass */
  override def get_isMaximized(): Boolean = js.native
  
  /* CompleteClass */
  override def get_lastTabStop(): HTMLElement = js.native
  
  /* CompleteClass */
  override def get_returnValue(): Any = js.native
  
  /* CompleteClass */
  override def get_showClose(): Boolean = js.native
  
  /* CompleteClass */
  override def get_title(): String = js.native
  
  /* CompleteClass */
  override def get_url(): String = js.native
  
  /* CompleteClass */
  override def set_returnValue(value: Any): Unit = js.native
}
object ModalDialog {
  
  @JSGlobal("SP.UI.ModalDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /** Show modal dialog specified by url, callback, height and width. */
  /* static member */
  inline def OpenPopUpPage(url: String, callback: DialogReturnValueCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OpenPopUpPage")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OpenPopUpPage")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Double, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OpenPopUpPage")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def OpenPopUpPage(url: String, callback: DialogReturnValueCallback, width: Unit, height: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("OpenPopUpPage")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Refresh the page if specified dialogResult equals to SP.UI.DialogResult.OK */
  /* static member */
  inline def RefreshPage(dialogResult: typingsJapgolly.sharepoint.SP.UI.DialogResult): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RefreshPage")(dialogResult.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Show page specified by the url in a modal dialog. If the dialog returns SP.UI.DialogResult.OK, the page is refreshed. */
  /* static member */
  inline def ShowPopupDialog(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ShowPopupDialog")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Should be called from an existing dialog. */
  /* static member */
  inline def commonModalDialogClose(dialogResult: typingsJapgolly.sharepoint.SP.UI.DialogResult, returnValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commonModalDialogClose")(dialogResult.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Shows a modal dialog, specified by url, callback, args, and options. Internally, uses SP.UI.ModalDialog.showModalDialog.
    @param url overrides options.url
    @param callback overrides options.dialogResultValueCallback
    @param args overrides options.args */
  /* static member */
  inline def commonModalDialogOpen(url: String, options: IDialogOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commonModalDialogOpen")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commonModalDialogOpen(url: String, options: IDialogOptions, callback: Unit, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commonModalDialogOpen")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commonModalDialogOpen")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commonModalDialogOpen(url: String, options: IDialogOptions, callback: DialogReturnValueCallback, args: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commonModalDialogOpen")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def getChildDialog(): typingsJapgolly.sharepoint.SP.UI.ModalDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("get_childDialog")().asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  
  /** Displays a modal dialog defined by the specified options. */
  /* static member */
  inline def showModalDialog(options: IDialogOptions): typingsJapgolly.sharepoint.SP.UI.ModalDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("showModalDialog")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  
  /* static member */
  inline def showPlatformFirstRunDialog(url: String, callbackFunc: DialogReturnValueCallback): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showPlatformFirstRunDialog")(url.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel button is shown. If user clicks it, the callbackFunc is called. */
  /* static member */
  inline def showWaitScreenSize(title: String): typingsJapgolly.sharepoint.SP.UI.ModalDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: String): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: String, callbackFunc: Unit, height: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: String, callbackFunc: Unit, height: Double, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: String, callbackFunc: Unit, height: Unit, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: String, callbackFunc: DialogReturnValueCallback, height: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: DialogReturnValueCallback,
    height: Double,
    width: Double
  ): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(
    title: String,
    message: String,
    callbackFunc: DialogReturnValueCallback,
    height: Unit,
    width: Double
  ): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: Unit, callbackFunc: Unit, height: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: Unit, callbackFunc: Unit, height: Double, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: Unit, callbackFunc: Unit, height: Unit, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: Unit, callbackFunc: DialogReturnValueCallback): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: Unit, callbackFunc: DialogReturnValueCallback, height: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(
    title: String,
    message: Unit,
    callbackFunc: DialogReturnValueCallback,
    height: Double,
    width: Double
  ): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenSize(title: String, message: Unit, callbackFunc: DialogReturnValueCallback, height: Unit, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenSize")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callbackFunc.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  
  /** Displays a wait/loading modal dialog with the specified title, message, height and width. Height and width are defined in pixels. Cancel/close button is not shown. */
  /* static member */
  inline def showWaitScreenWithNoClose(title: String): typingsJapgolly.sharepoint.SP.UI.ModalDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenWithNoClose(title: String, message: String): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenWithNoClose(title: String, message: String, height: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenWithNoClose(title: String, message: String, height: Double, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenWithNoClose(title: String, message: String, height: Unit, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenWithNoClose(title: String, message: Unit, height: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenWithNoClose(title: String, message: Unit, height: Double, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
  inline def showWaitScreenWithNoClose(title: String, message: Unit, height: Unit, width: Double): typingsJapgolly.sharepoint.SP.UI.ModalDialog = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitScreenWithNoClose")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.UI.ModalDialog]
}
