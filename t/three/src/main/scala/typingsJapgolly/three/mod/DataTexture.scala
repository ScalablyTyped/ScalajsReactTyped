package typingsJapgolly.three.mod

import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "DataTexture")
@js.native
open class DataTexture protected ()
  extends typingsJapgolly.three.srcThreeMod.DataTexture {
  /**
    * @param data
    * @param width
    * @param height
    * @param [format=THREE.RGBAFormat]
    * @param [type=THREE.UnsignedByteType]
    * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
    * @param [wrapS=THREE.ClampToEdgeWrapping]
    * @param [wrapT=THREE.ClampToEdgeWrapping]
    * @param [magFilter=THREE.NearestFilter]
    * @param [minFilter=THREE.NearestFilter]
    * @param [anisotropy=1]
    * @param [encoding=THREE.LinearEncoding]
    */
  def this(
    data: js.UndefOr[BufferSource | Null],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    format: js.UndefOr[typingsJapgolly.three.srcConstantsMod.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureEncoding]
  ) = this()
}
