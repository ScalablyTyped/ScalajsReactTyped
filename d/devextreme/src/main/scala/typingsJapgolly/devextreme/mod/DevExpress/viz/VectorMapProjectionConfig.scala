package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorMapProjectionConfig extends js.Object {
  /** Specifies the projection's ratio of the width to the height. */
  var aspectRatio: js.UndefOr[Double] = js.undefined
  /** Converts coordinates from [x, y] to [lon, lat]. */
  var from: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.undefined
  /** Converts coordinates from [lon, lat] to [x, y]. */
  var to: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.undefined
}

object VectorMapProjectionConfig {
  @scala.inline
  def apply(
    aspectRatio: Int | Double = null,
    from: /* coordinates */ js.Array[Double] => CallbackTo[js.Array[Double]] = null,
    to: /* coordinates */ js.Array[Double] => CallbackTo[js.Array[Double]] = null
  ): VectorMapProjectionConfig = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(js.Any.fromFunction1((t0: /* coordinates */ js.Array[scala.Double]) => from(t0).runNow()))
    if (to != null) __obj.updateDynamic("to")(js.Any.fromFunction1((t0: /* coordinates */ js.Array[scala.Double]) => to(t0).runNow()))
    __obj.asInstanceOf[VectorMapProjectionConfig]
  }
}

