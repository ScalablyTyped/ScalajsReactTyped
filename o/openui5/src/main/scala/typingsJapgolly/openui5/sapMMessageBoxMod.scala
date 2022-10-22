package typingsJapgolly.openui5

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.openui5.anon.Actions
import typingsJapgolly.openui5.anon.CloseOnNavigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMessageBoxMod extends Shortcut {
  
  @JSImport("sap/m/MessageBox", JSImport.Default)
  @js.native
  val default: MessageBox = js.native
  
  @js.native
  sealed trait Action extends StObject
  @JSImport("sap/m/MessageBox", "Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action & String] = js.native
    
    /**
      * Adds an "Abort" button to the message box.
      */
    @js.native
    sealed trait ABORT
      extends StObject
         with Action
    /* "ABORT" */ val ABORT: typingsJapgolly.openui5.sapMMessageBoxMod.Action.ABORT & String = js.native
    
    /**
      * Adds a "Cancel" button to the message box.
      */
    @js.native
    sealed trait CANCEL
      extends StObject
         with Action
    /* "CANCEL" */ val CANCEL: typingsJapgolly.openui5.sapMMessageBoxMod.Action.CANCEL & String = js.native
    
    /**
      * Adds a "Close" button to the message box.
      */
    @js.native
    sealed trait CLOSE
      extends StObject
         with Action
    /* "CLOSE" */ val CLOSE: typingsJapgolly.openui5.sapMMessageBoxMod.Action.CLOSE & String = js.native
    
    /**
      * Adds a "Delete" button to the message box.
      */
    @js.native
    sealed trait DELETE
      extends StObject
         with Action
    /* "DELETE" */ val DELETE: typingsJapgolly.openui5.sapMMessageBoxMod.Action.DELETE & String = js.native
    
    /**
      * Adds an "Ignore" button to the message box.
      */
    @js.native
    sealed trait IGNORE
      extends StObject
         with Action
    /* "IGNORE" */ val IGNORE: typingsJapgolly.openui5.sapMMessageBoxMod.Action.IGNORE & String = js.native
    
    /**
      * Adds a "No" button to the message box.
      */
    @js.native
    sealed trait NO
      extends StObject
         with Action
    /* "NO" */ val NO: typingsJapgolly.openui5.sapMMessageBoxMod.Action.NO & String = js.native
    
    /**
      * Adds an "OK" button to the message box.
      */
    @js.native
    sealed trait OK
      extends StObject
         with Action
    /* "OK" */ val OK: typingsJapgolly.openui5.sapMMessageBoxMod.Action.OK & String = js.native
    
    /**
      * Adds a "Retry" button to the message box.
      */
    @js.native
    sealed trait RETRY
      extends StObject
         with Action
    /* "RETRY" */ val RETRY: typingsJapgolly.openui5.sapMMessageBoxMod.Action.RETRY & String = js.native
    
    /**
      * Adds a "Yes" button to the message box.
      */
    @js.native
    sealed trait YES
      extends StObject
         with Action
    /* "YES" */ val YES: typingsJapgolly.openui5.sapMMessageBoxMod.Action.YES & String = js.native
  }
  
  @js.native
  sealed trait Icon extends StObject
  @JSImport("sap/m/MessageBox", "Icon")
  @js.native
  object Icon extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Icon & String] = js.native
    
    /**
      * Shows the error icon in the message box.
      */
    @js.native
    sealed trait ERROR
      extends StObject
         with Icon
    /* "undefined" */ val ERROR: typingsJapgolly.openui5.sapMMessageBoxMod.Icon.ERROR & String = js.native
    
    /**
      * Shows the information icon in the message box.
      */
    @js.native
    sealed trait INFORMATION
      extends StObject
         with Icon
    /* "undefined" */ val INFORMATION: typingsJapgolly.openui5.sapMMessageBoxMod.Icon.INFORMATION & String = js.native
    
    /**
      * Shows no icon in the message box.
      */
    @js.native
    sealed trait NONE
      extends StObject
         with Icon
    /* "undefined" */ val NONE: typingsJapgolly.openui5.sapMMessageBoxMod.Icon.NONE & String = js.native
    
    /**
      * Shows the question icon in the message box.
      */
    @js.native
    sealed trait QUESTION
      extends StObject
         with Icon
    /* "undefined" */ val QUESTION: typingsJapgolly.openui5.sapMMessageBoxMod.Icon.QUESTION & String = js.native
    
    /**
      * Shows the success icon in the message box.
      */
    @js.native
    sealed trait SUCCESS
      extends StObject
         with Icon
    /* "undefined" */ val SUCCESS: typingsJapgolly.openui5.sapMMessageBoxMod.Icon.SUCCESS & String = js.native
    
    /**
      * Shows the warning icon in the message box.
      */
    @js.native
    sealed trait WARNING
      extends StObject
         with Icon
    /* "undefined" */ val WARNING: typingsJapgolly.openui5.sapMMessageBoxMod.Icon.WARNING & String = js.native
  }
  
  /**
    * @SINCE 1.21.2
    *
    * Provides easier methods to create sap.m.Dialog with type sap.m.DialogType.Message, such as standard alerts,
    * confirmation dialogs, or arbitrary message dialogs.
    *
    * Because the `MessageBox` is a static class, a `sap.ui.require("sap/m/MessageBox");` statement must be
    * explicitly executed prior using the class. MessageBox provides several functions:
    * 	 - `show()` - This is the generic way to open a message dialog. You can customize its contents through
    * 			the `mOptions` parameter described below.
    * 	 - `alert()`, `confirm()`, `error()`, `information()`, `success()` and `warning()` - predefined templates
    * 			of message dialogs. Each value type is coming with action buttons and an icon that are corresponding
    * 			to its semantic. Although the full set of `mOptions` (applicable to `show()`) are available to them,
    * 			it is recommended to only use the documented options.
    *
    * **NOTE:** All options of show() are available for the other template functions as well, but it is recommended
    * to use show() only in more specific scenarios. **NOTE:** Due to the static nature of the `MessageBox`
    * class, you cannot expect data binding support from its helper functions. If this is required you can
    * use the `sap.m.Dialog` instead. **NOTE:** When using the `MessageBox.Error` method, there is no
    * emphasized action by design.
    *
    * Example:
    * ```javascript
    *
    * sap.ui.define(["sap/m/MessageBox"], function (MessageBox) {
    * 	MessageBox.show(
    * 		"This message should appear in the message box.", {
    * 			icon: MessageBox.Icon.INFORMATION,
    * 			title: "My message box title",
    * 			actions: [MessageBox.Action.YES, MessageBox.Action.NO],
    * 			emphasizedAction: MessageBox.Action.YES,
    * 			onClose: function (oAction) { / * do something * / }
    * 		}
    * 	);
    * });
    * ```
    *
    *
    * When using the `sap.m.MessageBox` in SAP Quartz and Horizon themes, the breakpoints and layout paddings
    * could be determined by the MessageBox' width. To enable this concept and add responsive paddings to an
    * element of the MessageBox control, you have to add the following classes depending on your use case:
    * `sapUiResponsivePadding--header`, `sapUiResponsivePadding--content`, `sapUiResponsivePadding--footer`.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/message-box/ Message Box}
    */
  @js.native
  trait MessageBox extends StObject {
    
    /**
      * Displays an alert dialog with the given message and an OK button (no icons).
      *
      *
      * ```javascript
      *
      * sap.m.MessageBox.alert("This message should appear in the alert", {
      *     title: "Alert",                                      // default
      *     onClose: null,                                       // default
      *     styleClass: "",                                      // default
      *     actions: sap.m.MessageBox.Action.OK,                 // default
      *     emphasizedAction: sap.m.MessageBox.Action.OK,        // default
      *     initialFocus: null,                                  // default
      *     textDirection: sap.ui.core.TextDirection.Inherit     // default
      * });
      * ```
      *
      *
      * If a callback is given, it is called after the alert dialog has been closed by the user via the OK button.
      * The callback is called with the following signature:
      *
      *
      * ```javascript
      *
      *   function (oAction)
      * ```
      *
      *
      * where `oAction` can be either sap.m.MessageBox.Action.OK when the alert dialog is closed by tapping on
      * the OK button or null when the alert dialog is closed by calling `sap.m.InstanceManager.closeAllDialogs()`.
      *
      * The alert dialog opened by this method is processed asynchronously. Applications have to use `fnCallback`
      * to continue work after the user closed the alert dialog.
      */
    def alert(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String
    ): Unit = js.native
    def alert(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String,
      /**
      * Other options (optional)
      */
    mOptions: Actions
    ): Unit = js.native
    
    /**
      * Displays a confirmation dialog with the given message, a QUESTION icon, an OK button and a Cancel button.
      * If a callback is given, it is called after the confirmation box has been closed by the user with one
      * of the buttons.
      *
      *
      * ```javascript
      *
      * sap.m.MessageBox.confirm("This message should appear in the confirmation", {
      *     title: "Confirm",                                    // default
      *     onClose: null,                                       // default
      *     styleClass: "",                                      // default
      *     actions: [ sap.m.MessageBox.Action.OK,
      *                sap.m.MessageBox.Action.CANCEL ],         // default
      *     emphasizedAction: sap.m.MessageBox.Action.OK,        // default
      *     initialFocus: null,                                  // default
      *     textDirection: sap.ui.core.TextDirection.Inherit     // default
      * });
      * ```
      *
      *
      * The callback is called with the following signature
      *
      *
      * ```javascript
      *
      *   function(oAction)
      * ```
      *
      *
      * where oAction is set by one of the following three values: 1. sap.m.MessageBox.Action.OK: OK (confirmed)
      * button is tapped. 2. sap.m.MessageBox.Action.CANCEL: Cancel (unconfirmed) button is tapped. 3. null:
      * Confirm dialog is closed by calling `sap.m.InstanceManager.closeAllDialogs()`
      *
      * The confirmation dialog opened by this method is processed asynchronously. Applications have to use `fnCallback`
      * to continue work after the user closed the confirmation dialog
      */
    def confirm(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String
    ): Unit = js.native
    def confirm(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String,
      /**
      * Other options (optional)
      */
    mOptions: Actions
    ): Unit = js.native
    
    /**
      * @SINCE 1.30
      *
      * Displays an error dialog with the given message, an ERROR icon, a CLOSE button.. If a callback is given,
      * it is called after the error box has been closed by the user with one of the buttons.
      *
      *
      * ```javascript
      *
      * sap.m.MessageBox.error("This message should appear in the error message box", {
      *     title: "Error",                                      // default
      *     onClose: null,                                       // default
      *     styleClass: "",                                      // default
      *     actions: sap.m.MessageBox.Action.CLOSE,              // default
      *     emphasizedAction: null,                              // default
      *     initialFocus: null,                                  // default
      *     textDirection: sap.ui.core.TextDirection.Inherit     // default
      * });
      * ```
      *
      *
      * The callback is called with the following signature
      *
      *
      * ```javascript
      *
      *   function (oAction)
      * ```
      *
      *
      * The error dialog opened by this method is processed asynchronously. Applications have to use `fnCallback`
      * to continue work after the user closed the error dialog.
      */
    def error(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String
    ): Unit = js.native
    def error(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String,
      /**
      * Other options (optional)
      */
    mOptions: Actions
    ): Unit = js.native
    
    /**
      * @SINCE 1.30
      *
      * Displays an information dialog with the given message, an INFO icon, an OK button. If a callback is given,
      * it is called after the info box has been closed by the user with one of the buttons.
      *
      *
      * ```javascript
      *
      * sap.m.MessageBox.information("This message should appear in the information message box", {
      *     title: "Information",                                // default
      *     onClose: null,                                       // default
      *     styleClass: "",                                      // default
      *     actions: sap.m.MessageBox.Action.OK,                 // default
      *     emphasizedAction: sap.m.MessageBox.Action.OK,        // default
      *     initialFocus: null,                                  // default
      *     textDirection: sap.ui.core.TextDirection.Inherit     // default
      * });
      * ```
      *
      *
      * The callback is called with the following signature
      * ```javascript
      *
      *   function (oAction)
      * ```
      *
      *
      * The information dialog opened by this method is processed asynchronously. Applications have to use `fnCallback`
      * to continue work after the user closed the information dialog
      */
    def information(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String
    ): Unit = js.native
    def information(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String,
      /**
      * Other options (optional)
      */
    mOptions: Actions
    ): Unit = js.native
    
    /**
      * Creates and displays an sap.m.Dialog with type sap.m.DialogType.Message with the given text and buttons,
      * and optionally other parts. After the user has tapped a button, the `onClose` function is invoked when
      * given.
      *
      * The only mandatory parameter is `vMessage`. Either a string with the corresponding text or even a layout
      * control could be provided.
      *
      *
      * ```javascript
      *
      * sap.m.MessageBox.show("This message should appear in the message box", {
      *     icon: sap.m.MessageBox.Icon.NONE,                    // default
      *     title: "",                                           // default
      *     actions: sap.m.MessageBox.Action.OK,                 // default
      *     emphasizedAction: sap.m.MessageBox.Action.OK,        // default
      *     onClose: null,                                       // default
      *     styleClass: "",                                      // default
      *     initialFocus: null,                                  // default
      *     textDirection: sap.ui.core.TextDirection.Inherit     // default
      * });
      * ```
      *
      *
      * The created dialog is executed asynchronously. When it has been created and registered for rendering,
      * this function returns without waiting for a user reaction.
      *
      * When applications have to react on the users choice, they have to provide a callback function and postpone
      * any reaction on the user choice until that callback is triggered.
      *
      * The signature of the callback is
      *
      * function (oAction);
      *
      * where `oAction` is the button that the user has tapped. For example, when the user has pressed the close
      * button, an sap.m.MessageBox.Action.CLOSE is returned.
      */
    def show(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String
    ): Unit = js.native
    def show(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String,
      /**
      * Other options (optional)
      */
    mOptions: CloseOnNavigation
    ): Unit = js.native
    
    /**
      * @SINCE 1.30
      *
      * Displays a success dialog with the given message, a SUCCESS icon, an OK button. If a callback is given,
      * it is called after the success box has been closed by the user with one of the buttons.
      *
      *
      * ```javascript
      *
      * sap.m.MessageBox.success("This message should appear in the success message box", {
      *     title: "Success",                                    // default
      *     onClose: null,                                       // default
      *     styleClass: "",                                      // default
      *     actions: sap.m.MessageBox.Action.OK,                 // default
      *     emphasizedAction: sap.m.MessageBox.Action.OK,        // default
      *     initialFocus: null,                                  // default
      *     textDirection: sap.ui.core.TextDirection.Inherit     // default
      * });
      * ```
      *
      *
      * The callback is called with the following signature
      * ```javascript
      *
      *   function(oAction)
      * ```
      *
      *
      * The success dialog opened by this method is processed asynchronously. Applications have to use `fnCallback`
      * to continue work after the user closed the success dialog
      */
    def success(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String
    ): Unit = js.native
    def success(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String,
      /**
      * Other options (optional)
      */
    mOptions: Actions
    ): Unit = js.native
    
    /**
      * @SINCE 1.30
      *
      * Displays a warning dialog with the given message, a WARNING icon, an OK button. If a callback is given,
      * it is called after the warning box has been closed by the user with one of the buttons.
      *
      *
      * ```javascript
      *
      * sap.m.MessageBox.warning("This message should appear in the warning message box", {
      *     title: "Warning",                                    // default
      *     onClose: null,                                       // default
      *     styleClass: "",                                      // default
      *     actions: sap.m.MessageBox.Action.OK,                 // default
      *     emphasizedAction: sap.m.MessageBox.Action.OK,        // default
      *     initialFocus: null,                                  // default
      *     textDirection: sap.ui.core.TextDirection.Inherit     // default
      * });
      * ```
      *
      *
      * The callback is called with the following signature
      * ```javascript
      *
      *   function (oAction)
      * ```
      *
      *
      * The warning dialog opened by this method is processed asynchronously. Applications have to use `fnCallback`
      * to continue work after the user closed the warning dialog
      */
    def warning(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String
    ): Unit = js.native
    def warning(
      /**
      * Message to be displayed in the alert dialog. The usage of sap.core.Control as vMessage is deprecated
      * since version 1.30.4.
      */
    vMessage: String,
      /**
      * Other options (optional)
      */
    mOptions: Actions
    ): Unit = js.native
  }
  
  type _To = MessageBox
  
  /* This means you don't have to write `default`, but can instead just say `sapMMessageBoxMod.foo` */
  override def _to: MessageBox = default
}
