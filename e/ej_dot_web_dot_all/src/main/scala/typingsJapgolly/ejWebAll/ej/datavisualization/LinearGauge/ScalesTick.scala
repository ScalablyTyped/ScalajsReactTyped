package typingsJapgolly.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesTick extends js.Object {
  /** Specifies the angle in the tick.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Specifies the tick Color in the tick.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the DistanceFromScale in the tick.
    * @Default {null}
    */
  var distanceFromScale: js.UndefOr[ScalesTicksDistanceFromScale] = js.undefined
  /** Specifies the tick Height in the tick.
    * @Default {10}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Specifies the opacity in the tick.
    * @Default {0}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the tick Placement in the tick. See TickPlacement
    * @Default {Near}
    */
  var placement: js.UndefOr[PointerPlacement | String] = js.undefined
  /** Specifies the tick Style in the tick. See
    * @Default {MajorInterval}
    */
  var `type`: js.UndefOr[TicksType | String] = js.undefined
  /** Specifies the tick Width in the tick.
    * @Default {3}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ScalesTick {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    color: String = null,
    distanceFromScale: ScalesTicksDistanceFromScale = null,
    height: Int | Double = null,
    opacity: Int | Double = null,
    placement: PointerPlacement | String = null,
    `type`: TicksType | String = null,
    width: Int | Double = null
  ): ScalesTick = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (distanceFromScale != null) __obj.updateDynamic("distanceFromScale")(distanceFromScale.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesTick]
  }
}

