package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.TreeWalker
import typingsJapgolly.orbitUiReactComponents.anon.Add
import typingsJapgolly.orbitUiReactComponents.anon.Dispose
import typingsJapgolly.orbitUiReactComponents.anon.From
import typingsJapgolly.orbitUiReactComponents.anon.IsDisabled
import typingsJapgolly.orbitUiReactComponents.anon.OnBlurOnFocus
import typingsJapgolly.orbitUiReactComponents.anon.OnFocus
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyDown
import typingsJapgolly.orbitUiReactComponents.anon.`0`
import typingsJapgolly.orbitUiReactComponents.anon.`2`
import typingsJapgolly.orbitUiReactComponents.distSharedSrcAugmentElementMod.RecordWithSize
import typingsJapgolly.orbitUiReactComponents.distSharedSrcCheckableContextMod.CheckableContextType
import typingsJapgolly.orbitUiReactComponents.distSharedSrcCheckableContextMod.UseCheckablePropsReturn
import typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusableTreeWalkerMod.FocusableTreeWalkerOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.AsRef
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distSharedSrcMergePropsMod.Props
import typingsJapgolly.orbitUiReactComponents.distSharedSrcMergePropsMod.TupleTypes
import typingsJapgolly.orbitUiReactComponents.distSharedSrcMergePropsMod.UnionToIntersection
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSizeMod.Size
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSizeMod.SizeAdapter
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSlotsMod.GetSlotsReturn
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSlotsMod.SlotOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSlotsMod.UseSlotsReturn
import typingsJapgolly.orbitUiReactComponents.distSharedSrcStyleContextMod.StyleContextType
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseAutoFocusMod.AutoFocusChildOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseAutoFocusMod.AutoFocusOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseChainedEventCallbackMod.ChainableFunction
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseControllableStateMod.ControllableStateOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManagerOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.ChangeEventHandler
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusWithinMod.UseFocusWithinOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseKeyboardNavigationMod.KeyboardNavigationBindings
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseKeyboardNavigationMod.KeyboardNavigationOptions
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.AssignableRef
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.UnwrapStateType
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseResizeObserverMod.UseResizeObserverOptions
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsBooleans.`false`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefRenderFunction
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.std.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared", "CheckableContext")
  @js.native
  val CheckableContext: Context[CheckableContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared", "CompositeKeyWeakMap")
  @js.native
  open class CompositeKeyWeakMap[T] ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedSrcMod.CompositeKeyWeakMap[T]
  
  @JSImport("@orbit-ui/react-components/dist/shared", "DomScope")
  @js.native
  open class DomScope protected ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedSrcMod.DomScope {
    def this(scopeRef: RefHandle[js.Array[HTMLElement]], handlersRef: RefHandle[js.Array[ChangeEventHandler]]) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared", "ElementIterator")
  @js.native
  open class ElementIterator[T] protected ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedSrcMod.ElementIterator[T] {
    def this(elements: js.Array[T]) = this()
    def this(elements: js.Array[T], hasFrom: From) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared", "FocusManager")
  @js.native
  open class FocusManager protected ()
    extends typingsJapgolly.orbitUiReactComponents.distSharedSrcMod.FocusManager {
    def this(scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope) = this()
    def this(
      scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
      hasIsVirtualKeyPropOnFocus: FocusManagerOptions
    ) = this()
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared", "FocusTarget")
  @js.native
  object FocusTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget & String
      ] = js.native
    
    /* "first" */ val first: typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.first & String = js.native
    
    /* "last" */ val last: typingsJapgolly.orbitUiReactComponents.distSharedSrcFocusTargetMod.FocusTarget.last & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared", "FocusableElementSelector")
  @js.native
  val FocusableElementSelector: String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared", "Keys")
  @js.native
  object Keys extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys & String] = js.native
    
    /* "ArrowDown" */ val arrowDown: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowDown & String = js.native
    
    /* "ArrowLeft" */ val arrowLeft: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowLeft & String = js.native
    
    /* "ArrowRight" */ val arrowRight: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowRight & String = js.native
    
    /* "ArrowUp" */ val arrowUp: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.arrowUp & String = js.native
    
    /* "Backspace" */ val backspace: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.backspace & String = js.native
    
    /* "Delete" */ val delete: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.delete & String = js.native
    
    /* "End" */ val end: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.end & String = js.native
    
    /* "Enter" */ val enter: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.enter & String = js.native
    
    /* "Escape" */ val esc: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.esc & String = js.native
    
    /* "Home" */ val home: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.home & String = js.native
    
    /* " " */ val space: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.space & String = js.native
    
    /* "Tab" */ val tab: typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys.tab & String = js.native
  }
  
  @JSImport("@orbit-ui/react-components/dist/shared", "StyleContext")
  @js.native
  val StyleContext: Context[StyleContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared", "StyleProvider")
  @js.native
  val StyleProvider: Provider[StyleContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared", "TabbableElementSelector")
  @js.native
  val TabbableElementSelector: String = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared", "VirtualFocusCssClass")
  @js.native
  val VirtualFocusCssClass: /* "o-ui-focus" */ String = js.native
  
  inline def adaptSize[T /* <: Size */](size: Size, adapter: SizeAdapter[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptSize")(size.asInstanceOf[js.Any], adapter.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def appendEventKey(str: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendEventKey")(str.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def arrayify[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def assignRef[T](ref: AssignableRef[T], node: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def augmentElement(element: Element & RefAttributes[Any], newProps: Record[String, Any]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("augmentElement")(element.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def createChainedFunction_false[T /* <: ChainableFunction */](funcs: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  inline def createDisposables(): Add = ^.asInstanceOf[js.Dynamic].applyDynamic("createDisposables")().asInstanceOf[Add]
  
  inline def createEmbeddableAdapter[T /* <: Size */](sizeAdapter: SizeAdapter[T]): js.Function2[/* element */ Element, /* hasSizeProps */ RecordWithSize, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmbeddableAdapter")(sizeAdapter.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* element */ Element, /* hasSizeProps */ RecordWithSize, Element]]
  
  inline def createFocusableTreeWalker(root: HTMLElement): TreeWalker = ^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any]).asInstanceOf[TreeWalker]
  inline def createFocusableTreeWalker(root: HTMLElement, hasTabbable: FocusableTreeWalkerOptions): TreeWalker = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusableTreeWalker")(root.asInstanceOf[js.Any], hasTabbable.asInstanceOf[js.Any])).asInstanceOf[TreeWalker]
  
  inline def createSizeAdapter[T /* <: Size */](adapter: SizeAdapter[T]): js.Function1[/* size */ Size, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSizeAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* size */ Size, T]]
  
  inline def cssModule_false(moduleName: String, values: (`false` | String)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssModule")(scala.List(moduleName.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def forwardRef[P /* <: Record[String, Any] */, T](render: ForwardRefRenderFunction[AsRef[T], P]): OrbitComponent[T, P] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[T, P]]
  
  inline def getRawSlots(children: Node, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def getSlotKey(element: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotKey")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getSlots[T /* <: SlotOptions */](children: Node, has_Slots: T): GetSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(children.asInstanceOf[js.Any], has_Slots.asInstanceOf[js.Any])).asInstanceOf[GetSlotsReturn[T]]
  
  inline def isArray[T](value: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isDefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmptyArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(value: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNil(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNilOrEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNilOrEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(value: Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
  
  inline def isNumber(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isPlainObject(value: Any): /* is std.Record<string, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, any> */ Boolean]
  
  inline def isPromise(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isUndefined(value: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def mergeClasses_false(values: (String | `false`)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def mergeProps[T /* <: js.Array[Props] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): UnionToIntersection[TupleTypes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(args.asInstanceOf[js.Any]).asInstanceOf[UnionToIntersection[TupleTypes[T]]]
  
  inline def mergeRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  inline def normalizeSize[T /* <: Size */](): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")().asInstanceOf[md | T]
  inline def normalizeSize[T /* <: Size */](size: T): md | T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSize")(size.asInstanceOf[js.Any]).asInstanceOf[md | T]
  
  inline def omitProps[TObject /* <: Record[String, Any] */, TKey /* <: String */](obj: TObject, omit: js.Array[TKey]): Omit[TObject, TKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("omitProps")(obj.asInstanceOf[js.Any], omit.asInstanceOf[js.Any])).asInstanceOf[Omit[TObject, TKey]]
  
  inline def resolveChildren(children: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def resolveChildren(children: Node, renderProps: Record[String, Any]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any], renderProps.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def resolveFragment(children: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFragment")(children.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def slot[P](slotName: String, ElementType: P): P = (^.asInstanceOf[js.Dynamic].applyDynamic("slot")(slotName.asInstanceOf[js.Any], ElementType.asInstanceOf[js.Any])).asInstanceOf[P]
  
  inline def useAutoFocus(targetRef: RefHandle[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocus(targetRef: RefHandle[HTMLElement], hasIsDisabledDelayOnFocus: AutoFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocus")(targetRef.asInstanceOf[js.Any], hasIsDisabledDelayOnFocus.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useAutoFocusChild(focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useAutoFocusChild(
    focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    hasTargetIsDisabledDelayCanFocusOnFocusOnNotFound: AutoFocusChildOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAutoFocusChild")(focusManager.asInstanceOf[js.Any], hasTargetIsDisabledDelayCanFocusOnFocusOnNotFound.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useChainedEventCallback_false[T /* <: ChainableFunction */](callbacks: (T | `false`)*): ChainableFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("useChainedEventCallback")(callbacks.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ChainableFunction]
  
  inline def useCheckableContext(): js.Tuple2[CheckableContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableContext")().asInstanceOf[js.Tuple2[CheckableContextType, Boolean]]
  
  inline def useCheckableProps(hasValue: `0`): js.Tuple2[UseCheckablePropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCheckableProps")(hasValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[UseCheckablePropsReturn, Boolean]]
  
  inline def useCommittedRef[T](value: T): RefHandle[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCommittedRef")(value.asInstanceOf[js.Any]).asInstanceOf[RefHandle[T]]
  
  inline def useControllableState[T](): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")().asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: T, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: T, defaultValue: Unit, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: Unit, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: T, initialValue: Unit, defaultValue: T, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: T,
    initialValue: Unit,
    defaultValue: Unit,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: T, defaultValue: T, hasOnChange: ControllableStateOptions[T]): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: Unit,
    initialValue: T,
    defaultValue: Unit,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](controlledValue: Unit, initialValue: Unit, defaultValue: T): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: Unit,
    initialValue: Unit,
    defaultValue: T,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  inline def useControllableState[T](
    controlledValue: Unit,
    initialValue: Unit,
    defaultValue: Unit,
    hasOnChange: ControllableStateOptions[T]
  ): js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableState")(controlledValue.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], hasOnChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, js.Function1[/* maybeState */ T, Unit], Boolean]]
  
  inline def useDisposables(): Dispose = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisposables")().asInstanceOf[Dispose]
  
  inline def useDocumentListener(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Unit, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useDocumentListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDocumentListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Unit] */](): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")().asInstanceOf[TCallback]
  inline def useEventCallback[TCallback /* <: js.Function1[/* repeated */ Any, Unit] */](callback: TCallback): TCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[TCallback]
  
  inline def useEventListener(eventTarget: js.Function0[EventTarget], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: js.Function0[EventTarget], eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: Null,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: js.Function0[EventTarget],
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: Null,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: Null,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(eventTarget: EventTarget, eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useEventListener(
    eventTarget: EventTarget,
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(eventTarget.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useFocusManager(scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope): typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager]
  inline def useFocusManager(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    hasIsVirtualKeyPropOnFocus: FocusManagerOptions
  ): typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager = (^.asInstanceOf[js.Dynamic].applyDynamic("useFocusManager")(scope.asInstanceOf[js.Any], hasIsVirtualKeyPropOnFocus.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager]
  
  inline def useFocusScope(): js.Tuple2[
    typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, 
    js.Function1[/* rootElement */ HTMLElement, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusScope")().asInstanceOf[js.Tuple2[
    typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope, 
    js.Function1[/* rootElement */ HTMLElement, Unit]
  ]]
  
  inline def useFocusWithin(): OnFocus | OnBlurOnFocus = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")().asInstanceOf[OnFocus | OnBlurOnFocus]
  inline def useFocusWithin(hasOnFocusOnBlurIsDisabled: UseFocusWithinOptions): OnFocus | OnBlurOnFocus = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusWithin")(hasOnFocusOnBlurIsDisabled.asInstanceOf[js.Any]).asInstanceOf[OnFocus | OnBlurOnFocus]
  
  inline def useForceRender(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceRender")().asInstanceOf[js.Function0[Unit]]
  
  inline def useForwardInputApi(inputRef: RefHandle[HTMLInputElement]): js.Function1[/* targetRef */ RefHandle[HTMLInputElement], HTMLInputElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForwardInputApi")(inputRef.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* targetRef */ RefHandle[HTMLInputElement], HTMLInputElement]]
  
  inline def useHasChild(querySelector: String, rootRef: RefHandle[HTMLElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChild")(querySelector.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useHasChildren(querySelectors: Record[String, String], rootRef: RefHandle[HTMLElement]): Record[String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useHasChildren")(querySelectors.asInstanceOf[js.Any], rootRef.asInstanceOf[js.Any])).asInstanceOf[Record[String, Boolean]]
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  inline def useId(userId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(userId: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useId(userId: Unit, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(userId.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useIsInitialRender(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsInitialRender")().asInstanceOf[Boolean]
  
  inline def useKeyboardNavigation(
    focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    hasPreviousNextFirstLast: KeyboardNavigationBindings
  ): OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], hasPreviousNextFirstLast.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown]
  inline def useKeyboardNavigation(
    focusManager: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager,
    hasPreviousNextFirstLast: KeyboardNavigationBindings,
    hasOnSelect: KeyboardNavigationOptions
  ): OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], hasPreviousNextFirstLast.asInstanceOf[js.Any], hasOnSelect.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown]
  
  inline def useKeyedRovingFocus(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    currentKey: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyedRovingFocus(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    currentKey: String,
    hasKeyPropIsDisabled: IsDisabled
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyedRovingFocus")(scope.asInstanceOf[js.Any], currentKey.asInstanceOf[js.Any], hasKeyPropIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useMergedRefs[T](refs: AssignableRef[T]*): MergedRef[UnwrapStateType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedRef[UnwrapStateType[T]]]
  
  inline def useRawSlots(children: Node, slots: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRawSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def useRefState[T](): js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")().asInstanceOf[js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
  inline def useRefState[T](initialValue: T): js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefState")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    RefHandle[T], 
    js.Function2[/* newValue */ T, /* rerender */ js.UndefOr[Boolean], Unit]
  ]]
  
  inline def useResizeObserver(onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit]): RefFn[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[RefFn[HTMLElement]]
  inline def useResizeObserver(
    onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit],
    hasIsDisabledBox: UseResizeObserverOptions
  ): RefFn[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], hasIsDisabledBox.asInstanceOf[js.Any])).asInstanceOf[RefFn[HTMLElement]]
  
  inline def useRovingFocus(scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRovingFocus(
    scope: typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusScopeMod.DomScope,
    hasIsDisabled: `2`
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRovingFocus")(scope.asInstanceOf[js.Any], hasIsDisabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useSlots[T /* <: SlotOptions */](children: Node, slots: T): UseSlotsReturn[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlots")(children.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[UseSlotsReturn[T]]
  
  inline def useStyleContext(): StyleContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleContext")().asInstanceOf[StyleContextType]
  
  inline def useStyleProps(key: String): js.Tuple2[StyleContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleProps")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[StyleContextType, Boolean]]
  
  inline def useWindowListener(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Unit, options: EventListenerOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: Null, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Boolean,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Boolean, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(
    eventName: String,
    listener: EventListenerOrEventListenerObject,
    active: Unit,
    options: EventListenerOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useWindowListener(eventName: String, listener: EventListenerOrEventListenerObject, active: Unit, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWindowListener")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], active.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkFocusableElements(
    root: HTMLElement,
    onElement: js.Function2[/* element */ org.scalajs.dom.Element, /* index */ js.UndefOr[Double], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walkFocusableElements")(root.asInstanceOf[js.Any], onElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
