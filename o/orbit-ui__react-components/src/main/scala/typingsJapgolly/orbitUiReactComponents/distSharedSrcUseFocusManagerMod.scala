package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.anon.From
import typingsJapgolly.orbitUiReactComponents.anon.OmitFocusManagerOptionson
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseFocusManagerMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", "ElementIterator")
  @js.native
  open class ElementIterator[T] protected () extends StObject {
    def this(elements: js.Array[T]) = this()
    def this(elements: js.Array[T], hasFrom: From) = this()
    
    def currentIndex: Double = js.native
    
    /* private */ var elements: Any = js.native
    
    /* private */ var index: Any = js.native
    
    def next(): T = js.native
    
    def previous(): T = js.native
    
    def reset(): Unit = js.native
    def reset(hasFrom: From): Unit = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", "FocusManager")
  @js.native
  open class FocusManager protected () extends StObject {
    def this(scope: DomScope) = this()
    def this(scope: DomScope, hasIsVirtualKeyPropOnFocus: FocusManagerOptions) = this()
    
    def elements: js.Array[HTMLElement] = js.native
    
    /* private */ var focusElement: Any = js.native
    
    def focusFirst(): HTMLElement = js.native
    def focusFirst(hasCanFocusOptions: FocusOptions): HTMLElement = js.native
    
    def focusKey(key: String): HTMLElement = js.native
    def focusKey(key: String, options: FocusOptions): HTMLElement = js.native
    
    def focusLast(): HTMLElement = js.native
    def focusLast(hasCanFocusOptions: FocusOptions): HTMLElement = js.native
    
    def focusNext(): HTMLElement = js.native
    def focusNext(hasCanFocusOptions: FocusOptions): HTMLElement = js.native
    
    def focusPrevious(): HTMLElement = js.native
    def focusPrevious(hasCanFocusOptions: FocusOptions): HTMLElement = js.native
    
    def focusTarget(target: String): HTMLElement = js.native
    def focusTarget(target: String, options: FocusOptions): HTMLElement = js.native
    
    def getActiveElement(): Element = js.native
    
    def isInScope(element: HTMLElement): Boolean = js.native
    
    /* private */ var isVirtual: Any = js.native
    
    /* private */ var keyProp: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var scope: Any = js.native
    
    def search(query: String): HTMLElement = js.native
    def search(query: String, options: FocusOptions): HTMLElement = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useFocusManager", "VirtualFocusCssClass")
  @js.native
  val VirtualFocusCssClass: /* "o-ui-focus" */ String = js.native
  
  inline def useFocusManager(scope: DomScope): FocusManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any]).asInstanceOf[FocusManager]
  inline def useFocusManager(scope: DomScope, hasIsVirtualKeyPropOnFocus: FocusManagerOptions): FocusManager = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any], hasIsVirtualKeyPropOnFocus.asInstanceOf[js.Any])).asInstanceOf[FocusManager]
  
  trait FocusManagerOptions extends StObject {
    
    var isVirtual: js.UndefOr[Boolean] = js.undefined
    
    var keyProp: js.UndefOr[String] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function2[/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson, Unit]
      ] = js.undefined
  }
  object FocusManagerOptions {
    
    inline def apply(): FocusManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusManagerOptions]
    }
    
    extension [Self <: FocusManagerOptions](x: Self) {
      
      inline def setIsVirtual(value: Boolean): Self = StObject.set(x, "isVirtual", value.asInstanceOf[js.Any])
      
      inline def setIsVirtualUndefined: Self = StObject.set(x, "isVirtual", js.undefined)
      
      inline def setKeyProp(value: String): Self = StObject.set(x, "keyProp", value.asInstanceOf[js.Any])
      
      inline def setKeyPropUndefined: Self = StObject.set(x, "keyProp", js.undefined)
      
      inline def setOnFocus(value: (/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson) => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction2((t0: /* activeElement */ HTMLElement, t1: /* options */ OmitFocusManagerOptionson) => (value(t0, t1)).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  trait FocusOptions extends StObject {
    
    var canFocus: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function2[/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson, Unit]
      ] = js.undefined
    
    var onNotFound: js.UndefOr[js.Function1[/* options */ OmitFocusManagerOptionson, Unit]] = js.undefined
  }
  object FocusOptions {
    
    inline def apply(): FocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOptions]
    }
    
    extension [Self <: FocusOptions](x: Self) {
      
      inline def setCanFocus(value: /* element */ HTMLElement => Boolean): Self = StObject.set(x, "canFocus", js.Any.fromFunction1(value))
      
      inline def setCanFocusUndefined: Self = StObject.set(x, "canFocus", js.undefined)
      
      inline def setOnFocus(value: (/* activeElement */ HTMLElement, /* options */ OmitFocusManagerOptionson) => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction2((t0: /* activeElement */ HTMLElement, t1: /* options */ OmitFocusManagerOptionson) => (value(t0, t1)).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnNotFound(value: /* options */ OmitFocusManagerOptionson => Callback): Self = StObject.set(x, "onNotFound", js.Any.fromFunction1((t0: /* options */ OmitFocusManagerOptionson) => value(t0).runNow()))
      
      inline def setOnNotFoundUndefined: Self = StObject.set(x, "onNotFound", js.undefined)
    }
  }
}
