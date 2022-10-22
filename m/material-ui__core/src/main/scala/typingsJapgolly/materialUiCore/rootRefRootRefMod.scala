package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootRefRootRefMod extends Shortcut {
  
  /**
    * ⚠️⚠️⚠️
    * If you want the DOM element of a Material-UI component check out
    * [FAQ: How can I access the DOM element?](https://mui.com/getting-started/faq/#how-can-i-access-the-dom-element)
    * first.
    *
    * This component uses `findDOMNode` which is deprecated in React.StrictMode.
    *
    * Helper component to allow attaching a ref to a
    * wrapped element to access the underlying DOM element.
    *
    * It's highly inspired by <https://github.com/facebook/react/issues/11401#issuecomment-340543801>.
    * For example:
    *
    * ```jsx
    * import React from 'react';
    * import RootRef from '@material-ui/core/RootRef';
    *
    * function MyComponent() {
    *   const domRef = React.useRef();
    *
    *   React.useEffect(() => {
    *     console.log(domRef.current); // DOM node
    *   }, []);
    *
    *   return (
    *     <RootRef rootRef={domRef}>
    *       <SomeChildComponent />
    *     </RootRef>
    *   );
    * }
    * ```
    *
    * @deprecated
    * API:
    *
    * - [RootRef API](https://mui.com/api/root-ref/)
    */
  @JSImport("@material-ui/core/RootRef/RootRef", JSImport.Default)
  @js.native
  val default: ComponentType[RootRefProps[Any]] = js.native
  
  trait RootRefProps[T] extends StObject {
    
    var rootRef: js.UndefOr[(js.Function1[/* instance */ T | Null, Unit]) | RefHandle[T]] = js.undefined
  }
  object RootRefProps {
    
    inline def apply[T](): RootRefProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootRefProps[T]]
    }
    
    extension [Self <: RootRefProps[?], T](x: Self & RootRefProps[T]) {
      
      inline def setRootRef(value: (js.Function1[/* instance */ T | Null, Unit]) | RefHandle[T]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      inline def setRootRefFunction1(value: /* instance */ T | Null => Callback): Self = StObject.set(x, "rootRef", js.Any.fromFunction1((t0: /* instance */ T | Null) => value(t0).runNow()))
      
      inline def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    }
  }
  
  type _To = ComponentType[RootRefProps[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rootRefRootRefMod.foo` */
  override def _to: ComponentType[RootRefProps[Any]] = default
}
