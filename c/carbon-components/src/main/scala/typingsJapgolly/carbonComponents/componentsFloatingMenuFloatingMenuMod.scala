package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.carbonComponents.anon.Direction
import typingsJapgolly.carbonComponents.anon.Left
import typingsJapgolly.carbonComponents.anon.PartialFloatingMenuOption
import typingsJapgolly.carbonComponents.anon.Partialleftnumbertopnumbe
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsFloatingMenuFloatingMenuMod {
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FloatingMenu {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialFloatingMenuOption) = this()
    
    /* CompleteClass */
    override def _changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def _getContainer(): HTMLElement = js.native
    
    /* CompleteClass */
    override def _getPos(): Left = js.native
    
    /* CompleteClass */
    override def _handleKeydown(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def _place(): Unit = js.native
    
    /* CompleteClass */
    override def _testStyles(): Unit = js.native
    
    /* CompleteClass */
    override def handleBlur(event: FocusEvent): Unit = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
    
    /* CompleteClass */
    override def shouldStateBeChanged(state: String): Boolean = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/floating-menu/floating-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/floating-menu/floating-menu", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options")
    @js.native
    def options: FloatingMenuOptions = js.native
    inline def options_=(x: FloatingMenuOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_BOTTOM")
  @js.native
  val DIRECTION_BOTTOM: /* "bottom" */ String = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_LEFT")
  @js.native
  val DIRECTION_LEFT: /* "left" */ String = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_RIGHT")
  @js.native
  val DIRECTION_RIGHT: /* "right" */ String = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_TOP")
  @js.native
  val DIRECTION_TOP: /* "top" */ String = js.native
  
  inline def getFloatingPosition(hasMenuSizeRefPositionOffsetDirectionScrollXScrollY: Direction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFloatingPosition")(hasMenuSizeRefPositionOffsetDirectionScrollXScrollY.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait FloatingMenu extends StObject {
    
    def _changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit
    
    def _getContainer(): HTMLElement
    
    def _getPos(): Left
    
    def _handleKeydown(event: KeyboardEvent): Unit
    
    def _place(): Unit
    
    def _testStyles(): Unit
    
    def handleBlur(event: FocusEvent): Unit
    
    def release(): Unit
    
    def shouldStateBeChanged(state: String): Boolean
  }
  object FloatingMenu {
    
    inline def apply(
      _changeState: (String, js.Object, js.Function0[Unit]) => Callback,
      _getContainer: CallbackTo[HTMLElement],
      _getPos: CallbackTo[Left],
      _handleKeydown: KeyboardEvent => Callback,
      _place: Callback,
      _testStyles: Callback,
      handleBlur: FocusEvent => Callback,
      release: Callback,
      shouldStateBeChanged: String => Boolean
    ): FloatingMenu = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction3((t0: String, t1: js.Object, t2: js.Function0[Unit]) => (_changeState(t0, t1, t2)).runNow()), _getContainer = _getContainer.toJsFn, _getPos = _getPos.toJsFn, _handleKeydown = js.Any.fromFunction1((t0: KeyboardEvent) => _handleKeydown(t0).runNow()), _place = _place.toJsFn, _testStyles = _testStyles.toJsFn, handleBlur = js.Any.fromFunction1((t0: FocusEvent) => handleBlur(t0).runNow()), release = release.toJsFn, shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
      __obj.asInstanceOf[FloatingMenu]
    }
    
    extension [Self <: FloatingMenu](x: Self) {
      
      inline def setHandleBlur(value: FocusEvent => Callback): Self = StObject.set(x, "handleBlur", js.Any.fromFunction1((t0: FocusEvent) => value(t0).runNow()))
      
      inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
      
      inline def setShouldStateBeChanged(value: String => Boolean): Self = StObject.set(x, "shouldStateBeChanged", js.Any.fromFunction1(value))
      
      inline def set_changeState(value: (String, js.Object, js.Function0[Unit]) => Callback): Self = StObject.set(x, "_changeState", js.Any.fromFunction3((t0: String, t1: js.Object, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def set_getContainer(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "_getContainer", value.toJsFn)
      
      inline def set_getPos(value: CallbackTo[Left]): Self = StObject.set(x, "_getPos", value.toJsFn)
      
      inline def set_handleKeydown(value: KeyboardEvent => Callback): Self = StObject.set(x, "_handleKeydown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def set_place(value: Callback): Self = StObject.set(x, "_place", value.toJsFn)
      
      inline def set_testStyles(value: Callback): Self = StObject.set(x, "_testStyles", value.toJsFn)
    }
  }
  
  trait FloatingMenuOptions extends StObject {
    
    var attribAvoidFocusOnOpen: String
    
    var attribDirection: String
    
    var classRefShown: String
    
    var classShown: String
    
    var eventAfterHidden: String
    
    var eventAfterShown: String
    
    var eventBeforeHidden: String
    
    var eventBeforeShown: String
    
    var offset: Partialleftnumbertopnumbe
    
    var refNode: HTMLElement
    
    var selectorContainer: String
    
    var selectorPrimaryFocus: String
  }
  object FloatingMenuOptions {
    
    inline def apply(
      attribAvoidFocusOnOpen: String,
      attribDirection: String,
      classRefShown: String,
      classShown: String,
      eventAfterHidden: String,
      eventAfterShown: String,
      eventBeforeHidden: String,
      eventBeforeShown: String,
      offset: Partialleftnumbertopnumbe,
      refNode: HTMLElement,
      selectorContainer: String,
      selectorPrimaryFocus: String
    ): FloatingMenuOptions = {
      val __obj = js.Dynamic.literal(attribAvoidFocusOnOpen = attribAvoidFocusOnOpen.asInstanceOf[js.Any], attribDirection = attribDirection.asInstanceOf[js.Any], classRefShown = classRefShown.asInstanceOf[js.Any], classShown = classShown.asInstanceOf[js.Any], eventAfterHidden = eventAfterHidden.asInstanceOf[js.Any], eventAfterShown = eventAfterShown.asInstanceOf[js.Any], eventBeforeHidden = eventBeforeHidden.asInstanceOf[js.Any], eventBeforeShown = eventBeforeShown.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], refNode = refNode.asInstanceOf[js.Any], selectorContainer = selectorContainer.asInstanceOf[js.Any], selectorPrimaryFocus = selectorPrimaryFocus.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatingMenuOptions]
    }
    
    extension [Self <: FloatingMenuOptions](x: Self) {
      
      inline def setAttribAvoidFocusOnOpen(value: String): Self = StObject.set(x, "attribAvoidFocusOnOpen", value.asInstanceOf[js.Any])
      
      inline def setAttribDirection(value: String): Self = StObject.set(x, "attribDirection", value.asInstanceOf[js.Any])
      
      inline def setClassRefShown(value: String): Self = StObject.set(x, "classRefShown", value.asInstanceOf[js.Any])
      
      inline def setClassShown(value: String): Self = StObject.set(x, "classShown", value.asInstanceOf[js.Any])
      
      inline def setEventAfterHidden(value: String): Self = StObject.set(x, "eventAfterHidden", value.asInstanceOf[js.Any])
      
      inline def setEventAfterShown(value: String): Self = StObject.set(x, "eventAfterShown", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeHidden(value: String): Self = StObject.set(x, "eventBeforeHidden", value.asInstanceOf[js.Any])
      
      inline def setEventBeforeShown(value: String): Self = StObject.set(x, "eventBeforeShown", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Partialleftnumbertopnumbe): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRefNode(value: HTMLElement): Self = StObject.set(x, "refNode", value.asInstanceOf[js.Any])
      
      inline def setSelectorContainer(value: String): Self = StObject.set(x, "selectorContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectorPrimaryFocus(value: String): Self = StObject.set(x, "selectorPrimaryFocus", value.asInstanceOf[js.Any])
    }
  }
}
