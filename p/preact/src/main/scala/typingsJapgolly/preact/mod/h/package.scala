package typingsJapgolly.preact.mod.h

import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.preact.mod.Attributes
import typingsJapgolly.preact.mod.ClassAttributes
import typingsJapgolly.preact.mod.ComponentChildren
import typingsJapgolly.preact.mod.ComponentType
import typingsJapgolly.preact.mod.VNode
import typingsJapgolly.preact.mod.h.^
import typingsJapgolly.preact.preactStrings.input
import typingsJapgolly.preact.srcJsxMod.JSXInternal.DOMAttributes
import typingsJapgolly.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typingsJapgolly.preact.srcJsxMod.JSXInternal.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(
  `type`: input,
  props: DOMAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply(`type`: input, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[T /* <: HTMLElement */](
  `type`: String,
  props: ClassAttributes[T] & HTMLAttributes[EventTarget] & SVGAttributes[SVGElement],
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[T /* <: HTMLElement */](`type`: String, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P](`type`: ComponentType[P], props: Attributes & P, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 165, starting with typingsJapgolly.preact.preactStrings.a, typingsJapgolly.preact.preactStrings.abbr, typingsJapgolly.preact.preactStrings.address */ Any,
  props: ClassAttributes[T] & P,
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 165, starting with typingsJapgolly.preact.preactStrings.a, typingsJapgolly.preact.preactStrings.abbr, typingsJapgolly.preact.preactStrings.address */ Any,
  props: Null,
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
