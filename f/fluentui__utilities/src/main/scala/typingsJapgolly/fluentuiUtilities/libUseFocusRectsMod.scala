package typingsJapgolly.fluentuiUtilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import typingsJapgolly.fluentuiUtilities.anon.RootRef
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFocusRectsMod {
  
  @JSImport("@fluentui/utilities/lib/useFocusRects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/utilities/lib/useFocusRects", "FocusRects")
  @js.native
  val FocusRects: FunctionComponent[RootRef] = js.native
  
  @JSImport("@fluentui/utilities/lib/useFocusRects", "FocusRectsContext")
  @js.native
  val FocusRectsContext: Context[js.UndefOr[IFocusRectsContext]] = js.native
  
  inline def useFocusRects(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")().asInstanceOf[Unit]
  inline def useFocusRects(rootRef: RefHandle[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")(rootRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IFocusRectsContext extends StObject {
    
    /**
      * Ref to the root element of the provider
      */
    val providerRef: RefHandle[HTMLElement]
    
    /**
      * Used by child FocusRectsProviders to register their element with the parent provider.
      */
    def registerProvider(ref: RefHandle[HTMLElement]): Unit
    
    /**
      * Array of this and all child provider elements under this one in the React tree.
      *
      * Tracking all child providers will allow a focus event in the parent to also set focus styling in its descendants.
      * This is needed for Combobox, for example, because the focus events happen on the parent context, but the visual
      * focus indicator is in the combobox callout. The callout needs to be notified on focus events from the parent.
      */
    val registeredProviders: js.Array[RefHandle[HTMLElement]]
    
    /**
      * Used by child FocusRectsProviders to unregister their element from the parent provider.
      */
    def unregisterProvider(ref: RefHandle[HTMLElement]): Unit
  }
  object IFocusRectsContext {
    
    inline def apply(
      providerRef: RefHandle[HTMLElement],
      registerProvider: RefHandle[HTMLElement] => Callback,
      registeredProviders: js.Array[RefHandle[HTMLElement]],
      unregisterProvider: RefHandle[HTMLElement] => Callback
    ): IFocusRectsContext = {
      val __obj = js.Dynamic.literal(providerRef = providerRef.asInstanceOf[js.Any], registerProvider = js.Any.fromFunction1((t0: RefHandle[HTMLElement]) => registerProvider(t0).runNow()), registeredProviders = registeredProviders.asInstanceOf[js.Any], unregisterProvider = js.Any.fromFunction1((t0: RefHandle[HTMLElement]) => unregisterProvider(t0).runNow()))
      __obj.asInstanceOf[IFocusRectsContext]
    }
    
    extension [Self <: IFocusRectsContext](x: Self) {
      
      inline def setProviderRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "providerRef", value.asInstanceOf[js.Any])
      
      inline def setRegisterProvider(value: RefHandle[HTMLElement] => Callback): Self = StObject.set(x, "registerProvider", js.Any.fromFunction1((t0: RefHandle[HTMLElement]) => value(t0).runNow()))
      
      inline def setRegisteredProviders(value: js.Array[RefHandle[HTMLElement]]): Self = StObject.set(x, "registeredProviders", value.asInstanceOf[js.Any])
      
      inline def setRegisteredProvidersVarargs(value: RefHandle[HTMLElement]*): Self = StObject.set(x, "registeredProviders", js.Array(value*))
      
      inline def setUnregisterProvider(value: RefHandle[HTMLElement] => Callback): Self = StObject.set(x, "unregisterProvider", js.Any.fromFunction1((t0: RefHandle[HTMLElement]) => value(t0).runNow()))
    }
  }
  
  trait ListenerCallbacks extends StObject {
    
    def onKeyDown(ev: KeyboardEvent): Unit
    
    def onKeyUp(ev: KeyboardEvent): Unit
    
    def onMouseDown(ev: MouseEvent): Unit
    
    def onPointerDown(ev: PointerEvent): Unit
  }
  object ListenerCallbacks {
    
    inline def apply(
      onKeyDown: KeyboardEvent => Callback,
      onKeyUp: KeyboardEvent => Callback,
      onMouseDown: MouseEvent => Callback,
      onPointerDown: PointerEvent => Callback
    ): ListenerCallbacks = {
      val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1((t0: KeyboardEvent) => onKeyDown(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: KeyboardEvent) => onKeyUp(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: MouseEvent) => onMouseDown(t0).runNow()), onPointerDown = js.Any.fromFunction1((t0: PointerEvent) => onPointerDown(t0).runNow()))
      __obj.asInstanceOf[ListenerCallbacks]
    }
    
    extension [Self <: ListenerCallbacks](x: Self) {
      
      inline def setOnKeyDown(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnKeyUp(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnMouseDown(value: MouseEvent => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setOnPointerDown(value: PointerEvent => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: PointerEvent) => value(t0).runNow()))
    }
  }
}
