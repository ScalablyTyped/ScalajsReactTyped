package typingsJapgolly.bootstrap3Dialog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BootstrapDialog {
  
  trait DialogButton extends StObject {
    
    /**
      * If provided, the callback will be invoked after the button is clicked, and the dialog instance
      * will be passed to the callback function.
      */
    var action: js.UndefOr[js.Function1[/* dialog */ DialogContext, Unit]] = js.undefined
    
    /**  If it's true, after clicked the button a spinning icon appears. */
    var autospin: js.UndefOr[Boolean] = js.undefined
    
    /** Additional css class to be added to the button. */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Object containing data attributes to be added to the button. */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Hotkey char code */
    var hotkey: js.UndefOr[Double] = js.undefined
    
    /** If set, the specified icon will be added to the button. */
    var icon: js.UndefOr[String] = js.undefined
    
    /** If id is set, you can use dialogInstance.getButton(id) to get the button later. */
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object DialogButton {
    
    inline def apply(): DialogButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogButton]
    }
    
    extension [Self <: DialogButton](x: Self) {
      
      inline def setAction(value: /* dialog */ DialogContext => Callback): Self = StObject.set(x, "action", js.Any.fromFunction1((t0: /* dialog */ DialogContext) => value(t0).runNow()))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAutospin(value: Boolean): Self = StObject.set(x, "autospin", value.asInstanceOf[js.Any])
      
      inline def setAutospinUndefined: Self = StObject.set(x, "autospin", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHotkey(value: Double): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      inline def setHotkeyUndefined: Self = StObject.set(x, "hotkey", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait DialogButtonInstance extends StObject {
    
    /** Equals to $button.toggleEnable(false); */
    def disable(): Unit
    
    /** Equals to $button.toggleEnable(true); */
    def enable(): Unit
    
    /** Equals to $button.toggleSpin(true); */
    def spin(): Unit
    
    /** Equals to $button.toggleSpin(false); */
    def stopSpin(): Unit
    
    def toggleEnable(enabled: Boolean): Unit
    
    def toggleSpin(spin: Boolean): Unit
  }
  object DialogButtonInstance {
    
    inline def apply(
      disable: Callback,
      enable: Callback,
      spin: Callback,
      stopSpin: Callback,
      toggleEnable: Boolean => Callback,
      toggleSpin: Boolean => Callback
    ): DialogButtonInstance = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, spin = spin.toJsFn, stopSpin = stopSpin.toJsFn, toggleEnable = js.Any.fromFunction1((t0: Boolean) => toggleEnable(t0).runNow()), toggleSpin = js.Any.fromFunction1((t0: Boolean) => toggleSpin(t0).runNow()))
      __obj.asInstanceOf[DialogButtonInstance]
    }
    
    extension [Self <: DialogButtonInstance](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setSpin(value: Callback): Self = StObject.set(x, "spin", value.toJsFn)
      
      inline def setStopSpin(value: Callback): Self = StObject.set(x, "stopSpin", value.toJsFn)
      
      inline def setToggleEnable(value: Boolean => Callback): Self = StObject.set(x, "toggleEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setToggleSpin(value: Boolean => Callback): Self = StObject.set(x, "toggleSpin", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait DialogContext extends StObject {
    
    /**      Close the dialog. Usage: dialogInstance.close() */
    def close(): Unit
    
    /** Disable all buttons in dialog footer when it's false, enable all when it's true. */
    def enableButtons(enable: Boolean): Unit
    
    def getButton(buttonId: String): JQuery[HTMLElement]
    
    /** Get data entry according to the given key, returns null if no data entry found. */
    def getData(dataName: String): Any
    
    /** Return the raw modal, equivalent to $('<div class='modal fade'...></div>') */
    def getModal(): JQuery[HTMLElement]
    
    /** Return the raw modal body. */
    def getModalBody(): JQuery[HTMLElement]
    
    /** Return the raw modal content. */
    def getModalContent(): JQuery[HTMLElement]
    
    /** Return the raw modal dialog. */
    def getModalDialog(): JQuery[HTMLElement]
    
    /** Return the raw modal footer. */
    def getModalFooter(): JQuery[HTMLElement]
    
    /** Return the raw modal header. */
    def getModalHeader(): JQuery[HTMLElement]
    
    def getTitle(): String
    
    /** Open the dialog. Usage: dialogInstance.open() */
    def open(): Unit
    
    /**
      * Calling dialog.open() will automatically get this method called first, but if you want to do something on your dialog
      * before it's shown, you can manually call dialog.realize() before calling dialog.open().
      */
    def realize(): Unit
    
    /**
      * When set to true (default), dialog can be closed by clicking close icon in dialog header,
      * or by clicking outside the dialog, or, ESC key is pressed.
      */
    def setClosable(closable: Boolean): Unit
    
    /** Bind data entry to dialog instance, value can be any types that javascript supports. */
    def setData(dataName: String, value: Any): Unit
    
    def setMessage(message: String): Unit
    
    def setTitle(title: String): Unit
    
    /** See BootstrapDialog.TYPE_xxx constants. */
    def setType(dialogType: String): Unit
  }
  object DialogContext {
    
    inline def apply(
      close: Callback,
      enableButtons: Boolean => Callback,
      getButton: String => JQuery[HTMLElement],
      getData: String => Any,
      getModal: CallbackTo[JQuery[HTMLElement]],
      getModalBody: CallbackTo[JQuery[HTMLElement]],
      getModalContent: CallbackTo[JQuery[HTMLElement]],
      getModalDialog: CallbackTo[JQuery[HTMLElement]],
      getModalFooter: CallbackTo[JQuery[HTMLElement]],
      getModalHeader: CallbackTo[JQuery[HTMLElement]],
      getTitle: CallbackTo[String],
      open: Callback,
      realize: Callback,
      setClosable: Boolean => Callback,
      setData: (String, Any) => Callback,
      setMessage: String => Callback,
      setTitle: String => Callback,
      setType: String => Callback
    ): DialogContext = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, enableButtons = js.Any.fromFunction1((t0: Boolean) => enableButtons(t0).runNow()), getButton = js.Any.fromFunction1(getButton), getData = js.Any.fromFunction1(getData), getModal = getModal.toJsFn, getModalBody = getModalBody.toJsFn, getModalContent = getModalContent.toJsFn, getModalDialog = getModalDialog.toJsFn, getModalFooter = getModalFooter.toJsFn, getModalHeader = getModalHeader.toJsFn, getTitle = getTitle.toJsFn, open = open.toJsFn, realize = realize.toJsFn, setClosable = js.Any.fromFunction1((t0: Boolean) => setClosable(t0).runNow()), setData = js.Any.fromFunction2((t0: String, t1: Any) => (setData(t0, t1)).runNow()), setMessage = js.Any.fromFunction1((t0: String) => setMessage(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()), setType = js.Any.fromFunction1((t0: String) => setType(t0).runNow()))
      __obj.asInstanceOf[DialogContext]
    }
    
    extension [Self <: DialogContext](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setEnableButtons(value: Boolean => Callback): Self = StObject.set(x, "enableButtons", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setGetButton(value: String => JQuery[HTMLElement]): Self = StObject.set(x, "getButton", js.Any.fromFunction1(value))
      
      inline def setGetData(value: String => Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
      
      inline def setGetModal(value: CallbackTo[JQuery[HTMLElement]]): Self = StObject.set(x, "getModal", value.toJsFn)
      
      inline def setGetModalBody(value: CallbackTo[JQuery[HTMLElement]]): Self = StObject.set(x, "getModalBody", value.toJsFn)
      
      inline def setGetModalContent(value: CallbackTo[JQuery[HTMLElement]]): Self = StObject.set(x, "getModalContent", value.toJsFn)
      
      inline def setGetModalDialog(value: CallbackTo[JQuery[HTMLElement]]): Self = StObject.set(x, "getModalDialog", value.toJsFn)
      
      inline def setGetModalFooter(value: CallbackTo[JQuery[HTMLElement]]): Self = StObject.set(x, "getModalFooter", value.toJsFn)
      
      inline def setGetModalHeader(value: CallbackTo[JQuery[HTMLElement]]): Self = StObject.set(x, "getModalHeader", value.toJsFn)
      
      inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setRealize(value: Callback): Self = StObject.set(x, "realize", value.toJsFn)
      
      inline def setSetClosable(value: Boolean => Callback): Self = StObject.set(x, "setClosable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetData(value: (String, Any) => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSetMessage(value: String => Callback): Self = StObject.set(x, "setMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetTitle(value: String => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetType(value: String => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait DialogInstance extends StObject {
    
    @JSName("$modal")
    var $modal: JQuery[HTMLElement]
    
    @JSName("$modalBody")
    var $modalBody: JQuery[HTMLElement]
    
    @JSName("$modalContent")
    var $modalContent: JQuery[HTMLElement]
    
    @JSName("$modalDialog")
    var $modalDialog: JQuery[HTMLElement]
    
    @JSName("$modalFooter")
    var $modalFooter: JQuery[HTMLElement]
    
    @JSName("$modalHeader")
    var $modalHeader: JQuery[HTMLElement]
    
    var opened: Boolean
    
    var options: DialogOptions
  }
  object DialogInstance {
    
    inline def apply(
      $modal: JQuery[HTMLElement],
      $modalBody: JQuery[HTMLElement],
      $modalContent: JQuery[HTMLElement],
      $modalDialog: JQuery[HTMLElement],
      $modalFooter: JQuery[HTMLElement],
      $modalHeader: JQuery[HTMLElement],
      opened: Boolean,
      options: DialogOptions
    ): DialogInstance = {
      val __obj = js.Dynamic.literal($modal = $modal.asInstanceOf[js.Any], $modalBody = $modalBody.asInstanceOf[js.Any], $modalContent = $modalContent.asInstanceOf[js.Any], $modalDialog = $modalDialog.asInstanceOf[js.Any], $modalFooter = $modalFooter.asInstanceOf[js.Any], $modalHeader = $modalHeader.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogInstance]
    }
    
    extension [Self <: DialogInstance](x: Self) {
      
      inline def set$modal(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modal", value.asInstanceOf[js.Any])
      
      inline def set$modalBody(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalBody", value.asInstanceOf[js.Any])
      
      inline def set$modalContent(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalContent", value.asInstanceOf[js.Any])
      
      inline def set$modalDialog(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalDialog", value.asInstanceOf[js.Any])
      
      inline def set$modalFooter(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalFooter", value.asInstanceOf[js.Any])
      
      inline def set$modalHeader(value: JQuery[HTMLElement]): Self = StObject.set(x, "$modalHeader", value.asInstanceOf[js.Any])
      
      inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: DialogOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogOptions extends StObject {
    
    /** Whether fade-out background while showing the dialog. TRUE by default. */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When it's true, all modal stuff will be removed from the DOM tree after the dialog is popped down,
      * set it to false if you need your dialog (same instance) pups up and down again and again.
      * Default is true.
      */
    var autodestroy: js.UndefOr[Boolean] = js.undefined
    
    /** 'Cancel' by default. */
    var btnCancelLabel: js.UndefOr[String] = js.undefined
    
    /** If you didn't specify it, dialog type will be used. */
    var btnOKClass: js.UndefOr[String] = js.undefined
    
    /** 'OK' by default. */
    var btnOKLabel: js.UndefOr[String] = js.undefined
    
    /** Default button title. OK by default. */
    var buttonLabel: js.UndefOr[String] = js.undefined
    
    var buttons: js.UndefOr[js.Array[DialogButton]] = js.undefined
    
    /** Result will be true if button was click, while it will be false if users close the dialog directly. */
    var callback: js.UndefOr[js.Function1[/* result */ Boolean, Unit]] = js.undefined
    
    /**
      * When set to true, you can close the dialog by:
      *  - Clicking the close icon in dialog header.
      *  - Clicking outside the dialog.
      *  - ESC key.
      *
      * FALSE by default.
      */
    var closable: js.UndefOr[Boolean] = js.undefined
    
    /** Whether dialog will close by clicking outside of it. */
    var closeByBackdrop: js.UndefOr[Boolean] = js.undefined
    
    /** Whether dialog will close by ESC. */
    var closeByKeyboard: js.UndefOr[Boolean] = js.undefined
    
    /** Additional css classes that will be added to your dialog. */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Data to be bound to the dialog. */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * If provided, 'aria-describedby' attribute will be added to the dialog with the description string as its value. This can improve accessibility, as the description can be read by screen
      * readers.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /** Whether dialog could be dragged by its header. Cursor could be changed (see doc)! FALSE by default. */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /** Dialog message. Either string, JQuery element, or function that returns either string or JQuery element. */
    var message: js.UndefOr[
        String | JQuery[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery[HTMLElement]])
      ] = js.undefined
    
    /**
      * Automatically convert line breaking character to <br /> if it's set to true,
      * everything keeps original if it's false.
      */
    var nl2br: js.UndefOr[Boolean] = js.undefined
    
    /** If provided, it will be invoked when the dialog is popped down. */
    var onhidden: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.undefined
    
    /**
      * If provided, it will be invoked when the dialog is popping down.
      * Return FALSE to don`t close the dialog. Don`t return anything by default.
      */
    var onhide: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Any]] = js.undefined
    
    /** If provided, it will be invoked when the dialog is popping up. */
    var onshow: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.undefined
    
    /** If provided, it will be invoked when the dialog is popped up. */
    var onshown: js.UndefOr[js.Function1[/* dialog */ js.UndefOr[DialogContext], Unit]] = js.undefined
    
    /** Text size. See BootstrapDialog.SIZE_xxx constants. By default - SIZE_NORMAL */
    var size: js.UndefOr[String] = js.undefined
    
    /** Icon class name, for example 'glyphicon glyphicon-check'. */
    var spinicon: js.UndefOr[String] = js.undefined
    
    /** Dialog title. Either string or JQuery element. */
    var title: js.UndefOr[String | JQuery[HTMLElement]] = js.undefined
    
    /** Dialog header type. See BootstrapDialog.TYPE_xxx constants. */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DialogOptions {
    
    inline def apply(): DialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogOptions]
    }
    
    extension [Self <: DialogOptions](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAutodestroy(value: Boolean): Self = StObject.set(x, "autodestroy", value.asInstanceOf[js.Any])
      
      inline def setAutodestroyUndefined: Self = StObject.set(x, "autodestroy", js.undefined)
      
      inline def setBtnCancelLabel(value: String): Self = StObject.set(x, "btnCancelLabel", value.asInstanceOf[js.Any])
      
      inline def setBtnCancelLabelUndefined: Self = StObject.set(x, "btnCancelLabel", js.undefined)
      
      inline def setBtnOKClass(value: String): Self = StObject.set(x, "btnOKClass", value.asInstanceOf[js.Any])
      
      inline def setBtnOKClassUndefined: Self = StObject.set(x, "btnOKClass", js.undefined)
      
      inline def setBtnOKLabel(value: String): Self = StObject.set(x, "btnOKLabel", value.asInstanceOf[js.Any])
      
      inline def setBtnOKLabelUndefined: Self = StObject.set(x, "btnOKLabel", js.undefined)
      
      inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
      
      inline def setButtons(value: js.Array[DialogButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: DialogButton*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setCallback(value: /* result */ Boolean => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* result */ Boolean) => value(t0).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseByBackdrop(value: Boolean): Self = StObject.set(x, "closeByBackdrop", value.asInstanceOf[js.Any])
      
      inline def setCloseByBackdropUndefined: Self = StObject.set(x, "closeByBackdrop", js.undefined)
      
      inline def setCloseByKeyboard(value: Boolean): Self = StObject.set(x, "closeByKeyboard", value.asInstanceOf[js.Any])
      
      inline def setCloseByKeyboardUndefined: Self = StObject.set(x, "closeByKeyboard", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setMessage(
        value: String | JQuery[HTMLElement] | (js.Function1[/* dialog */ js.UndefOr[DialogContext], String | JQuery[HTMLElement]])
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* dialog */ js.UndefOr[DialogContext] => String | JQuery[HTMLElement]): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setNl2br(value: Boolean): Self = StObject.set(x, "nl2br", value.asInstanceOf[js.Any])
      
      inline def setNl2brUndefined: Self = StObject.set(x, "nl2br", js.undefined)
      
      inline def setOnhidden(value: /* dialog */ js.UndefOr[DialogContext] => Callback): Self = StObject.set(x, "onhidden", js.Any.fromFunction1((t0: /* dialog */ js.UndefOr[DialogContext]) => value(t0).runNow()))
      
      inline def setOnhiddenUndefined: Self = StObject.set(x, "onhidden", js.undefined)
      
      inline def setOnhide(value: /* dialog */ js.UndefOr[DialogContext] => Any): Self = StObject.set(x, "onhide", js.Any.fromFunction1(value))
      
      inline def setOnhideUndefined: Self = StObject.set(x, "onhide", js.undefined)
      
      inline def setOnshow(value: /* dialog */ js.UndefOr[DialogContext] => Callback): Self = StObject.set(x, "onshow", js.Any.fromFunction1((t0: /* dialog */ js.UndefOr[DialogContext]) => value(t0).runNow()))
      
      inline def setOnshowUndefined: Self = StObject.set(x, "onshow", js.undefined)
      
      inline def setOnshown(value: /* dialog */ js.UndefOr[DialogContext] => Callback): Self = StObject.set(x, "onshown", js.Any.fromFunction1((t0: /* dialog */ js.UndefOr[DialogContext]) => value(t0).runNow()))
      
      inline def setOnshownUndefined: Self = StObject.set(x, "onshown", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpinicon(value: String): Self = StObject.set(x, "spinicon", value.asInstanceOf[js.Any])
      
      inline def setSpiniconUndefined: Self = StObject.set(x, "spinicon", js.undefined)
      
      inline def setTitle(value: String | JQuery[HTMLElement]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DialogStatic extends StObject {
    
    def apply(options: DialogOptions): DialogContext = js.native
    
    var BUTTONS_ORDER_CANCEL_OK: String = js.native
    
    var BUTTONS_ORDER_OK_CANCEL: String = js.native
    
    var BUTTON_SIZES: Any = js.native
    
    var DEFAULT_TEXTS: Any = js.native
    
    /** For text localization. */
    var ICON_SPINNER: String = js.native
    
    var NAMESPACE: String = js.native
    
    var SIZE_LARGE: String = js.native
    
    var SIZE_NORMAL: String = js.native
    
    var SIZE_SMALL: String = js.native
    
    var SIZE_WIDE: String = js.native
    
    var TYPE_DANGER: String = js.native
    
    var TYPE_DEFAULT: String = js.native
    
    var TYPE_INFO: String = js.native
    
    var TYPE_PRIMARY: String = js.native
    
    var TYPE_SUCCESS: String = js.native
    
    var TYPE_WARNING: String = js.native
    
    def alert(message: String): Unit = js.native
    def alert(message: String, closeCallback: js.Function0[Unit]): Unit = js.native
    
    def confirm(message: String): Unit = js.native
    def confirm(message: String, closeCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
    
    def show(options: DialogOptions): DialogInstance = js.native
  }
}
