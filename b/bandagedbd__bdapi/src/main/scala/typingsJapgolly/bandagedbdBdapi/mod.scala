package typingsJapgolly.bandagedbdBdapi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.DomElement
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.MutationRecord
import org.scalajs.dom.SVGElement
import org.scalajs.dom.Text
import typingsJapgolly.bandagedbdBdapi.anon.TypeofBdApiModule
import typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.input
import typingsJapgolly.lodash.mod.LoDashStatic
import typingsJapgolly.react.anon.Children
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
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.react.mod.ReactPortal
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
import typingsJapgolly.reactDom.mod.Renderer
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    /* was `typeof BdApiModule` */
    object BdApi {
      
      @JSGlobal("BdApi")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The following functions are available as a part of each `AddonAPI` object from `BdApi`.
        */
      /* was `typeof AddonAPI` */
      @JSGlobal("BdApi.Plugins")
      @js.native
      open class Plugins ()
        extends StObject
           with AddonAPI {
        
        /**
          * Disables the given addon.
          * @param name The name/identifier of the addon.
          */
        /* CompleteClass */
        override def disable(name: String): Unit = js.native
        
        /**
          * Enables the given addon
          * @param name The name/identifier of the addon.
          */
        /* CompleteClass */
        override def enable(name: String): Unit = js.native
        
        /**
          * String representing the resolved location of the user's addon folder.
          */
        /* CompleteClass */
        override val folder: String = js.native
        
        /**
          * Gets the "instance" of the given addon.
          * @param name The name/identifier of the addon.
          * @returns For plugins, this is the plugin instance, for themes this is the meta + css.
          */
        /* CompleteClass */
        override def get(name: String): js.Object = js.native
        
        /**
          * Gets all the "instances" of addon type.
          * @returns An array matching the output of get.
          */
        /* CompleteClass */
        override def getAll(): Unit = js.native
        
        /**
          * Checks if the given addon is currently enabled.
          * @param name The name/identifier of the addon.
          * @returns Indicates if the addon is enabled.
          */
        /* CompleteClass */
        override def isEnabled(name: String): Boolean = js.native
        
        /**
          * Toggle the enablement the given addon.
          * @param name The name/identifier of the addon.
          */
        /* CompleteClass */
        override def toggle(name: String): Unit = js.native
      }
      
      /* was `typeof ReactInstance` */
      object React {
        
        @JSGlobal("BdApi.React")
        @js.native
        val ^ : js.Any = js.native
        
        // Sync with `ReactChildren` until `ReactChildren` is removed.
        object Children {
          
          @JSGlobal("BdApi.React.Children")
          @js.native
          val ^ : js.Any = js.native
          
          inline def count(children: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(children.asInstanceOf[js.Any]).asInstanceOf[Double]
          
          inline def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
          inline def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
          
          inline def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
          inline def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
          
          inline def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(children.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any]
          
          inline def toArray(children: Node): js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]]]
          inline def toArray(children: js.Array[Node]): js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[Node, js.UndefOr[Boolean | Null]]]]
        }
        
        // Base component for plain JS classes
        @JSGlobal("BdApi.React.Component")
        @js.native
        open class Component[P, S, SS] protected ()
          extends typingsJapgolly.react.mod.Component[P, S, SS] {
          def this(props: P) = this()
          /**
            * @deprecated
            * @see https://reactjs.org/docs/legacy-context.html
            */
          def this(props: P, context: Any) = this()
        }
        object Component {
          
          @JSGlobal("BdApi.React.Component")
          @js.native
          val ^ : js.Any = js.native
          
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
          @JSGlobal("BdApi.React.Component.contextType")
          @js.native
          def contextType: js.UndefOr[Context[Any]] = js.native
          inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
        }
        
        @JSGlobal("BdApi.React.Fragment")
        @js.native
        val Fragment: ExoticComponent[Children] = js.native
        
        @JSGlobal("BdApi.React.Profiler")
        @js.native
        val Profiler: ExoticComponent[ProfilerProps] = js.native
        
        @JSGlobal("BdApi.React.PureComponent")
        @js.native
        open class PureComponent[P, S, SS] protected ()
          extends typingsJapgolly.react.mod.PureComponent[P, S, SS] {
          def this(props: P) = this()
          /**
            * @deprecated
            * @see https://reactjs.org/docs/legacy-context.html
            */
          def this(props: P, context: Any) = this()
        }
        
        @JSGlobal("BdApi.React.StrictMode")
        @js.native
        val StrictMode: ExoticComponent[Children] = js.native
        
        @JSGlobal("BdApi.React.Suspense")
        @js.native
        val Suspense: ExoticComponent[SuspenseProps] = js.native
        
        @JSGlobal("BdApi.React.SuspenseList")
        @js.native
        val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
        
        inline def cloneElement[P](element: Element, props: Partial[P] & Attributes, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def cloneElement[P](element: Element, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        // Custom components
        inline def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
        inline def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
        // DOM Element (has to be the last, because type checking stops at first overload that fits)
        inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: DOMAttributes[T] & P, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
        inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](element: DomElement, props: Unit, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
        inline def cloneElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
        inline def cloneElement[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */](element: CElement[P, T], props: Unit, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
        // DOM Elements
        // ReactHTMLElement
        inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: Node*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
        inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: Node*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
        // SVGElement
        inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: Node*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
        inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: Node*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
        
        // ReactHTMLElement, less specific
        inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: Node*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
        inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: Node*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
        
        inline def createContext[T](
          // If you thought this should be optional, see
        // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
        defaultValue: T
        ): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
        
        inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](
          `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
          props: (ClassAttributes[ClassicComponent[P, js.Object]]) & P,
          children: Node*
        ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
        inline def createElement[P /* <: js.Object */](
          `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
          props: Null,
          children: Node*
        ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
        inline def createElement[P /* <: js.Object */](
          `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
          props: Unit,
          children: Node*
        ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
        inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
        inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.a, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.abbr, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.address */ Any,
          props: ClassAttributes[T] & P,
          children: Node*
        ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
        inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.a, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.abbr, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.address */ Any,
          props: Null,
          children: Node*
        ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
        inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.a, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.abbr, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.address */ Any,
          props: Unit,
          children: Node*
        ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
        
        inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
        inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Null, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
        inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Unit, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
        
        inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: ClassAttributes[T] & P, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
        inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Null, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
        inline def createElement_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Unit, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
        
        inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.animate, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.circle, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.clipPath */ Any,
          props: ClassAttributes[T] & P,
          children: Node*
        ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
        inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.animate, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.circle, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.clipPath */ Any,
          props: Null,
          children: Node*
        ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
        inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.animate, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.circle, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.clipPath */ Any,
          props: Unit,
          children: Node*
        ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
        
        // Custom components
        inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
        inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
        inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
        
        // DOM Elements
        // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
        inline def createElement_input(
          `type`: input,
          props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
          children: Node*
        ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
        inline def createElement_input(`type`: input, props: Null, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
        inline def createElement_input(`type`: input, props: Unit, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
        
        inline def createFactory(
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.animate, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.circle, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.clipPath */ Any
        ): SVGFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGFactory]
        inline def createFactory[P](`type`: ComponentClassP[P & js.Object]): Factory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Factory[P]]
        inline def createFactory[P](`type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, ClassicComponent[P, js.Object]]]
        // Custom components
        inline def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentFactory[P]]
        inline def createFactory[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String): DOMFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DOMFactory[P, T]]
        
        inline def createFactory_PTC_CFactory[P, T /* <: japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C]): CFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, T]]
        
        //
        // Top Level API
        // ----------------------------------------------------------------------
        // DOM Elements
        inline def createFactory_T_HTMLFactory[T /* <: HTMLElement */](
          `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.a, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.abbr, typingsJapgolly.bandagedbdBdapi.bandagedbdBdapiStrings.address */ Any
        ): HTMLFactory[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[HTMLFactory[T]]
        
        inline def createRef[T](): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefHandle[T]]
        
        inline def experimentalUse[T](usable: Usable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]
        
        inline def experimentalUseEvent[T /* <: js.Function */](event: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]
        
        inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]
        
        inline def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
        inline def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
        
        inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]
        
        inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
        inline def memo[T /* <: ComponentType[Any] */](
          Component: T,
          propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
        ): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
        inline def memo[P /* <: js.Object */](Component: FunctionComponent[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
        inline def memo[P /* <: js.Object */](
          Component: FunctionComponent[P],
          propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
        ): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]
        
        inline def startTransition(scope: TransitionFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
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
        inline def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
        
        // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
        /**
          * Accepts a context object (the value returned from `React.createContext`) and returns the current
          * context value, as given by the nearest context provider for the given context.
          *
          * @version 16.8.0
          * @see https://reactjs.org/docs/hooks-reference.html#usecontext
          */
        inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
        
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
        inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
        
        /**
          * Accepts a function that contains imperative, possibly effectful code.
          *
          * @param effect Imperative function that can return a cleanup function
          * @param deps If present, effect will only activate if the values in the list change.
          *
          * @version 16.8.0
          * @see https://reactjs.org/docs/hooks-reference.html#useeffect
          */
        inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
        
        inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
        inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def useInsertionEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
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
        inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
          *
          * @version 16.8.0
          * @see https://reactjs.org/docs/hooks-reference.html#usememo
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
        inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
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
        inline def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
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
        inline def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
          reducer: R,
          initializerArg: (I & ReducerState[R]) | I,
          initializer: js.Function1[
                  (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
                  ReducerState[R] | ReducerStateWithoutAction[R]
                ]
        ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
        
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
        inline def useRef[T](): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefHandle[T]]
        inline def useRef[T](initialValue: T): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefHandle[T]]
        
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
        inline def useRef_T_MutableRefObject[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
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
        inline def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
        
        // convenience overload when first argument is omitted
        /**
          * Returns a stateful value, and a function to update it.
          *
          * @version 16.8.0
          * @see https://reactjs.org/docs/hooks-reference.html#usestate
          */
        inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
        /**
          * Returns a stateful value, and a function to update it.
          *
          * @version 16.8.0
          * @see https://reactjs.org/docs/hooks-reference.html#usestate
          */
        inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
        inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
        
        inline def useSyncExternalStore[Snapshot](
          subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
          getSnapshot: js.Function0[Snapshot]
        ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
        inline def useSyncExternalStore[Snapshot](
          subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
          getSnapshot: js.Function0[Snapshot],
          getServerSnapshot: js.Function0[Snapshot]
        ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
        
        inline def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[Boolean, TransitionStartFunction]]
        
        @JSGlobal("BdApi.React.version")
        @js.native
        val version: String = js.native
      }
      
      /* was `typeof ReactDOMInstance` */
      object ReactDOM {
        
        @JSGlobal("BdApi.ReactDOM")
        @js.native
        val ^ : js.Any = js.native
        
        inline def createPortal(children: Node, container: DocumentFragment): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
        inline def createPortal(children: Node, container: DocumentFragment, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
        inline def createPortal(children: Node, container: org.scalajs.dom.Element): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
        inline def createPortal(children: Node, container: org.scalajs.dom.Element, key: String): ReactPortal = (^.asInstanceOf[js.Dynamic].applyDynamic("createPortal")(children.asInstanceOf[js.Any], container.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactPortal]
        
        inline def findDOMNode(): org.scalajs.dom.Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")().asInstanceOf[org.scalajs.dom.Element | Null | Text]
        inline def findDOMNode(instance: ReactInstance): org.scalajs.dom.Element | Null | Text = ^.asInstanceOf[js.Dynamic].applyDynamic("findDOMNode")(instance.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Element | Null | Text]
        
        inline def flushSync[R](fn: js.Function0[R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any]).asInstanceOf[R]
        inline def flushSync[A, R](fn: js.Function1[/* a */ A, R], a: A): R = (^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[R]
        
        @JSGlobal("BdApi.ReactDOM.hydrate")
        @js.native
        val hydrate: Renderer = js.native
        
        @JSGlobal("BdApi.ReactDOM.render")
        @js.native
        val render: Renderer = js.native
        
        inline def unmountComponentAtNode(container: DocumentFragment): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        inline def unmountComponentAtNode(container: org.scalajs.dom.Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(container.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        
        inline def unstableBatchedUpdates(callback: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def unstableBatchedUpdates[A](callback: js.Function1[/* a */ A, Any], a: A): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def unstableBatchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, Any], a: A, b: B): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_batchedUpdates")(callback.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def unstableRenderSubtreeIntoContainer[T /* <: org.scalajs.dom.Element */](
          parentComponent: Component[Any & js.Object, js.Object],
          element: DomElement,
          container: org.scalajs.dom.Element
        ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
        inline def unstableRenderSubtreeIntoContainer[T /* <: org.scalajs.dom.Element */](
          parentComponent: Component[Any & js.Object, js.Object],
          element: DomElement,
          container: org.scalajs.dom.Element,
          callback: js.Function1[/* element */ T, Any]
        ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
        inline def unstableRenderSubtreeIntoContainer[P](
          parentComponent: Component[Any & js.Object, js.Object],
          element: Element,
          container: org.scalajs.dom.Element
        ): (Component[P & js.Object, js.Object]) | org.scalajs.dom.Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[(Component[P & js.Object, js.Object]) | org.scalajs.dom.Element | Unit]
        inline def unstableRenderSubtreeIntoContainer[P](
          parentComponent: Component[Any & js.Object, js.Object],
          element: Element,
          container: org.scalajs.dom.Element,
          callback: js.Function1[
                  /* component */ js.UndefOr[(Component[P & js.Object, js.Object]) | org.scalajs.dom.Element], 
                  Any
                ]
        ): (Component[P & js.Object, js.Object]) | org.scalajs.dom.Element | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[(Component[P & js.Object, js.Object]) | org.scalajs.dom.Element | Unit]
        inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P & js.Object, js.Object] */](
          parentComponent: Component[Any & js.Object, js.Object],
          element: CElement[P, T],
          container: org.scalajs.dom.Element
        ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[T]
        inline def unstableRenderSubtreeIntoContainer[P, T /* <: Component[P & js.Object, js.Object] */](
          parentComponent: Component[Any & js.Object, js.Object],
          element: CElement[P, T],
          container: org.scalajs.dom.Element,
          callback: js.Function1[/* component */ T, Any]
        ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_renderSubtreeIntoContainer")(parentComponent.asInstanceOf[js.Any], element.asInstanceOf[js.Any], container.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
        
        @JSGlobal("BdApi.ReactDOM.version")
        @js.native
        val version: String = js.native
      }
      
      /**
        * Creates an shows an alert modal to the user. A preview of how it may look can be found [here](https://i.zackrauen.com/7qnnNC.png).
        * @param title The title to show on the modal.
        * @param content Content to show in the modal (can be html string).
        */
      inline def alert(title: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Removes a style added with `injectCSS` below.
        * @param id ID of the node to remove.
        */
      inline def clearCSS(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCSS")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Deletes some saved data for plugin `pluginName` with key `key`.
        * @param pluginName Which plugin this is being used for.
        * @param key Key for which data should be deleted.
        */
      inline def deleteData(pluginName: String, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Disables a BBD setting by id.
        * @param id Id for the setting.
        */
      inline def disableSetting(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableSetting")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Gives access to BBD's internal emotes object and is therefore subject to change.
        */
      @JSGlobal("BdApi.emotes")
      @js.native
      val emotes: Any = js.native
      
      /**
        * Enables a BBD setting by id.
        * @param id Id for the setting.
        */
      inline def enableSetting(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableSetting")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Searches for multiple internal Discord webpack module based on `filter`. It's the same as `findModule` but will return all matches.
        * @param filter A function to use to filter modules.
        * @returns The modules found or null if none were found.
        */
      inline def findAllModules(filter: js.Function1[/* module */ Any, Boolean]): js.Array[Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllModules")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any] | Null]
      
      /**
        * Searches for an internal Discord webpack module based on `filter`.
        * @param filter A function to use to filter modules.
        * @returns The modules found or null if none were found.
        */
      inline def findModule(filter: js.Function1[/* module */ Any, Boolean]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModule")(filter.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /**
        * Searches for an internal Discord webpack module with a specific `displayName` value.
        * @param name The `displayName` to look for.
        * @returns The modules found or null if none were found.
        */
      inline def findModuleByDisplayName(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByDisplayName")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      /**
        * Searches for an internal Discord webpack module that has every property passed.
        * @param props A series of properties to check for.
        * @returns The modules found or null if none were found.
        */
      inline def findModuleByProps(props: String*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByProps")(props.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      /**
        * Searches for an internal Discord webpack module that has every property passed on its prototype.
        * @param props A series of prototype properties to check for
        * @returns The modules found or null if none were found..
        */
      inline def findModuleByPrototypes(props: String*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findModuleByPrototypes")(props.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      /**
        * Returns BandagedBD's instance of the core module. Only use this if you know what you are doing.
        * @deprecated since 2020.3.27
        * @returns BBD's instantiated core module.
        */
      inline def getCore(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCore")().asInstanceOf[Any]
      
      // TODO: This should not return 'any' but instead 'Core'
      // Not worth it in my opinion because it's deprecated (commit caf3406e0a22a24dc5ad76d9c51edb3330d379b7)
      /**
        * Alias for loadData(pluginName, key)
        * @param pluginName Which plugin this is being used for.
        * @param key Key for which data should be returned.
        * @returns The information that was saved previously, or null otherwise.
        */
      inline def getData(pluginName: String, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /**
        * Gets the internal react instance for a particular node.
        * @param node jQuery
        * @returns The instance if found or undefined otherwise.
        */
      inline def getInternalInstance(node: HTMLElement): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternalInstance")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Object]]
      
      /**
        * Gets the instance of another plugin with the name `name`.
        * @deprecated since unknown
        * @param name Name of the plugin to retreive.
        * @returns The plugin if found or null otherwise.
        */
      inline def getPlugin(name: String): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]
      
      /**
        * Adds a block of css to the current document's `head`.
        * @param id Identifier for the node to be added. Can be used later with `clearCSS` from above.
        * @param css String of css to be added.
        * @returns The plugin if found or null otherwise.
        */
      inline def injectCSS(id: String, css: String): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("injectCSS")(id.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
      
      /**
        * Links some remote JavaScript to be added to the page. Useful for libraries like `Sortable.js`.
        * @param id Identifier for the node to be added. Can be used later with `unlinkJS` below.
        * @param url URL of the js.
        */
      inline def linkJS(id: String, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkJS")(id.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Gets some saved data for plugin `pluginName` with key `key`. Data can be saved with `saveData`.
        * @param pluginName Which plugin this is being used for.
        * @param key Key for which data should be returned.
        * @returns The information that was saved previously, or null otherwise.
        */
      inline def loadData(pluginName: String, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("loadData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /**
        * This function monkey-patches a method on an object. The patching callback may be run before, after or instead of target method.
        * - Be careful when monkey-patching. Think not only about original functionality of target method and your changes,
        * but also about developers of other plugins, who may also patch this method before or after you.
        * Try to change target method behaviour as little as possible, and avoid changing method signatures.
        * - Display name of patched method is changed, so you can see if a function has been patched (and how many times) while debugging or in the stack trace.
        * Also, patched methods have property `__monkeyPatched` set to `true`, in case you want to check something programmatically.
        * @param module Object to be patched. You can can also pass class prototypes to patch all class instances.
        * @param methodName The name of the target message to be patched.
        * @param options Options object. You should provide at least one of `before`, `after` or `instead` parameters. Other parameters are optional.
        * @param options.once Set to `true` if you want to automatically unpatch method after first call.
        * @param options.silent Set to `true` if you want to suppress log messages about patching and unpatching.
        * Useful to avoid clogging the console in case of frequent conditional patching/unpatching, for example from another monkeyPatch callback.
        * @param options.displayName You can provide meaningful name for class/object provided in `what` param for logging purposes.
        * By default, this function will try to determine name automatically.
        * @param options.before Callback that will be called before original target method call. You can modify arguments here, so it will be passed to original method.Can be combined with `after`.
        * @param options.after Callback that will be called after original target method call. You can modify return value here, so it will be passed to external code which calls target method.
        * Can be combined with `before`.
        * @param options.instead Callback that will be called instead of original target method call.
        * You can get access to original method using `originalMethod` parameter if you want to call it, but you do not have to.
        * Can't be combined with `before` and `after`.
        * @returns A cancel function which allows you to undo the patch.
        */
      inline def monkeyPatch(module: js.Object, methodName: String, options: MonkeyPatchOptions): CancelPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("monkeyPatch")(module.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelPatch]
      
      /**
        * Adds a listener for when the node is removed from the document body.
        * @param node Node to wait for.
        * @param callback Function to be performed on event.
        */
      inline def onRemoved(node: HTMLElement, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onRemoved")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Saved some `data` for plugin `pluginName` under `key` key. Gets saved in the plugins folder under `pluginName.config.json`. Data can be saved with `loadData`.
        * @param pluginName Which plugin this is being used for.
        * @param key Key for the data should be saved under.
        * @param data Data to save.
        */
      inline def saveData(pluginName: String, key: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Yields the total active height of the application.
        */
      @JSGlobal("BdApi.screenHeight")
      @js.native
      val screenHeight: Double = js.native
      
      /**
        * Yields the total active width of the application.
        */
      @JSGlobal("BdApi.screenWidth")
      @js.native
      val screenWidth: Double = js.native
      
      /**
        * Alias for saveData(pluginName, key, data)
        * @param pluginName Which plugin this is being used for.
        * @param key Key for the data should be saved under.
        * @param data Data to save.
        */
      inline def setData(pluginName: String, key: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(pluginName.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Gives access to BBD's internal settings object and is therefore subject to change.
        */
      @JSGlobal("BdApi.settings")
      @js.native
      val settings: Any = js.native
      
      /**
        * Shows a generic but very customizable confirmation modal with optional confirm and cancel callbacks.
        * @param title Title of the modal.
        * @param content A single or mixed array of react elements and strings. Everything is wrapped in Discord's `TextElement` component so strings will show and render properly.
        * @param options Options to modify the modal.
        * @param options.danger Whether the main button should be red or not.
        * @param options.confirmText Text for the confirmation/submit button.
        * @param options.canceltext Text for the cancel button.
        * @param options.onConfirm Callback to occur when clicking the submit button.
        * @param options.onCancel Callback to occur when clicking the cancel button.
        */
      inline def showConfirmationModal(title: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showConfirmationModal")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def showConfirmationModal(title: String, content: String, options: ConfirmationModalOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showConfirmationModal")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Shows a simple toast message similar to on Android. An example of the `success` toast can be seen [here](https://i.zackrauen.com/zIagVa.png).
        * @param content Content to show inside the toast.
        * @param options Options for the toast.
        * @param options.type Changes the type of the toast stylistically and semantically. Choices: "", "info", "success", "danger"/"error", "warning"/"warn". Default: ""
        * @param options.icon Determines whether the icon should show corresponding to the type. A toast without type will always have no icon. Default: true
        * @param options.timeout Adjusts the time (in ms) the toast should be shown for before disappearing automatically. Default: 3000
        */
      inline def showToast(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def showToast(content: String, options: ToastOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Wraps a function in a try catch block.
        * @param method Function to wrap.
        * @param message Additional info for any errors.
        */
      inline def suppressErrors(method: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrors")(method.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
      inline def suppressErrors(method: js.Function0[Unit], message: String): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrors")(method.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
      
      /**
        * Determines if the input is valid and parseable JSON.
        * @param data Data to test.
        * @returns True if the data is valid, false otherwise.
        */
      inline def testJSON(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("testJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Toggles a BBD setting by id.
        * @param id Id for the setting.
        */
      inline def toggleOption(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleOption")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Removes some previously linked JS by `linkJS`.
        * @param id ID of the node to remove.
        */
      inline def unlinkJS(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkJS")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /* was `typeof _` */
    @JSGlobal("_")
    @js.native
    val _underscore: LoDashStatic = js.native
    
    @JSGlobal("global")
    @js.native
    val global: Window = js.native
    
    trait Window extends StObject {
      
      var BdApi: TypeofBdApiModule
      
      @JSName("_")
      var _underscore: LoDashStatic
    }
    object Window {
      
      inline def apply(BdApi: TypeofBdApiModule, _underscore: LoDashStatic): Window = {
        val __obj = js.Dynamic.literal(BdApi = BdApi.asInstanceOf[js.Any])
        __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setBdApi(value: TypeofBdApiModule): Self = StObject.set(x, "BdApi", value.asInstanceOf[js.Any])
        
        inline def set_underscore(value: LoDashStatic): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * The following functions are available as a part of each `AddonAPI` object from `BdApi`.
    */
  trait AddonAPI extends StObject {
    
    /**
      * Disables the given addon.
      * @param name The name/identifier of the addon.
      */
    def disable(name: String): Unit
    
    /**
      * Enables the given addon
      * @param name The name/identifier of the addon.
      */
    def enable(name: String): Unit
    
    /**
      * String representing the resolved location of the user's addon folder.
      */
    val folder: String
    
    /**
      * Gets the "instance" of the given addon.
      * @param name The name/identifier of the addon.
      * @returns For plugins, this is the plugin instance, for themes this is the meta + css.
      */
    def get(name: String): js.Object
    
    /**
      * Gets all the "instances" of addon type.
      * @returns An array matching the output of get.
      */
    def getAll(): Unit
    
    /**
      * Checks if the given addon is currently enabled.
      * @param name The name/identifier of the addon.
      * @returns Indicates if the addon is enabled.
      */
    def isEnabled(name: String): Boolean
    
    /**
      * Toggle the enablement the given addon.
      * @param name The name/identifier of the addon.
      */
    def toggle(name: String): Unit
  }
  object AddonAPI {
    
    inline def apply(
      disable: String => Callback,
      enable: String => Callback,
      folder: String,
      get: String => js.Object,
      getAll: Callback,
      isEnabled: String => Boolean,
      toggle: String => Callback
    ): AddonAPI = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction1((t0: String) => disable(t0).runNow()), enable = js.Any.fromFunction1((t0: String) => enable(t0).runNow()), folder = folder.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = getAll.toJsFn, isEnabled = js.Any.fromFunction1(isEnabled), toggle = js.Any.fromFunction1((t0: String) => toggle(t0).runNow()))
      __obj.asInstanceOf[AddonAPI]
    }
    
    extension [Self <: AddonAPI](x: Self) {
      
      inline def setDisable(value: String => Callback): Self = StObject.set(x, "disable", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setEnable(value: String => Callback): Self = StObject.set(x, "enable", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => js.Object): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAll(value: Callback): Self = StObject.set(x, "getAll", value.toJsFn)
      
      inline def setIsEnabled(value: String => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      inline def setToggle(value: String => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  object BdApiModule {
    
    /**
      * The following functions are available as a part of each `AddonAPI` object from `BdApi`.
      */
    /* was `typeof AddonAPI` */
    type Plugins = AddonAPI
    
    /* was `typeof ReactInstance` */
    object React {
      
      // Base component for plain JS classes
      type Component[P, S, SS] = japgolly.scalajs.react.facade.React.Component[P & js.Object, js.Object]
      
      type PureComponent[P, S, SS] = typingsJapgolly.react.mod.PureComponent[P, S, SS]
    }
  }
  
  trait BdPlugin extends StObject {
    
    /**
      * The author string for the plugin displayed in the plugins page.
      *
      * Note: This is no longer required if it is included in the meta.
      * @returns the author of the plugin.
      */
    var getAuthor: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * The description of the plugin shown in the plugins page.
      *
      * Note: This is no longer required if it is included in the meta.
      * @returns the description of the plugin.
      */
    var getDescription: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * The name for the plugin to be displayed to the user in the plugins page and for internal settings to use.
      *
      * Note: This is no longer required if it is included in the meta.
      * @returns the name for the plugin.
      */
    var getName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * Called when the user clicks on the settings button for the plugin. If this function is not implemented the button is not shown.
      *
      * Note: The button will be disabled if the plugin is disabled to avoid errors with not-started plugins.
      */
    var getSettingsPanel: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * The version of the plugin displayed in the plugins page.
      *
      * Note: This is no longer required if it is included in the meta.
      * @returns the version of the plugin.
      */
    var getVersion: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * Called when the plugin is loaded regardless of if it is enabled or disabled.
      */
    var load: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called on every mutation that occurs on the document. For more information on observers and mutations take a look at
      * [MDN's documentation](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver).
      * @param e The mutation that occurred.
      */
    var observer: js.UndefOr[js.Function1[/* e */ MutationRecord, Unit]] = js.undefined
    
    /**
      * Called every time the user navigates such as changing channel, changing servers, changing to friends list, etc.
      */
    var onSwitch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when the plugin is enabled or when it is loaded and was previously reloaded (such as discord start or reload).
      */
    def start(): Unit
    
    /**
      * Called when the plugin is disabled.
      */
    def stop(): Unit
  }
  object BdPlugin {
    
    inline def apply(start: Callback, stop: Callback): BdPlugin = {
      val __obj = js.Dynamic.literal(start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[BdPlugin]
    }
    
    extension [Self <: BdPlugin](x: Self) {
      
      inline def setGetAuthor(value: CallbackTo[String]): Self = StObject.set(x, "getAuthor", value.toJsFn)
      
      inline def setGetAuthorUndefined: Self = StObject.set(x, "getAuthor", js.undefined)
      
      inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
      
      inline def setGetDescriptionUndefined: Self = StObject.set(x, "getDescription", js.undefined)
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetSettingsPanel(value: CallbackTo[String]): Self = StObject.set(x, "getSettingsPanel", value.toJsFn)
      
      inline def setGetSettingsPanelUndefined: Self = StObject.set(x, "getSettingsPanel", js.undefined)
      
      inline def setGetVersion(value: CallbackTo[String]): Self = StObject.set(x, "getVersion", value.toJsFn)
      
      inline def setGetVersionUndefined: Self = StObject.set(x, "getVersion", js.undefined)
      
      inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setObserver(value: /* e */ MutationRecord => Callback): Self = StObject.set(x, "observer", js.Any.fromFunction1((t0: /* e */ MutationRecord) => value(t0).runNow()))
      
      inline def setObserverUndefined: Self = StObject.set(x, "observer", js.undefined)
      
      inline def setOnSwitch(value: Callback): Self = StObject.set(x, "onSwitch", value.toJsFn)
      
      inline def setOnSwitchUndefined: Self = StObject.set(x, "onSwitch", js.undefined)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  type CancelPatch = js.Function0[Unit]
  
  trait ConfirmationModalOptions extends StObject {
    
    var cancelText: js.UndefOr[String] = js.undefined
    
    var confirmText: js.UndefOr[String] = js.undefined
    
    var danger: js.UndefOr[Boolean] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onConfirm: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object ConfirmationModalOptions {
    
    inline def apply(): ConfirmationModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmationModalOptions]
    }
    
    extension [Self <: ConfirmationModalOptions](x: Self) {
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
      
      inline def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
      
      inline def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      inline def setOnCancel(value: CallbackTo[Any]): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnConfirm(value: CallbackTo[Any]): Self = StObject.set(x, "onConfirm", value.toJsFn)
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  trait MonkeyPatchOptions extends StObject {
    
    var after: js.UndefOr[PatchFunction] = js.undefined
    
    var before: js.UndefOr[PatchFunction] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var instead: js.UndefOr[PatchFunction] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object MonkeyPatchOptions {
    
    inline def apply(): MonkeyPatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MonkeyPatchOptions]
    }
    
    extension [Self <: MonkeyPatchOptions](x: Self) {
      
      inline def setAfter(value: /* data */ PatchData => Any): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: /* data */ PatchData => Any): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setInstead(value: /* data */ PatchData => Any): Self = StObject.set(x, "instead", js.Any.fromFunction1(value))
      
      inline def setInsteadUndefined: Self = StObject.set(x, "instead", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait PatchData extends StObject {
    
    var CancelPatch: typingsJapgolly.bandagedbdBdapi.mod.CancelPatch
    
    def callOriginalMethod(): Unit
    
    var methodArguments: js.Array[Any]
    
    def originalMethod(): Unit
    
    var returnValue: Any
    
    var thisObject: js.Object
  }
  object PatchData {
    
    inline def apply(
      CancelPatch: Callback,
      callOriginalMethod: Callback,
      methodArguments: js.Array[Any],
      originalMethod: Callback,
      returnValue: Any,
      thisObject: js.Object
    ): PatchData = {
      val __obj = js.Dynamic.literal(CancelPatch = CancelPatch.toJsFn, callOriginalMethod = callOriginalMethod.toJsFn, methodArguments = methodArguments.asInstanceOf[js.Any], originalMethod = originalMethod.toJsFn, returnValue = returnValue.asInstanceOf[js.Any], thisObject = thisObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchData]
    }
    
    extension [Self <: PatchData](x: Self) {
      
      inline def setCallOriginalMethod(value: Callback): Self = StObject.set(x, "callOriginalMethod", value.toJsFn)
      
      inline def setCancelPatch(value: Callback): Self = StObject.set(x, "CancelPatch", value.toJsFn)
      
      inline def setMethodArguments(value: js.Array[Any]): Self = StObject.set(x, "methodArguments", value.asInstanceOf[js.Any])
      
      inline def setMethodArgumentsVarargs(value: Any*): Self = StObject.set(x, "methodArguments", js.Array(value*))
      
      inline def setOriginalMethod(value: Callback): Self = StObject.set(x, "originalMethod", value.toJsFn)
      
      inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setThisObject(value: js.Object): Self = StObject.set(x, "thisObject", value.asInstanceOf[js.Any])
    }
  }
  
  type PatchFunction = js.Function1[/* data */ PatchData, Any]
  
  trait ToastOptions extends StObject {
    
    var icon: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToastOptions {
    
    inline def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    extension [Self <: ToastOptions](x: Self) {
      
      inline def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
