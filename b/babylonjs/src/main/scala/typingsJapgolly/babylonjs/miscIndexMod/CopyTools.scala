package typingsJapgolly.babylonjs.miscIndexMod

import typingsJapgolly.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typingsJapgolly.babylonjs.mathsMathDotsizeMod.ISize
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CopyTools {
  
  @JSImport("babylonjs/Misc/index", "CopyTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Transform some pixel data to a base64 string
    * @param pixels defines the pixel data to transform to base64
    * @param size defines the width and height of the (texture) data
    * @param invertY true if the data must be inverted for the Y coordinate during the conversion
    * @returns The base64 encoded string or null
    */
  @JSImport("babylonjs/Misc/index", "CopyTools.GenerateBase64StringFromPixelData")
  @js.native
  def GenerateBase64StringFromPixelData: js.Function3[
    /* pixels */ js.typedarray.ArrayBufferView, 
    /* size */ ISize, 
    /* invertY */ js.UndefOr[Boolean], 
    Nullable[String]
  ] = js.native
  /**
    * Transform some pixel data to a base64 string
    * @param pixels defines the pixel data to transform to base64
    * @param size defines the width and height of the (texture) data
    * @param invertY true if the data must be inverted for the Y coordinate during the conversion
    * @returns The base64 encoded string or null
    */
  inline def GenerateBase64StringFromPixelData(pixels: js.typedarray.ArrayBufferView, size: ISize): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromPixelData")(pixels.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
  inline def GenerateBase64StringFromPixelData(pixels: js.typedarray.ArrayBufferView, size: ISize, invertY: Boolean): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromPixelData")(pixels.asInstanceOf[js.Any], size.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
  inline def GenerateBase64StringFromPixelData_=(
    x: js.Function3[
      /* pixels */ js.typedarray.ArrayBufferView, 
      /* size */ ISize, 
      /* invertY */ js.UndefOr[Boolean], 
      Nullable[String]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GenerateBase64StringFromPixelData")(x.asInstanceOf[js.Any])
  
  /**
    * Reads the pixels stored in the webgl texture and returns them as a base64 string
    * @param texture defines the texture to read pixels from
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @returns The base64 encoded string or null
    */
  @JSImport("babylonjs/Misc/index", "CopyTools.GenerateBase64StringFromTexture")
  @js.native
  def GenerateBase64StringFromTexture: js.Function3[
    /* texture */ BaseTexture, 
    /* faceIndex */ js.UndefOr[Double], 
    /* level */ js.UndefOr[Double], 
    Nullable[String]
  ] = js.native
  /**
    * Reads the pixels stored in the webgl texture and returns them as a base64 string
    * @param texture defines the texture to read pixels from
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @returns The base64 encoded string or null
    */
  inline def GenerateBase64StringFromTexture(texture: BaseTexture): Nullable[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Nullable[String]]
  inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
  inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Double, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
  inline def GenerateBase64StringFromTexture(texture: BaseTexture, faceIndex: Unit, level: Double): Nullable[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTexture")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Nullable[String]]
  
  /**
    * Reads the pixels stored in the webgl texture and returns them as a base64 string
    * @param texture defines the texture to read pixels from
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @returns The base64 encoded string or null wrapped in a promise
    */
  @JSImport("babylonjs/Misc/index", "CopyTools.GenerateBase64StringFromTextureAsync")
  @js.native
  def GenerateBase64StringFromTextureAsync: js.Function3[
    /* texture */ BaseTexture, 
    /* faceIndex */ js.UndefOr[Double], 
    /* level */ js.UndefOr[Double], 
    js.Promise[Nullable[String]]
  ] = js.native
  /**
    * Reads the pixels stored in the webgl texture and returns them as a base64 string
    * @param texture defines the texture to read pixels from
    * @param faceIndex defines the face of the texture to read (in case of cube texture)
    * @param level defines the LOD level of the texture to read (in case of Mip Maps)
    * @returns The base64 encoded string or null wrapped in a promise
    */
  inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture): js.Promise[Nullable[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Nullable[String]]]
  inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture, faceIndex: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]
  inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture, faceIndex: Double, level: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]
  inline def GenerateBase64StringFromTextureAsync(texture: BaseTexture, faceIndex: Unit, level: Double): js.Promise[Nullable[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("GenerateBase64StringFromTextureAsync")(texture.asInstanceOf[js.Any], faceIndex.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Nullable[String]]]
  inline def GenerateBase64StringFromTextureAsync_=(
    x: js.Function3[
      /* texture */ BaseTexture, 
      /* faceIndex */ js.UndefOr[Double], 
      /* level */ js.UndefOr[Double], 
      js.Promise[Nullable[String]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GenerateBase64StringFromTextureAsync")(x.asInstanceOf[js.Any])
  
  inline def GenerateBase64StringFromTexture_=(
    x: js.Function3[
      /* texture */ BaseTexture, 
      /* faceIndex */ js.UndefOr[Double], 
      /* level */ js.UndefOr[Double], 
      Nullable[String]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GenerateBase64StringFromTexture")(x.asInstanceOf[js.Any])
}
