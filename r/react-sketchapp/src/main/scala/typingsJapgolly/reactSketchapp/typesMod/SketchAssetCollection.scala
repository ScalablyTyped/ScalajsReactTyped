package typingsJapgolly.reactSketchapp.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchAssetCollection extends js.Object {
  def colors(): js.Array[MSColor]
  def gradients(): js.Array[MSGradient]
}

object SketchAssetCollection {
  @scala.inline
  def apply(colors: CallbackTo[js.Array[MSColor]], gradients: CallbackTo[js.Array[MSGradient]]): SketchAssetCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colors")(colors.toJsFn)
    __obj.updateDynamic("gradients")(gradients.toJsFn)
    __obj.asInstanceOf[SketchAssetCollection]
  }
}

