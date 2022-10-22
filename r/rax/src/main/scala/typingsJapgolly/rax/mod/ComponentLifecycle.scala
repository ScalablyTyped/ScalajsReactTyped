package typingsJapgolly.rax.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ======================================================================
  * Rax Component Specs and Lifecycle
  * ======================================================================
  */
// This should actually be something like `Lifecycle<P, S> | DeprecatedLifecycle<P, S>`,
// as Rax will _not_ call the deprecated lifecycle methods if any of the new lifecycle
// methods are present.
trait ComponentLifecycle[P, S, SS] extends StObject {
  
  /**
    * Catches exceptions generated in descendant components. Unhandled exceptions will cause
    * the entire component tree to unmount.
    */
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
  
  /**
    * Called immediately after a component is mounted. Setting state here will trigger re-rendering.
    */
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called immediately after updating occurs. Not called for the initial render.
    *
    * The snapshot is only present if getSnapshotBeforeUpdate is present and returns non-null.
    */
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS], Unit]
  ] = js.undefined
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ Any, Unit]] = js.undefined
  
  /**
    * Called immediately before a component is destroyed. Perform any necessary cleanup in this method, such as
    * cancelled network requests, or cleaning up any DOM elements created in `componentDidMount`.
    */
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var componentWillUpdate: js.UndefOr[js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ Any, Unit]] = js.undefined
  
  /**
    * Runs before Rax applies the result of `render` to the document, and
    * returns an object to be given to componentDidUpdate. Useful for saving
    * things such as scroll position before `render` causes changes to it.
    *
    * Note: the presence of getSnapshotBeforeUpdate prevents any of the deprecated
    * lifecycle events from running.
    */
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ P, /* prevState */ S, SS | Null]] = js.undefined
  
  /**
    * Called to determine whether the change in props and state should trigger a re-render.
    *
    * `Component` always returns true.
    * `PureComponent` implements a shallow comparison on props and state and returns true if any
    * props or states have changed.
    *
    * If false is returned, `Component#render`, `componentWillUpdate`
    * and `componentDidUpdate` will not be called.
    */
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ Any, Boolean]
  ] = js.undefined
}
object ComponentLifecycle {
  
  inline def apply[P, S, SS](): ComponentLifecycle[P, S, SS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentLifecycle[P, S, SS]]
  }
  
  extension [Self <: ComponentLifecycle[?, ?, ?], P, S, SS](x: Self & (ComponentLifecycle[P, S, SS])) {
    
    inline def setComponentDidCatch(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Callback): Self = StObject.set(x, "componentDidCatch", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* errorInfo */ ErrorInfo) => (value(t0, t1)).runNow()))
    
    inline def setComponentDidCatchUndefined: Self = StObject.set(x, "componentDidCatch", js.undefined)
    
    inline def setComponentDidMount(value: Callback): Self = StObject.set(x, "componentDidMount", value.toJsFn)
    
    inline def setComponentDidMountUndefined: Self = StObject.set(x, "componentDidMount", js.undefined)
    
    inline def setComponentDidUpdate(value: (/* prevProps */ P, /* prevState */ S, /* snapshot */ js.UndefOr[SS]) => Callback): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction3((t0: /* prevProps */ P, t1: /* prevState */ S, t2: /* snapshot */ js.UndefOr[SS]) => (value(t0, t1, t2)).runNow()))
    
    inline def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
    
    inline def setComponentWillMount(value: Callback): Self = StObject.set(x, "componentWillMount", value.toJsFn)
    
    inline def setComponentWillMountUndefined: Self = StObject.set(x, "componentWillMount", js.undefined)
    
    inline def setComponentWillReceiveProps(value: (/* nextProps */ P, /* nextContext */ Any) => Callback): Self = StObject.set(x, "componentWillReceiveProps", js.Any.fromFunction2((t0: /* nextProps */ P, t1: /* nextContext */ Any) => (value(t0, t1)).runNow()))
    
    inline def setComponentWillReceivePropsUndefined: Self = StObject.set(x, "componentWillReceiveProps", js.undefined)
    
    inline def setComponentWillUnmount(value: Callback): Self = StObject.set(x, "componentWillUnmount", value.toJsFn)
    
    inline def setComponentWillUnmountUndefined: Self = StObject.set(x, "componentWillUnmount", js.undefined)
    
    inline def setComponentWillUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ Any) => Callback): Self = StObject.set(x, "componentWillUpdate", js.Any.fromFunction3((t0: /* nextProps */ P, t1: /* nextState */ S, t2: /* nextContext */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setComponentWillUpdateUndefined: Self = StObject.set(x, "componentWillUpdate", js.undefined)
    
    inline def setGetSnapshotBeforeUpdate(value: (/* prevProps */ P, /* prevState */ S) => SS | Null): Self = StObject.set(x, "getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    inline def setGetSnapshotBeforeUpdateUndefined: Self = StObject.set(x, "getSnapshotBeforeUpdate", js.undefined)
    
    inline def setShouldComponentUpdate(value: (/* nextProps */ P, /* nextState */ S, /* nextContext */ Any) => Boolean): Self = StObject.set(x, "shouldComponentUpdate", js.Any.fromFunction3(value))
    
    inline def setShouldComponentUpdateUndefined: Self = StObject.set(x, "shouldComponentUpdate", js.undefined)
  }
}
