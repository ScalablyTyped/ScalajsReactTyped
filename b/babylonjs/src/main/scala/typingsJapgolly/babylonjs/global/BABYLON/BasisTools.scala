package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BasisTools {
  
  @JSGlobal("BABYLON.BasisTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the internal format to be passed to texImage2D corresponding to the .basis format value
    * @param basisFormat format chosen from GetSupportedTranscodeFormat
    * @returns internal format corresponding to the Basis format
    */
  inline def GetInternalFormatFromBasisFormat(basisFormat: Double, engine: typingsJapgolly.babylonjs.BABYLON.Engine): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetInternalFormatFromBasisFormat")(basisFormat.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * URL to use when loading the basis transcoder
    */
  @JSGlobal("BABYLON.BasisTools.JSModuleURL")
  @js.native
  def JSModuleURL: String = js.native
  inline def JSModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSModuleURL")(x.asInstanceOf[js.Any])
  
  /**
    * Loads a texture from the transcode result
    * @param texture texture load to
    * @param transcodeResult the result of transcoding the basis file to load from
    */
  inline def LoadTextureFromTranscodeResult(
    texture: typingsJapgolly.babylonjs.BABYLON.InternalTexture,
    transcodeResult: typingsJapgolly.babylonjs.BABYLON.TranscodeResult
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadTextureFromTranscodeResult")(texture.asInstanceOf[js.Any], transcodeResult.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def TranscodeAsync(
    data: js.typedarray.ArrayBufferView,
    config: typingsJapgolly.babylonjs.BABYLON.BasisTranscodeConfiguration
  ): js.Promise[typingsJapgolly.babylonjs.BABYLON.TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.BABYLON.TranscodeResult]]
  /**
    * Transcodes a loaded image file to compressed pixel data
    * @param data image data to transcode
    * @param config configuration options for the transcoding
    * @returns a promise resulting in the transcoded image
    */
  inline def TranscodeAsync(
    data: js.typedarray.ArrayBuffer,
    config: typingsJapgolly.babylonjs.BABYLON.BasisTranscodeConfiguration
  ): js.Promise[typingsJapgolly.babylonjs.BABYLON.TranscodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("TranscodeAsync")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.BABYLON.TranscodeResult]]
  
  /**
    * URL to use when loading the wasm module for the transcoder
    */
  @JSGlobal("BABYLON.BasisTools.WasmModuleURL")
  @js.native
  def WasmModuleURL: String = js.native
  inline def WasmModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WasmModuleURL")(x.asInstanceOf[js.Any])
}
