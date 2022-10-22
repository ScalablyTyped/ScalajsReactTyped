package typingsJapgolly.fullcalendarCore.vdomMod.global.FullCalendarVDom

import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Text
import org.scalajs.dom.UIEvent
import typingsJapgolly.fullcalendarCore.vdomMod.global.FullCalendarVDom.^
import typingsJapgolly.preact.mod.ComponentClass
import typingsJapgolly.preact.mod.FunctionComponent
import typingsJapgolly.preact.mod.RefCallback
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Fragment: FunctionComponent[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[FunctionComponent[js.Object]]

inline def createContext[T](defaultValue: T): typingsJapgolly.preact.mod.Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.preact.mod.Context[T]]

inline def createRef[T](): typingsJapgolly.preact.mod.RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typingsJapgolly.preact.mod.RefObject[T]]

inline def flushSync(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushSync")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: DocumentFragment, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: DocumentFragment, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: Document, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: Document, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: Element, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: Element, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: ShadowRoot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: ShadowRoot, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: typingsJapgolly.preact.mod.ComponentChild, parent: ShadowRoot, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unmountComponentAtNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmountComponentAtNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ComponentChild = js.UndefOr[
typingsJapgolly.preact.mod.VNode[Any] | js.Object | String | Double | js.BigInt | Boolean | Null]

type ComponentChildren = js.Array[typingsJapgolly.preact.mod.ComponentChild] | typingsJapgolly.preact.mod.ComponentChild

type ComponentType[P] = (ComponentClass[P, js.Object]) | FunctionComponent[P]

type Ref[T] = typingsJapgolly.preact.mod.RefObject[T] | RefCallback[T] | Null

type VNode = typingsJapgolly.preact.mod.VNode[Any]

type VUIEvent = UIEvent
