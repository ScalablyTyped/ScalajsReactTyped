package typingsJapgolly.reactTransitionGroup

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactTransitionGroup.anon.Appear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  /**
    * The Transition component lets you describe a transition from one component
    * state to another _over time_ with a simple declarative API. Most commonly
    * It's used to animate the mounting and unmounting of Component, but can also
    * be used to describe in-place transition states as well.
    *
    * By default the `Transition` component does not alter the behavior of the
    * component it renders, it only tracks "enter" and "exit" states for the components.
    * It's up to you to give meaning and effect to those states. For example we can
    * add styles to a component when it enters or exits:
    *
    * ```jsx
    * import Transition from 'react-transition-group/Transition';
    *
    * const duration = 300;
    *
    * const defaultStyle = {
    *   transition: `opacity ${duration}ms ease-in-out`,
    *   opacity: 0,
    * }
    *
    * const transitionStyles = {
    *   entering: { opacity: 1 },
    *   entered:  { opacity: 1 },
    * };
    *
    * const Fade = ({ in: inProp }) => (
    *   <Transition in={inProp} timeout={duration}>
    *     {(state) => (
    *       <div style={{
    *         ...defaultStyle,
    *         ...transitionStyles[state]
    *       }}>
    *         I'm A fade Transition!
    *       </div>
    *     )}
    *   </Transition>
    * );
    * ```
    *
    */
  @JSImport("react-transition-group/Transition", JSImport.Default)
  @js.native
  open class default[RefElement /* <: js.UndefOr[HTMLElement] */] ()
    extends Component[TransitionProps[RefElement], js.Object, Any]
  
  @JSImport("react-transition-group/Transition", "ENTERED")
  @js.native
  val ENTERED: /* "entered" */ String = js.native
  
  @JSImport("react-transition-group/Transition", "ENTERING")
  @js.native
  val ENTERING: /* "entering" */ String = js.native
  
  @JSImport("react-transition-group/Transition", "EXITED")
  @js.native
  val EXITED: /* "exited" */ String = js.native
  
  @JSImport("react-transition-group/Transition", "EXITING")
  @js.native
  val EXITING: /* "exiting" */ String = js.native
  
  @JSImport("react-transition-group/Transition", "UNMOUNTED")
  @js.native
  val UNMOUNTED: /* "unmounted" */ String = js.native
  
  trait BaseTransitionProps[RefElement /* <: js.UndefOr[HTMLElement] */]
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    /**
      * A function child can be used instead of a React element. This function is
      * called with the current transition status ('entering', 'entered',
      * 'exiting',  'exited', 'unmounted'), which can be used to apply context
      * specific props to a component.
      * ```jsx
      *    <Transition in={this.state.in} timeout={150}>
      *        {state => (
      *            <MyComponent className={`fade fade-${state}`} />
      *        )}
      *    </Transition>
      * ```
      */
    var children: js.UndefOr[TransitionChildren] = js.undefined
    
    /**
      * Show the component; triggers the enter or exit states
      */
    var in: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default the child component is mounted immediately along with the
      * parent Transition component. If you want to "lazy mount" the component on
      * the first `in={true}` you can set `mountOnEnter`. After the first enter
      * transition the component will stay mounted, even on "exited", unless you
      * also specify `unmountOnExit`.
      */
    var mountOnEnter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A React reference to DOM element that need to transition: https://stackoverflow.com/a/51127130/4671932
      * When `nodeRef` prop is used, node is not passed to callback functions (e.g. onEnter) because user already has direct access to the node.
      * When changing `key` prop of `Transition` in a `TransitionGroup` a new `nodeRef` need to be provided to `Transition` with changed `key`
      * prop (@see https://github.com/reactjs/react-transition-group/blob/master/test/Transition-test.js).
      */
    var nodeRef: js.UndefOr[Ref[RefElement]] = js.undefined
    
    /**
      * Callback fired before the "entering" status is applied. An extra
      * parameter `isAppearing` is supplied to indicate if the enter stage is
      * occurring on the initial mount
      */
    var onEnter: js.UndefOr[EnterHandler[RefElement]] = js.undefined
    
    /**
      * Callback fired after the "entered" status is applied. An extra parameter
      * isAppearing is supplied to indicate if the enter stage is occurring on
      * the initial mount
      */
    var onEntered: js.UndefOr[EnterHandler[RefElement]] = js.undefined
    
    /**
      * Callback fired after the "entering" status is applied. An extra parameter
      * isAppearing is supplied to indicate if the enter stage is occurring on
      * the initial mount
      */
    var onEntering: js.UndefOr[EnterHandler[RefElement]] = js.undefined
    
    /**
      * Callback fired before the "exiting" status is applied.
      */
    var onExit: js.UndefOr[ExitHandler[RefElement]] = js.undefined
    
    /**
      * Callback fired after the "exited" status is applied.
      */
    var onExited: js.UndefOr[ExitHandler[RefElement]] = js.undefined
    
    /**
      * Callback fired after the "exiting" status is applied.
      */
    var onExiting: js.UndefOr[ExitHandler[RefElement]] = js.undefined
    
    /**
      * By default the child component stays mounted after it reaches the
      * 'exited' state. Set `unmountOnExit` if you'd prefer to unmount the
      * component after it finishes exiting.
      */
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object BaseTransitionProps {
    
    inline def apply[RefElement /* <: js.UndefOr[HTMLElement] */](): BaseTransitionProps[RefElement] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTransitionProps[RefElement]]
    }
    
    extension [Self <: BaseTransitionProps[?], RefElement /* <: js.UndefOr[HTMLElement] */](x: Self & BaseTransitionProps[RefElement]) {
      
      inline def setChildren(value: TransitionChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* status */ TransitionStatus => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setNodeRef(value: Ref[RefElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      inline def setNodeRefFunction1(value: RefElement | Null => Callback): Self = StObject.set(x, "nodeRef", js.Any.fromFunction1((t0: RefElement | Null) => value(t0).runNow()))
      
      inline def setNodeRefNull: Self = StObject.set(x, "nodeRef", null)
      
      inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      inline def setOnEnter(value: EnterHandler[RefElement]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEntered(value: EnterHandler[RefElement]): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      inline def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      inline def setOnEntering(value: EnterHandler[RefElement]): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      inline def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      inline def setOnExit(value: ExitHandler[RefElement]): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setOnExited(value: ExitHandler[RefElement]): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      inline def setOnExiting(value: ExitHandler[RefElement]): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      inline def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
  
  type EndHandler[RefElement /* <: js.UndefOr[HTMLElement] */] = RefHandler[
    RefElement, 
    js.Function2[/* node */ HTMLElement, /* done */ js.Function0[Unit], Unit], 
    js.Function1[/* done */ js.Function0[Unit], Unit]
  ]
  
  trait EndListenerProps[Ref /* <: js.UndefOr[HTMLElement] */]
    extends StObject
       with BaseTransitionProps[Ref]
       with TransitionProps[Ref] {
    
    /**
      * Add a custom transition end trigger. Called with the transitioning DOM
      * node and a done callback. Allows for more fine grained transition end
      * logic. Note: Timeouts are still used as a fallback if provided.
      */
    var addEndListener: EndHandler[Ref]
    
    /**
      * The duration of the transition, in milliseconds. Required unless addEndListener is provided.
      *
      * You may specify a single timeout for all transitions:
      * ```js
      *   timeout={500}
      * ```
      * or individually:
      * ```js
      * timeout={{
      *  appear: 500,
      *  enter: 300,
      *  exit: 500,
      * }}
      * ```
      * - appear defaults to the value of `enter`
      * - enter defaults to `0`
      * - exit defaults to `0`
      */
    var timeout: js.UndefOr[Double | Appear] = js.undefined
  }
  object EndListenerProps {
    
    inline def apply[Ref /* <: js.UndefOr[HTMLElement] */](addEndListener: EndHandler[Ref]): EndListenerProps[Ref] = {
      val __obj = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndListenerProps[Ref]]
    }
    
    extension [Self <: EndListenerProps[?], Ref /* <: js.UndefOr[HTMLElement] */](x: Self & EndListenerProps[Ref]) {
      
      inline def setAddEndListener(value: EndHandler[Ref]): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double | Appear): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type EnterHandler[RefElement /* <: js.UndefOr[HTMLElement] */] = RefHandler[
    RefElement, 
    js.Function2[/* node */ HTMLElement, /* isAppearing */ Boolean, Unit], 
    js.Function1[/* isAppearing */ Boolean, Unit]
  ]
  
  type ExitHandler[E /* <: js.UndefOr[HTMLElement] */] = RefHandler[E, js.Function1[/* node */ HTMLElement, Unit], js.Function0[Unit]]
  
  type RefHandler[RefElement /* <: js.UndefOr[HTMLElement] */, ImplicitRefHandler /* <: js.Function2[/* node */ HTMLElement, /* repeated */ Any, Unit] */, ExplicitRefHandler /* <: js.Function1[/* repeated */ Any, Unit] */] = /* import warning: importer.ImportType#apply Failed type conversion: react-transition-group.anon.Explicit<ImplicitRefHandler, ExplicitRefHandler>[RefElement extends undefined ? 'implicit' : 'explicit'] */ js.Any
  
  trait TimeoutProps[RefElement /* <: js.UndefOr[HTMLElement] */]
    extends StObject
       with BaseTransitionProps[RefElement]
       with TransitionProps[RefElement] {
    
    /**
      * Add a custom transition end trigger. Called with the transitioning DOM
      * node and a done callback. Allows for more fine grained transition end
      * logic. Note: Timeouts are still used as a fallback if provided.
      */
    var addEndListener: js.UndefOr[EndHandler[RefElement]] = js.undefined
    
    /**
      * The duration of the transition, in milliseconds. Required unless addEndListener is provided.
      *
      * You may specify a single timeout for all transitions:
      * ```js
      *   timeout={500}
      * ```
      * or individually:
      * ```js
      * timeout={{
      *  appear: 500,
      *  enter: 300,
      *  exit: 500,
      * }}
      * ```
      * - appear defaults to the value of `enter`
      * - enter defaults to `0`
      * - exit defaults to `0`
      */
    var timeout: Double | Appear
  }
  object TimeoutProps {
    
    inline def apply[RefElement /* <: js.UndefOr[HTMLElement] */](timeout: Double | Appear): TimeoutProps[RefElement] = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeoutProps[RefElement]]
    }
    
    extension [Self <: TimeoutProps[?], RefElement /* <: js.UndefOr[HTMLElement] */](x: Self & TimeoutProps[RefElement]) {
      
      inline def setAddEndListener(value: EndHandler[RefElement]): Self = StObject.set(x, "addEndListener", value.asInstanceOf[js.Any])
      
      inline def setAddEndListenerUndefined: Self = StObject.set(x, "addEndListener", js.undefined)
      
      inline def setTimeout(value: Double | Appear): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The Transition component lets you describe a transition from one component
    * state to another _over time_ with a simple declarative API. Most commonly
    * It's used to animate the mounting and unmounting of Component, but can also
    * be used to describe in-place transition states as well.
    *
    * By default the `Transition` component does not alter the behavior of the
    * component it renders, it only tracks "enter" and "exit" states for the components.
    * It's up to you to give meaning and effect to those states. For example we can
    * add styles to a component when it enters or exits:
    *
    * ```jsx
    * import Transition from 'react-transition-group/Transition';
    *
    * const duration = 300;
    *
    * const defaultStyle = {
    *   transition: `opacity ${duration}ms ease-in-out`,
    *   opacity: 0,
    * }
    *
    * const transitionStyles = {
    *   entering: { opacity: 1 },
    *   entered:  { opacity: 1 },
    * };
    *
    * const Fade = ({ in: inProp }) => (
    *   <Transition in={inProp} timeout={duration}>
    *     {(state) => (
    *       <div style={{
    *         ...defaultStyle,
    *         ...transitionStyles[state]
    *       }}>
    *         I'm A fade Transition!
    *       </div>
    *     )}
    *   </Transition>
    * );
    * ```
    *
    */
  type Transition[RefElement /* <: js.UndefOr[HTMLElement] */] = japgolly.scalajs.react.facade.React.Component[TransitionProps[RefElement] & js.Object, js.Object]
  
  trait TransitionActions extends StObject {
    
    /**
      * Normally a component is not transitioned if it is shown when the
      * `<Transition>` component mounts. If you want to transition on the first
      * mount set  appear to true, and the component will transition in as soon
      * as the `<Transition>` mounts. Note: there are no specific "appear" states.
      * appear only adds an additional enter transition.
      */
    var appear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable enter transitions.
      */
    var enter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable exit transitions.
      */
    var exit: js.UndefOr[Boolean] = js.undefined
  }
  object TransitionActions {
    
    inline def apply(): TransitionActions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionActions]
    }
    
    extension [Self <: TransitionActions](x: Self) {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  type TransitionChildren = Node | (js.Function1[/* status */ TransitionStatus, Node])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]
    - typingsJapgolly.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]
  */
  trait TransitionProps[RefElement /* <: js.UndefOr[HTMLElement] */] extends StObject
  object TransitionProps {
    
    inline def EndListenerProps[RefElement /* <: js.UndefOr[HTMLElement] */](addEndListener: EndHandler[RefElement]): typingsJapgolly.reactTransitionGroup.transitionMod.EndListenerProps[RefElement] = {
      val __obj = js.Dynamic.literal(addEndListener = addEndListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactTransitionGroup.transitionMod.EndListenerProps[RefElement]]
    }
    
    inline def TimeoutProps[RefElement /* <: js.UndefOr[HTMLElement] */](timeout: Double | Appear): typingsJapgolly.reactTransitionGroup.transitionMod.TimeoutProps[RefElement] = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactTransitionGroup.transitionMod.TimeoutProps[RefElement]]
    }
  }
  
  type TransitionStatus = /* "entering" */ String
}
