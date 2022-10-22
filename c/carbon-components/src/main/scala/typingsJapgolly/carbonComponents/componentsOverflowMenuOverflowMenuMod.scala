package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.carbonComponents.anon.Left
import typingsJapgolly.carbonComponents.anon.PartialOverflowMenuOption
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsOverflowMenuOverflowMenuMod {
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OverflowMenu {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialOverflowMenuOption) = this()
    
    /* CompleteClass */
    override def _handleDocumentClick(event: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def _handleKeyPress(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): Null | Element = js.native
    
    /* CompleteClass */
    override def navigate(direction: Double): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  inline def getMenuOffset(menuBody: Element, direction: String, trigger: Element): js.UndefOr[Left] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuOffset")(menuBody.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Left]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait OverflowMenu extends StObject {
    
    def _handleDocumentClick(event: MouseEvent): Unit
    
    def _handleKeyPress(event: KeyboardEvent): Unit
    
    def changeState(state: String, detail: js.Object, callback: js.Function0[Unit]): Unit
    
    def getCurrentNavigation(): Null | Element
    
    def navigate(direction: Double): Unit
  }
  object OverflowMenu {
    
    inline def apply(
      _handleDocumentClick: MouseEvent => Callback,
      _handleKeyPress: KeyboardEvent => Callback,
      changeState: (String, js.Object, js.Function0[Unit]) => Callback,
      getCurrentNavigation: CallbackTo[Null | Element],
      navigate: Double => Callback
    ): OverflowMenu = {
      val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1((t0: MouseEvent) => _handleDocumentClick(t0).runNow()), _handleKeyPress = js.Any.fromFunction1((t0: KeyboardEvent) => _handleKeyPress(t0).runNow()), changeState = js.Any.fromFunction3((t0: String, t1: js.Object, t2: js.Function0[Unit]) => (changeState(t0, t1, t2)).runNow()), getCurrentNavigation = getCurrentNavigation.toJsFn, navigate = js.Any.fromFunction1((t0: Double) => navigate(t0).runNow()))
      __obj.asInstanceOf[OverflowMenu]
    }
    
    extension [Self <: OverflowMenu](x: Self) {
      
      inline def setChangeState(value: (String, js.Object, js.Function0[Unit]) => Callback): Self = StObject.set(x, "changeState", js.Any.fromFunction3((t0: String, t1: js.Object, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetCurrentNavigation(value: CallbackTo[Null | Element]): Self = StObject.set(x, "getCurrentNavigation", value.toJsFn)
      
      inline def setNavigate(value: Double => Callback): Self = StObject.set(x, "navigate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def set_handleDocumentClick(value: MouseEvent => Callback): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def set_handleKeyPress(value: KeyboardEvent => Callback): Self = StObject.set(x, "_handleKeyPress", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    }
  }
  
  trait OverflowMenuOptions extends StObject {
    
    var classMenuFlip: String
    
    var classMenuShown: String
    
    var classShown: String
    
    def objMenuOffset(menuBody: Element, direction: String, trigger: Element): js.UndefOr[Left]
    
    def objMenuOffsetFlip(menuBody: Element, direction: String, trigger: Element): js.UndefOr[Left]
    @JSName("objMenuOffsetFlip")
    var objMenuOffsetFlip_Original: js.Function3[
        /* menuBody */ Element, 
        /* direction */ String, 
        /* trigger */ Element, 
        js.UndefOr[Left]
      ]
    
    @JSName("objMenuOffset")
    var objMenuOffset_Original: js.Function3[
        /* menuBody */ Element, 
        /* direction */ String, 
        /* trigger */ Element, 
        js.UndefOr[Left]
      ]
    
    var selectorContent: String
    
    var selectorInit: String
    
    var selectorItem: String
    
    var selectorOptionMenu: String
    
    var selectorTrigger: String
  }
  object OverflowMenuOptions {
    
    inline def apply(
      classMenuFlip: String,
      classMenuShown: String,
      classShown: String,
      objMenuOffset: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left],
      objMenuOffsetFlip: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left],
      selectorContent: String,
      selectorInit: String,
      selectorItem: String,
      selectorOptionMenu: String,
      selectorTrigger: String
    ): OverflowMenuOptions = {
      val __obj = js.Dynamic.literal(classMenuFlip = classMenuFlip.asInstanceOf[js.Any], classMenuShown = classMenuShown.asInstanceOf[js.Any], classShown = classShown.asInstanceOf[js.Any], objMenuOffset = js.Any.fromFunction3(objMenuOffset), objMenuOffsetFlip = js.Any.fromFunction3(objMenuOffsetFlip), selectorContent = selectorContent.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorItem = selectorItem.asInstanceOf[js.Any], selectorOptionMenu = selectorOptionMenu.asInstanceOf[js.Any], selectorTrigger = selectorTrigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverflowMenuOptions]
    }
    
    extension [Self <: OverflowMenuOptions](x: Self) {
      
      inline def setClassMenuFlip(value: String): Self = StObject.set(x, "classMenuFlip", value.asInstanceOf[js.Any])
      
      inline def setClassMenuShown(value: String): Self = StObject.set(x, "classMenuShown", value.asInstanceOf[js.Any])
      
      inline def setClassShown(value: String): Self = StObject.set(x, "classShown", value.asInstanceOf[js.Any])
      
      inline def setObjMenuOffset(value: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left]): Self = StObject.set(x, "objMenuOffset", js.Any.fromFunction3(value))
      
      inline def setObjMenuOffsetFlip(value: (/* menuBody */ Element, /* direction */ String, /* trigger */ Element) => js.UndefOr[Left]): Self = StObject.set(x, "objMenuOffsetFlip", js.Any.fromFunction3(value))
      
      inline def setSelectorContent(value: String): Self = StObject.set(x, "selectorContent", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorItem(value: String): Self = StObject.set(x, "selectorItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorOptionMenu(value: String): Self = StObject.set(x, "selectorOptionMenu", value.asInstanceOf[js.Any])
      
      inline def setSelectorTrigger(value: String): Self = StObject.set(x, "selectorTrigger", value.asInstanceOf[js.Any])
    }
  }
}
