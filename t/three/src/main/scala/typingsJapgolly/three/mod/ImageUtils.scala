package typingsJapgolly.three.mod

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.three.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageUtils {
  
  @JSImport("three", "ImageUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated
    */
  @JSImport("three", "ImageUtils.crossOrigin")
  @js.native
  def crossOrigin: String = js.native
  inline def crossOrigin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(x.asInstanceOf[js.Any])
  
  inline def getDataURL(image: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataURL")(image.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @deprecated Use {@link TextureLoader THREE.TextureLoader()} instead.
    */
  inline def loadTexture(url: String): typingsJapgolly.three.srcTexturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTexture(
    url: String,
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTexture(
    url: String,
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTexture(url: String, mapping: Unit, onLoad: Unit, onError: js.Function1[/* message */ String, Unit]): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTexture(url: String, mapping: typingsJapgolly.three.srcConstantsMod.Mapping): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTexture(
    url: String,
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTexture(
    url: String,
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTexture(
    url: String,
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  
  /**
    * @deprecated Use {@link CubeTextureLoader THREE.CubeTextureLoader()} instead.
    */
  inline def loadTextureCube(array: js.Array[String]): typingsJapgolly.three.srcTexturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTextureCube(array: js.Array[String], mapping: typingsJapgolly.three.srcConstantsMod.Mapping): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.three.srcTexturesTextureMod.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.three.srcConstantsMod.Mapping,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.three.srcTexturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcTexturesTextureMod.Texture]
  
  inline def sRGBToLinear(image: Any): HTMLCanvasElement | Data = ^.asInstanceOf[js.Dynamic].applyDynamic("sRGBToLinear")(image.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement | Data]
}
