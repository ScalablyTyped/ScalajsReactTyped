package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.BlendOption
import typingsJapgolly.cesium.mod.Matrix4
import typingsJapgolly.cesium.mod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlendOption extends js.Object {
  var blendOption: js.UndefOr[BlendOption] = js.undefined
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var scene: js.UndefOr[Scene] = js.undefined
}

object AnonBlendOption {
  @scala.inline
  def apply(
    blendOption: BlendOption = null,
    debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null,
    scene: Scene = null
  ): AnonBlendOption = {
    val __obj = js.Dynamic.literal()
    if (blendOption != null) __obj.updateDynamic("blendOption")(blendOption.asInstanceOf[js.Any])
    if (!js.isUndefined(debugShowBoundingVolume)) __obj.updateDynamic("debugShowBoundingVolume")(debugShowBoundingVolume.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlendOption]
  }
}

