package typingsJapgolly.durandal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.durandal.compositionMod.CompositionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The dialog module enables the display of message boxes, custom modal dialogs and other overlays or slide-out UI abstractions. Dialogs are constructed by the composition system which interacts with a user defined dialog context. The dialog module enforced the activator lifecycle.
  * @requires system
  * @requires app
  * @requires composition
  * @requires activator
  * @requires viewEngine
  * @requires jquery
  * @requires knockout
  */
object pluginsDialogMod {
  
  @JSImport("plugins/dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plugins/dialog", "MessageBox")
  @js.native
  def MessageBox: Box = js.native
  inline def MessageBox_=(x: Box): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageBox")(x.asInstanceOf[js.Any])
  
  inline def addContext(name: String, modalContext: DialogContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContext")(name.asInstanceOf[js.Any], modalContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def close(obj: Any, results: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(scala.List(obj.asInstanceOf[js.Any]).`++`(results.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  @JSImport("plugins/dialog", "currentZIndex")
  @js.native
  def currentZIndex: Double = js.native
  inline def currentZIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentZIndex")(x.asInstanceOf[js.Any])
  
  inline def getContext(): DialogContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[DialogContext]
  inline def getContext(name: String): DialogContext = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(name.asInstanceOf[js.Any]).asInstanceOf[DialogContext]
  
  inline def getDialog(obj: Any): Dialog = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialog")(obj.asInstanceOf[js.Any]).asInstanceOf[Dialog]
  
  inline def getNextZIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextZIndex")().asInstanceOf[Double]
  
  inline def install(config: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isOpen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")().asInstanceOf[Boolean]
  
  inline def show(obj: Any): DurandalPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any]).asInstanceOf[DurandalPromise[Any]]
  inline def show(obj: Any, activationData: Any): DurandalPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any], activationData.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[Any]]
  inline def show(obj: Any, activationData: Any, context: String): DurandalPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any], activationData.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[Any]]
  inline def show(obj: Any, activationData: Unit, context: String): DurandalPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(obj.asInstanceOf[js.Any], activationData.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[Any]]
  
  inline def showMessage(message: String): DurandalPromise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any]).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: js.Array[DialogButton | String]): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Unit,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: Unit, autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: Unit, autoclose: Boolean, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: String, options: Unit, autoclose: Unit, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: js.Array[DialogButton | String]): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: Unit,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(
    message: String,
    title: Unit,
    options: js.Array[DialogButton | String],
    autoclose: Unit,
    settings: js.Object
  ): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: Unit, autoclose: Boolean): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: Unit, autoclose: Boolean, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  inline def showMessage(message: String, title: Unit, options: Unit, autoclose: Unit, settings: js.Object): DurandalPromise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMessage")(message.asInstanceOf[js.Any], title.asInstanceOf[js.Any], options.asInstanceOf[js.Any], autoclose.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[String]]
  
  /**
    * Models a message box's message, title and options.
    * @class
    */
  trait Box extends StObject {
    
    /**
      * Provides the view to the composition system.
      * @returns {DOMElement} The view of the message box.
      */
    def getView(): HTMLElement
    
    /**
      * Selects an option and closes the message box, returning the selected option through the dialog system's promise.
      * @param {string} dialogResult The result to select.
      */
    def selectOption(dialogResult: String): Unit
  }
  object Box {
    
    inline def apply(getView: CallbackTo[HTMLElement], selectOption: String => Callback): Box = {
      val __obj = js.Dynamic.literal(getView = getView.toJsFn, selectOption = js.Any.fromFunction1((t0: String) => selectOption(t0).runNow()))
      __obj.asInstanceOf[Box]
    }
    
    extension [Self <: Box](x: Self) {
      
      inline def setGetView(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getView", value.toJsFn)
      
      inline def setSelectOption(value: String => Callback): Self = StObject.set(x, "selectOption", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait Dialog extends StObject {
    
    var activator: DurandalActivator[Any]
    
    def close(): DurandalPromise[Any]
    
    var context: DialogContext
    
    var host: HTMLElement
    
    var owner: Any
    
    var settings: CompositionContext
  }
  object Dialog {
    
    inline def apply(
      activator: DurandalActivator[Any],
      close: CallbackTo[DurandalPromise[Any]],
      context: DialogContext,
      host: HTMLElement,
      owner: Any,
      settings: CompositionContext
    ): Dialog = {
      val __obj = js.Dynamic.literal(activator = activator.asInstanceOf[js.Any], close = close.toJsFn, context = context.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dialog]
    }
    
    extension [Self <: Dialog](x: Self) {
      
      inline def setActivator(value: DurandalActivator[Any]): Self = StObject.set(x, "activator", value.asInstanceOf[js.Any])
      
      inline def setClose(value: CallbackTo[DurandalPromise[Any]]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setContext(value: DialogContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: CompositionContext): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialogContext extends StObject {
    
    /**
      * In this function, you are expected to add a DOM element to the tree which will serve as the "host" for the modal's composed view. You must add a property called host to the modalWindow object which references the dom element. It is this host which is passed to the composition module.
      * @param {Dialog} theDialog The dialog model.
      */
    def addHost(theDialog: Dialog): Unit
    
    /**
      * Opacity of the blockout. The default is 0.6.
      */
    var blockoutOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * This function is called after the modal is fully composed into the DOM, allowing your implementation to do any final modifications, such as positioning or animation. You can obtain the original dialog object by using `getDialog` on context.model.
      * @param {DOMElement} child The dialog view.
      * @param {DOMElement} parent The parent view.
      * @param {object} context The composition context.
      */
    def compositionComplete(child: HTMLElement, parent: HTMLElement, context: CompositionContext): Unit
    
    /**
      * This function is expected to remove any DOM machinery associated with the specified dialog and do any other necessary cleanup.
      * @param {Dialog} theDialog The dialog model.
      */
    def removeHost(theDialog: Dialog): Unit
  }
  object DialogContext {
    
    inline def apply(
      addHost: Dialog => Callback,
      compositionComplete: (HTMLElement, HTMLElement, CompositionContext) => Callback,
      removeHost: Dialog => Callback
    ): DialogContext = {
      val __obj = js.Dynamic.literal(addHost = js.Any.fromFunction1((t0: Dialog) => addHost(t0).runNow()), compositionComplete = js.Any.fromFunction3((t0: HTMLElement, t1: HTMLElement, t2: CompositionContext) => (compositionComplete(t0, t1, t2)).runNow()), removeHost = js.Any.fromFunction1((t0: Dialog) => removeHost(t0).runNow()))
      __obj.asInstanceOf[DialogContext]
    }
    
    extension [Self <: DialogContext](x: Self) {
      
      inline def setAddHost(value: Dialog => Callback): Self = StObject.set(x, "addHost", js.Any.fromFunction1((t0: Dialog) => value(t0).runNow()))
      
      inline def setBlockoutOpacity(value: Double): Self = StObject.set(x, "blockoutOpacity", value.asInstanceOf[js.Any])
      
      inline def setBlockoutOpacityUndefined: Self = StObject.set(x, "blockoutOpacity", js.undefined)
      
      inline def setCompositionComplete(value: (HTMLElement, HTMLElement, CompositionContext) => Callback): Self = StObject.set(x, "compositionComplete", js.Any.fromFunction3((t0: HTMLElement, t1: HTMLElement, t2: CompositionContext) => (value(t0, t1, t2)).runNow()))
      
      inline def setRemoveHost(value: Dialog => Callback): Self = StObject.set(x, "removeHost", js.Any.fromFunction1((t0: Dialog) => value(t0).runNow()))
    }
  }
}
