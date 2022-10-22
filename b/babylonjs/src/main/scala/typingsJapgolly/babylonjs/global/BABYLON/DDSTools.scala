package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DDSInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DDSTools")
@js.native
open class DDSTools ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DDSTools
/* static members */
object DDSTools {
  
  @JSGlobal("BABYLON.DDSTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets DDS information from an array buffer
    * @param data defines the array buffer view to read data from
    * @returns the DDS information
    */
  inline def GetDDSInfo(data: js.typedarray.ArrayBufferView): DDSInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDDSInfo")(data.asInstanceOf[js.Any]).asInstanceOf[DDSInfo]
  
  /**
    * Gets or sets a boolean indicating that LOD info is stored in alpha channel (false by default)
    */
  @JSGlobal("BABYLON.DDSTools.StoreLODInAlphaChannel")
  @js.native
  def StoreLODInAlphaChannel: Boolean = js.native
  inline def StoreLODInAlphaChannel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StoreLODInAlphaChannel")(x.asInstanceOf[js.Any])
  
  /**
    * Uploads DDS Levels to a Babylon Texture
    * @internal
    */
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double,
    currentFace: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double,
    currentFace: Double,
    destTypeMustBeFilterable: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double,
    currentFace: Unit,
    destTypeMustBeFilterable: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Unit,
    currentFace: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Unit,
    currentFace: Double,
    destTypeMustBeFilterable: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def UploadDDSLevels(
    engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    data: js.typedarray.ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Unit,
    currentFace: Unit,
    destTypeMustBeFilterable: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UploadDDSLevels")(engine.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], data.asInstanceOf[js.Any], info.asInstanceOf[js.Any], loadMipmaps.asInstanceOf[js.Any], faces.asInstanceOf[js.Any], lodIndex.asInstanceOf[js.Any], currentFace.asInstanceOf[js.Any], destTypeMustBeFilterable.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("BABYLON.DDSTools._ExtractLongWordOrder")
  @js.native
  def _ExtractLongWordOrder: Any = js.native
  inline def _ExtractLongWordOrder_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractLongWordOrder")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetFloatAsHalfFloatRGBAArrayBuffer")
  @js.native
  def _GetFloatAsHalfFloatRGBAArrayBuffer: Any = js.native
  inline def _GetFloatAsHalfFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatAsHalfFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetFloatAsUIntRGBAArrayBuffer")
  @js.native
  def _GetFloatAsUIntRGBAArrayBuffer: Any = js.native
  inline def _GetFloatAsUIntRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetFloatRGBAArrayBuffer")
  @js.native
  def _GetFloatRGBAArrayBuffer: Any = js.native
  inline def _GetFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetHalfFloatAsFloatRGBAArrayBuffer")
  @js.native
  def _GetHalfFloatAsFloatRGBAArrayBuffer: Any = js.native
  inline def _GetHalfFloatAsFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetHalfFloatAsUIntRGBAArrayBuffer")
  @js.native
  def _GetHalfFloatAsUIntRGBAArrayBuffer: Any = js.native
  inline def _GetHalfFloatAsUIntRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetHalfFloatRGBAArrayBuffer")
  @js.native
  def _GetHalfFloatRGBAArrayBuffer: Any = js.native
  inline def _GetHalfFloatRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetLuminanceArrayBuffer")
  @js.native
  def _GetLuminanceArrayBuffer: Any = js.native
  inline def _GetLuminanceArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetLuminanceArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetRGBAArrayBuffer")
  @js.native
  def _GetRGBAArrayBuffer: Any = js.native
  inline def _GetRGBAArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.DDSTools._GetRGBArrayBuffer")
  @js.native
  def _GetRGBArrayBuffer: Any = js.native
  inline def _GetRGBArrayBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBArrayBuffer")(x.asInstanceOf[js.Any])
}
