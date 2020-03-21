package typingsJapgolly.preact.internalMod

import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.std.Event_
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreactElement extends HTMLElement {
  var _children: js.UndefOr[VNode[_] | Null] = js.native
  /** Event listeners to support event delegation */
  var _listeners: Record[String, js.Function1[/* e */ Event_, Unit]] = js.native
  // style: HTMLElement["style"]; // From HTMLElement
  var data: js.UndefOr[String | Double] = js.native
  // Preact uses this attribute to detect SVG nodes
  var ownerSVGElement: js.UndefOr[SVGElement | Null] = js.native
}

