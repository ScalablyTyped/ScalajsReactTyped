package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDropdownDropdownMod {
  
  @JSImport("carbon-components/components/dropdown/dropdown", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Dropdown {
    def this(element: HTMLElement, options: DropdownOptions) = this()
    
    /* CompleteClass */
    override def _focusCleanup(): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _toggle(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _updateFocus(itemToFocus: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): js.UndefOr[HTMLElement] = js.native
    
    /* CompleteClass */
    override def handleBlur(): Unit = js.native
    
    /* CompleteClass */
    override def navigate(direction: Double): Unit = js.native
    
    /* CompleteClass */
    override def select(itemToSelect: HTMLElement): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/dropdown/dropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object NAVIGATE {
      
      @JSImport("carbon-components/components/dropdown/dropdown", "default.NAVIGATE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/dropdown/dropdown", "default.NAVIGATE.BACKWARD")
      @js.native
      def BACKWARD: Double = js.native
      inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/dropdown/dropdown", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/dropdown/dropdown", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Dropdown extends StObject {
    
    def _focusCleanup(): Unit
    
    def _handleKeyDown(event: KeyboardEvent): Unit
    
    def _toggle(event: MouseEvent): Unit
    
    def _updateFocus(itemToFocus: HTMLElement): Unit
    
    def getCurrentNavigation(): js.UndefOr[HTMLElement]
    
    def handleBlur(): Unit
    
    def navigate(direction: Double): Unit
    
    def select(itemToSelect: HTMLElement): Unit
  }
  object Dropdown {
    
    inline def apply(
      _focusCleanup: Callback,
      _handleKeyDown: KeyboardEvent => Callback,
      _toggle: MouseEvent => Callback,
      _updateFocus: HTMLElement => Callback,
      getCurrentNavigation: CallbackTo[js.UndefOr[HTMLElement]],
      handleBlur: Callback,
      navigate: Double => Callback,
      select: HTMLElement => Callback
    ): Dropdown = {
      val __obj = js.Dynamic.literal(_focusCleanup = _focusCleanup.toJsFn, _handleKeyDown = js.Any.fromFunction1((t0: KeyboardEvent) => _handleKeyDown(t0).runNow()), _toggle = js.Any.fromFunction1((t0: MouseEvent) => _toggle(t0).runNow()), _updateFocus = js.Any.fromFunction1((t0: HTMLElement) => _updateFocus(t0).runNow()), getCurrentNavigation = getCurrentNavigation.toJsFn, handleBlur = handleBlur.toJsFn, navigate = js.Any.fromFunction1((t0: Double) => navigate(t0).runNow()), select = js.Any.fromFunction1((t0: HTMLElement) => select(t0).runNow()))
      __obj.asInstanceOf[Dropdown]
    }
    
    extension [Self <: Dropdown](x: Self) {
      
      inline def setGetCurrentNavigation(value: CallbackTo[js.UndefOr[HTMLElement]]): Self = StObject.set(x, "getCurrentNavigation", value.toJsFn)
      
      inline def setHandleBlur(value: Callback): Self = StObject.set(x, "handleBlur", value.toJsFn)
      
      inline def setNavigate(value: Double => Callback): Self = StObject.set(x, "navigate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSelect(value: HTMLElement => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def set_focusCleanup(value: Callback): Self = StObject.set(x, "_focusCleanup", value.toJsFn)
      
      inline def set_handleKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def set_toggle(value: MouseEvent => Callback): Self = StObject.set(x, "_toggle", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def set_updateFocus(value: HTMLElement => Callback): Self = StObject.set(x, "_updateFocus", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    }
  }
  
  trait DropdownOptions extends StObject {
    
    var classDisabled: String
    
    var classFocused: String
    
    var classOpen: String
    
    var classSelected: String
    
    var classShowSelected: String
    
    var eventAfterSelected: String
    
    var eventBeforeSelected: String
    
    var selectorInit: String
    
    var selectorItem: String
    
    var selectorItemFocused: String
    
    var selectorItemHidden: String
    
    var selectorItemSelected: String
    
    var selectorLinkSelected: String
    
    var selectorMenu: String
    
    var selectorText: String
    
    var selectorTextInner: String
    
    var selectorTrigger: String
  }
  object DropdownOptions {
    
    inline def apply(
      classDisabled: String,
      classFocused: String,
      classOpen: String,
      classSelected: String,
      classShowSelected: String,
      eventAfterSelected: String,
      eventBeforeSelected: String,
      selectorInit: String,
      selectorItem: String,
      selectorItemFocused: String,
      selectorItemHidden: String,
      selectorItemSelected: String,
      selectorLinkSelected: String,
      selectorMenu: String,
      selectorText: String,
      selectorTextInner: String,
      selectorTrigger: String
    ): DropdownOptions = {
      val __obj = js.Dynamic.literal(classDisabled = classDisabled.asInstanceOf[js.Any], classFocused = classFocused.asInstanceOf[js.Any], classOpen = classOpen.asInstanceOf[js.Any], classSelected = classSelected.asInstanceOf[js.Any], classShowSelected = classShowSelected.asInstanceOf[js.Any], eventAfterSelected = eventAfterSelected.asInstanceOf[js.Any], eventBeforeSelected = eventBeforeSelected.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItem = selectorItem.asInstanceOf[js.Any], selectorItemFocused = selectorItemFocused.asInstanceOf[js.Any], selectorItemHidden = selectorItemHidden.asInstanceOf[js.Any], selectorItemSelected = selectorItemSelected.asInstanceOf[js.Any], selectorLinkSelected = selectorLinkSelected.asInstanceOf[js.Any], selectorMenu = selectorMenu.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], selectorTextInner = selectorTextInner.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownOptions]
    }
    
    extension [Self <: DropdownOptions](x: Self) {
      
      inline def setClassDisabled(value: String): Self = StObject.set(x, "classDisabled", value.asInstanceOf[js.Any])
      
      inline def setClassFocused(value: String): Self = StObject.set(x, "classFocused", value.asInstanceOf[js.Any])
      
      inline def setClassOpen(value: String): Self = StObject.set(x, "classOpen", value.asInstanceOf[js.Any])
      
      inline def setClassSelected(value: String): Self = StObject.set(x, "classSelected", value.asInstanceOf[js.Any])
      
      inline def setClassShowSelected(value: String): Self = StObject.set(x, "classShowSelected", value.asInstanceOf[js.Any])
      
      inline def setEventAfterSelected(value: String): Self = StObject.set(x, "eventAfterSelected", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeSelected(value: String): Self = StObject.set(x, "eventBeforeSelected", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorItem(value: String): Self = StObject.set(x, "selectorItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorItemFocused(value: String): Self = StObject.set(x, "selectorItemFocused", value.asInstanceOf[js.Any])
      
      inline def setSelectorItemHidden(value: String): Self = StObject.set(x, "selectorItemHidden", value.asInstanceOf[js.Any])
      
      inline def setSelectorItemSelected(value: String): Self = StObject.set(x, "selectorItemSelected", value.asInstanceOf[js.Any])
      
      inline def setSelectorLinkSelected(value: String): Self = StObject.set(x, "selectorLinkSelected", value.asInstanceOf[js.Any])
      
      inline def setSelectorMenu(value: String): Self = StObject.set(x, "selectorMenu", value.asInstanceOf[js.Any])
      
      inline def setSelectorText(value: String): Self = StObject.set(x, "selectorText", value.asInstanceOf[js.Any])
      
      inline def setSelectorTextInner(value: String): Self = StObject.set(x, "selectorTextInner", value.asInstanceOf[js.Any])
      
      inline def setSelectorTrigger(value: String): Self = StObject.set(x, "selectorTrigger", value.asInstanceOf[js.Any])
    }
  }
}
