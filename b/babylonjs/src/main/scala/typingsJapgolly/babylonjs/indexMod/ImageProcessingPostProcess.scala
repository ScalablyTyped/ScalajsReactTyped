package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ImageProcessingPostProcess")
@js.native
open class ImageProcessingPostProcess protected ()
  extends typingsJapgolly.babylonjs.postProcessesIndexMod.ImageProcessingPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsJapgolly.babylonjs.enginesEngineMod.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    imageProcessingConfiguration: js.UndefOr[
        typingsJapgolly.babylonjs.materialsImageProcessingConfigurationMod.ImageProcessingConfiguration
      ]
  ) = this()
}
