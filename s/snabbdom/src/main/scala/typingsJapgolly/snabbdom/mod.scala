package typingsJapgolly.snabbdom

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import org.scalajs.dom.Text
import typingsJapgolly.snabbdom.anon.Key
import typingsJapgolly.snabbdom.anon.PartialModule
import typingsJapgolly.snabbdom.buildHMod.VNodeChildren
import typingsJapgolly.snabbdom.buildHtmldomapiMod.DOMAPI
import typingsJapgolly.snabbdom.buildInitMod.Options
import typingsJapgolly.snabbdom.buildJsxMod.FunctionComponent
import typingsJapgolly.snabbdom.buildJsxMod.JsxVNodeChildren
import typingsJapgolly.snabbdom.buildModulesModuleMod.Module
import typingsJapgolly.snabbdom.buildThunkMod.ThunkFn
import typingsJapgolly.snabbdom.buildVnodeMod.VNodeData
import typingsJapgolly.snabbdom.buildVnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snabbdom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Fragment_(data: Null, children: JsxVNodeChildren*): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(scala.List(data.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VNode_]
  inline def Fragment_(data: Key, children: JsxVNodeChildren*): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(scala.List(data.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VNode_]
  
  inline def array(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def attachTo(target: Element, vnode: VNode_): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(target.asInstanceOf[js.Any], vnode.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  
  @JSImport("snabbdom", "attributesModule")
  @js.native
  val attributesModule: Module = js.native
  
  @JSImport("snabbdom", "classModule")
  @js.native
  val classModule: Module = js.native
  
  @JSImport("snabbdom", "datasetModule")
  @js.native
  val datasetModule: Module = js.native
  
  @JSImport("snabbdom", "eventListenersModule")
  @js.native
  val eventListenersModule: Module = js.native
  
  inline def fragment(children: VNodeChildren): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(children.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  
  inline def h(sel: String): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  inline def h(sel: String, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  inline def h(sel: String, data: Null, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  inline def h(sel: String, data: VNodeData): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  inline def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  
  @JSImport("snabbdom", "htmlDomApi")
  @js.native
  val htmlDomApi: DOMAPI = js.native
  
  inline def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: Unit, options: Options): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: DOMAPI, options: Options): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  
  inline def jsx(tag: String, data: Null, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  inline def jsx(tag: String, data: VNodeData, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  inline def jsx(tag: FunctionComponent, data: Null, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  inline def jsx(tag: FunctionComponent, data: VNodeData, children: JsxVNodeChildren*): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(tag.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode_]
  
  inline def primitive(s: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("primitive")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("snabbdom", "propsModule")
  @js.native
  val propsModule: Module = js.native
  
  @JSImport("snabbdom", "styleModule")
  @js.native
  val styleModule: Module = js.native
  
  @JSImport("snabbdom", "thunk")
  @js.native
  val thunk: ThunkFn = js.native
  
  inline def toVNode(node: Node): VNode_ = ^.asInstanceOf[js.Dynamic].applyDynamic("toVNode")(node.asInstanceOf[js.Any]).asInstanceOf[VNode_]
  inline def toVNode(node: Node, domApi: DOMAPI): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("toVNode")(node.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any])).asInstanceOf[VNode_]
  
  inline def vnode(
    sel: js.UndefOr[String],
    data: js.UndefOr[Any],
    children: js.UndefOr[js.Array[VNode_ | String]],
    text: js.UndefOr[String],
    elm: js.UndefOr[Element | DocumentFragment | Text]
  ): VNode_ = (^.asInstanceOf[js.Dynamic].applyDynamic("vnode")(sel.asInstanceOf[js.Any], data.asInstanceOf[js.Any], children.asInstanceOf[js.Any], text.asInstanceOf[js.Any], elm.asInstanceOf[js.Any])).asInstanceOf[VNode_]
}
