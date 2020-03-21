package typingsJapgolly.xstyledSystem

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.DomElement
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.react.AnonChildren
import typingsJapgolly.react.AnonDefault
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseConfig
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListProps
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.TimeoutConfig
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.TransitionStartFunction
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.CFactory
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DOMElement
import typingsJapgolly.react.mod.DOMFactory
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.DispatchWithoutAction
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.react.mod.Factory
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.ForwardRefRenderFunction
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.FunctionComponentFactory
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HTMLFactory
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.LazyExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.ProfilerProps
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.ReactChildren
import typingsJapgolly.react.mod.ReactElement
import typingsJapgolly.react.mod.ReactHTMLElement
import typingsJapgolly.react.mod.ReactNode
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.Reducer
import typingsJapgolly.react.mod.ReducerAction
import typingsJapgolly.react.mod.ReducerState
import typingsJapgolly.react.mod.ReducerStateWithoutAction
import typingsJapgolly.react.mod.ReducerWithoutAction
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SVGFactory
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.react.mod.SuspenseProps
import typingsJapgolly.std.Partial
import typingsJapgolly.xstyledSystem.xstyledSystemStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReact extends js.Object {
  val Children: ReactChildren = js.native
  // Base component for plain JS classes
  // tslint:disable-next-line:no-empty-interface
  var Component: TypeofComponent = js.native
  val Fragment: ExoticComponent[AnonChildren] = js.native
  val Profiler: ExoticComponent[ProfilerProps] = js.native
  var PureComponent: Instantiable0[typingsJapgolly.react.mod.PureComponent[js.Object, js.Object, js.Object]] = js.native
  val StrictMode: ExoticComponent[AnonChildren] = js.native
  /**
    * This feature is not yet available for server-side rendering.
    * Suspense support will be added in a later release.
    */
  val Suspense: ExoticComponent[SuspenseProps] = js.native
  val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
  val version: String = js.native
  // Custom components
  def cloneElement[P](element: FunctionComponentElement[P]): FunctionComponentElement[P] = js.native
  def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: Node*): FunctionComponentElement[P] = js.native
  def cloneElement[P](element: ReactElement): Element = js.native
  def cloneElement[P](element: ReactElement, props: Partial[P] with Attributes, children: Node*): Element = js.native
  def cloneElement[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T]): CElement[P, T] = js.native
  def cloneElement[P, T /* <: Component[P with js.Object, js.Object] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: Node*): CElement[P, T] = js.native
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[P, T]): DomElement = js.native
  def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](element: DOMElement[P, T], props: DOMAttributes[T] with P, children: Node*): DomElement = js.native
  // DOM Elements
  // ReactHTMLElement
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T]): DetailedReactHTMLElement[P, T] = js.native
  def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: Node*): DetailedReactHTMLElement[P, T] = js.native
  // SVGElement
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement): ReactSVGElement = js.native
  def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: Node*): ReactSVGElement = js.native
  // ReactHTMLElement, less specific
  @JSName("cloneElement")
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T]): ReactHTMLElement[T] = js.native
  @JSName("cloneElement")
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: Node*): ReactHTMLElement[T] = js.native
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): Context[T] = js.native
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T,
    calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]
  ): Context[T] = js.native
  def createElement[P /* <: js.Object */](`type`: String): Element = js.native
  def createElement[P /* <: js.Object */](`type`: String, children: ReactNode*): Element = js.native
  def createElement[P /* <: js.Object */](`type`: String, props: Attributes with P, children: Node*): Element = js.native
  def createElement[P /* <: js.Object */](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    children: ReactNode*
  ): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def createElement[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, ComponentState]]) with P,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState]): Element = js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], children: ReactNode*): Element = js.native
  def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes with P, children: Node*): Element = js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P]): Element = js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], children: ReactNode*): Element = js.native
  def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: Node*): Element = js.native
  def createElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: String, props: ClassAttributes[T] with P, children: Node*): DomElement = js.native
  def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any): DetailedReactHTMLElement[P, T] = js.native
  def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any,
    children: ReactNode*
  ): DetailedReactHTMLElement[P, T] = js.native
  def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any,
    props: ClassAttributes[T] with P,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = js.native
  def createElement[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C]): CElement[P, T] = js.native
  def createElement[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], children: ReactNode*): CElement[P, T] = js.native
  def createElement[P /* <: js.Object */, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: Node*): CElement[P, T] = js.native
  @JSName("createElement")
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: String): DomElement = js.native
  @JSName("createElement")
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: String, children: Node*): DomElement = js.native
  // Custom components
  @JSName("createElement")
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P]): FunctionComponentElement[P] = js.native
  @JSName("createElement")
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], children: ReactNode*): FunctionComponentElement[P] = js.native
  @JSName("createElement")
  def createElement_P_Object_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes with P, children: Node*): FunctionComponentElement[P] = js.native
  @JSName("createElement")
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): ReactSVGElement = js.native
  @JSName("createElement")
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    children: ReactNode*
  ): ReactSVGElement = js.native
  @JSName("createElement")
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: ClassAttributes[T] with P,
    children: Node*
  ): ReactSVGElement = js.native
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @JSName("createElement")
  def createElement_input(`type`: input): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSName("createElement")
  def createElement_input(`type`: input, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  @JSName("createElement")
  def createElement_input(
    `type`: input,
    props: InputHTMLAttributes[typingsJapgolly.std.HTMLInputElement] with ClassAttributes[typingsJapgolly.std.HTMLInputElement],
    children: Node*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
  def createFactory(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): SVGFactory = js.native
  def createFactory[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, js.Object]] = js.native
  def createFactory[P](`type`: ComponentClass[P, ComponentState]): Factory[P] = js.native
  // Custom components
  def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = js.native
  def createFactory[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.raw.Element */](`type`: String): DOMFactory[P, T] = js.native
  def createFactory[P, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](`type`: ClassType[P, T, C]): CFactory[P, T] = js.native
  //
  // Top Level API
  // ----------------------------------------------------------------------
  // DOM Elements
  @JSName("createFactory")
  def createFactory_T_HTMLElement_HTMLFactory[T /* <: HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 115 */ js.Any): HTMLFactory[T] = js.native
  def createRef[T](): RefHandle[T] = js.native
  def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]] = js.native
  def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
  def `lazy`[T /* <: ComponentType[_] */](factory: js.Function0[js.Promise[AnonDefault[T]]]): LazyExoticComponent[T] = js.native
  def memo[T /* <: ComponentType[_] */](Component: T): MemoExoticComponent[T] = js.native
  def memo[T /* <: ComponentType[_] */](
    Component: T,
    propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
  ): MemoExoticComponent[T] = js.native
  def memo[P /* <: js.Object */](Component: SFC[P]): NamedExoticComponent[P] = js.native
  def memo[P /* <: js.Object */](
    Component: SFC[P],
    propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
  ): NamedExoticComponent[P] = js.native
  def unstable_withSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]]): Unit = js.native
  def unstable_withSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: SuspenseConfig): Unit = js.native
  // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
  // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
  /**
    * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
    * has changed.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecallback
    */
  // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: DependencyList): T = js.native
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  def useContext[T](context: Context[T]): T = js.native
  /**
    * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
    *
    * NOTE: We don’t recommend adding debug values to every custom hook.
    * It’s most valuable for custom hooks that are part of shared libraries.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
    */
  // the name of the custom hook is itself derived from the function name at runtime:
  // it's just the function name without the "use" prefix.
  def useDebugValue[T](value: T): Unit = js.native
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): Unit = js.native
  def useDeferredValue[T](value: T): T = js.native
  def useDeferredValue[T](value: T, config: TimeoutConfig): T = js.native
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  def useEffect(effect: EffectCallback): Unit = js.native
  def useEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
  // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
  /**
    * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
    * `ref`. As always, imperative code using refs should be avoided in most cases.
    *
    * `useImperativeHandle` should be used with `React.forwardRef`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
    */
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref], init: js.Function0[R]): Unit = js.native
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[Ref], init: js.Function0[R], deps: DependencyList): Unit = js.native
  /**
    * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
    * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
    * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
    *
    * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
    *
    * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
    * `componentDidMount` and `componentDidUpdate`.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
    */
  def useLayoutEffect(effect: EffectCallback): Unit = js.native
  def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
  def useMemo[T](factory: js.Function0[T]): T = js.native
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
    * the second argument.
    *
    * ```ts
    * function expensive () { ... }
    *
    * function Component () {
    *   const expensiveResult = useMemo(expensive, [expensive])
    *   return ...
    * }
    * ```
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usememo
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload where dispatch could accept 0 arguments.
  def useReducer[R /* <: ReducerWithoutAction[_] */](reducer: R, initializerArg: ReducerStateWithoutAction[R]): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload where dispatch could accept 0 arguments.
  def useReducer[R /* <: ReducerWithoutAction[_] */, I](
    reducer: R,
    initializerArg: I,
    initializer: js.Function1[/* arg */ I, ReducerStateWithoutAction[R]]
  ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
  // The Flow types do have an overload for 3-ary invocation with undefined initializer.
  // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
  // supertype between the reducer's return type and the initialState (or the initializer's return type),
  // which would prevent autocompletion from ever working.
  // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
  // in older versions, or a regression in newer versions of the typescript completion service.
  @JSName("useReducer")
  def useReducer_R_ReducerWildcardWildcard[R /* <: Reducer[_, _] */](reducer: R, initialState: ReducerState[R]): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
  /**
    * An alternative to `useState`.
    *
    * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
    * multiple sub-values. It also lets you optimize performance for components that trigger deep
    * updates because you can pass `dispatch` down instead of callbacks.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usereducer
    */
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  @JSName("useReducer")
  def useReducer_R_ReducerWildcardWildcardI[R /* <: Reducer[_, _] */, I](
    reducer: R,
    initializerArg: (I with ReducerState[R]) | I,
    initializer: js.Function1[(/* arg */ I with ReducerState[R]) | (/* arg */ I), ReducerState[R]]
  ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
  // convenience overload for potentially undefined initialValue / call with 0 arguments
  // has a default to stop it from defaulting to {} instead
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  def useRef[T](): MutableRefObject[js.UndefOr[T]] = js.native
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  def useRef[T](initialValue: T): MutableRefObject[T] = js.native
  @JSName("useRef")
  def useRef_T_RefObject[T](): RefHandle[T] = js.native
  // convenience overload for refs given as a ref prop as they typically start with a null value
  /**
    * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
    * (`initialValue`). The returned object will persist for the full lifetime of the component.
    *
    * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
    * value around similar to how you’d use instance fields in classes.
    *
    * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
    * of the generic argument.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useref
    */
  // TODO (TypeScript 3.0): <T extends unknown>
  @JSName("useRef")
  def useRef_T_RefObject[T](initialValue: T): RefHandle[T] = js.native
  // convenience overload when first argument is ommitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  def useTransition(): js.Tuple2[TransitionStartFunction, Boolean] = js.native
  def useTransition(config: SuspenseConfig): js.Tuple2[TransitionStartFunction, Boolean] = js.native
}

