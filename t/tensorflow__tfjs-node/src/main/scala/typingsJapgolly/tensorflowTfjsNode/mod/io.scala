package typingsJapgolly.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.File
import org.scalajs.dom.RequestInit
import typingsJapgolly.tensorflowTfjsCore.anon.Data
import typingsJapgolly.tensorflowTfjsCore.distIoRouterRegistryMod.IORouter
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandlerSync
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.LoadOptions
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelArtifacts
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelArtifactsInfo
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelJSON
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.SaveResult
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.TrainingConfig
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.WeightGroup
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.WeightsManifestConfig
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.WeightsManifestEntry
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensor
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsNode.anon.Fn0
import typingsJapgolly.tensorflowTfjsNode.anon.FnCall
import typingsJapgolly.tensorflowTfjsNode.anon.FnCallManifestFilePathPrefixWeightNamesRequestInit
import typingsJapgolly.tensorflowTfjsNode.anon.FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig
import typingsJapgolly.tensorflowTfjsNode.anon.FnCallModelJSONWeightSpecsWeightData
import typingsJapgolly.tensorflowTfjsNode.anon.FnCallTensorsGroup
import typingsJapgolly.tensorflowTfjsNode.distIoFileSystemMod.NodeFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object io {
  
  @JSImport("@tensorflow/tfjs-node", "io")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-node", "io.browserFiles")
  @js.native
  def browserFiles: js.Function1[/* files */ js.Array[File], IOHandler] = js.native
  inline def browserFiles(files: js.Array[File]): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserFiles")(files.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def browserFiles_=(x: js.Function1[/* files */ js.Array[File], IOHandler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserFiles")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.browserHTTPRequest")
  @js.native
  def browserHTTPRequest: FnCall = js.native
  inline def browserHTTPRequest(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("browserHTTPRequest")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("browserHTTPRequest")(path.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def browserHTTPRequest_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserHTTPRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.concatenateArrayBuffers")
  @js.native
  def concatenateArrayBuffers: js.Function1[/* buffers */ js.Array[js.typedarray.ArrayBuffer], js.typedarray.ArrayBuffer] = js.native
  inline def concatenateArrayBuffers(buffers: js.Array[js.typedarray.ArrayBuffer]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateArrayBuffers")(buffers.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def concatenateArrayBuffers_=(x: js.Function1[/* buffers */ js.Array[js.typedarray.ArrayBuffer], js.typedarray.ArrayBuffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("concatenateArrayBuffers")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.copyModel")
  @js.native
  def copyModel: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  /**
    * Copy a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Copying within a storage medium, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Copying between two storage mediums, e.g.,
    *    `tf.io.copyModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Copy the model, from Local Storage to IndexedDB.
    * await tf.io.copyModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove both models.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of copying.
    * @param destURL Destination URL of copying.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if copying fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  inline def copyModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyModel")(sourceURL.asInstanceOf[js.Any], destURL.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModelArtifactsInfo]]
  inline def copyModel_=(x: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copyModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.decodeWeights")
  @js.native
  def decodeWeights: js.Function2[
    /* buffer */ js.typedarray.ArrayBuffer, 
    /* specs */ js.Array[WeightsManifestEntry], 
    NamedTensorMap
  ] = js.native
  inline def decodeWeights(buffer: js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeWeights")(buffer.asInstanceOf[js.Any], specs.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def decodeWeights_=(
    x: js.Function2[
      /* buffer */ js.typedarray.ArrayBuffer, 
      /* specs */ js.Array[WeightsManifestEntry], 
      NamedTensorMap
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeWeights")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.encodeWeights")
  @js.native
  def encodeWeights: FnCallTensorsGroup = js.native
  inline def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWeights")(tensors.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  inline def encodeWeights_=(x: FnCallTensorsGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeWeights")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.fileSystem")
  @js.native
  def fileSystem: js.Function1[/* path */ String | js.Array[String], NodeFileSystem] = js.native
  inline def fileSystem(path: String): NodeFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSystem")(path.asInstanceOf[js.Any]).asInstanceOf[NodeFileSystem]
  inline def fileSystem(path: js.Array[String]): NodeFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSystem")(path.asInstanceOf[js.Any]).asInstanceOf[NodeFileSystem]
  inline def fileSystem_=(x: js.Function1[/* path */ String | js.Array[String], NodeFileSystem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileSystem")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.fromMemory")
  @js.native
  def fromMemory: FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig = js.native
  inline def fromMemory(modelArtifacts: js.Object): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: js.Object, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: js.Object, weightSpecs: Unit, weightData: Unit, trainingConfig: TrainingConfig): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemory")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  
  @JSImport("@tensorflow/tfjs-node", "io.fromMemorySync")
  @js.native
  def fromMemorySync: Fn0 = js.native
  inline def fromMemorySync(modelArtifacts: js.Object): IOHandlerSync = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: js.Object, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: js.Object,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: js.Object, weightSpecs: Unit, weightData: Unit, trainingConfig: TrainingConfig): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: ModelArtifacts): IOHandlerSync = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(modelArtifacts: ModelArtifacts, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync(
    modelArtifacts: ModelArtifacts,
    weightSpecs: Unit,
    weightData: Unit,
    trainingConfig: TrainingConfig
  ): IOHandlerSync = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMemorySync")(modelArtifacts.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any], trainingConfig.asInstanceOf[js.Any])).asInstanceOf[IOHandlerSync]
  inline def fromMemorySync_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMemorySync")(x.asInstanceOf[js.Any])
  
  inline def fromMemory_=(x: FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMemory")(x.asInstanceOf[js.Any])
  
  inline def getLoadHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  inline def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  inline def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  inline def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  
  @JSImport("@tensorflow/tfjs-node", "io.getModelArtifactsForJSON")
  @js.native
  def getModelArtifactsForJSON: js.Function2[
    /* modelJSON */ ModelJSON, 
    /* loadWeights */ js.Function1[
      /* weightsManifest */ WeightsManifestConfig, 
      js.Promise[js.Tuple2[js.Array[WeightsManifestEntry], js.typedarray.ArrayBuffer]]
    ], 
    js.Promise[ModelArtifacts]
  ] = js.native
  inline def getModelArtifactsForJSON(
    modelJSON: ModelJSON,
    loadWeights: js.Function1[
      /* weightsManifest */ WeightsManifestConfig, 
      js.Promise[js.Tuple2[js.Array[WeightsManifestEntry], js.typedarray.ArrayBuffer]]
    ]
  ): js.Promise[ModelArtifacts] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSON")(modelJSON.asInstanceOf[js.Any], loadWeights.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModelArtifacts]]
  
  @JSImport("@tensorflow/tfjs-node", "io.getModelArtifactsForJSONSync")
  @js.native
  def getModelArtifactsForJSONSync: FnCallModelJSONWeightSpecsWeightData = js.native
  inline def getModelArtifactsForJSONSync(modelJSON: ModelJSON): ModelArtifacts = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any]).asInstanceOf[ModelArtifacts]
  inline def getModelArtifactsForJSONSync(modelJSON: ModelJSON, weightSpecs: js.Array[WeightsManifestEntry]): ModelArtifacts = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any])).asInstanceOf[ModelArtifacts]
  inline def getModelArtifactsForJSONSync(
    modelJSON: ModelJSON,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): ModelArtifacts = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[ModelArtifacts]
  inline def getModelArtifactsForJSONSync(modelJSON: ModelJSON, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): ModelArtifacts = (^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsForJSONSync")(modelJSON.asInstanceOf[js.Any], weightSpecs.asInstanceOf[js.Any], weightData.asInstanceOf[js.Any])).asInstanceOf[ModelArtifacts]
  inline def getModelArtifactsForJSONSync_=(x: FnCallModelJSONWeightSpecsWeightData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getModelArtifactsForJSONSync")(x.asInstanceOf[js.Any])
  
  inline def getModelArtifactsForJSON_=(
    x: js.Function2[
      /* modelJSON */ ModelJSON, 
      /* loadWeights */ js.Function1[
        /* weightsManifest */ WeightsManifestConfig, 
        js.Promise[js.Tuple2[js.Array[WeightsManifestEntry], js.typedarray.ArrayBuffer]]
      ], 
      js.Promise[ModelArtifacts]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getModelArtifactsForJSON")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.getModelArtifactsInfoForJSON")
  @js.native
  def getModelArtifactsInfoForJSON: js.Function1[/* modelArtifacts */ ModelArtifacts, ModelArtifactsInfo] = js.native
  inline def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsInfoForJSON")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[ModelArtifactsInfo]
  inline def getModelArtifactsInfoForJSON_=(x: js.Function1[/* modelArtifacts */ ModelArtifacts, ModelArtifactsInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getModelArtifactsInfoForJSON")(x.asInstanceOf[js.Any])
  
  inline def getSaveHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  inline def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  
  @JSImport("@tensorflow/tfjs-node", "io.getWeightSpecs")
  @js.native
  def getWeightSpecs: js.Function1[/* weightsManifest */ WeightsManifestConfig, js.Array[WeightsManifestEntry]] = js.native
  inline def getWeightSpecs(weightsManifest: WeightsManifestConfig): js.Array[WeightsManifestEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWeightSpecs")(weightsManifest.asInstanceOf[js.Any]).asInstanceOf[js.Array[WeightsManifestEntry]]
  inline def getWeightSpecs_=(x: js.Function1[/* weightsManifest */ WeightsManifestConfig, js.Array[WeightsManifestEntry]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getWeightSpecs")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.http")
  @js.native
  def http: FnCall = js.native
  inline def http(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("http")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def http(path: String, loadOptions: LoadOptions): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("http")(path.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def http_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("http")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.isHTTPScheme")
  @js.native
  def isHTTPScheme: js.Function1[/* url */ String, Boolean] = js.native
  inline def isHTTPScheme(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTTPScheme")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHTTPScheme_=(x: js.Function1[/* url */ String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isHTTPScheme")(x.asInstanceOf[js.Any])
  
  /**
    * List all models stored in registered storage mediums.
    *
    * For a web browser environment, the registered mediums are Local Storage and
    * IndexedDB.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @returns A `Promise` of a dictionary mapping URLs of existing models to
    * their model artifacts info. URLs include medium-specific schemes, e.g.,
    *   'indexeddb://my/model/1'. Model artifacts info include type of the
    * model's topology, byte sizes of the topology, weights, etc.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  inline def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listModels")().asInstanceOf[js.Promise[StringDictionary[ModelArtifactsInfo]]]
  @JSImport("@tensorflow/tfjs-node", "io.listModels")
  @js.native
  def listModels_Fio: js.Function0[js.Promise[StringDictionary[ModelArtifactsInfo]]] = js.native
  
  inline def listModels_Fio_=(x: js.Function0[js.Promise[StringDictionary[ModelArtifactsInfo]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listModels")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.loadWeights")
  @js.native
  def loadWeights: FnCallManifestFilePathPrefixWeightNamesRequestInit = js.native
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
  inline def loadWeights_=(x: FnCallManifestFilePathPrefixWeightNamesRequestInit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadWeights")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.moveModel")
  @js.native
  def moveModel: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  /**
    * Move a model from one URL to another.
    *
    * This function supports:
    *
    * 1. Moving within a storage medium, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'localstorage://model-2')`
    * 2. Moving between two storage mediums, e.g.,
    *    `tf.io.moveModel('localstorage://model-1', 'indexeddb://model-1')`
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Move the model, from Local Storage to IndexedDB.
    * await tf.io.moveModel(
    *     'localstorage://demo/management/model1',
    *     'indexeddb://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Remove the moved model.
    * await tf.io.removeModel('indexeddb://demo/management/model1');
    * ```
    *
    * @param sourceURL Source URL of moving.
    * @param destURL Destination URL of moving.
    * @returns ModelArtifactsInfo of the copied model (if and only if copying
    *   is successful).
    * @throws Error if moving fails, e.g., if no model exists at `sourceURL`, or
    *   if `oldPath` and `newPath` are identical.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  inline def moveModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveModel")(sourceURL.asInstanceOf[js.Any], destURL.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModelArtifactsInfo]]
  inline def moveModel_=(x: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.nodeHTTPRequest")
  @js.native
  def nodeHTTPRequest: js.Function3[
    /* path */ String, 
    /* requestInit */ js.UndefOr[RequestInit], 
    /* weightPathPrefix */ js.UndefOr[String], 
    IOHandler
  ] = js.native
  inline def nodeHTTPRequest(path: String): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest(path: String, requestInit: Unit, weightPathPrefix: String): IOHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeHTTPRequest")(path.asInstanceOf[js.Any], requestInit.asInstanceOf[js.Any], weightPathPrefix.asInstanceOf[js.Any])).asInstanceOf[IOHandler]
  inline def nodeHTTPRequest_=(
    x: js.Function3[
      /* path */ String, 
      /* requestInit */ js.UndefOr[RequestInit], 
      /* weightPathPrefix */ js.UndefOr[String], 
      IOHandler
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeHTTPRequest")(x.asInstanceOf[js.Any])
  
  inline def registerLoadRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerSaveRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSaveRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@tensorflow/tfjs-node", "io.removeModel")
  @js.native
  def removeModel: js.Function1[/* url */ String, js.Promise[ModelArtifactsInfo]] = js.native
  /**
    * Remove a model specified by URL from a registered storage medium.
    *
    * ```js
    * // First create and save a model.
    * const model = tf.sequential();
    * model.add(tf.layers.dense(
    *     {units: 1, inputShape: [10], activation: 'sigmoid'}));
    * await model.save('localstorage://demo/management/model1');
    *
    * // Then list existing models.
    * console.log(JSON.stringify(await tf.io.listModels()));
    *
    * // Delete the model.
    * await tf.io.removeModel('localstorage://demo/management/model1');
    *
    * // List models again.
    * console.log(JSON.stringify(await tf.io.listModels()));
    * ```
    *
    * @param url A URL to a stored model, with a scheme prefix, e.g.,
    *   'localstorage://my-model-1', 'indexeddb://my/model/2'.
    * @returns ModelArtifactsInfo of the deleted model (if and only if deletion
    *   is successful).
    * @throws Error if deletion fails, e.g., if no model exists at `path`.
    *
    * @doc {
    *   heading: 'Models',
    *   subheading: 'Management',
    *   namespace: 'io',
    *   ignoreCI: true
    * }
    */
  inline def removeModel(url: String): js.Promise[ModelArtifactsInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeModel")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ModelArtifactsInfo]]
  inline def removeModel_=(x: js.Function1[/* url */ String, js.Promise[ModelArtifactsInfo]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeModel")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.weightsLoaderFactory")
  @js.native
  def weightsLoaderFactory: js.Function1[
    /* fetchWeightsFunction */ js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[js.typedarray.ArrayBuffer]]], 
    js.Function3[
      /* manifest */ WeightsManifestConfig, 
      /* filePathPrefix */ js.UndefOr[String], 
      /* weightNames */ js.UndefOr[js.Array[String]], 
      js.Promise[NamedTensorMap]
    ]
  ] = js.native
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
  inline def weightsLoaderFactory_=(
    x: js.Function1[
      /* fetchWeightsFunction */ js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[js.typedarray.ArrayBuffer]]], 
      js.Function3[
        /* manifest */ WeightsManifestConfig, 
        /* filePathPrefix */ js.UndefOr[String], 
        /* weightNames */ js.UndefOr[js.Array[String]], 
        js.Promise[NamedTensorMap]
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weightsLoaderFactory")(x.asInstanceOf[js.Any])
  
  @JSImport("@tensorflow/tfjs-node", "io.withSaveHandler")
  @js.native
  def withSaveHandler: js.Function1[
    /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]], 
    IOHandler
  ] = js.native
  inline def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("withSaveHandler")(saveHandler.asInstanceOf[js.Any]).asInstanceOf[IOHandler]
  
  @JSImport("@tensorflow/tfjs-node", "io.withSaveHandlerSync")
  @js.native
  def withSaveHandlerSync: js.Function1[
    /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, SaveResult], 
    IOHandlerSync
  ] = js.native
  inline def withSaveHandlerSync(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, SaveResult]): IOHandlerSync = ^.asInstanceOf[js.Dynamic].applyDynamic("withSaveHandlerSync")(saveHandler.asInstanceOf[js.Any]).asInstanceOf[IOHandlerSync]
  inline def withSaveHandlerSync_=(
    x: js.Function1[
      /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, SaveResult], 
      IOHandlerSync
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withSaveHandlerSync")(x.asInstanceOf[js.Any])
  
  inline def withSaveHandler_=(
    x: js.Function1[
      /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]], 
      IOHandler
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withSaveHandler")(x.asInstanceOf[js.Any])
}
