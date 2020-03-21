package typingsJapgolly.pixiSpine.PIXI.spine.core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexEffect extends js.Object {
  def begin(skeleton: Skeleton): Unit
  def end(): Unit
  def transform(position: Vector2, uv: Vector2, light: Color, dark: Color): Unit
}

object VertexEffect {
  @scala.inline
  def apply(
    begin: Skeleton => Callback,
    end: Callback,
    transform: (Vector2, Vector2, Color, Color) => Callback
  ): VertexEffect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("begin")(js.Any.fromFunction1((t0: typingsJapgolly.pixiSpine.PIXI.spine.core.Skeleton) => begin(t0).runNow()))
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("transform")(js.Any.fromFunction4((t0: typingsJapgolly.pixiSpine.PIXI.spine.core.Vector2, t1: typingsJapgolly.pixiSpine.PIXI.spine.core.Vector2, t2: typingsJapgolly.pixiSpine.PIXI.spine.core.Color, t3: typingsJapgolly.pixiSpine.PIXI.spine.core.Color) => transform(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[VertexEffect]
  }
}

