package typingsJapgolly.reactErrorBoundary

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ErrorInfo
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.PropsWithRef
import typingsJapgolly.reactErrorBoundary.anon.ComponentStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-error-boundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useErrorHandler(): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")().asInstanceOf[js.Function1[/* error */ Any, Unit]]
  inline def useErrorHandler(givenError: Any): js.Function1[/* error */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useErrorHandler")(givenError.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* error */ Any, Unit]]
  
  inline def withErrorBoundary[P](Component: ComponentType[P], errorBoundaryProps: ErrorBoundaryProps): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withErrorBoundary")(Component.asInstanceOf[js.Any], errorBoundaryProps.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  @js.native
  trait ErrorBoundary extends Component[PropsWithRef[PropsWithChildren[ErrorBoundaryProps]], ErrorBoundaryState, Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: js.Error, info: ErrorInfo): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MErrorBoundary(prevProps: ErrorBoundaryProps, prevState: ErrorBoundaryState): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetErrorBoundary(args: Any*): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithFallback
    - typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithComponent
    - typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithRender
  */
  trait ErrorBoundaryProps extends StObject
  object ErrorBoundaryProps {
    
    inline def ErrorBoundaryPropsWithComponent(FallbackComponent: ComponentType[FallbackProps]): typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithComponent = {
      val __obj = js.Dynamic.literal(FallbackComponent = FallbackComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithComponent]
    }
    
    inline def ErrorBoundaryPropsWithFallback(): typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithFallback = {
      val __obj = js.Dynamic.literal(fallback = null)
      __obj.asInstanceOf[typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithFallback]
    }
    
    inline def ErrorBoundaryPropsWithRender(fallbackRender: /* props */ FallbackProps => Element | Null): typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithRender = {
      val __obj = js.Dynamic.literal(fallbackRender = js.Any.fromFunction1(fallbackRender))
      __obj.asInstanceOf[typingsJapgolly.reactErrorBoundary.mod.ErrorBoundaryPropsWithRender]
    }
  }
  
  trait ErrorBoundaryPropsWithComponent
    extends StObject
       with ErrorBoundaryProps {
    
    var FallbackComponent: ComponentType[FallbackProps]
    
    var fallback: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallbackRender: js.UndefOr[scala.Nothing] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[
          /* prevResetKeys */ js.UndefOr[js.Array[Any]], 
          /* resetKeys */ js.UndefOr[js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryPropsWithComponent {
    
    inline def apply(FallbackComponent: ComponentType[FallbackProps]): ErrorBoundaryPropsWithComponent = {
      val __obj = js.Dynamic.literal(FallbackComponent = FallbackComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorBoundaryPropsWithComponent]
    }
    
    extension [Self <: ErrorBoundaryPropsWithComponent](x: Self) {
      
      inline def setFallbackComponent(value: ComponentType[FallbackProps]): Self = StObject.set(x, "FallbackComponent", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* info */ ComponentStack) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setOnResetKeysChange(
        value: (/* prevResetKeys */ js.UndefOr[js.Array[Any]], /* resetKeys */ js.UndefOr[js.Array[Any]]) => Callback
      ): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2((t0: /* prevResetKeys */ js.UndefOr[js.Array[Any]], t1: /* resetKeys */ js.UndefOr[js.Array[Any]]) => (value(t0, t1)).runNow()))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
  
  trait ErrorBoundaryPropsWithFallback
    extends StObject
       with ErrorBoundaryProps {
    
    var FallbackComponent: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallback: Element | Null
    
    var fallbackRender: js.UndefOr[scala.Nothing] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[
          /* prevResetKeys */ js.UndefOr[js.Array[Any]], 
          /* resetKeys */ js.UndefOr[js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryPropsWithFallback {
    
    inline def apply(): ErrorBoundaryPropsWithFallback = {
      val __obj = js.Dynamic.literal(fallback = null)
      __obj.asInstanceOf[ErrorBoundaryPropsWithFallback]
    }
    
    extension [Self <: ErrorBoundaryPropsWithFallback](x: Self) {
      
      inline def setFallback(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* info */ ComponentStack) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setOnResetKeysChange(
        value: (/* prevResetKeys */ js.UndefOr[js.Array[Any]], /* resetKeys */ js.UndefOr[js.Array[Any]]) => Callback
      ): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2((t0: /* prevResetKeys */ js.UndefOr[js.Array[Any]], t1: /* resetKeys */ js.UndefOr[js.Array[Any]]) => (value(t0, t1)).runNow()))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
  
  trait ErrorBoundaryPropsWithRender
    extends StObject
       with ErrorBoundaryProps {
    
    var FallbackComponent: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallback: js.UndefOr[scala.Nothing] = js.undefined
    
    var fallbackRender: js.Function1[/* props */ FallbackProps, Element | Null]
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* info */ ComponentStack, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onResetKeysChange: js.UndefOr[
        js.Function2[
          /* prevResetKeys */ js.UndefOr[js.Array[Any]], 
          /* resetKeys */ js.UndefOr[js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    var resetKeys: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ErrorBoundaryPropsWithRender {
    
    inline def apply(fallbackRender: /* props */ FallbackProps => Element | Null): ErrorBoundaryPropsWithRender = {
      val __obj = js.Dynamic.literal(fallbackRender = js.Any.fromFunction1(fallbackRender))
      __obj.asInstanceOf[ErrorBoundaryPropsWithRender]
    }
    
    extension [Self <: ErrorBoundaryPropsWithRender](x: Self) {
      
      inline def setFallbackRender(value: /* props */ FallbackProps => Element | Null): Self = StObject.set(x, "fallbackRender", js.Any.fromFunction1(value))
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ ComponentStack) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* info */ ComponentStack) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReset(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setOnResetKeysChange(
        value: (/* prevResetKeys */ js.UndefOr[js.Array[Any]], /* resetKeys */ js.UndefOr[js.Array[Any]]) => Callback
      ): Self = StObject.set(x, "onResetKeysChange", js.Any.fromFunction2((t0: /* prevResetKeys */ js.UndefOr[js.Array[Any]], t1: /* resetKeys */ js.UndefOr[js.Array[Any]]) => (value(t0, t1)).runNow()))
      
      inline def setOnResetKeysChangeUndefined: Self = StObject.set(x, "onResetKeysChange", js.undefined)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setResetKeys(value: js.Array[Any]): Self = StObject.set(x, "resetKeys", value.asInstanceOf[js.Any])
      
      inline def setResetKeysUndefined: Self = StObject.set(x, "resetKeys", js.undefined)
      
      inline def setResetKeysVarargs(value: Any*): Self = StObject.set(x, "resetKeys", js.Array(value*))
    }
  }
  
  trait ErrorBoundaryState extends StObject {
    
    var error: js.Error | Null
  }
  object ErrorBoundaryState {
    
    inline def apply(): ErrorBoundaryState = {
      val __obj = js.Dynamic.literal(error = null)
      __obj.asInstanceOf[ErrorBoundaryState]
    }
    
    extension [Self <: ErrorBoundaryState](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
  
  trait FallbackProps extends StObject {
    
    var error: js.Error
    
    def resetErrorBoundary(args: Any*): Unit
  }
  object FallbackProps {
    
    inline def apply(error: js.Error, resetErrorBoundary: /* repeated */ Any => Callback): FallbackProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], resetErrorBoundary = js.Any.fromFunction1((t0: /* repeated */ Any) => resetErrorBoundary(t0).runNow()))
      __obj.asInstanceOf[FallbackProps]
    }
    
    extension [Self <: FallbackProps](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResetErrorBoundary(value: /* repeated */ Any => Callback): Self = StObject.set(x, "resetErrorBoundary", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
