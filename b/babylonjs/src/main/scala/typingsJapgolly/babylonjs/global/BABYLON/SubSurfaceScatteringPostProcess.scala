package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubSurfaceScatteringPostProcess")
@js.native
open class SubSurfaceScatteringPostProcess protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SubSurfaceScatteringPostProcess {
  def this(
    name: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
