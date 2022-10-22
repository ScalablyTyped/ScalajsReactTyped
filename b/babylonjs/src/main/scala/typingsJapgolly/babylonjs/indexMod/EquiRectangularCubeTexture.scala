package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "EquiRectangularCubeTexture")
@js.native
open class EquiRectangularCubeTexture protected ()
  extends typingsJapgolly.babylonjs.materialsIndexMod.EquiRectangularCubeTexture {
  /**
    * Instantiates an EquiRectangularCubeTexture from the following parameters.
    * @param url The location of the image
    * @param scene The scene the texture will be used in
    * @param size The cubemap desired size (the more it increases the longer the generation will be)
    * @param noMipmap Forces to not generate the mipmap if true
    * @param gammaSpace Specifies if the texture will be used in gamma or linear space
    * (the PBR material requires those textures in linear space, but the standard material would require them in Gamma space)
    * @param onLoad — defines a callback called when texture is loaded
    * @param onError — defines a callback called if there is an error
    */
  def this(url: String, scene: typingsJapgolly.babylonjs.sceneMod.Scene, size: Double) = this()
  def this(url: String, scene: typingsJapgolly.babylonjs.sceneMod.Scene, size: Double, noMipmap: Boolean) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Boolean
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Unit,
    gammaSpace: Boolean
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Boolean,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Unit,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Unit,
    gammaSpace: Boolean,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Unit,
    gammaSpace: Unit,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Boolean,
    onLoad: Unit,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Boolean,
    onLoad: Nullable[js.Function0[Unit]],
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Unit,
    onLoad: Unit,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Unit,
    onLoad: Nullable[js.Function0[Unit]],
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Unit,
    gammaSpace: Boolean,
    onLoad: Unit,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Unit,
    gammaSpace: Boolean,
    onLoad: Nullable[js.Function0[Unit]],
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Unit,
    gammaSpace: Unit,
    onLoad: Unit,
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
  def this(
    url: String,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    size: Double,
    noMipmap: Unit,
    gammaSpace: Unit,
    onLoad: Nullable[js.Function0[Unit]],
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
      ]
  ) = this()
}
/* static members */
object EquiRectangularCubeTexture {
  
  @JSImport("babylonjs/index", "EquiRectangularCubeTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /** The six faces of the cube. */
  @JSImport("babylonjs/index", "EquiRectangularCubeTexture._FacesMapping")
  @js.native
  def _FacesMapping: Any = js.native
  inline def _FacesMapping_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FacesMapping")(x.asInstanceOf[js.Any])
}
