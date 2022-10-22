package typingsJapgolly.tensorflowTfjsNode

import org.scalajs.dom.RequestInit
import typingsJapgolly.tensorflowTfjsCore.anon.Data
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandlerSync
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.LoadOptions
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelArtifacts
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.ModelJSON
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.TrainingConfig
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.WeightGroup
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.WeightsManifestConfig
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.WeightsManifestEntry
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.PackAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod.PackInputs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensor
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsNode.distNodejsKernelBackendMod.NodeJSKernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attrs extends StObject {
    
    var attrs: PackAttrs
    
    var backend: NodeJSKernelBackend
    
    var inputs: PackInputs
  }
  object Attrs {
    
    inline def apply(attrs: PackAttrs, backend: NodeJSKernelBackend, inputs: PackInputs): Attrs = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    extension [Self <: Attrs](x: Self) {
      
      inline def setAttrs(value: PackAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setBackend(value: NodeJSKernelBackend): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: PackInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
    }
  }
  
  trait DateSaved extends StObject {
    
    var dateSaved: js.Date
    
    var modelTopologyBytes: Double
    
    var modelTopologyType: String
    
    var weightDataBytes: Double
    
    var weightSpecsBytes: Double
  }
  object DateSaved {
    
    inline def apply(
      dateSaved: js.Date,
      modelTopologyBytes: Double,
      modelTopologyType: String,
      weightDataBytes: Double,
      weightSpecsBytes: Double
    ): DateSaved = {
      val __obj = js.Dynamic.literal(dateSaved = dateSaved.asInstanceOf[js.Any], modelTopologyBytes = modelTopologyBytes.asInstanceOf[js.Any], modelTopologyType = modelTopologyType.asInstanceOf[js.Any], weightDataBytes = weightDataBytes.asInstanceOf[js.Any], weightSpecsBytes = weightSpecsBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateSaved]
    }
    
    extension [Self <: DateSaved](x: Self) {
      
      inline def setDateSaved(value: js.Date): Self = StObject.set(x, "dateSaved", value.asInstanceOf[js.Any])
      
      inline def setModelTopologyBytes(value: Double): Self = StObject.set(x, "modelTopologyBytes", value.asInstanceOf[js.Any])
      
      inline def setModelTopologyType(value: String): Self = StObject.set(x, "modelTopologyType", value.asInstanceOf[js.Any])
      
      inline def setWeightDataBytes(value: Double): Self = StObject.set(x, "weightDataBytes", value.asInstanceOf[js.Any])
      
      inline def setWeightSpecsBytes(value: Double): Self = StObject.set(x, "weightSpecsBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(modelArtifacts: js.Object): IOHandlerSync = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandlerSync = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer
    ): IOHandlerSync = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandlerSync = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: Unit,
      trainingConfig: TrainingConfig
    ): IOHandlerSync = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandlerSync = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: Unit,
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandlerSync = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: Unit, weightData: Unit, trainingConfig: TrainingConfig): IOHandlerSync = js.native
    def apply(modelArtifacts: ModelArtifacts): IOHandlerSync = js.native
    def apply(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandlerSync = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer
    ): IOHandlerSync = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandlerSync = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: Unit,
      trainingConfig: TrainingConfig
    ): IOHandlerSync = js.native
    def apply(modelArtifacts: ModelArtifacts, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandlerSync = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: Unit,
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandlerSync = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: Unit,
      weightData: Unit,
      trainingConfig: TrainingConfig
    ): IOHandlerSync = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: String): IOHandler = js.native
    def apply(path: String, loadOptions: LoadOptions): IOHandler = js.native
  }
  
  @js.native
  trait FnCallManifestFilePathPrefixWeightNamesRequestInit extends StObject {
    
    def apply(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
    def apply(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
    def apply(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: String,
      weightNames: js.Array[String],
      requestInit: RequestInit
    ): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: String,
      weightNames: Unit,
      requestInit: RequestInit
    ): js.Promise[NamedTensorMap] = js.native
    def apply(manifest: WeightsManifestConfig, filePathPrefix: Unit, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
    def apply(
      manifest: WeightsManifestConfig,
      filePathPrefix: Unit,
      weightNames: js.Array[String],
      requestInit: RequestInit
    ): js.Promise[NamedTensorMap] = js.native
    def apply(manifest: WeightsManifestConfig, filePathPrefix: Unit, weightNames: Unit, requestInit: RequestInit): js.Promise[NamedTensorMap] = js.native
  }
  
  @js.native
  trait FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig extends StObject {
    
    def apply(modelArtifacts: js.Object): IOHandler = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer
    ): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: Unit,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandler = js.native
    def apply(
      modelArtifacts: js.Object,
      weightSpecs: Unit,
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: js.Object, weightSpecs: Unit, weightData: Unit, trainingConfig: TrainingConfig): IOHandler = js.native
    def apply(modelArtifacts: ModelArtifacts): IOHandler = js.native
    def apply(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer
    ): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: Unit,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(modelArtifacts: ModelArtifacts, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: Unit,
      weightData: js.typedarray.ArrayBuffer,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
    def apply(
      modelArtifacts: ModelArtifacts,
      weightSpecs: Unit,
      weightData: Unit,
      trainingConfig: TrainingConfig
    ): IOHandler = js.native
  }
  
  @js.native
  trait FnCallModelJSONWeightSpecsWeightData extends StObject {
    
    def apply(modelJSON: ModelJSON): ModelArtifacts = js.native
    def apply(modelJSON: ModelJSON, weightSpecs: js.Array[WeightsManifestEntry]): ModelArtifacts = js.native
    def apply(
      modelJSON: ModelJSON,
      weightSpecs: js.Array[WeightsManifestEntry],
      weightData: js.typedarray.ArrayBuffer
    ): ModelArtifacts = js.native
    def apply(modelJSON: ModelJSON, weightSpecs: Unit, weightData: js.typedarray.ArrayBuffer): ModelArtifacts = js.native
  }
  
  @js.native
  trait FnCallTensorsGroup extends StObject {
    
    def apply(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
    def apply(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
    def apply(tensors: NamedTensorMap): js.Promise[Data] = js.native
    def apply(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
  }
  
  trait Unreliable extends StObject {
    
    var unreliable: Boolean
  }
  object Unreliable {
    
    inline def apply(unreliable: Boolean): Unreliable = {
      val __obj = js.Dynamic.literal(unreliable = unreliable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unreliable]
    }
    
    extension [Self <: Unreliable](x: Self) {
      
      inline def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
    }
  }
}
