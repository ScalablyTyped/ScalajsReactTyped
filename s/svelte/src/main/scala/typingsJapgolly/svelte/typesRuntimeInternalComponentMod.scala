package typingsJapgolly.svelte

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.svelte.svelteBooleans.`false`
import typingsJapgolly.svelte.svelteInts.`0`
import typingsJapgolly.svelte.svelteInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalComponentMod {
  
  @JSImport("svelte/types/runtime/internal/Component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("svelte/types/runtime/internal/Component", "SvelteComponent")
  @js.native
  open class SvelteComponent () extends StObject {
    
    @JSName("$destroy")
    def $destroy(): Unit = js.native
    
    @JSName("$on")
    def $on(`type`: Any, callback: Any): js.Function0[Unit] = js.native
    
    @JSName("$set")
    def $set(DollarDollarprops: Any): Unit = js.native
    
    @JSName("$$")
    var DollarDollar: T = js.native
    
    @JSName("$$set")
    var DollarDollarset: js.UndefOr[js.Function1[/* $$props */ Any, Unit]] = js.native
  }
  
  @JSImport("svelte/types/runtime/internal/Component", "SvelteElement")
  @js.native
  def SvelteElement: Any = js.native
  inline def SvelteElement_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SvelteElement")(x.asInstanceOf[js.Any])
  
  inline def bind(component: Any, name: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(component.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def claimComponent(block: Any, parent_nodes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("claim_component")(block.asInstanceOf[js.Any], parent_nodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createComponent(block: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create_component")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def destroyComponent(component: Any, detaching: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy_component")(component.asInstanceOf[js.Any], detaching.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init(
    component: Any,
    options: Any,
    instance: Any,
    create_fragment: Any,
    not_equal: Any,
    props: Any,
    append_styles: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], create_fragment.asInstanceOf[js.Any], not_equal.asInstanceOf[js.Any], props.asInstanceOf[js.Any], append_styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    component: Any,
    options: Any,
    instance: Any,
    create_fragment: Any,
    not_equal: Any,
    props: Any,
    append_styles: Any,
    dirty: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], create_fragment.asInstanceOf[js.Any], not_equal.asInstanceOf[js.Any], props.asInstanceOf[js.Any], append_styles.asInstanceOf[js.Any], dirty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountComponent(component: Any, target: Any, anchor: Any, customElement: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount_component")(component.asInstanceOf[js.Any], target.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], customElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Fragment extends StObject {
    
    def a(): Unit
    
    def c(): Unit
    
    def d(detaching: `0` | `1`): Unit
    
    def f(): Unit
    
    var first: Null
    
    def h(): Unit
    
    def i(local: Any): Unit
    
    var key: String | Null
    
    def l(nodes: Any): Unit
    
    def m(target: HTMLElement, anchor: Any): Unit
    
    def o(local: Any): Unit
    
    def p(ctx: Any, dirty: Any): Unit
    
    def r(): Unit
  }
  object Fragment {
    
    inline def apply(
      a: Callback,
      c: Callback,
      d: `0` | `1` => Callback,
      f: Callback,
      first: Null,
      h: Callback,
      i: Any => Callback,
      l: Any => Callback,
      m: (HTMLElement, Any) => Callback,
      o: Any => Callback,
      p: (Any, Any) => Callback,
      r: Callback
    ): Fragment = {
      val __obj = js.Dynamic.literal(a = a.toJsFn, c = c.toJsFn, d = js.Any.fromFunction1((t0: `0` | `1`) => d(t0).runNow()), f = f.toJsFn, first = first.asInstanceOf[js.Any], h = h.toJsFn, i = js.Any.fromFunction1((t0: Any) => i(t0).runNow()), l = js.Any.fromFunction1((t0: Any) => l(t0).runNow()), m = js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (m(t0, t1)).runNow()), o = js.Any.fromFunction1((t0: Any) => o(t0).runNow()), p = js.Any.fromFunction2((t0: Any, t1: Any) => (p(t0, t1)).runNow()), r = r.toJsFn, key = null)
      __obj.asInstanceOf[Fragment]
    }
    
    extension [Self <: Fragment](x: Self) {
      
      inline def setA(value: Callback): Self = StObject.set(x, "a", value.toJsFn)
      
      inline def setC(value: Callback): Self = StObject.set(x, "c", value.toJsFn)
      
      inline def setD(value: `0` | `1` => Callback): Self = StObject.set(x, "d", js.Any.fromFunction1((t0: `0` | `1`) => value(t0).runNow()))
      
      inline def setF(value: Callback): Self = StObject.set(x, "f", value.toJsFn)
      
      inline def setFirst(value: Null): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setH(value: Callback): Self = StObject.set(x, "h", value.toJsFn)
      
      inline def setI(value: Any => Callback): Self = StObject.set(x, "i", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setL(value: Any => Callback): Self = StObject.set(x, "l", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setM(value: (HTMLElement, Any) => Callback): Self = StObject.set(x, "m", js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setO(value: Any => Callback): Self = StObject.set(x, "o", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setP(value: (Any, Any) => Callback): Self = StObject.set(x, "p", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setR(value: Callback): Self = StObject.set(x, "r", value.toJsFn)
    }
  }
  
  trait T extends StObject {
    
    var after_update: js.Array[Any]
    
    var before_update: js.Array[Any]
    
    var bound: Any
    
    var callbacks: Any
    
    var context: Map[Any, Any]
    
    var ctx: Null | Any
    
    var dirty: js.Array[Double]
    
    var fragment: Null | `false` | Fragment
    
    var not_equal: Any
    
    var on_destroy: js.Array[Any]
    
    var on_disconnect: js.Array[Any]
    
    var on_mount: js.Array[Any]
    
    var props: Record[String, `0` | String]
    
    var root: Element | ShadowRoot
    
    var skip_bound: Boolean
    
    def update(): Unit
  }
  object T {
    
    inline def apply(
      after_update: js.Array[Any],
      before_update: js.Array[Any],
      bound: Any,
      callbacks: Any,
      context: Map[Any, Any],
      dirty: js.Array[Double],
      not_equal: Any,
      on_destroy: js.Array[Any],
      on_disconnect: js.Array[Any],
      on_mount: js.Array[Any],
      props: Record[String, `0` | String],
      root: Element | ShadowRoot,
      skip_bound: Boolean,
      update: Callback
    ): T = {
      val __obj = js.Dynamic.literal(after_update = after_update.asInstanceOf[js.Any], before_update = before_update.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], not_equal = not_equal.asInstanceOf[js.Any], on_destroy = on_destroy.asInstanceOf[js.Any], on_disconnect = on_disconnect.asInstanceOf[js.Any], on_mount = on_mount.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], skip_bound = skip_bound.asInstanceOf[js.Any], update = update.toJsFn, ctx = null, fragment = null)
      __obj.asInstanceOf[T]
    }
    
    extension [Self <: T](x: Self) {
      
      inline def setAfter_update(value: js.Array[Any]): Self = StObject.set(x, "after_update", value.asInstanceOf[js.Any])
      
      inline def setAfter_updateVarargs(value: Any*): Self = StObject.set(x, "after_update", js.Array(value*))
      
      inline def setBefore_update(value: js.Array[Any]): Self = StObject.set(x, "before_update", value.asInstanceOf[js.Any])
      
      inline def setBefore_updateVarargs(value: Any*): Self = StObject.set(x, "before_update", js.Array(value*))
      
      inline def setBound(value: Any): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setCallbacks(value: Any): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Map[Any, Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setCtxNull: Self = StObject.set(x, "ctx", null)
      
      inline def setDirty(value: js.Array[Double]): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyVarargs(value: Double*): Self = StObject.set(x, "dirty", js.Array(value*))
      
      inline def setFragment(value: `false` | Fragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentNull: Self = StObject.set(x, "fragment", null)
      
      inline def setNot_equal(value: Any): Self = StObject.set(x, "not_equal", value.asInstanceOf[js.Any])
      
      inline def setOn_destroy(value: js.Array[Any]): Self = StObject.set(x, "on_destroy", value.asInstanceOf[js.Any])
      
      inline def setOn_destroyVarargs(value: Any*): Self = StObject.set(x, "on_destroy", js.Array(value*))
      
      inline def setOn_disconnect(value: js.Array[Any]): Self = StObject.set(x, "on_disconnect", value.asInstanceOf[js.Any])
      
      inline def setOn_disconnectVarargs(value: Any*): Self = StObject.set(x, "on_disconnect", js.Array(value*))
      
      inline def setOn_mount(value: js.Array[Any]): Self = StObject.set(x, "on_mount", value.asInstanceOf[js.Any])
      
      inline def setOn_mountVarargs(value: Any*): Self = StObject.set(x, "on_mount", js.Array(value*))
      
      inline def setProps(value: Record[String, `0` | String]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Element | ShadowRoot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSkip_bound(value: Boolean): Self = StObject.set(x, "skip_bound", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
}
