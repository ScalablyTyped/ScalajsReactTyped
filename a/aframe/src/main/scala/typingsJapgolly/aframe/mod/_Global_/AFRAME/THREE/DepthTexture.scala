package typingsJapgolly.aframe.mod._Global_.AFRAME.THREE

import typingsJapgolly.three.constantsMod.Mapping
import typingsJapgolly.three.constantsMod.TextureDataType
import typingsJapgolly.three.constantsMod.TextureFilter
import typingsJapgolly.three.constantsMod.Wrapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.DepthTexture")
@js.native
class DepthTexture protected ()
  extends typingsJapgolly.three.mod.DepthTexture {
  def this(
    width: Double,
    heighht: Double,
    `type`: js.UndefOr[TextureDataType],
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

