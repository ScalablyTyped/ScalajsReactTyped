package typingsJapgolly.tensorflowTfjsCore

import org.scalajs.dom.RequestInit
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.LoadOptions
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.WeightsManifestConfig
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoWeightsLoaderMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/weights_loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: Unit,
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: Unit, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: Unit,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  inline def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: Unit, weightNames: Unit, requestInit: RequestInit): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeights")(manifest.asInstanceOf[js.Any], filePathPrefix.asInstanceOf[js.Any], weightNames.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
  
  inline def loadWeightsAsArrayBuffer(fetchURLs: js.Array[String]): js.Promise[js.Array[js.typedarray.ArrayBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadWeightsAsArrayBuffer")(fetchURLs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.typedarray.ArrayBuffer]]]
  inline def loadWeightsAsArrayBuffer(fetchURLs: js.Array[String], loadOptions: LoadOptions): js.Promise[js.Array[js.typedarray.ArrayBuffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadWeightsAsArrayBuffer")(fetchURLs.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.typedarray.ArrayBuffer]]]
  
  inline def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[js.typedarray.ArrayBuffer]]]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("weightsLoaderFactory")(fetchWeightsFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ]]
}
