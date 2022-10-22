package typingsJapgolly.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.DepthTexture")
@js.native
open class DepthTexture protected ()
  extends typingsJapgolly.three.mod.DepthTexture {
  /**
    * @param width
    * @param height
    * @param type
    * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
    * @param [wrapS=THREE.ClampToEdgeWrapping]
    * @param [wrapT=THREE.ClampToEdgeWrapping]
    * @param [magFilter=THREE.NearestFilter]
    * @param [minFilter=THREE.NearestFilter]
    * @param [anisotropy=1]
    */
  def this(
    width: Double,
    height: Double,
    `type`: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}
