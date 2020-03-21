package typingsJapgolly.dragula.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.dragula.dragulaStrings.cancel
import typingsJapgolly.dragula.dragulaStrings.cloned
import typingsJapgolly.dragula.dragulaStrings.copy
import typingsJapgolly.dragula.dragulaStrings.drag
import typingsJapgolly.dragula.dragulaStrings.dragend
import typingsJapgolly.dragula.dragulaStrings.drop
import typingsJapgolly.dragula.dragulaStrings.mirror
import typingsJapgolly.dragula.dragulaStrings.out
import typingsJapgolly.dragula.dragulaStrings.over
import typingsJapgolly.dragula.dragulaStrings.remove
import typingsJapgolly.dragula.dragulaStrings.shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Drake extends js.Object {
  var containers: js.Array[Element] = js.native
  var dragging: Boolean = js.native
  def canMove(item: Element): Boolean = js.native
  def cancel(): Unit = js.native
  def cancel(revert: Boolean): Unit = js.native
  def destroy(): Unit = js.native
  def end(): Unit = js.native
  def on(
    event: cloned,
    listener: js.Function3[/* clone */ Element, /* original */ Element, /* type */ mirror | copy, Unit]
  ): Drake = js.native
  @JSName("on")
  def on_cancel(
    event: cancel,
    listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
  ): Drake = js.native
  @JSName("on")
  def on_drag(event: drag, listener: js.Function2[/* el */ Element, /* source */ Element, Unit]): Drake = js.native
  @JSName("on")
  def on_dragend(event: dragend, listener: js.Function1[/* el */ Element, Unit]): Drake = js.native
  @JSName("on")
  def on_drop(
    event: drop,
    listener: js.Function4[
      /* el */ Element, 
      /* target */ Element, 
      /* source */ Element, 
      /* sibling */ Element, 
      Unit
    ]
  ): Drake = js.native
  @JSName("on")
  def on_out(
    event: out,
    listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
  ): Drake = js.native
  @JSName("on")
  def on_over(
    event: over,
    listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
  ): Drake = js.native
  @JSName("on")
  def on_remove(
    event: remove,
    listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
  ): Drake = js.native
  @JSName("on")
  def on_shadow(
    event: shadow,
    listener: js.Function3[/* el */ Element, /* container */ Element, /* source */ Element, Unit]
  ): Drake = js.native
  def remove(): Unit = js.native
  def start(item: Element): Unit = js.native
}

