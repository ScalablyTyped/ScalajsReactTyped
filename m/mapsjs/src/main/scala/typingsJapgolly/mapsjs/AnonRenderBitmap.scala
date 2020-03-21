package typingsJapgolly.mapsjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.mapsjs.mod.geometry
import typingsJapgolly.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderBitmap extends js.Object {
  var renderBitmap: js.UndefOr[
    js.Function4[
      /* img */ HTMLElement, 
      /* context */ CanvasRenderingContext2D, 
      /* contextSize */ Double, 
      /* bleed */ Double, 
      Unit
    ]
  ] = js.undefined
  var renderGeometry: js.UndefOr[js.Function2[/* shape */ geometry, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
  var renderPoint: js.UndefOr[js.Function2[/* pt */ point, /* context */ CanvasRenderingContext2D, Unit]] = js.undefined
}

object AnonRenderBitmap {
  @scala.inline
  def apply(
    renderBitmap: (/* img */ HTMLElement, /* context */ CanvasRenderingContext2D, /* contextSize */ Double, /* bleed */ Double) => Callback = null,
    renderGeometry: (/* shape */ geometry, /* context */ CanvasRenderingContext2D) => Callback = null,
    renderPoint: (/* pt */ point, /* context */ CanvasRenderingContext2D) => Callback = null
  ): AnonRenderBitmap = {
    val __obj = js.Dynamic.literal()
    if (renderBitmap != null) __obj.updateDynamic("renderBitmap")(js.Any.fromFunction4((t0: /* img */ org.scalajs.dom.raw.HTMLElement, t1: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D, t2: /* contextSize */ scala.Double, t3: /* bleed */ scala.Double) => renderBitmap(t0, t1, t2, t3).runNow()))
    if (renderGeometry != null) __obj.updateDynamic("renderGeometry")(js.Any.fromFunction2((t0: /* shape */ typingsJapgolly.mapsjs.mod.geometry, t1: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D) => renderGeometry(t0, t1).runNow()))
    if (renderPoint != null) __obj.updateDynamic("renderPoint")(js.Any.fromFunction2((t0: /* pt */ typingsJapgolly.mapsjs.mod.point, t1: /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D) => renderPoint(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRenderBitmap]
  }
}

