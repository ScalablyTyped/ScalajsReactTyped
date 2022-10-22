package typingsJapgolly.vueRuntimeCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.vueRuntimeCore.anon.ElementvnodeVNodeRenderer
import typingsJapgolly.vueRuntimeCore.anon.ShadowRootvnodeVNodeRende
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydrationRenderer
  extends StObject
     with Renderer[Element | ShadowRoot] {
  
  def hydrate(vnode: VNode[Node, Element, StringDictionary[Any]], container: ElementvnodeVNodeRenderer): Unit
  def hydrate(vnode: VNode[Node, Element, StringDictionary[Any]], container: ShadowRootvnodeVNodeRende): Unit
  @JSName("hydrate")
  var hydrate_Original: RootHydrateFunction
}
object HydrationRenderer {
  
  inline def apply(
    createApp: (/* rootComponent */ Component[Any, Any, Any, ComputedOptions, MethodOptions], /* rootProps */ js.UndefOr[Data | Null]) => App[Element | ShadowRoot],
    hydrate: (/* vnode */ VNode[Node, Element, StringDictionary[Any]], /* container */ ElementvnodeVNodeRenderer | ShadowRootvnodeVNodeRende) => Callback,
    render: (/* vnode */ (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | Null, Element | ShadowRoot, /* isSVG */ js.UndefOr[Boolean]) => Callback
  ): HydrationRenderer = {
    val __obj = js.Dynamic.literal(createApp = js.Any.fromFunction2(createApp), hydrate = js.Any.fromFunction2((t0: /* vnode */ VNode[Node, Element, StringDictionary[Any]], t1: /* container */ ElementvnodeVNodeRenderer | ShadowRootvnodeVNodeRende) => (hydrate(t0, t1)).runNow()), render = js.Any.fromFunction3((t0: /* vnode */ (VNode[RendererNode, RendererElement, StringDictionary[Any]]) | Null, t1: Element | ShadowRoot, t2: /* isSVG */ js.UndefOr[Boolean]) => (render(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[HydrationRenderer]
  }
  
  extension [Self <: HydrationRenderer](x: Self) {
    
    inline def setHydrate(
      value: (/* vnode */ VNode[Node, Element, StringDictionary[Any]], /* container */ ElementvnodeVNodeRenderer | ShadowRootvnodeVNodeRende) => Callback
    ): Self = StObject.set(x, "hydrate", js.Any.fromFunction2((t0: /* vnode */ VNode[Node, Element, StringDictionary[Any]], t1: /* container */ ElementvnodeVNodeRenderer | ShadowRootvnodeVNodeRende) => (value(t0, t1)).runNow()))
  }
}
