package typingsJapgolly.go

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.go.mod.BrushLike
import typingsJapgolly.go.mod.GraphObject
import typingsJapgolly.go.mod.Iterable
import typingsJapgolly.go.mod.MarginLike
import typingsJapgolly.go.mod.Part
import typingsJapgolly.go.mod.Point
import typingsJapgolly.go.mod.Size
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocument extends js.Object {
  var background: js.UndefOr[BrushLike] = js.undefined
  var document: js.UndefOr[Document_] = js.undefined
  var elementFinished: js.UndefOr[js.Function2[/* obj */ GraphObject, /* elt */ SVGElement, Unit]] = js.undefined
  var maxSize: js.UndefOr[Size] = js.undefined
  var padding: js.UndefOr[MarginLike] = js.undefined
  var parts: js.UndefOr[Iterable[Part]] = js.undefined
  var position: js.UndefOr[Point] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var showTemporary: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object AnonDocument {
  @scala.inline
  def apply(
    background: BrushLike = null,
    document: Document_ = null,
    elementFinished: (/* obj */ GraphObject, /* elt */ SVGElement) => Callback = null,
    maxSize: Size = null,
    padding: MarginLike = null,
    parts: Iterable[Part] = null,
    position: Point = null,
    scale: Int | Double = null,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    showTemporary: js.UndefOr[Boolean] = js.undefined,
    size: Size = null
  ): AnonDocument = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (elementFinished != null) __obj.updateDynamic("elementFinished")(js.Any.fromFunction2((t0: /* obj */ typingsJapgolly.go.mod.GraphObject, t1: /* elt */ org.scalajs.dom.raw.SVGElement) => elementFinished(t0, t1).runNow()))
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.asInstanceOf[js.Any])
    if (!js.isUndefined(showTemporary)) __obj.updateDynamic("showTemporary")(showTemporary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocument]
  }
}

