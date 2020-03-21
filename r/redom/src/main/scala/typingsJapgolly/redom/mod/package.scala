package typingsJapgolly.redom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HTMLElementOfRedomQuery[Q /* <: typingsJapgolly.redom.mod.RedomQuery */] = typingsJapgolly.redom.mod.HTMLElementOfStringLiteral[Q] | Q
  type HTMLElementOfStringLiteral[Q /* <: java.lang.String */] = org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement | org.scalajs.dom.raw.HTMLStyleElement | typingsJapgolly.std.HTMLTableHeaderCellElement | org.scalajs.dom.raw.HTMLTableSectionElement | org.scalajs.dom.raw.HTMLTableCellElement | org.scalajs.dom.raw.HTMLTableRowElement | org.scalajs.dom.raw.HTMLTableElement | org.scalajs.dom.raw.HTMLHeadingElement | org.scalajs.dom.raw.HTMLButtonElement | org.scalajs.dom.raw.HTMLOptionElement | org.scalajs.dom.raw.HTMLSelectElement | org.scalajs.dom.raw.HTMLTextAreaElement | org.scalajs.dom.raw.HTMLLabelElement | org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLFormElement | org.scalajs.dom.raw.HTMLOListElement | org.scalajs.dom.raw.HTMLLIElement | org.scalajs.dom.raw.HTMLUListElement | org.scalajs.dom.raw.HTMLIFrameElement | org.scalajs.dom.raw.HTMLImageElement | org.scalajs.dom.raw.HTMLBRElement | org.scalajs.dom.raw.HTMLHRElement | org.scalajs.dom.raw.HTMLParagraphElement | org.scalajs.dom.raw.HTMLPreElement | org.scalajs.dom.raw.HTMLSpanElement | org.scalajs.dom.raw.HTMLAnchorElement | org.scalajs.dom.raw.HTMLDivElement
  type RedomElement = org.scalajs.dom.raw.Node | typingsJapgolly.redom.mod.RedomComponent
  type RedomMiddleware = js.Function1[/* el */ org.scalajs.dom.raw.HTMLElement, scala.Unit]
  type RedomQuery = java.lang.String | typingsJapgolly.redom.mod.RedomElement
  type RedomQueryArgument = typingsJapgolly.redom.mod.RedomQueryArgumentValue | js.Array[typingsJapgolly.redom.mod.RedomQueryArgumentValue]
  type RedomQueryArgumentValue = typingsJapgolly.redom.mod.RedomElement | java.lang.String | scala.Double | org.scalablytyped.runtime.StringDictionary[js.Any] | typingsJapgolly.redom.mod.RedomMiddleware
  type RouterDictionary = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.redom.mod.RedomComponentConstructor]
}
