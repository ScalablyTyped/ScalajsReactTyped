package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialModalOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsModalModalMod {
  
  @JSImport("carbon-components/components/modal/modal", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Modal {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialModalOptions) = this()
    
    /* CompleteClass */
    override def _changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def _handleFocusin(evt: FocusEvent): Unit = js.native
    
    /* CompleteClass */
    var _handleFocusinListener: Any = js.native
    
    /* CompleteClass */
    var _handleKeydownListener: Any = js.native
    
    /* CompleteClass */
    override def _hookCloseActions(): Unit = js.native
    
    /* CompleteClass */
    override def createdByLauncher(evt: Event): Unit = js.native
    
    /* CompleteClass */
    override def shouldStateBeChanged(state: String): Boolean = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/modal/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/modal/modal", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Modal extends StObject {
    
    def _changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit
    
    def _handleFocusin(evt: FocusEvent): Unit
    
    var _handleFocusinListener: Any
    
    var _handleKeydownListener: Any
    
    def _hookCloseActions(): Unit
    
    def createdByLauncher(evt: Event): Unit
    
    def shouldStateBeChanged(state: String): Boolean
  }
  object Modal {
    
    inline def apply(
      _changeState: (String, js.Object, js.Function0[Unit]) => Callback,
      _handleFocusin: FocusEvent => Callback,
      _handleFocusinListener: Any,
      _handleKeydownListener: Any,
      _hookCloseActions: Callback,
      createdByLauncher: Event => Callback,
      shouldStateBeChanged: String => Boolean
    ): Modal = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction3((t0: String, t1: js.Object, t2: js.Function0[Unit]) => (_changeState(t0, t1, t2)).runNow()), _handleFocusin = js.Any.fromFunction1((t0: FocusEvent) => _handleFocusin(t0).runNow()), _handleFocusinListener = _handleFocusinListener.asInstanceOf[js.Any], _handleKeydownListener = _handleKeydownListener.asInstanceOf[js.Any], _hookCloseActions = _hookCloseActions.toJsFn, createdByLauncher = js.Any.fromFunction1((t0: Event) => createdByLauncher(t0).runNow()), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
      __obj.asInstanceOf[Modal]
    }
    
    extension [Self <: Modal](x: Self) {
      
      inline def setCreatedByLauncher(value: Event => Callback): Self = StObject.set(x, "createdByLauncher", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setShouldStateBeChanged(value: String => Boolean): Self = StObject.set(x, "shouldStateBeChanged", js.Any.fromFunction1(value))
      
      inline def set_changeState(value: (String, js.Object, js.Function0[Unit]) => Callback): Self = StObject.set(x, "_changeState", js.Any.fromFunction3((t0: String, t1: js.Object, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def set_handleFocusin(value: FocusEvent => Callback): Self = StObject.set(x, "_handleFocusin", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
      
      inline def set_handleFocusinListener(value: Any): Self = StObject.set(x, "_handleFocusinListener", value.asInstanceOf[js.Any])
      
      inline def set_handleKeydownListener(value: Any): Self = StObject.set(x, "_handleKeydownListener", value.asInstanceOf[js.Any])
      
      inline def set_hookCloseActions(value: Callback): Self = StObject.set(x, "_hookCloseActions", value.toJsFn)
    }
  }
  
  trait ModalOptions extends StObject {
    
    var attribInitTarget: String
    
    var classBody: String
    
    var classVisible: String
    
    var eventAfterHidden: String
    
    var eventAfterShown: String
    
    var eventBeforeHidden: String
    
    var eventBeforeShown: String
    
    var initEventNames: js.Array[String]
    
    var selectorInit: String
    
    var selectorModalClose: String
    
    var selectorModalContainer: String
    
    var selectorPrimaryFocus: String
    
    var selectorsFloatingMenus: js.Array[String]
  }
  object ModalOptions {
    
    inline def apply(
      attribInitTarget: String,
      classBody: String,
      classVisible: String,
      eventAfterHidden: String,
      eventAfterShown: String,
      eventBeforeHidden: String,
      eventBeforeShown: String,
      initEventNames: js.Array[String],
      selectorInit: String,
      selectorModalClose: String,
      selectorModalContainer: String,
      selectorPrimaryFocus: String,
      selectorsFloatingMenus: js.Array[String]
    ): ModalOptions = {
      val __obj = js.Dynamic.literal(attribInitTarget = attribInitTarget.asInstanceOf[js.Any], classBody = classBody.asInstanceOf[js.Any], classVisible = classVisible.asInstanceOf[js.Any], eventAfterHidden = eventAfterHidden.asInstanceOf[js.Any], eventAfterShown = eventAfterShown.asInstanceOf[js.Any], eventBeforeHidden = eventBeforeHidden.asInstanceOf[js.Any], eventBeforeShown = eventBeforeShown.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorModalClose = selectorModalClose.asInstanceOf[js.Any], selectorModalContainer = selectorModalContainer.asInstanceOf[js.Any], selectorPrimaryFocus = selectorPrimaryFocus.asInstanceOf[js.Any], selectorsFloatingMenus = selectorsFloatingMenus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalOptions]
    }
    
    extension [Self <: ModalOptions](x: Self) {
      
      inline def setAttribInitTarget(value: String): Self = StObject.set(x, "attribInitTarget", value.asInstanceOf[js.Any])
      
      inline def setClassBody(value: String): Self = StObject.set(x, "classBody", value.asInstanceOf[js.Any])
      
      inline def setClassVisible(value: String): Self = StObject.set(x, "classVisible", value.asInstanceOf[js.Any])
      
      inline def setEventAfterHidden(value: String): Self = StObject.set(x, "eventAfterHidden", value.asInstanceOf[js.Any])
      
      inline def setEventAfterShown(value: String): Self = StObject.set(x, "eventAfterShown", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeHidden(value: String): Self = StObject.set(x, "eventBeforeHidden", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeShown(value: String): Self = StObject.set(x, "eventBeforeShown", value.asInstanceOf[js.Any])
      
      inline def setInitEventNames(value: js.Array[String]): Self = StObject.set(x, "initEventNames", value.asInstanceOf[js.Any])
      
      inline def setInitEventNamesVarargs(value: String*): Self = StObject.set(x, "initEventNames", js.Array(value*))
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorModalClose(value: String): Self = StObject.set(x, "selectorModalClose", value.asInstanceOf[js.Any])
      
      inline def setSelectorModalContainer(value: String): Self = StObject.set(x, "selectorModalContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectorPrimaryFocus(value: String): Self = StObject.set(x, "selectorPrimaryFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectorsFloatingMenus(value: js.Array[String]): Self = StObject.set(x, "selectorsFloatingMenus", value.asInstanceOf[js.Any])
      
      inline def setSelectorsFloatingMenusVarargs(value: String*): Self = StObject.set(x, "selectorsFloatingMenus", js.Array(value*))
    }
  }
}
