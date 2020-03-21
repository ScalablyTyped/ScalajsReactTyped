package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Application-wide service for handling modals, overlays and dialogs By default it
  * injects the passed template url into a div to body of the document And renders it,
  * but does also support rendering items in an iframe, incase serverside processing is needed, or its a non-angular page
  */
trait IDialogService extends js.Object {
  var dialogs: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#close
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Closes a specific dialog
    * @param {Object} dialog the dialog object to close
    * @param {Object} args if specified this object will be sent to any callbacks registered on the dialogs.
    */
  def close(dialog: IDialog, args: js.Any*): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#closeAll
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Closes all dialogs
    * @param {Object} args if specified this object will be sent to any callbacks registered on the dialogs.
    */
  def closeAll(args: js.Any*): Unit
  /** Internal method that closes the dialog properly and cleans up resources */
  def closeDialog(dialog: IDialog): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#contentPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a content picker tree in a modal, the callback returns an array of selected documents
    * @param {Object} options content picker dialog options object
    * @param {Boolean} options.multipicker should the picker return one or multiple items
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def contentPicker(options: IContentPickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#ysodDialog
    * @methodOf umbraco.services.dialogService
    * @description
    * Opens a dialog to an embed dialog
    */
  def embedDialog(options: js.Any): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#iconPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a icon picker in a modal, the callback returns a object representing the selected icon
    * @param {Object} options iconpicker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def iconPicker(options: IIconPickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#linkPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a link picker tree in a modal, the callback returns a single link
    * @param {Object} options content picker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def linkPicker(options: ILinkPickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#macroPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a mcaro picker in a modal, the callback returns a object representing the macro and it's parameters
    * @param {Object} options macropicker dialog options object
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def macroPicker(options: IMacroPickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#mediaPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a media picker in a modal, the callback returns an array of selected media items
    * @param {Object} options mediapicker dialog options object
    * @param {Boolean} options.onlyImages Only display files that have an image file-extension
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def mediaPicker(options: IMediaPickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#memberGroupPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a member group picker in a modal, the callback returns a object representing the selected member
    * @param {Object} options member group picker dialog options object
    * @param {Boolean} options.multiPicker should the tree pick one or multiple members before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def memberGroupPicker(options: IMemberGroupPickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#memberPicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a member picker in a modal, the callback returns a object representing the selected member
    * @param {Object} options member picker dialog options object
    * @param {Boolean} options.multiPicker should the tree pick one or multiple members before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def memberPicker(options: IMemberPickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#open
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a modal rendering a given template url.
    *
    * @param {Object} options rendering options
    * @param {DomElement} options.container the DOM element to inject the modal into, by default set to body
    * @param {Function} options.callback function called when the modal is submitted
    * @param {String} options.template the url of the template
    * @param {String} options.animation animation csss class, by default set to "fade"
    * @param {String} options.modalClass modal css class, by default "umb-modal"
    * @param {Bool} options.show show the modal instantly
    * @param {Bool} options.iframe load template in an iframe, only needed for serverside templates
    * @param {Int} options.width set a width on the modal, only needed for iframes
    * @param {Bool} options.inline strips the modal from any animation and wrappers, used when you want to inject a dialog into an existing container
    * @returns {Object} modal object
    */
  def open(options: IDialogRenderingOptions): IModal
  /** Internal method that handles opening all dialogs */
  def openDialog(options: IDialogRenderingOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#propertyDialog
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a dialog with a chosen property editor in, a value can be passed to the modal, and this value is returned in the callback
    * @param {Object} options mediapicker dialog options object
    * @param {Function} options.callback callback function
    * @param {String} editor editor to use to edit a given value and return on callback
    * @param {Object} value value sent to the property editor
    * @returns {Object} modal object
    */
  def propertyDialog(options: IPropertyDialogOptions): IModal
  /** Internal method that removes all dialogs */
  def removeAllDialogs(args: js.Any*): Unit
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#treePicker
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a tree picker in a modal, the callback returns a object representing the selected tree item
    * @param {Object} options iconpicker dialog options object
    * @param {String} options.section tree section to display
    * @param {String} options.treeAlias specific tree to display
    * @param {Boolean} options.multiPicker should the tree pick one or multiple items before returning
    * @param {Function} options.callback callback function
    * @returns {Object} modal object
    */
  def treePicker(options: ITreePickerOptions): IModal
  /**
    * @ngdoc method
    * @name umbraco.services.dialogService#ysodDialog
    * @methodOf umbraco.services.dialogService
    *
    * @description
    * Opens a dialog to show a custom YSOD
    */
  def ysodDialog(ysodError: js.Any): Unit
}

object IDialogService {
  @scala.inline
  def apply(
    close: (IDialog, /* repeated */ js.Any) => Callback,
    closeAll: /* repeated */ js.Any => Callback,
    closeDialog: IDialog => Callback,
    contentPicker: IContentPickerOptions => CallbackTo[IModal],
    embedDialog: js.Any => Callback,
    iconPicker: IIconPickerOptions => CallbackTo[IModal],
    linkPicker: ILinkPickerOptions => CallbackTo[IModal],
    macroPicker: IMacroPickerOptions => CallbackTo[IModal],
    mediaPicker: IMediaPickerOptions => CallbackTo[IModal],
    memberGroupPicker: IMemberGroupPickerOptions => CallbackTo[IModal],
    memberPicker: IMemberPickerOptions => CallbackTo[IModal],
    open: IDialogRenderingOptions => CallbackTo[IModal],
    openDialog: IDialogRenderingOptions => CallbackTo[IModal],
    propertyDialog: IPropertyDialogOptions => CallbackTo[IModal],
    removeAllDialogs: /* repeated */ js.Any => Callback,
    treePicker: ITreePickerOptions => CallbackTo[IModal],
    ysodDialog: js.Any => Callback,
    dialogs: js.Array[_] = null
  ): IDialogService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction2((t0: typingsJapgolly.umbraco.umbraco.services.IDialog, t1: /* repeated */ js.Any) => close(t0, t1).runNow()))
    __obj.updateDynamic("closeAll")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => closeAll(t0).runNow()))
    __obj.updateDynamic("closeDialog")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IDialog) => closeDialog(t0).runNow()))
    __obj.updateDynamic("contentPicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IContentPickerOptions) => contentPicker(t0).runNow()))
    __obj.updateDynamic("embedDialog")(js.Any.fromFunction1((t0: js.Any) => embedDialog(t0).runNow()))
    __obj.updateDynamic("iconPicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IIconPickerOptions) => iconPicker(t0).runNow()))
    __obj.updateDynamic("linkPicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.ILinkPickerOptions) => linkPicker(t0).runNow()))
    __obj.updateDynamic("macroPicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IMacroPickerOptions) => macroPicker(t0).runNow()))
    __obj.updateDynamic("mediaPicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IMediaPickerOptions) => mediaPicker(t0).runNow()))
    __obj.updateDynamic("memberGroupPicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IMemberGroupPickerOptions) => memberGroupPicker(t0).runNow()))
    __obj.updateDynamic("memberPicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IMemberPickerOptions) => memberPicker(t0).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IDialogRenderingOptions) => open(t0).runNow()))
    __obj.updateDynamic("openDialog")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IDialogRenderingOptions) => openDialog(t0).runNow()))
    __obj.updateDynamic("propertyDialog")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.IPropertyDialogOptions) => propertyDialog(t0).runNow()))
    __obj.updateDynamic("removeAllDialogs")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => removeAllDialogs(t0).runNow()))
    __obj.updateDynamic("treePicker")(js.Any.fromFunction1((t0: typingsJapgolly.umbraco.umbraco.services.ITreePickerOptions) => treePicker(t0).runNow()))
    __obj.updateDynamic("ysodDialog")(js.Any.fromFunction1((t0: js.Any) => ysodDialog(t0).runNow()))
    if (dialogs != null) __obj.updateDynamic("dialogs")(dialogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogService]
  }
}

