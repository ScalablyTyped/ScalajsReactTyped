package typingsJapgolly.babylonjs.miscIndexMod

import typingsJapgolly.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typingsJapgolly.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial
import typingsJapgolly.babylonjs.miscHighDynamicRangePanoramaToCubemapMod.CubeMapInfo
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "CubeMapToSphericalPolynomialTools")
@js.native
open class CubeMapToSphericalPolynomialTools ()
  extends typingsJapgolly.babylonjs.miscHighDynamicRangeIndexMod.CubeMapToSphericalPolynomialTools
/* static members */
object CubeMapToSphericalPolynomialTools {
  
  @JSImport("babylonjs/Misc/index", "CubeMapToSphericalPolynomialTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a texture to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param texture The texture to extract the information from.
    * @returns The Spherical Polynomial data.
    */
  inline def ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): Nullable[js.Promise[SphericalPolynomial]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertCubeMapTextureToSphericalPolynomial")(texture.asInstanceOf[js.Any]).asInstanceOf[Nullable[js.Promise[SphericalPolynomial]]]
  
  /**
    * Converts a cubemap to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param cubeInfo The Cube map to extract the information from.
    * @returns The Spherical Polynomial data.
    */
  inline def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("ConvertCubeMapToSphericalPolynomial")(cubeInfo.asInstanceOf[js.Any]).asInstanceOf[SphericalPolynomial]
  
  /**
    * Compute the area on the unit sphere of the rectangle defined by (x,y) and the origin
    * See https://www.rorydriscoll.com/2012/01/15/cubemap-texel-solid-angle/
    * @param x
    * @param y
    */
  @JSImport("babylonjs/Misc/index", "CubeMapToSphericalPolynomialTools._AreaElement")
  @js.native
  def _AreaElement: Any = js.native
  inline def _AreaElement_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AreaElement")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Misc/index", "CubeMapToSphericalPolynomialTools._FileFaces")
  @js.native
  def _FileFaces: Any = js.native
  inline def _FileFaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FileFaces")(x.asInstanceOf[js.Any])
}
