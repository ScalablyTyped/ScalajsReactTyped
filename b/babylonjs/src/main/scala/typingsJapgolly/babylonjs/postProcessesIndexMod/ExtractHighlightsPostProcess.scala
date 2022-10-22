package typingsJapgolly.babylonjs.postProcessesIndexMod

import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.enginesEngineMod.Engine
import typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "ExtractHighlightsPostProcess")
@js.native
open class ExtractHighlightsPostProcess protected ()
  extends typingsJapgolly.babylonjs.postProcessesExtractHighlightsPostProcessMod.ExtractHighlightsPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
