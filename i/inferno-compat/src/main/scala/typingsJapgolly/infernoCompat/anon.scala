package typingsJapgolly.infernoCompat

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.SVGAElement
import typingsJapgolly.inferno.anon.ReadonlychildrenInfernoNo
import typingsJapgolly.inferno.distCoreTypesMod.ForwardRef
import typingsJapgolly.inferno.distCoreTypesMod.Inferno.ComponentClass
import typingsJapgolly.inferno.distCoreTypesMod.Inferno.InfernoNode
import typingsJapgolly.inferno.distCoreTypesMod.Inferno.StatelessComponent
import typingsJapgolly.inferno.distCoreTypesMod.LinkedEvent
import typingsJapgolly.inferno.distCoreTypesMod.Props
import typingsJapgolly.inferno.distCoreTypesMod.Ref
import typingsJapgolly.inferno.distCoreTypesMod.RefObject
import typingsJapgolly.inferno.distCoreTypesMod.Refs
import typingsJapgolly.inferno.distCoreTypesMod.VNode
import typingsJapgolly.inferno.distDomUtilsCommonMod.AnimationQueues
import typingsJapgolly.inferno.mod.Component
import typingsJapgolly.infernoCompat.mod.IterateChildrenFn
import typingsJapgolly.infernoCreateClass.mod.ClassicComponentClass
import typingsJapgolly.infernoCreateClass.mod.ComponentSpec
import typingsJapgolly.infernoVnodeFlags.mod.ChildFlags
import typingsJapgolly.infernoVnodeFlags.mod.VNodeFlags
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Any extends StObject {
    
    def any(): js.Function0[Unit]
    
    def array(): Unit
    
    def arrayOf(): js.Function0[Unit]
    
    def bool(): Unit
    
    def checkPropTypes(): Null
    
    def element(): js.Function0[Unit]
    
    def func(): Unit
    
    def instanceOf(): js.Function0[Unit]
    
    def node(): js.Function0[Unit]
    
    def number(): Unit
    
    def `object`(): Unit
    
    def objectOf(): js.Function0[Unit]
    
    def oneOf(): js.Function0[Unit]
    
    def oneOfType(): js.Function0[Unit]
    
    def shape(): js.Function0[Unit]
    
    def string(): Unit
    
    def symbol(): Unit
  }
  object Any {
    
    inline def apply(
      any: CallbackTo[js.Function0[Unit]],
      array: Callback,
      arrayOf: CallbackTo[js.Function0[Unit]],
      bool: Callback,
      checkPropTypes: CallbackTo[Null],
      element: CallbackTo[js.Function0[Unit]],
      func: Callback,
      instanceOf: CallbackTo[js.Function0[Unit]],
      node: CallbackTo[js.Function0[Unit]],
      number: Callback,
      `object`: Callback,
      objectOf: CallbackTo[js.Function0[Unit]],
      oneOf: CallbackTo[js.Function0[Unit]],
      oneOfType: CallbackTo[js.Function0[Unit]],
      shape: CallbackTo[js.Function0[Unit]],
      string: Callback,
      symbol: Callback
    ): Any = {
      val __obj = js.Dynamic.literal(any = any.toJsFn, array = array.toJsFn, arrayOf = arrayOf.toJsFn, bool = bool.toJsFn, checkPropTypes = checkPropTypes.toJsFn, element = element.toJsFn, func = func.toJsFn, instanceOf = instanceOf.toJsFn, node = node.toJsFn, number = number.toJsFn, objectOf = objectOf.toJsFn, oneOf = oneOf.toJsFn, oneOfType = oneOfType.toJsFn, shape = shape.toJsFn, string = string.toJsFn, symbol = symbol.toJsFn)
      __obj.updateDynamic("object")(`object`.toJsFn)
      __obj.asInstanceOf[Any]
    }
    
    extension [Self <: Any](x: Self) {
      
      inline def setAny(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "any", value.toJsFn)
      
      inline def setArray(value: Callback): Self = StObject.set(x, "array", value.toJsFn)
      
      inline def setArrayOf(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "arrayOf", value.toJsFn)
      
      inline def setBool(value: Callback): Self = StObject.set(x, "bool", value.toJsFn)
      
      inline def setCheckPropTypes(value: CallbackTo[Null]): Self = StObject.set(x, "checkPropTypes", value.toJsFn)
      
      inline def setElement(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setFunc(value: Callback): Self = StObject.set(x, "func", value.toJsFn)
      
      inline def setInstanceOf(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "instanceOf", value.toJsFn)
      
      inline def setNode(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "node", value.toJsFn)
      
      inline def setNumber(value: Callback): Self = StObject.set(x, "number", value.toJsFn)
      
      inline def setObject(value: Callback): Self = StObject.set(x, "object", value.toJsFn)
      
      inline def setObjectOf(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "objectOf", value.toJsFn)
      
      inline def setOneOf(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "oneOf", value.toJsFn)
      
      inline def setOneOfType(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "oneOfType", value.toJsFn)
      
      inline def setShape(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "shape", value.toJsFn)
      
      inline def setString(value: Callback): Self = StObject.set(x, "string", value.toJsFn)
      
      inline def setSymbol(value: Callback): Self = StObject.set(x, "symbol", value.toJsFn)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[InfernoNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: InfernoNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ComponentComparator extends StObject {
    
    var componentComparator: (js.Function2[/* lastVNode */ VNode, /* nextVNode */ VNode, Boolean]) | Null
    
    var createVNode: (js.Function1[/* vNode */ VNode, Unit]) | Null
    
    var reactStyles: js.UndefOr[Boolean] = js.undefined
    
    var renderComplete: (js.Function2[
        /* rootInput */ InfernoNode | VNode, 
        /* parentDOM */ Element | Node | HTMLElement | SVGAElement | ShadowRoot | DocumentFragment, 
        Unit
      ]) | Null
  }
  object ComponentComparator {
    
    inline def apply(): ComponentComparator = {
      val __obj = js.Dynamic.literal(componentComparator = null, createVNode = null, renderComplete = null)
      __obj.asInstanceOf[ComponentComparator]
    }
    
    extension [Self <: ComponentComparator](x: Self) {
      
      inline def setComponentComparator(value: (/* lastVNode */ VNode, /* nextVNode */ VNode) => Boolean): Self = StObject.set(x, "componentComparator", js.Any.fromFunction2(value))
      
      inline def setComponentComparatorNull: Self = StObject.set(x, "componentComparator", null)
      
      inline def setCreateVNode(value: /* vNode */ VNode => Callback): Self = StObject.set(x, "createVNode", js.Any.fromFunction1((t0: /* vNode */ VNode) => value(t0).runNow()))
      
      inline def setCreateVNodeNull: Self = StObject.set(x, "createVNode", null)
      
      inline def setReactStyles(value: Boolean): Self = StObject.set(x, "reactStyles", value.asInstanceOf[js.Any])
      
      inline def setReactStylesUndefined: Self = StObject.set(x, "reactStyles", js.undefined)
      
      inline def setRenderComplete(
        value: (/* rootInput */ InfernoNode | VNode, /* parentDOM */ Element | Node | HTMLElement | SVGAElement | ShadowRoot | DocumentFragment) => Callback
      ): Self = StObject.set(x, "renderComplete", js.Any.fromFunction2((t0: /* rootInput */ InfernoNode | VNode, t1: /* parentDOM */ Element | Node | HTMLElement | SVGAElement | ShadowRoot | DocumentFragment) => (value(t0, t1)).runNow()))
      
      inline def setRenderCompleteNull: Self = StObject.set(x, "renderComplete", null)
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    def count(children: js.Array[scala.Any]): Double = js.native
    
    def forEach(children: js.Array[scala.Any], fn: IterateChildrenFn): Unit = js.native
    def forEach(children: js.Array[scala.Any], fn: IterateChildrenFn, ctx: scala.Any): Unit = js.native
    
    def map(children: js.Array[scala.Any], fn: IterateChildrenFn, ctx: scala.Any): js.Array[scala.Any] = js.native
    
    def only(children: js.Array[scala.Any]): scala.Any = js.native
    
    def toArray(children: js.Array[scala.Any]): js.Array[scala.Any] = js.native
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](): RefObject[T] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
    def apply(
      vNode: VNode,
      parentDOM: Element,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
    def apply(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Element,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
    def apply(
      vNode: VNode,
      parentDOM: Null,
      context: js.Object,
      isSVG: Boolean,
      nextNode: Null,
      lifecycle: js.Array[js.Function],
      animations: AnimationQueues
    ): Unit = js.native
  }
  
  @js.native
  trait FnCallChildrenChildFlagsKey extends StObject {
    
    def apply(children: scala.Any, childFlags: ChildFlags): VNode = js.native
    def apply(children: scala.Any, childFlags: ChildFlags, key: String): VNode = js.native
    def apply(children: scala.Any, childFlags: ChildFlags, key: Double): VNode = js.native
  }
  
  @js.native
  trait FnCallDataEvent extends StObject {
    
    def apply[T, E /* <: Event */](data: T, event: js.Function2[/* data */ T, /* event */ E, Unit]): (LinkedEvent[T, E]) | Null = js.native
  }
  
  @js.native
  trait FnCallFlagsTypeClassNameChildrenChildFlagsPropsKeyRef extends StObject {
    
    def apply[P](
      flags: VNodeFlags,
      `type`: String,
      className: js.UndefOr[String | Null],
      children: js.UndefOr[InfernoNode],
      childFlags: js.UndefOr[ChildFlags],
      props: js.UndefOr[P | Null],
      key: js.UndefOr[String | Double | Null],
      ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
    ): VNode = js.native
  }
  
  @js.native
  trait FnCallFlagsTypePropsKeyRef extends StObject {
    
    def apply[P](
      flags: VNodeFlags,
      `type`: js.Function | ComponentClass[P] | (ForwardRef[P, scala.Any]),
      props: js.UndefOr[P | Null],
      key: js.UndefOr[Null | String | Double],
      ref: js.UndefOr[Ref[Element] | Refs[P] | Null]
    ): VNode = js.native
  }
  
  @js.native
  trait FnCallInputParentDOMCallback extends StObject {
    
    def apply(input: scala.Any, parentDOM: Element): Unit = js.native
    def apply(input: scala.Any, parentDOM: Element, callback: js.Function): Unit = js.native
  }
  
  @js.native
  trait FnCallObj extends StObject {
    
    def apply[P, S](obj: ComponentSpec[P, S]): ClassicComponentClass[P, S] = js.native
  }
  
  @js.native
  trait FnCallParentDOM extends StObject {
    
    def apply(): js.Function4[
        /* lastInput */ scala.Any, 
        /* nextInput */ scala.Any, 
        /* callback */ scala.Any, 
        /* context */ scala.Any, 
        Unit
      ] = js.native
    def apply(parentDOM: scala.Any): js.Function4[
        /* lastInput */ scala.Any, 
        /* nextInput */ scala.Any, 
        /* callback */ scala.Any, 
        /* context */ scala.Any, 
        Unit
      ] = js.native
  }
  
  @js.native
  trait FnCallRender extends StObject {
    
    def apply[T, P](
      render: js.Function2[/* props */ ReadonlychildrenInfernoNo & P, /* ref */ RefObject[T], InfernoNode]
    ): scala.Any = js.native
  }
  
  @js.native
  trait FnCallTextKey extends StObject {
    
    def apply(): VNode = js.native
    def apply(text: String): VNode = js.native
    def apply(text: String, key: String): VNode = js.native
    def apply(text: String, key: Double): VNode = js.native
    def apply(text: Boolean): VNode = js.native
    def apply(text: Boolean, key: String): VNode = js.native
    def apply(text: Boolean, key: Double): VNode = js.native
    def apply(text: Double): VNode = js.native
    def apply(text: Double, key: String): VNode = js.native
    def apply(text: Double, key: Double): VNode = js.native
    def apply(text: Null, key: String): VNode = js.native
    def apply(text: Null, key: Double): VNode = js.native
    def apply(text: Unit, key: String): VNode = js.native
    def apply(text: Unit, key: Double): VNode = js.native
  }
  
  @js.native
  trait FnCallTypePropsChildren extends StObject {
    
    def apply[P](`type`: String, props: P & Props[P], _children: scala.Any*): VNode = js.native
    def apply[P](`type`: String, props: Null, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: String, props: Unit, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: ComponentClass[P], props: P & Props[P], _children: scala.Any*): VNode = js.native
    def apply[P](`type`: ComponentClass[P], props: Null, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: ComponentClass[P], props: Unit, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: StatelessComponent[P], props: P & Props[P], _children: scala.Any*): VNode = js.native
    def apply[P](`type`: StatelessComponent[P], props: Null, _children: scala.Any*): VNode = js.native
    def apply[P](`type`: StatelessComponent[P], props: Unit, _children: scala.Any*): VNode = js.native
  }
  
  @js.native
  trait FnCallVNodeToClonePropsChildren extends StObject {
    
    def apply(vNodeToClone: VNode): VNode = js.native
    def apply(vNodeToClone: VNode, props: scala.Any): VNode = js.native
    def apply(vNodeToClone: VNode, props: scala.Any, _children: scala.Any): VNode = js.native
    def apply(vNodeToClone: VNode, props: Unit, _children: scala.Any): VNode = js.native
  }
  
  @js.native
  trait TypeofComponent
    extends StObject
       with Instantiable0[Component[js.Object, js.Object]] {
    
    var defaultProps: js.UndefOr[js.Object] = js.native
    
    var getDerivedStateFromProps: js.UndefOr[js.Function2[/* nextProps */ scala.Any, /* state */ scala.Any, scala.Any]] = js.native
  }
}
