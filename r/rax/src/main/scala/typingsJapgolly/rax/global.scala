package typingsJapgolly.rax

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.rax.mod.Attributes
import typingsJapgolly.rax.mod.CElement
import typingsJapgolly.rax.mod.ClassAttributes
import typingsJapgolly.rax.mod.ClassType
import typingsJapgolly.rax.mod.ClassicComponent
import typingsJapgolly.rax.mod.ClassicComponentClass
import typingsJapgolly.rax.mod.ComponentClass
import typingsJapgolly.rax.mod.ComponentProps
import typingsJapgolly.rax.mod.ComponentState
import typingsJapgolly.rax.mod.ComponentType
import typingsJapgolly.rax.mod.Context
import typingsJapgolly.rax.mod.DOMAttributes
import typingsJapgolly.rax.mod.DOMElement
import typingsJapgolly.rax.mod.DependencyList
import typingsJapgolly.rax.mod.DetailedRaxHTMLElement
import typingsJapgolly.rax.mod.Dispatch
import typingsJapgolly.rax.mod.EffectCallback
import typingsJapgolly.rax.mod.ExoticComponent
import typingsJapgolly.rax.mod.FC
import typingsJapgolly.rax.mod.ForwardRefExoticComponent
import typingsJapgolly.rax.mod.ForwardRefRenderFunction
import typingsJapgolly.rax.mod.FunctionComponent
import typingsJapgolly.rax.mod.FunctionComponentElement
import typingsJapgolly.rax.mod.HTMLAttributes
import typingsJapgolly.rax.mod.InputHTMLAttributes
import typingsJapgolly.rax.mod.JSXElementConstructor
import typingsJapgolly.rax.mod.MemoExoticComponent
import typingsJapgolly.rax.mod.MutableRefObject
import typingsJapgolly.rax.mod.NamedExoticComponent
import typingsJapgolly.rax.mod.PropsWithChildren
import typingsJapgolly.rax.mod.PropsWithoutRef
import typingsJapgolly.rax.mod.RaxChildren
import typingsJapgolly.rax.mod.RaxElement
import typingsJapgolly.rax.mod.RaxInstance
import typingsJapgolly.rax.mod.RaxNode
import typingsJapgolly.rax.mod.RaxSVGElement
import typingsJapgolly.rax.mod.Reducer
import typingsJapgolly.rax.mod.ReducerAction
import typingsJapgolly.rax.mod.ReducerState
import typingsJapgolly.rax.mod.Ref
import typingsJapgolly.rax.mod.RefAttributes
import typingsJapgolly.rax.mod.RefObject
import typingsJapgolly.rax.mod.Renderer
import typingsJapgolly.rax.mod.SVGAttributes
import typingsJapgolly.rax.mod.SetStateAction
import typingsJapgolly.rax.raxStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Rax {
    
    @JSGlobal("Rax")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Rax.Children")
    @js.native
    val Children: RaxChildren = js.native
    
    // Base component for plain JS classes
    @JSGlobal("Rax.Component")
    @js.native
    open class Component[P, S, SS] protected ()
      extends typingsJapgolly.rax.mod.Component[P, S, SS] {
      def this(props: P) = this()
    }
    
    @JSGlobal("Rax.Fragment")
    @js.native
    val Fragment: ExoticComponent[typingsJapgolly.rax.anon.Children] = js.native
    
    @JSGlobal("Rax.PureComponent")
    @js.native
    open class PureComponent[P, S, SS] protected ()
      extends typingsJapgolly.rax.mod.PureComponent[P, S, SS] {
      def this(props: P) = this()
    }
    
    inline def createContext[T](defaultValue: T): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
    inline def createContext[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]): Context[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[Context[T]]
    
    inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
      children: RaxNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
    inline def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: Null,
      children: RaxNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
    inline def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
      props: Unit,
      children: RaxNode*
    ): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
    inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: RaxNode*): RaxElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxElement[P, String | JSXElementConstructor[Any]]]
    inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114, starting with typingsJapgolly.rax.raxStrings.a_, typingsJapgolly.rax.raxStrings.abbr, typingsJapgolly.rax.raxStrings.address */ Any,
      props: ClassAttributes[T] & P,
      children: RaxNode*
    ): DetailedRaxHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[P, T]]
    inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114, starting with typingsJapgolly.rax.raxStrings.a_, typingsJapgolly.rax.raxStrings.abbr, typingsJapgolly.rax.raxStrings.address */ Any,
      props: Null,
      children: RaxNode*
    ): DetailedRaxHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[P, T]]
    inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 114, starting with typingsJapgolly.rax.raxStrings.a_, typingsJapgolly.rax.raxStrings.abbr, typingsJapgolly.rax.raxStrings.address */ Any,
      props: Unit,
      children: RaxNode*
    ): DetailedRaxHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[P, T]]
    
    inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: typingsJapgolly.rax.mod.Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: RaxNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
    inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: typingsJapgolly.rax.mod.Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: RaxNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
    inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: typingsJapgolly.rax.mod.Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: RaxNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
    
    inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: RaxNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
    inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: RaxNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
    inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: RaxNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
    
    inline def createElement_PT_RaxSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.rax.raxStrings.animate, typingsJapgolly.rax.raxStrings.circle, typingsJapgolly.rax.raxStrings.clipPath */ Any,
      props: ClassAttributes[T] & P,
      children: RaxNode*
    ): RaxSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxSVGElement]
    inline def createElement_PT_RaxSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.rax.raxStrings.animate, typingsJapgolly.rax.raxStrings.circle, typingsJapgolly.rax.raxStrings.clipPath */ Any,
      props: Null,
      children: RaxNode*
    ): RaxSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxSVGElement]
    inline def createElement_PT_RaxSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.rax.raxStrings.animate, typingsJapgolly.rax.raxStrings.circle, typingsJapgolly.rax.raxStrings.clipPath */ Any,
      props: Unit,
      children: RaxNode*
    ): RaxSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RaxSVGElement]
    
    // Custom components
    inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: RaxNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
    inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: RaxNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
    inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: RaxNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
    
    /**
      * ======================================================================
      * Rax Top Level API
      * ======================================================================
      */
    // DOM Elements
    // TODO: generalize this to everything in `keyof RaxHTML`, not just "input"
    inline def createElement_input(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
      children: RaxNode*
    ): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    inline def createElement_input(`type`: input, props: Null, children: RaxNode*): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    inline def createElement_input(`type`: input, props: Unit, children: RaxNode*): DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedRaxHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    
    inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
    
    inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]
    
    inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
    inline def memo[T /* <: ComponentType[Any] */](
      Component: T,
      propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
    ): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
    inline def memo[P /* <: js.Object */](Component: FC[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
    inline def memo[P /* <: js.Object */](
      Component: FC[P],
      propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
    ): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]
    
    @JSGlobal("Rax.render")
    @js.native
    val render: Renderer = js.native
    
    object shared {
      
      @JSGlobal("Rax.shared")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Rax.shared.Element")
      @js.native
      def Element: RaxElement[Any, String | JSXElementConstructor[Any]] = js.native
      inline def Element_=(x: RaxElement[Any, String | JSXElementConstructor[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Rax.shared.Host")
      @js.native
      def Host: Any = js.native
      inline def Host_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Host")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Rax.shared.Instance")
      @js.native
      def Instance: RaxInstance = js.native
      inline def Instance_=(x: RaxInstance): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Rax.shared.flattenChildren")
      @js.native
      def flattenChildren: Any = js.native
      inline def flattenChildren_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flattenChildren")(x.asInstanceOf[js.Any])
    }
    
    // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
    // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
    /**
      * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
      * has changed.
      */
    // TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
    inline def useCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
    
    // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
    /**
      * Accepts a context object (the value returned from `Rax.createContext`) and returns the current
      * context value, as given by the nearest context provider for the given context.
      */
    inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Accepts a function that contains imperative, possibly effectful code.
      *
      * @param effect Imperative function that can return a cleanup function
      * @param deps If present, effect will only activate if the values in the list change.
      */
    inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
    /**
      * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
      * `ref`. As always, imperative code using refs should be avoided in most cases.
      *
      * `useImperativeHandle` should be used with `Rax.forwardRef`.
      */
    inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
      * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
      * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
      *
      * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
      *
      * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
      * `componentDidMount` and `componentDidUpdate`.
      */
    inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
      */
    // allow undefined, but don't make it optional as that is very likely a mistake
    inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      */
    // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
    // The Flow types do have an overload for 3-ary invocation with undefined initializer.
    // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
    // supertype between the reducer's return type and the initialState (or the initializer's return type),
    // which would prevent autocompletion from ever working.
    // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
    // in older versions, or a regression in newer versions of the typescript completion service.
    inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      */
    // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
    // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
    // the last overload effectively behaves as if the identity function (x => x) is the initializer.
    // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
    inline def useReducer[R /* <: Reducer[Any, Any] */, I](
      reducer: R,
      initializerArg: (I & ReducerState[R]) | I,
      initializer: js.Function1[(/* arg */ I & ReducerState[R]) | (/* arg */ I), ReducerState[R]]
    ): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
    
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
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    inline def useRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefObject[T]]
    inline def useRef[T](initialValue: T): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]
    
    // convenience overload for potentially undefined initialValue / call with 0 arguments
    // has a default to stop it from defaulting to {} instead
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    inline def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      */
    // TODO (TypeScript 3.0): <T extends unknown>
    inline def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
    
    // convenience overload when first argument is ommitted
    /**
      * Returns a stateful value, and a function to update it.
      */
    inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
    /**
      * Returns a stateful value, and a function to update it.
      */
    inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
    inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
    
    @JSGlobal("Rax.version")
    @js.native
    val version: String = js.native
  }
}
