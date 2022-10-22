package typingsJapgolly.reactMdTransition.typesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionHookReturnValue[E /* <: HTMLElement */]
  extends StObject
     with TransitionState {
  
  /**
    * A ref that is required for the transition to occur and should be passed to
    * the element affected by the transition.
    */
  var ref: RefFn[E]
  
  /**
    * A function that can be used to specifically set the transition to a
    * specific stage. This shouldn't really be used too much and is really just
    * useful for "appear only transitions" that do not unmount the child
    * elements.
    *
    * @example
    * Simple Example
    * ```tsx
    * import { ReactElement, useEffect, useRef } from "react";
    * import { useCSSTransition } from "@react-md/transition";
    * import { useRouter } from "react-router-dom";
    *
    * function Example(): ReactElement {
    *   const { pathname } = useRouter();
    *   const { elementProps, transitionTo } = useCSSTransition({
    *     transitionIn: true,
    *     timeout: 1000,
    *     classNames: "some-enter-transition",
    *   });
    *
    *   useEffect(() => {
    *     // Do not trigger transition on first load.
    *     if (prevPathname.current === pathname) {
    *       return;
    *     }
    *
    *     prevPathname.current = pathname;
    *     transitionTo("enter");
    *   }, [pathname, transitionTo]);
    *
    *   return <div {...elementProps}>{content}</div>;
    * }
    * ```
    *
    * @param stage - The {@link TransitionStage} to set to
    */
  def transitionTo(stage: TransitionStage): Unit
}
object TransitionHookReturnValue {
  
  inline def apply[E /* <: HTMLElement */](
    appearing: Boolean,
    ref: E | Null => Callback,
    rendered: Boolean,
    stage: TransitionStage,
    transitionTo: TransitionStage => Callback
  ): TransitionHookReturnValue[E] = {
    val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], ref = js.Any.fromFunction1((t0: E | Null) => ref(t0).runNow()), rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], transitionTo = js.Any.fromFunction1((t0: TransitionStage) => transitionTo(t0).runNow()))
    __obj.asInstanceOf[TransitionHookReturnValue[E]]
  }
  
  extension [Self <: TransitionHookReturnValue[?], E /* <: HTMLElement */](x: Self & TransitionHookReturnValue[E]) {
    
    inline def setRef(value: E | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
    
    inline def setTransitionTo(value: TransitionStage => Callback): Self = StObject.set(x, "transitionTo", js.Any.fromFunction1((t0: TransitionStage) => value(t0).runNow()))
  }
}
