package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ExtractHighlightsPostProcess")
@js.native
open class ExtractHighlightsPostProcess protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.ExtractHighlightsPostProcess {
  def this(
    name: String,
    options: Double | PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
