package typingsJapgolly.tinymce.mod.geom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  def clamp(rect: Rect, clampRect: Rect, fixedSize: Boolean): Rect
  def create(x: Double, y: Double, w: Double, h: Double): Rect
  def findBestRelativePosition(rect: Rect, targetRect: Rect, constrainRect: Rect, rels: js.Array[_]): Unit
  def fromClientRect(clientRect: ClientRect): Rect
  def inflate(rect: Rect, w: Double, h: Double): Rect
  def intersect(rect: Rect, cropRect: Rect): Rect
  def relativePosition(rect: Rect, targetRect: Rect, rel: String): Unit
}

object Rect {
  @scala.inline
  def apply(
    clamp: (Rect, Rect, Boolean) => CallbackTo[Rect],
    create: (Double, Double, Double, Double) => CallbackTo[Rect],
    findBestRelativePosition: (Rect, Rect, Rect, js.Array[js.Any]) => Callback,
    fromClientRect: ClientRect => CallbackTo[Rect],
    inflate: (Rect, Double, Double) => CallbackTo[Rect],
    intersect: (Rect, Rect) => CallbackTo[Rect],
    relativePosition: (Rect, Rect, String) => Callback
  ): Rect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clamp")(js.Any.fromFunction3((t0: typingsJapgolly.tinymce.mod.geom.Rect, t1: typingsJapgolly.tinymce.mod.geom.Rect, t2: scala.Boolean) => clamp(t0, t1, t2).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => create(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findBestRelativePosition")(js.Any.fromFunction4((t0: typingsJapgolly.tinymce.mod.geom.Rect, t1: typingsJapgolly.tinymce.mod.geom.Rect, t2: typingsJapgolly.tinymce.mod.geom.Rect, t3: js.Array[js.Any]) => findBestRelativePosition(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("fromClientRect")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.ClientRect) => fromClientRect(t0).runNow()))
    __obj.updateDynamic("inflate")(js.Any.fromFunction3((t0: typingsJapgolly.tinymce.mod.geom.Rect, t1: scala.Double, t2: scala.Double) => inflate(t0, t1, t2).runNow()))
    __obj.updateDynamic("intersect")(js.Any.fromFunction2((t0: typingsJapgolly.tinymce.mod.geom.Rect, t1: typingsJapgolly.tinymce.mod.geom.Rect) => intersect(t0, t1).runNow()))
    __obj.updateDynamic("relativePosition")(js.Any.fromFunction3((t0: typingsJapgolly.tinymce.mod.geom.Rect, t1: typingsJapgolly.tinymce.mod.geom.Rect, t2: java.lang.String) => relativePosition(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Rect]
  }
}

