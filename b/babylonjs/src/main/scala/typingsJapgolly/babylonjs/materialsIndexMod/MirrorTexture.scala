package typingsJapgolly.babylonjs.materialsIndexMod

import typingsJapgolly.babylonjs.anon.Height
import typingsJapgolly.babylonjs.anon.Ratio
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "MirrorTexture")
@js.native
open class MirrorTexture protected ()
  extends typingsJapgolly.babylonjs.materialsTexturesIndexMod.MirrorTexture {
  /**
    * Instantiates a Mirror Texture.
    * Mirror texture can be used to simulate the view from a mirror in a scene.
    * It will dynamically be rendered every frame to adapt to the camera point of view.
    * You can then easily use it as a reflectionTexture on a flat surface.
    * In case the surface is not a plane, please consider relying on reflection probes.
    * @see https://doc.babylonjs.com/how_to/reflect#mirrors
    * @param name
    * @param size
    * @param scene
    * @param generateMipMaps
    * @param type
    * @param samplingMode
    * @param generateDepthBuffer
    */
  def this(
    name: String,
    size: Double | Height | Ratio,
    scene: js.UndefOr[Scene],
    generateMipMaps: js.UndefOr[Boolean],
    `type`: js.UndefOr[Double],
    samplingMode: js.UndefOr[Double],
    generateDepthBuffer: js.UndefOr[Boolean]
  ) = this()
}
