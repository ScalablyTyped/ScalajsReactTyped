package typingsJapgolly.testingLibraryReactHooks

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Omit
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksBooleans.`false`
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.act
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.render
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.rerender
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.unmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  @js.native
  trait Act extends StObject {
    
    def apply(callback: js.Function0[js.UndefOr[Unit]]): Unit = js.native
  }
  
  trait AsyncUtils extends StObject {
    
    var waitFor: WaitFor
    
    var waitForNextUpdate: WaitForNextUpdate
    
    var waitForValueToChange: WaitForValueToChange
  }
  object AsyncUtils {
    
    inline def apply(
      waitFor: (/* callback */ js.Function0[Boolean | Unit], /* options */ js.UndefOr[WaitForOptions]) => js.Promise[Unit],
      waitForNextUpdate: /* options */ js.UndefOr[WaitForNextUpdateOptions] => js.Promise[Unit],
      waitForValueToChange: (/* selector */ js.Function0[Any], /* options */ js.UndefOr[WaitForValueToChangeOptions]) => js.Promise[Unit]
    ): AsyncUtils = {
      val __obj = js.Dynamic.literal(waitFor = js.Any.fromFunction2(waitFor), waitForNextUpdate = js.Any.fromFunction1(waitForNextUpdate), waitForValueToChange = js.Any.fromFunction2(waitForValueToChange))
      __obj.asInstanceOf[AsyncUtils]
    }
    
    extension [Self <: AsyncUtils](x: Self) {
      
      inline def setWaitFor(
        value: (/* callback */ js.Function0[Boolean | Unit], /* options */ js.UndefOr[WaitForOptions]) => js.Promise[Unit]
      ): Self = StObject.set(x, "waitFor", js.Any.fromFunction2(value))
      
      inline def setWaitForNextUpdate(value: /* options */ js.UndefOr[WaitForNextUpdateOptions] => js.Promise[Unit]): Self = StObject.set(x, "waitForNextUpdate", js.Any.fromFunction1(value))
      
      inline def setWaitForValueToChange(
        value: (/* selector */ js.Function0[Any], /* options */ js.UndefOr[WaitForValueToChangeOptions]) => js.Promise[Unit]
      ): Self = StObject.set(x, "waitForValueToChange", js.Any.fromFunction2(value))
    }
  }
  
  type CleanupCallback = js.Function0[js.Promise[Unit] | Unit]
  
  type CreateRenderer[TProps, TResult, TRendererOptions /* <: js.Object */, TRenderer /* <: Renderer[TProps] */] = js.Function2[
    /* props */ RendererProps[TProps, TResult], 
    /* options */ TRendererOptions, 
    TRenderer
  ]
  
  trait RenderHookOptions[TProps] extends StObject {
    
    var initialProps: js.UndefOr[TProps] = js.undefined
  }
  object RenderHookOptions {
    
    inline def apply[TProps](): RenderHookOptions[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderHookOptions[TProps]]
    }
    
    extension [Self <: RenderHookOptions[?], TProps](x: Self & RenderHookOptions[TProps]) {
      
      inline def setInitialProps(value: TProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
      
      inline def setInitialPropsUndefined: Self = StObject.set(x, "initialProps", js.undefined)
    }
  }
  
  type RenderHookResult[TProps, TValue, TRenderer /* <: Renderer[TProps] */] = ResultContainer[TValue] & (Omit[Renderer[TProps], render | act]) & (Omit[
    TRenderer, 
    /* keyof @testing-library/react-hooks.@testing-library/react-hooks/lib/types.Renderer<TProps> */ render | rerender | unmount | act
  ]) & AsyncUtils
  
  trait RenderResult[TValue] extends StObject {
    
    val all: js.Array[TValue | js.Error]
    
    val current: TValue
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object RenderResult {
    
    inline def apply[TValue](all: js.Array[TValue | js.Error], current: TValue): RenderResult[TValue] = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderResult[TValue]]
    }
    
    extension [Self <: RenderResult[?], TValue](x: Self & RenderResult[TValue]) {
      
      inline def setAll(value: js.Array[TValue | js.Error]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllVarargs(value: (TValue | js.Error)*): Self = StObject.set(x, "all", js.Array(value*))
      
      inline def setCurrent(value: TValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  @js.native
  trait Renderer[TProps] extends StObject {
    
    var act: Act = js.native
    
    def render(): Unit = js.native
    def render(props: TProps): Unit = js.native
    
    def rerender(): Unit = js.native
    def rerender(props: TProps): Unit = js.native
    
    def unmount(): Unit = js.native
  }
  
  trait RendererProps[TProps, TResult] extends StObject {
    
    def callback(props: TProps): TResult
    
    def setError(error: js.Error): Unit
    
    def setValue(value: TResult): Unit
  }
  object RendererProps {
    
    inline def apply[TProps, TResult](callback: TProps => TResult, setError: js.Error => Callback, setValue: TResult => Callback): RendererProps[TProps, TResult] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), setError = js.Any.fromFunction1((t0: js.Error) => setError(t0).runNow()), setValue = js.Any.fromFunction1((t0: TResult) => setValue(t0).runNow()))
      __obj.asInstanceOf[RendererProps[TProps, TResult]]
    }
    
    extension [Self <: RendererProps[?, ?], TProps, TResult](x: Self & (RendererProps[TProps, TResult])) {
      
      inline def setCallback(value: TProps => TResult): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setSetError(value: js.Error => Callback): Self = StObject.set(x, "setError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setSetValue(value: TResult => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: TResult) => value(t0).runNow()))
    }
  }
  
  trait ResultContainer[TValue] extends StObject {
    
    var result: RenderResult[TValue]
  }
  object ResultContainer {
    
    inline def apply[TValue](result: RenderResult[TValue]): ResultContainer[TValue] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultContainer[TValue]]
    }
    
    extension [Self <: ResultContainer[?], TValue](x: Self & ResultContainer[TValue]) {
      
      inline def setResult(value: RenderResult[TValue]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  type ServerRenderHookResult[TProps, TValue, TRenderer /* <: ServerRenderer[TProps] */] = RenderHookResult[TProps, TValue, TRenderer]
  
  @js.native
  trait ServerRenderer[TProps]
    extends StObject
       with Renderer[TProps] {
    
    def hydrate(): Unit = js.native
  }
  
  type WaitFor = js.Function2[
    /* callback */ js.Function0[Boolean | Unit], 
    /* options */ js.UndefOr[WaitForOptions], 
    js.Promise[Unit]
  ]
  
  type WaitForNextUpdate = js.Function1[/* options */ js.UndefOr[WaitForNextUpdateOptions], js.Promise[Unit]]
  
  /* Inlined std.Pick<@testing-library/react-hooks.@testing-library/react-hooks/lib/types.WaitOptions, 'timeout'> */
  trait WaitForNextUpdateOptions extends StObject {
    
    var timeout: js.UndefOr[Double | `false`] = js.undefined
  }
  object WaitForNextUpdateOptions {
    
    inline def apply(): WaitForNextUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitForNextUpdateOptions]
    }
    
    extension [Self <: WaitForNextUpdateOptions](x: Self) {
      
      inline def setTimeout(value: Double | `false`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type WaitForOptions = WaitOptions
  
  type WaitForValueToChange = js.Function2[
    /* selector */ js.Function0[Any], 
    /* options */ js.UndefOr[WaitForValueToChangeOptions], 
    js.Promise[Unit]
  ]
  
  type WaitForValueToChangeOptions = WaitOptions
  
  trait WaitOptions extends StObject {
    
    var interval: js.UndefOr[Double | `false`] = js.undefined
    
    var timeout: js.UndefOr[Double | `false`] = js.undefined
  }
  object WaitOptions {
    
    inline def apply(): WaitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaitOptions]
    }
    
    extension [Self <: WaitOptions](x: Self) {
      
      inline def setInterval(value: Double | `false`): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimeout(value: Double | `false`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
