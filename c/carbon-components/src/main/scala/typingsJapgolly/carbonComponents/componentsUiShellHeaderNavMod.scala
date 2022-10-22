package typingsJapgolly.carbonComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUiShellHeaderNavMod {
  
  @JSImport("carbon-components/components/ui-shell/header-nav", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HeaderNav {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: HeaderNavOptions) = this()
    
    /* CompleteClass */
    override def _handleKeyDown(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def getCurrentNavigation(): Null | Element = js.native
    
    /* CompleteClass */
    override def navigate(direction: Double): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/ui-shell/header-nav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object NAVIGATE {
      
      @JSImport("carbon-components/components/ui-shell/header-nav", "default.NAVIGATE")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/ui-shell/header-nav", "default.NAVIGATE.BACKWARD")
      @js.native
      def BACKWARD: Double = js.native
      inline def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/ui-shell/header-nav", "default.NAVIGATE.FORWARD")
      @js.native
      def FORWARD: Double = js.native
      inline def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("carbon-components/components/ui-shell/header-nav", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait HeaderNav extends StObject {
    
    def _handleKeyDown(event: KeyboardEvent): Unit
    
    def getCurrentNavigation(): Null | Element
    
    def navigate(direction: Double): Unit
  }
  object HeaderNav {
    
    inline def apply(
      _handleKeyDown: KeyboardEvent => Callback,
      getCurrentNavigation: CallbackTo[Null | Element],
      navigate: Double => Callback
    ): HeaderNav = {
      val __obj = js.Dynamic.literal(_handleKeyDown = js.Any.fromFunction1((t0: KeyboardEvent) => _handleKeyDown(t0).runNow()), getCurrentNavigation = getCurrentNavigation.toJsFn, navigate = js.Any.fromFunction1((t0: Double) => navigate(t0).runNow()))
      __obj.asInstanceOf[HeaderNav]
    }
    
    extension [Self <: HeaderNav](x: Self) {
      
      inline def setGetCurrentNavigation(value: CallbackTo[Null | Element]): Self = StObject.set(x, "getCurrentNavigation", value.toJsFn)
      
      inline def setNavigate(value: Double => Callback): Self = StObject.set(x, "navigate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def set_handleKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "_handleKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    }
  }
  
  trait HeaderNavOptions extends StObject {
    
    var selectorInit: String
    
    var selectorNavKind: String
    
    var selectorSubmenu: String
    
    var selectorSubmenuItem: String
    
    var selectorSubmenuLink: String
  }
  object HeaderNavOptions {
    
    inline def apply(
      selectorInit: String,
      selectorNavKind: String,
      selectorSubmenu: String,
      selectorSubmenuItem: String,
      selectorSubmenuLink: String
    ): HeaderNavOptions = {
      val __obj = js.Dynamic.literal(selectorInit = selectorInit.asInstanceOf[js.Any], selectorNavKind = selectorNavKind.asInstanceOf[js.Any], selectorSubmenu = selectorSubmenu.asInstanceOf[js.Any], selectorSubmenuItem = selectorSubmenuItem.asInstanceOf[js.Any], selectorSubmenuLink = selectorSubmenuLink.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNavOptions]
    }
    
    extension [Self <: HeaderNavOptions](x: Self) {
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorNavKind(value: String): Self = StObject.set(x, "selectorNavKind", value.asInstanceOf[js.Any])
      
      inline def setSelectorSubmenu(value: String): Self = StObject.set(x, "selectorSubmenu", value.asInstanceOf[js.Any])
      
      inline def setSelectorSubmenuItem(value: String): Self = StObject.set(x, "selectorSubmenuItem", value.asInstanceOf[js.Any])
      
      inline def setSelectorSubmenuLink(value: String): Self = StObject.set(x, "selectorSubmenuLink", value.asInstanceOf[js.Any])
    }
  }
}
