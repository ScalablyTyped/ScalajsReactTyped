package typingsJapgolly.virtualDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VirtualDOM {
  
  @js.native
  trait EventHandler extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  type PatchFn[T /* <: Element */] = js.Function3[
    /* rootNode */ T, 
    /* patches */ js.Array[VPatch], 
    /* renderOptions */ VPatchOptions[T], 
    T
  ]
  
  trait Thunk
    extends StObject
       with VTree {
    
    def render(previous: VTree): VTree
    
    var `type`: String
    
    // 'Thunk'
    var vnode: VTree
  }
  object Thunk {
    
    inline def apply(render: VTree => VTree, `type`: String, vnode: VTree): Thunk = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Thunk]
    }
    
    extension [Self <: Thunk](x: Self) {
      
      inline def setRender(value: VTree => VTree): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVnode(value: VTree): Self = StObject.set(x, "vnode", value.asInstanceOf[js.Any])
    }
  }
  
  type VChild = (js.Array[String | VTree]) | VTree | String
  
  trait VHook extends StObject {
    
    def hook(node: Element, propertyName: String): Unit
    
    def unhook(node: Element, propertyName: String): Unit
  }
  object VHook {
    
    inline def apply(hook: (Element, String) => Callback, unhook: (Element, String) => Callback): VHook = {
      val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2((t0: Element, t1: String) => (hook(t0, t1)).runNow()), unhook = js.Any.fromFunction2((t0: Element, t1: String) => (unhook(t0, t1)).runNow()))
      __obj.asInstanceOf[VHook]
    }
    
    extension [Self <: VHook](x: Self) {
      
      inline def setHook(value: (Element, String) => Callback): Self = StObject.set(x, "hook", js.Any.fromFunction2((t0: Element, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setUnhook(value: (Element, String) => Callback): Self = StObject.set(x, "unhook", js.Any.fromFunction2((t0: Element, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  trait VNode
    extends StObject
       with VTree {
    
    var children: js.Array[VTree]
    
    var count: Double
    
    var descendantHooks: js.Array[Any]
    
    var hasThunks: Boolean
    
    var hasWidgets: Boolean
    
    var hooks: js.Array[Any]
    
    var key: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var properties: VProperties
    
    var tagName: String
    
    var `type`: String
    
    var version: String
  }
  object VNode {
    
    inline def apply(
      children: js.Array[VTree],
      count: Double,
      descendantHooks: js.Array[Any],
      hasThunks: Boolean,
      hasWidgets: Boolean,
      hooks: js.Array[Any],
      properties: VProperties,
      tagName: String,
      `type`: String,
      version: String
    ): VNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VNode]
    }
    
    extension [Self <: VNode](x: Self) {
      
      inline def setChildren(value: js.Array[VTree]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: VTree*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDescendantHooks(value: js.Array[Any]): Self = StObject.set(x, "descendantHooks", value.asInstanceOf[js.Any])
      
      inline def setDescendantHooksVarargs(value: Any*): Self = StObject.set(x, "descendantHooks", js.Array(value*))
      
      inline def setHasThunks(value: Boolean): Self = StObject.set(x, "hasThunks", value.asInstanceOf[js.Any])
      
      inline def setHasWidgets(value: Boolean): Self = StObject.set(x, "hasWidgets", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: js.Array[Any]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksVarargs(value: Any*): Self = StObject.set(x, "hooks", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setProperties(value: VProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VNodeConstructor
    extends StObject
       with Instantiable3[
          /* tagName */ String, 
          /* properties */ VProperties, 
          /* children */ js.Array[VTree], 
          VNode
        ]
       with Instantiable4[
          /* tagName */ String, 
          /* properties */ VProperties, 
          /* children */ js.Array[VTree], 
          /* key */ String, 
          VNode
        ]
       with Instantiable5[
          /* tagName */ String, 
          /* properties */ VProperties, 
          /* children */ js.Array[VTree], 
          (/* key */ String) | (/* key */ Unit), 
          /* namespace */ String, 
          VNode
        ]
  
  // enum VPatch {
  //   NONE = 0,
  //   VTEXT = 1,
  //   VNODE = 2,
  //   WIDGET = 3,
  //   PROPS = 4,
  //   ORDER = 5,
  //   INSERT = 6,
  //   REMOVE = 7,
  //   THUNK = 8
  // }
  trait VPatch extends StObject {
    
    var patch: Any
    
    /**
      type is set to 'VirtualPatch' on the prototype, but overridden in the
      constructor with a number.
      */
    var `type`: Double
    
    var vNode: VNode
    
    var version: String
  }
  object VPatch {
    
    inline def apply(patch: Any, `type`: Double, vNode: VNode, version: String): VPatch = {
      val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any], vNode = vNode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VPatch]
    }
    
    extension [Self <: VPatch](x: Self) {
      
      inline def setPatch(value: Any): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVNode(value: VNode): Self = StObject.set(x, "vNode", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait VPatchOptions[T /* <: Element */] extends StObject {
    
    var patch: js.UndefOr[PatchFn[T]] = js.undefined
  }
  object VPatchOptions {
    
    inline def apply[T /* <: Element */](): VPatchOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VPatchOptions[T]]
    }
    
    extension [Self <: VPatchOptions[?], T /* <: Element */](x: Self & VPatchOptions[T]) {
      
      inline def setPatch(value: (T, /* patches */ js.Array[VPatch], /* renderOptions */ VPatchOptions[T]) => T): Self = StObject.set(x, "patch", js.Any.fromFunction3(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    }
  }
  
  trait VProperties
    extends StObject
       with /**
    The relaxation on `style` above is the reason why we need `any` as an option
    on the indexer type.
    */
  /* index */ StringDictionary[
          Any | String | Boolean | Double | VHook | EventHandler | (StringDictionary[String | Boolean | Double])
        ] {
    
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      I would like to use {[index: string]: string}, but then we couldn't use an
      object literal when setting the styles, since TypeScript doesn't seem to
      infer that {'fontSize': string; 'fontWeight': string;} is actually quite
      assignable to the type { [index: string]: string; }
      */
    var style: js.UndefOr[Any] = js.undefined
  }
  object VProperties {
    
    inline def apply(): VProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VProperties]
    }
    
    extension [Self <: VProperties](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait VText
    extends StObject
       with VTree {
    
    var text: String
    
    var `type`: String
    
    var version: String
  }
  object VText {
    
    inline def apply(text: String, `type`: String, version: String): VText = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VText]
    }
    
    extension [Self <: VText](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VTextConstructor
    extends StObject
       with Instantiable1[/* text */ String, VText]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.virtualDom.VirtualDOM.VText
    - typingsJapgolly.virtualDom.VirtualDOM.VNode
    - typingsJapgolly.virtualDom.VirtualDOM.Widget
    - typingsJapgolly.virtualDom.VirtualDOM.Thunk
  */
  trait VTree extends StObject
  object VTree {
    
    inline def Thunk(render: VTree => VTree, `type`: String, vnode: VTree): typingsJapgolly.virtualDom.VirtualDOM.Thunk = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.virtualDom.VirtualDOM.Thunk]
    }
    
    inline def VNode(
      children: js.Array[VTree],
      count: Double,
      descendantHooks: js.Array[Any],
      hasThunks: Boolean,
      hasWidgets: Boolean,
      hooks: js.Array[Any],
      properties: VProperties,
      tagName: String,
      `type`: String,
      version: String
    ): typingsJapgolly.virtualDom.VirtualDOM.VNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], descendantHooks = descendantHooks.asInstanceOf[js.Any], hasThunks = hasThunks.asInstanceOf[js.Any], hasWidgets = hasWidgets.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.virtualDom.VirtualDOM.VNode]
    }
    
    inline def VText(text: String, `type`: String, version: String): typingsJapgolly.virtualDom.VirtualDOM.VText = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.virtualDom.VirtualDOM.VText]
    }
    
    inline def Widget(
      destroy: Element => Callback,
      init: CallbackTo[Element],
      `type`: String,
      update: (typingsJapgolly.virtualDom.VirtualDOM.Widget, Element) => Callback
    ): typingsJapgolly.virtualDom.VirtualDOM.Widget = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1((t0: Element) => destroy(t0).runNow()), init = init.toJsFn, update = js.Any.fromFunction2((t0: typingsJapgolly.virtualDom.VirtualDOM.Widget, t1: Element) => (update(t0, t1)).runNow()))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.virtualDom.VirtualDOM.Widget]
    }
  }
  
  trait Widget
    extends StObject
       with VTree {
    
    def destroy(node: Element): Unit
    
    // 'Widget'
    def init(): Element
    
    var `type`: String
    
    def update(previous: Widget, domNode: Element): Unit
  }
  object Widget {
    
    inline def apply(
      destroy: Element => Callback,
      init: CallbackTo[Element],
      `type`: String,
      update: (Widget, Element) => Callback
    ): Widget = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1((t0: Element) => destroy(t0).runNow()), init = init.toJsFn, update = js.Any.fromFunction2((t0: Widget, t1: Element) => (update(t0, t1)).runNow()))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Widget]
    }
    
    extension [Self <: Widget](x: Self) {
      
      inline def setDestroy(value: Element => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
      
      inline def setInit(value: CallbackTo[Element]): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (Widget, Element) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Widget, t1: Element) => (value(t0, t1)).runNow()))
    }
  }
  
  trait createProperties
    extends StObject
       with VProperties {
    
    var key: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
  }
  object createProperties {
    
    inline def apply(): createProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[createProperties]
    }
    
    extension [Self <: createProperties](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
}
