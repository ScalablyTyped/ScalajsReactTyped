package typingsJapgolly.vueRuntimeCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInternalInstance extends StObject {
  
  var appContext: AppContext
  
  var attrs: Data
  
  /**
    * custom element specific HMR method
    */
  var ceReload: js.UndefOr[js.Function1[/* newStyles */ js.UndefOr[js.Array[String]], Unit]] = js.undefined
  
  /* Excluded from this release type: withProxy */
  /* Excluded from this release type: ctx */
  var data: Data
  
  /**
    * Render effect instance
    */
  var effect: typingsJapgolly.vueReactivity.mod.ReactiveEffect[Any]
  
  var emit: EmitFn[
    ObjectEmitsOptions, 
    /* keyof @vue/runtime-core.@vue/runtime-core.ObjectEmitsOptions */ String
  ]
  
  var exposeProxy: (Record[String, Any]) | Null
  
  var exposed: (Record[String, Any]) | Null
  
  /* Excluded from this release type: bc */
  /* Excluded from this release type: c */
  /* Excluded from this release type: bm */
  /* Excluded from this release type: m */
  /* Excluded from this release type: bu */
  /* Excluded from this release type: u */
  /* Excluded from this release type: bum */
  /* Excluded from this release type: um */
  /* Excluded from this release type: rtc */
  /* Excluded from this release type: rtg */
  /* Excluded from this release type: a */
  /* Excluded from this release type: da */
  /* Excluded from this release type: ec */
  /* Excluded from this release type: sp */
  /**
    * For caching bound $forceUpdate on public proxy access
    */
  var f: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /* Excluded from this release type: render */
  /* Excluded from this release type: ssrRender */
  /* Excluded from this release type: provides */
  /* Excluded from this release type: scope */
  /* Excluded from this release type: accessCache */
  /* Excluded from this release type: renderCache */
  /* Excluded from this release type: components */
  /* Excluded from this release type: directives */
  /* Excluded from this release type: filters */
  /* Excluded from this release type: propsOptions */
  /* Excluded from this release type: emitsOptions */
  /* Excluded from this release type: inheritAttrs */
  /**
    * is custom element?
    */
  var isCE: js.UndefOr[Boolean] = js.undefined
  
  var isDeactivated: Boolean
  
  /* Excluded from this release type: emitted */
  /* Excluded from this release type: propsDefaults */
  /* Excluded from this release type: setupState */
  /* Excluded from this release type: devtoolsRawSetupState */
  /* Excluded from this release type: setupContext */
  /* Excluded from this release type: suspense */
  /* Excluded from this release type: suspenseId */
  /* Excluded from this release type: asyncDep */
  /* Excluded from this release type: asyncResolved */
  var isMounted: Boolean
  
  var isUnmounted: Boolean
  
  /**
    * For caching bound $nextTick on public proxy access
    */
  var n: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  var parent: ComponentInternalInstance | Null
  
  var props: Data
  
  var proxy: (ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
  ]) | Null
  
  var refs: Data
  
  var root: ComponentInternalInstance
  
  var slots: InternalSlots
  
  /* Excluded from this release type: next */
  /**
    * Root vnode of this component's own vdom tree
    */
  var subTree: VNode[RendererNode, RendererElement, StringDictionary[Any]]
  
  var `type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
  
  var uid: Double
  
  /**
    * Bound effect runner to be passed to schedulers
    */
  var update: SchedulerJob
  
  /**
    * Vnode representing this component in its parent's vdom tree
    */
  var vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]]
}
object ComponentInternalInstance {
  
  inline def apply(
    appContext: AppContext,
    attrs: Data,
    data: Data,
    effect: typingsJapgolly.vueReactivity.mod.ReactiveEffect[Any],
    emit: EmitFn[
      ObjectEmitsOptions, 
      /* keyof @vue/runtime-core.@vue/runtime-core.ObjectEmitsOptions */ String
    ],
    isDeactivated: Boolean,
    isMounted: Boolean,
    isUnmounted: Boolean,
    props: Data,
    refs: Data,
    root: ComponentInternalInstance,
    slots: InternalSlots,
    subTree: VNode[RendererNode, RendererElement, StringDictionary[Any]],
    `type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions],
    uid: Double,
    update: SchedulerJob,
    vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]]
  ): ComponentInternalInstance = {
    val __obj = js.Dynamic.literal(appContext = appContext.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], isDeactivated = isDeactivated.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], isUnmounted = isUnmounted.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], subTree = subTree.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], vnode = vnode.asInstanceOf[js.Any], exposeProxy = null, exposed = null, parent = null, proxy = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInternalInstance]
  }
  
  extension [Self <: ComponentInternalInstance](x: Self) {
    
    inline def setAppContext(value: AppContext): Self = StObject.set(x, "appContext", value.asInstanceOf[js.Any])
    
    inline def setAttrs(value: Data): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setCeReload(value: /* newStyles */ js.UndefOr[js.Array[String]] => Callback): Self = StObject.set(x, "ceReload", js.Any.fromFunction1((t0: /* newStyles */ js.UndefOr[js.Array[String]]) => value(t0).runNow()))
    
    inline def setCeReloadUndefined: Self = StObject.set(x, "ceReload", js.undefined)
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: typingsJapgolly.vueReactivity.mod.ReactiveEffect[Any]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEmit(
      value: EmitFn[
          ObjectEmitsOptions, 
          /* keyof @vue/runtime-core.@vue/runtime-core.ObjectEmitsOptions */ String
        ]
    ): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setExposeProxy(value: Record[String, Any]): Self = StObject.set(x, "exposeProxy", value.asInstanceOf[js.Any])
    
    inline def setExposeProxyNull: Self = StObject.set(x, "exposeProxy", null)
    
    inline def setExposed(value: Record[String, Any]): Self = StObject.set(x, "exposed", value.asInstanceOf[js.Any])
    
    inline def setExposedNull: Self = StObject.set(x, "exposed", null)
    
    inline def setF(value: Callback): Self = StObject.set(x, "f", value.toJsFn)
    
    inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    inline def setIsCE(value: Boolean): Self = StObject.set(x, "isCE", value.asInstanceOf[js.Any])
    
    inline def setIsCEUndefined: Self = StObject.set(x, "isCE", js.undefined)
    
    inline def setIsDeactivated(value: Boolean): Self = StObject.set(x, "isDeactivated", value.asInstanceOf[js.Any])
    
    inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    inline def setIsUnmounted(value: Boolean): Self = StObject.set(x, "isUnmounted", value.asInstanceOf[js.Any])
    
    inline def setN(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "n", value.toJsFn)
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setParent(value: ComponentInternalInstance): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProps(value: Data): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setProxy(
      value: ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]
    ): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyNull: Self = StObject.set(x, "proxy", null)
    
    inline def setRefs(value: Data): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ComponentInternalInstance): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: InternalSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSubTree(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "subTree", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: SchedulerJob): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setVnode(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "vnode", value.asInstanceOf[js.Any])
  }
}
