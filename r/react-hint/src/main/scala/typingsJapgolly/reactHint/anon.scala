package typingsJapgolly.reactHint

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.DomElement
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.anon.Default
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListProps
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.Usable
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.CFactory
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DOMAttributes
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
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.ReactHTMLElement
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.Reducer
import typingsJapgolly.react.mod.ReducerAction
import typingsJapgolly.react.mod.ReducerState
import typingsJapgolly.react.mod.ReducerStateWithoutAction
import typingsJapgolly.react.mod.ReducerWithoutAction
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SVGFactory
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.react.mod.SuspenseProps
import typingsJapgolly.react.mod.TransitionFunction
import typingsJapgolly.react.mod.TransitionStartFunction
import typingsJapgolly.reactHint.reactHintStrings.input
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Click extends StObject {
    
    var click: Boolean
    
    var focus: Boolean
    
    var hover: Boolean
  }
  object Click {
    
    inline def apply(click: Boolean, focus: Boolean, hover: Boolean): Click = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any])
      __obj.asInstanceOf[Click]
    }
    
    extension [Self <: Click](x: Self) {
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hide extends StObject {
    
    var hide: Double
    
    var show: Double
  }
  object Hide {
    
    inline def apply(hide: Double, show: Double): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofChildren extends StObject {
    
    def count(children: Any): Double = js.native
    
    def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
    def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
    
    def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
    def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = js.native
    
    def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = js.native
    
    def toArray(children: Node): js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]] = js.native
    def toArray(children: js.Array[Node]): js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]] = js.native
  }
  
  trait TypeofComponent extends StObject {
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    /* static member */
    var contextType: js.UndefOr[Context[Any]] = js.undefined
  }
  object TypeofComponent {
    
    inline def apply(): TypeofComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeofComponent]
    }
    
    extension [Self <: TypeofComponent](x: Self) {
      
      inline def setContextType(value: Context[Any]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    }
  }
  
  @js.native
  trait TypeofReact extends StObject {
    
    // Sync with `ReactChildren` until `ReactChildren` is removed.
    val Children: TypeofChildren = js.native
    
    // Base component for plain JS classes
    var Component: (Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
        japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]
      ]) & TypeofComponent = js.native
    
    val Fragment: ExoticComponent[typingsJapgolly.react.anon.Children] = js.native
    
    val Profiler: ExoticComponent[ProfilerProps] = js.native
    
    var PureComponent: Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
        typingsJapgolly.react.mod.PureComponent[js.Object, js.Object, js.Object]
      ] = js.native
    
    val StrictMode: ExoticComponent[typingsJapgolly.react.anon.Children] = js.native
    
    val Suspense: ExoticComponent[SuspenseProps] = js.native
    
    val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    def cloneElement[P](element: Element, props: Partial[P] & Attributes, children: Node*): Element = js.native
    def cloneElement[P](element: Element, props: Unit, children: Node*): Element = js.native
    // Custom components
    def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: Node*): FunctionComponentElement[P] = js.native
    def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: Node*): FunctionComponentElement[P] = js.native
    // DOM Element (has to be the last, because type checking stops at first overload that fits)
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: DOMAttributes[T] & P, children: Node*): DomElement = js.native
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: Unit, children: Node*): DomElement = js.native
    def cloneElement[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: Node*): CElement[P, T] = js.native
    def cloneElement[P, T /* <: Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Unit, children: Node*): CElement[P, T] = js.native
    // DOM Elements
    // ReactHTMLElement
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: Node*): DetailedReactHTMLElement[P, T] = js.native
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: Node*): DetailedReactHTMLElement[P, T] = js.native
    // SVGElement
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: Node*): ReactSVGElement = js.native
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: Node*): ReactSVGElement = js.native
    // ReactHTMLElement, less specific
    @JSName("cloneElement")
    def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: Node*): ReactHTMLElement[T] = js.native
    @JSName("cloneElement")
    def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: Node*): ReactHTMLElement[T] = js.native
    
    def createContext[T](
      // If you thought this should be optional, see
    // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
    defaultValue: T
    ): Context[T] = js.native
    
    def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Attributes & P, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Null, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Unit, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Null, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
      props: (ClassAttributes[ClassicComponent[P, js.Object]]) & P,
      children: Node*
    ): CElement[P, ClassicComponent[P, js.Object]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
      props: Null,
      children: Node*
    ): CElement[P, ClassicComponent[P, js.Object]] = js.native
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
      props: Unit,
      children: Node*
    ): CElement[P, ClassicComponent[P, js.Object]] = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): Element = js.native
    def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): Element = js.native
    def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.reactHint.reactHintStrings.a, typingsJapgolly.reactHint.reactHintStrings.abbr, typingsJapgolly.reactHint.reactHintStrings.address */ Any,
      props: ClassAttributes[T] & P,
      children: Node*
    ): DetailedReactHTMLElement[P, T] = js.native
    def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.reactHint.reactHintStrings.a, typingsJapgolly.reactHint.reactHintStrings.abbr, typingsJapgolly.reactHint.reactHintStrings.address */ Any,
      props: Null,
      children: Node*
    ): DetailedReactHTMLElement[P, T] = js.native
    def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.reactHint.reactHintStrings.a, typingsJapgolly.reactHint.reactHintStrings.abbr, typingsJapgolly.reactHint.reactHintStrings.address */ Any,
      props: Unit,
      children: Node*
    ): DetailedReactHTMLElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: Node*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Null, children: Node*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Unit, children: Node*): CElement[P, T] = js.native
    @JSName("createElement")
    def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: ClassAttributes[T] & P, children: Node*): DomElement = js.native
    @JSName("createElement")
    def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Null, children: Node*): DomElement = js.native
    @JSName("createElement")
    def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Unit, children: Node*): DomElement = js.native
    @JSName("createElement")
    def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHint.reactHintStrings.animate, typingsJapgolly.reactHint.reactHintStrings.circle, typingsJapgolly.reactHint.reactHintStrings.clipPath */ Any,
      props: ClassAttributes[T] & P,
      children: Node*
    ): ReactSVGElement = js.native
    @JSName("createElement")
    def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHint.reactHintStrings.animate, typingsJapgolly.reactHint.reactHintStrings.circle, typingsJapgolly.reactHint.reactHintStrings.clipPath */ Any,
      props: Null,
      children: Node*
    ): ReactSVGElement = js.native
    @JSName("createElement")
    def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHint.reactHintStrings.animate, typingsJapgolly.reactHint.reactHintStrings.circle, typingsJapgolly.reactHint.reactHintStrings.clipPath */ Any,
      props: Unit,
      children: Node*
    ): ReactSVGElement = js.native
    // Custom components
    @JSName("createElement")
    def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): FunctionComponentElement[P] = js.native
    @JSName("createElement")
    def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): FunctionComponentElement[P] = js.native
    @JSName("createElement")
    def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): FunctionComponentElement[P] = js.native
    // DOM Elements
    // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
    @JSName("createElement")
    def createElement_input(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
      children: Node*
    ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: Null, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    @JSName("createElement")
    def createElement_input(`type`: input, props: Unit, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
    
    def createFactory(
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.reactHint.reactHintStrings.animate, typingsJapgolly.reactHint.reactHintStrings.circle, typingsJapgolly.reactHint.reactHintStrings.clipPath */ Any
    ): SVGFactory = js.native
    def createFactory[P](`type`: ComponentClassP[P & js.Object]): Factory[P] = js.native
    def createFactory[P](`type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, js.Object]] = js.native
    // Custom components
    def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = js.native
    def createFactory[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String): DOMFactory[P, T] = js.native
    @JSName("createFactory")
    def createFactory_PTC_CFactory[P, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C]): CFactory[P, T] = js.native
    //
    // Top Level API
    // ----------------------------------------------------------------------
    // DOM Elements
    @JSName("createFactory")
    def createFactory_T_HTMLFactory[T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.reactHint.reactHintStrings.a, typingsJapgolly.reactHint.reactHintStrings.abbr, typingsJapgolly.reactHint.reactHintStrings.address */ Any
    ): HTMLFactory[T] = js.native
    
    def createRef[T](): RefHandle[T] = js.native
    
    def experimental_use[T](usable: Usable[T]): T = js.native
    
    def experimental_useEvent[T /* <: js.Function */](event: T): T = js.native
    
    def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = js.native
    
    def isValidElement[P](): /* is react.react.ReactElement */ Boolean = js.native
    def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = js.native
    
    def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = js.native
    
    def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = js.native
    def memo[T /* <: ComponentType[Any] */](
      Component: T,
      propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
    ): MemoExoticComponent[T] = js.native
    def memo[P /* <: js.Object */](Component: FunctionComponent[P]): NamedExoticComponent[P] = js.native
    def memo[P /* <: js.Object */](
      Component: FunctionComponent[P],
      propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
    ): NamedExoticComponent[P] = js.native
    
    def startTransition(scope: TransitionFunction): Unit = js.native
    
    // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
    // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
    /**
      * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
      * has changed.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usecallback
      */
    // A specific function type would not trigger implicit any.
    // See https://github.com/DefinitelyTyped/DefinitelyTyped/issues/52873#issuecomment-845806435 for a comparison between `Function` and more specific types.
    // tslint:disable-next-line ban-types
    def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = js.native
    
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
    def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = js.native
    
    def useDeferredValue[T](value: T): T = js.native
    
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
    
    def useId(): String = js.native
    
    def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = js.native
    def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = js.native
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
    def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = js.native
    def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = js.native
    
    def useInsertionEffect(effect: EffectCallback): Unit = js.native
    def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = js.native
    
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
    
    /**
      * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
      *
      * @version 16.8.0
      * @see https://reactjs.org/docs/hooks-reference.html#usememo
      */
    // allow undefined, but don't make it optional as that is very likely a mistake
    def useMemo[T](factory: js.Function0[T]): T = js.native
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
    // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
    // The Flow types do have an overload for 3-ary invocation with undefined initializer.
    // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
    // supertype between the reducer's return type and the initialState (or the initializer's return type),
    // which would prevent autocompletion from ever working.
    // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
    // in older versions, or a regression in newer versions of the typescript completion service.
    def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = js.native
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
    def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
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
    // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
    // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
    // the last overload effectively behaves as if the identity function (x => x) is the initializer.
    // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
    def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
      reducer: R,
      initializerArg: (I & ReducerState[R]) | I,
      initializer: js.Function1[
          (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
          ReducerState[R] | ReducerStateWithoutAction[R]
        ]
    ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = js.native
    
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
    def useRef[T](): RefHandle[T] = js.native
    def useRef[T](initialValue: T): RefHandle[T] = js.native
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
    @JSName("useRef")
    def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = js.native
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
    @JSName("useRef")
    def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = js.native
    
    // convenience overload when first argument is omitted
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
    
    def useSyncExternalStore[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot]
    ): Snapshot = js.native
    def useSyncExternalStore[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: js.Function0[Snapshot]
    ): Snapshot = js.native
    
    def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = js.native
    
    val version: String = js.native
  }
}
