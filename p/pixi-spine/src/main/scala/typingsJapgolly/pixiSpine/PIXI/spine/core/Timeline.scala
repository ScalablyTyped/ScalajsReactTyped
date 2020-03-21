package typingsJapgolly.pixiSpine.PIXI.spine.core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends js.Object {
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
  def getPropertyId(): Double
}

object Timeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    getPropertyId: CallbackTo[Double]
  ): Timeline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction7((t0: typingsJapgolly.pixiSpine.PIXI.spine.core.Skeleton, t1: scala.Double, t2: scala.Double, t3: js.Array[typingsJapgolly.pixiSpine.PIXI.spine.core.Event], t4: scala.Double, t5: typingsJapgolly.pixiSpine.PIXI.spine.core.MixBlend, t6: typingsJapgolly.pixiSpine.PIXI.spine.core.MixDirection) => apply(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.updateDynamic("getPropertyId")(getPropertyId.toJsFn)
    __obj.asInstanceOf[Timeline]
  }
}

