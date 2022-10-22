package typingsJapgolly.virtualDom

import org.scalajs.dom.Element
import org.scalajs.dom.Text
import typingsJapgolly.virtualDom.VirtualDOM.Thunk
import typingsJapgolly.virtualDom.VirtualDOM.VNode
import typingsJapgolly.virtualDom.VirtualDOM.VText
import typingsJapgolly.virtualDom.VirtualDOM.Widget
import typingsJapgolly.virtualDom.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElementMod {
  
  inline def apply(vnode: Thunk): Element = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply(vnode: Thunk, opts: Document): Element = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(vnode: VNode): Element = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply(vnode: VNode, opts: Document): Element = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  inline def apply(vnode: VText): Text = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Text]
  inline def apply(vnode: VText, opts: Document): Text = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Text]
  inline def apply(vnode: Widget): Element = ^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply(vnode: Widget, opts: Document): Element = (^.asInstanceOf[js.Dynamic].apply(vnode.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @JSImport("virtual-dom/create-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
