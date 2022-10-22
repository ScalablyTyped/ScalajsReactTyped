package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typingsJapgolly.tensorflowTfjsCore.distIoTypesMod.LoadOptions
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typingsJapgolly.tensorflowTfjsCore.distTensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.serialization.Serializable
import typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.BaseCallback
import typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.BaseCallbackConstructor
import typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.CustomCallbackArgs
import typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.YieldEveryOptions
import typingsJapgolly.tensorflowTfjsLayers.distCallbacksMod.EarlyStoppingCallbackArgs
import typingsJapgolly.tensorflowTfjsLayers.distCallbacksMod.EarlyStopping_
import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.MaxNormArgs
import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.MinMaxNormArgs
import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.UnitNormArgs
import typingsJapgolly.tensorflowTfjsLayers.distEngineContainerMod.ContainerArgs
import typingsJapgolly.tensorflowTfjsLayers.distEngineInputLayerMod.InputConfig
import typingsJapgolly.tensorflowTfjsLayers.distEngineInputLayerMod.InputLayer
import typingsJapgolly.tensorflowTfjsLayers.distEngineInputLayerMod.InputLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.InputSpecArgs
import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.ConstantArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.IdentityArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.Initializer
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.OrthogonalArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.RandomNormalArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.RandomUniformArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.SeedOnlyInitializerArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.TruncatedNormalArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.VarianceScalingArgs
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.Zeros
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatTypesMod.PyJsonDict
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ELU
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ELULayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.LeakyReLU
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.LeakyReLULayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.PReLU
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.PReLULayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ReLU
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ReLULayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.Softmax
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.SoftmaxLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ThresholdedReLU
import typingsJapgolly.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ThresholdedReLULayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalDepthwiseMod.DepthwiseConv2DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalDepthwiseMod.DepthwiseConv2D_
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv1D_
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv2DTranspose
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv2D_
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv3D_
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.ConvLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.Cropping2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.Cropping2DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.SeparableConv2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.SeparableConvLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.UpSampling2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalMod.UpSampling2DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2DArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2DCell
import typingsJapgolly.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2DCellArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.Activation
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.ActivationLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.Dense
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.DenseLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.Dropout
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.DropoutLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.Flatten
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.FlattenLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.Masking
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.MaskingArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.Permute
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.PermuteLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.RepeatVector
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.RepeatVectorLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.Reshape
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.ReshapeLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.SpatialDropout1D
import typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod.SpatialDropout1DLayerConfig
import typingsJapgolly.tensorflowTfjsLayers.distLayersEmbeddingsMod.Embedding
import typingsJapgolly.tensorflowTfjsLayers.distLayersEmbeddingsMod.EmbeddingLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.Add_
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.Average_
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.ConcatenateLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.Concatenate_
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.Dot
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.DotLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.Maximum_
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.Minimum_
import typingsJapgolly.tensorflowTfjsLayers.distLayersMergeMod.Multiply_
import typingsJapgolly.tensorflowTfjsLayers.distLayersNoiseMod.AlphaDropout
import typingsJapgolly.tensorflowTfjsLayers.distLayersNoiseMod.AlphaDropoutArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersNoiseMod.GaussianDropout
import typingsJapgolly.tensorflowTfjsLayers.distLayersNoiseMod.GaussianDropoutArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersNoiseMod.GaussianNoise
import typingsJapgolly.tensorflowTfjsLayers.distLayersNoiseMod.GaussianNoiseArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersNormalizationMod.BatchNormalizationLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersNormalizationMod.BatchNormalization_
import typingsJapgolly.tensorflowTfjsLayers.distLayersNormalizationMod.LayerNormalization
import typingsJapgolly.tensorflowTfjsLayers.distLayersNormalizationMod.LayerNormalizationLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPaddingMod.ZeroPadding2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPaddingMod.ZeroPadding2DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.AveragePooling1D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.AveragePooling2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.AveragePooling3D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.GlobalAveragePooling1D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.GlobalAveragePooling2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.GlobalMaxPooling1D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.GlobalMaxPooling2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.GlobalPooling2DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.MaxPooling1D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.MaxPooling2D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.MaxPooling3D
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.Pooling1DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.Pooling2DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPoolingMod.Pooling3DLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPreprocessingCategoryEncodingMod.CategoryEncoding
import typingsJapgolly.tensorflowTfjsLayers.distLayersPreprocessingCategoryEncodingMod.CategoryEncodingArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPreprocessingImagePreprocessingMod.Rescaling
import typingsJapgolly.tensorflowTfjsLayers.distLayersPreprocessingImagePreprocessingMod.RescalingArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersPreprocessingImageResizingMod.Resizing
import typingsJapgolly.tensorflowTfjsLayers.distLayersPreprocessingImageResizingMod.ResizingArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.GRU
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.GRUCell
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.GRUCellLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.GRULayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.LSTM
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.LSTMCell
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.LSTMCellLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.LSTMLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.RNNLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNN
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNNCell
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNNCellLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNNLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.StackedRNNCells
import typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.StackedRNNCellsArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersWrappersMod.Bidirectional
import typingsJapgolly.tensorflowTfjsLayers.distLayersWrappersMod.BidirectionalLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distLayersWrappersMod.TimeDistributed
import typingsJapgolly.tensorflowTfjsLayers.distLayersWrappersMod.WrapperLayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distModelsMod.ModelAndWeightsConfig
import typingsJapgolly.tensorflowTfjsLayers.distModelsMod.Sequential
import typingsJapgolly.tensorflowTfjsLayers.distModelsMod.SequentialArgs
import typingsJapgolly.tensorflowTfjsLayers.distRegularizersMod.L1Args
import typingsJapgolly.tensorflowTfjsLayers.distRegularizersMod.L1L2Args
import typingsJapgolly.tensorflowTfjsLayers.distRegularizersMod.L2Args
import typingsJapgolly.tensorflowTfjsLayers.distRegularizersMod.Regularizer
import typingsJapgolly.tensorflowTfjsLayers.distTypesMod.Kwargs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-layers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers", "Callback")
  @js.native
  open class Callback ()
    extends typingsJapgolly.tensorflowTfjsLayers.distCallbacksMod.Callback
  
  @JSImport("@tensorflow/tfjs-layers", "CallbackList")
  @js.native
  /**
    * Constructor of CallbackList.
    * @param callbacks Array of `Callback` instances.
    * @param queueLength Queue length for keeping running statistics over
    *   callback execution time.
    */
  open class CallbackList ()
    extends typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.CallbackList {
    def this(callbacks: js.Array[BaseCallback]) = this()
    def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
    def this(callbacks: Unit, queueLength: Double) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "CustomCallback")
  @js.native
  open class CustomCallback protected ()
    extends typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.CustomCallback {
    def this(args: CustomCallbackArgs) = this()
    def this(args: CustomCallbackArgs, yieldEvery: YieldEveryOptions) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "EarlyStopping")
  @js.native
  open class EarlyStopping () extends EarlyStopping_ {
    def this(args: EarlyStoppingCallbackArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "History")
  @js.native
  open class History ()
    extends typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.History
  
  @JSImport("@tensorflow/tfjs-layers", "InputSpec")
  @js.native
  open class InputSpec protected ()
    extends typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.InputSpec {
    def this(args: InputSpecArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "LayerVariable")
  @js.native
  open class LayerVariable protected ()
    extends typingsJapgolly.tensorflowTfjsLayers.distVariablesMod.LayerVariable {
    /**
      * Construct Variable from a `tf.Tensor`.
      *
      * If not explicitly named, the Variable will be given a name with the
      * prefix 'Variable'. Variable names are unique. In the case of name
      * collision, suffixies '_<num>' will be added to the name.
      *
      * @param val Initial value of the Variable.
      * @param name Name of the variable. If `null` or `undefined` is provided, it
      *   will default a name with the prefix 'Variable'.
      * @param constraint Optional, projection function to be applied to the
      * variable after optimize updates
      * @throws ValueError if `name` is `null` or `undefined`.
      */
    def this(`val`: Tensor[Rank]) = this()
    def this(`val`: Tensor[Rank], dtype: DataType) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Unit, constraint: Constraint) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "LayersModel")
  @js.native
  open class LayersModel protected ()
    extends typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel {
    def this(args: ContainerArgs) = this()
  }
  /* static members */
  object LayersModel {
    
    @JSImport("@tensorflow/tfjs-layers", "LayersModel")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "LayersModel.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers", "RNN")
  @js.native
  open class RNN protected () extends RNN_ {
    def this(args: RNNLayerArgs) = this()
  }
  /* static members */
  object RNN {
    
    @JSImport("@tensorflow/tfjs-layers", "RNN")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "RNN.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@tensorflow/tfjs-layers", "Sequential")
  @js.native
  open class Sequential_ () extends Sequential {
    def this(args: SequentialArgs) = this()
  }
  /* static members */
  object Sequential_ {
    
    @JSImport("@tensorflow/tfjs-layers", "Sequential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "Sequential.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: Unit, fastWeightInit: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: ConfigDict,
      fastWeightInit: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("@tensorflow/tfjs-layers", "SymbolicTensor")
  @js.native
  open class SymbolicTensor protected ()
    extends typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor {
    /**
      *
      * @param dtype
      * @param shape
      * @param sourceLayer The Layer that produced this symbolic tensor.
      * @param inputs The inputs passed to sourceLayer's __call__() method.
      * @param nodeIndex
      * @param tensorIndex
      * @param callArgs The keyword arguments passed to the __call__() method.
      * @param name
      * @param outputTensorIndex The index of this tensor in the list of outputs
      *   returned by apply().
      */
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
      callArgs: Kwargs
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: String
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: String,
      outputTensorIndex: Double
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: Unit,
      outputTensorIndex: Double
    ) = this()
  }
  
  object callbacks {
    
    @JSImport("@tensorflow/tfjs-layers", "callbacks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def earlyStopping(): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")().asInstanceOf[EarlyStopping_]
    inline def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")(args.asInstanceOf[js.Any]).asInstanceOf[EarlyStopping_]
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping_Fcallbacks: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
    
    inline def earlyStopping_Fcallbacks_=(x: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("earlyStopping")(x.asInstanceOf[js.Any])
  }
  
  object constraints {
    
    @JSImport("@tensorflow/tfjs-layers", "constraints")
    @js.native
    val ^ : js.Any = js.native
    
    inline def maxNorm(args: MaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("maxNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
    
    inline def minMaxNorm(config: MinMaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("minMaxNorm")(config.asInstanceOf[js.Any]).asInstanceOf[Constraint]
    
    inline def nonNeg(): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("nonNeg")().asInstanceOf[Constraint]
    
    inline def unitNorm(args: UnitNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("unitNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  }
  
  object initializers {
    
    @JSImport("@tensorflow/tfjs-layers", "initializers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def constant(args: ConstantArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def heNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def heUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def identity(args: IdentityArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def ones(): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")().asInstanceOf[Initializer]
    
    inline def orthogonal(args: OrthogonalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("orthogonal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def randomNormal(args: RandomNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def randomUniform(args: RandomUniformArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def truncatedNormal(args: TruncatedNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def varianceScaling(config: VarianceScalingArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("varianceScaling")(config.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def zeros(): Zeros = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")().asInstanceOf[Zeros]
  }
  
  inline def input(config: InputConfig): typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor]
  
  object layers {
    
    @JSImport("@tensorflow/tfjs-layers", "layers")
    @js.native
    val ^ : js.Any = js.native
    
    /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers", "layers.Layer")
    @js.native
    open class Layer ()
      extends typingsJapgolly.tensorflowTfjsLayers.distExportsLayersMod.Layer {
      def this(args: LayerArgs) = this()
    }
    /* static members */
    object Layer {
      
      @JSImport("@tensorflow/tfjs-layers", "layers.Layer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Converts a layer and its index to a unique (immutable type) name.
        * This function is used internally with `this.containerNodes`.
        * @param layer The layer.
        * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
        *   nodes.
        *
        * @returns The unique name.
        */
      inline def nodeKey(layer: typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer, nodeIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeKey")(layer.asInstanceOf[js.Any], nodeIndex.asInstanceOf[js.Any])).asInstanceOf[String]
    }
    
    /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers", "layers.RNNCell")
    @js.native
    open class RNNCell ()
      extends typingsJapgolly.tensorflowTfjsLayers.distExportsLayersMod.RNNCell {
      def this(args: LayerArgs) = this()
    }
    
    @JSImport("@tensorflow/tfjs-layers", "layers.RNN")
    @js.native
    open class RNN_ protected ()
      extends typingsJapgolly.tensorflowTfjsLayers.distExportsLayersMod.RNN_ {
      def this(args: RNNLayerArgs) = this()
    }
    /* static members */
    object RNN_ {
      
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN")
      @js.native
      val ^ : js.Any = js.native
      
      /** @nocollapse */
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN.className")
      @js.native
      def className: String = js.native
      inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** @nocollapse */
      inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
    }
    
    inline def activation(args: ActivationLayerArgs): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("activation")(args.asInstanceOf[js.Any]).asInstanceOf[Activation]
    
    inline def add(): Add_ = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Add_]
    inline def add(args: LayerArgs): Add_ = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(args.asInstanceOf[js.Any]).asInstanceOf[Add_]
    
    inline def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaDropout")(args.asInstanceOf[js.Any]).asInstanceOf[AlphaDropout]
    
    inline def average(): Average_ = ^.asInstanceOf[js.Dynamic].applyDynamic("average")().asInstanceOf[Average_]
    inline def average(args: LayerArgs): Average_ = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(args.asInstanceOf[js.Any]).asInstanceOf[Average_]
    
    inline def averagePooling1d(args: Pooling1DLayerArgs): AveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling1D]
    
    inline def averagePooling2d(args: Pooling2DLayerArgs): AveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling2D]
    
    inline def averagePooling3d(args: Pooling3DLayerArgs): AveragePooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling3D]
    
    inline def avgPool1d(args: Pooling1DLayerArgs): AveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool1d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling1D]
    
    inline def avgPool2d(args: Pooling2DLayerArgs): AveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool2d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling2D]
    
    inline def avgPool3d(args: Pooling3DLayerArgs): AveragePooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling3D]
    
    inline def avgPooling1d(args: Pooling1DLayerArgs): AveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling1D]
    
    inline def avgPooling2d(args: Pooling2DLayerArgs): AveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling2D]
    
    inline def avgPooling3d(args: Pooling3DLayerArgs): AveragePooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling3D]
    
    inline def batchNormalization(): BatchNormalization_ = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")().asInstanceOf[BatchNormalization_]
    inline def batchNormalization(args: BatchNormalizationLayerArgs): BatchNormalization_ = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[BatchNormalization_]
    
    inline def bidirectional(args: BidirectionalLayerArgs): Bidirectional = ^.asInstanceOf[js.Dynamic].applyDynamic("bidirectional")(args.asInstanceOf[js.Any]).asInstanceOf[Bidirectional]
    
    inline def categoryEncoding(args: CategoryEncodingArgs): CategoryEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("categoryEncoding")(args.asInstanceOf[js.Any]).asInstanceOf[CategoryEncoding]
    
    inline def concatenate(): Concatenate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")().asInstanceOf[Concatenate_]
    inline def concatenate(args: ConcatenateLayerArgs): Concatenate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(args.asInstanceOf[js.Any]).asInstanceOf[Concatenate_]
    
    inline def conv1d(args: ConvLayerArgs): Conv1D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(args.asInstanceOf[js.Any]).asInstanceOf[Conv1D_]
    
    inline def conv2d(args: ConvLayerArgs): Conv2D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(args.asInstanceOf[js.Any]).asInstanceOf[Conv2D_]
    
    inline def conv2dTranspose(args: ConvLayerArgs): Conv2DTranspose = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[Conv2DTranspose]
    
    inline def conv3d(args: ConvLayerArgs): Conv3D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(args.asInstanceOf[js.Any]).asInstanceOf[Conv3D_]
    
    inline def conv3dTranspose(args: ConvLayerArgs): typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.Layer]
    
    inline def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2d")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2D]
    
    inline def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2dCell")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2DCell]
    
    inline def cropping2D(args: Cropping2DLayerArgs): Cropping2D = ^.asInstanceOf[js.Dynamic].applyDynamic("cropping2D")(args.asInstanceOf[js.Any]).asInstanceOf[Cropping2D]
    
    inline def dense(args: DenseLayerArgs): Dense = ^.asInstanceOf[js.Dynamic].applyDynamic("dense")(args.asInstanceOf[js.Any]).asInstanceOf[Dense]
    
    inline def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): DepthwiseConv2D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[DepthwiseConv2D_]
    
    inline def dot(args: DotLayerArgs): Dot = ^.asInstanceOf[js.Dynamic].applyDynamic("dot")(args.asInstanceOf[js.Any]).asInstanceOf[Dot]
    
    inline def dropout(args: DropoutLayerArgs): Dropout = ^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(args.asInstanceOf[js.Any]).asInstanceOf[Dropout]
    
    inline def elu(): ELU = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")().asInstanceOf[ELU]
    inline def elu(args: ELULayerArgs): ELU = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(args.asInstanceOf[js.Any]).asInstanceOf[ELU]
    
    inline def embedding(args: EmbeddingLayerArgs): Embedding = ^.asInstanceOf[js.Dynamic].applyDynamic("embedding")(args.asInstanceOf[js.Any]).asInstanceOf[Embedding]
    
    inline def flatten(): Flatten = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Flatten]
    inline def flatten(args: FlattenLayerArgs): Flatten = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(args.asInstanceOf[js.Any]).asInstanceOf[Flatten]
    
    inline def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianDropout")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianDropout]
    
    inline def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianNoise")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianNoise]
    
    inline def globalAveragePooling1d(): GlobalAveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")().asInstanceOf[GlobalAveragePooling1D]
    inline def globalAveragePooling1d(args: LayerArgs): GlobalAveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalAveragePooling1D]
    
    inline def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): GlobalAveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalAveragePooling2D]
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool1d")
    @js.native
    val globalMaxPool1d: js.Function1[/* args */ js.UndefOr[LayerArgs], GlobalMaxPooling1D] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool2d")
    @js.native
    val globalMaxPool2d: js.Function1[/* args */ GlobalPooling2DLayerArgs, GlobalMaxPooling2D] = js.native
    
    inline def globalMaxPooling1d(): GlobalMaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")().asInstanceOf[GlobalMaxPooling1D]
    inline def globalMaxPooling1d(args: LayerArgs): GlobalMaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalMaxPooling1D]
    
    inline def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): GlobalMaxPooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalMaxPooling2D]
    
    inline def gru(args: GRULayerArgs): GRU = ^.asInstanceOf[js.Dynamic].applyDynamic("gru")(args.asInstanceOf[js.Any]).asInstanceOf[GRU]
    
    inline def gruCell(args: GRUCellLayerArgs): GRUCell = ^.asInstanceOf[js.Dynamic].applyDynamic("gruCell")(args.asInstanceOf[js.Any]).asInstanceOf[GRUCell]
    
    inline def input(config: InputConfig): typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor]
    
    inline def inputLayer(args: InputLayerArgs): InputLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("inputLayer")(args.asInstanceOf[js.Any]).asInstanceOf[InputLayer]
    
    inline def layerNormalization(): LayerNormalization = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")().asInstanceOf[LayerNormalization]
    inline def layerNormalization(args: LayerNormalizationLayerArgs): LayerNormalization = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[LayerNormalization]
    
    inline def leakyReLU(): LeakyReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")().asInstanceOf[LeakyReLU]
    inline def leakyReLU(args: LeakyReLULayerArgs): LeakyReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")(args.asInstanceOf[js.Any]).asInstanceOf[LeakyReLU]
    
    inline def lstm(args: LSTMLayerArgs): LSTM = ^.asInstanceOf[js.Dynamic].applyDynamic("lstm")(args.asInstanceOf[js.Any]).asInstanceOf[LSTM]
    
    inline def lstmCell(args: LSTMCellLayerArgs): LSTMCell = ^.asInstanceOf[js.Dynamic].applyDynamic("lstmCell")(args.asInstanceOf[js.Any]).asInstanceOf[LSTMCell]
    
    inline def masking(): Masking = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")().asInstanceOf[Masking]
    inline def masking(args: MaskingArgs): Masking = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")(args.asInstanceOf[js.Any]).asInstanceOf[Masking]
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool1d")
    @js.native
    val maxPool1d: js.Function1[/* args */ Pooling1DLayerArgs, MaxPooling1D] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool2d")
    @js.native
    val maxPool2d: js.Function1[/* args */ Pooling2DLayerArgs, MaxPooling2D] = js.native
    
    inline def maxPooling1d(args: Pooling1DLayerArgs): MaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling1D]
    
    inline def maxPooling2d(args: Pooling2DLayerArgs): MaxPooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling2D]
    
    inline def maxPooling3d(args: Pooling3DLayerArgs): MaxPooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling3D]
    
    inline def maximum(): Maximum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")().asInstanceOf[Maximum_]
    inline def maximum(args: LayerArgs): Maximum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(args.asInstanceOf[js.Any]).asInstanceOf[Maximum_]
    
    inline def minimum(): Minimum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")().asInstanceOf[Minimum_]
    inline def minimum(args: LayerArgs): Minimum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(args.asInstanceOf[js.Any]).asInstanceOf[Minimum_]
    
    inline def multiply(): Multiply_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")().asInstanceOf[Multiply_]
    inline def multiply(args: LayerArgs): Multiply_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(args.asInstanceOf[js.Any]).asInstanceOf[Multiply_]
    
    inline def permute(args: PermuteLayerArgs): Permute = ^.asInstanceOf[js.Dynamic].applyDynamic("permute")(args.asInstanceOf[js.Any]).asInstanceOf[Permute]
    
    inline def prelu(): PReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")().asInstanceOf[PReLU]
    inline def prelu(args: PReLULayerArgs): PReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[PReLU]
    
    inline def reLU(): ReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")().asInstanceOf[ReLU]
    inline def reLU(args: ReLULayerArgs): ReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")(args.asInstanceOf[js.Any]).asInstanceOf[ReLU]
    
    inline def repeatVector(args: RepeatVectorLayerArgs): RepeatVector = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatVector")(args.asInstanceOf[js.Any]).asInstanceOf[RepeatVector]
    
    inline def rescaling(): Rescaling = ^.asInstanceOf[js.Dynamic].applyDynamic("rescaling")().asInstanceOf[Rescaling]
    inline def rescaling(args: RescalingArgs): Rescaling = ^.asInstanceOf[js.Dynamic].applyDynamic("rescaling")(args.asInstanceOf[js.Any]).asInstanceOf[Rescaling]
    
    inline def reshape(args: ReshapeLayerArgs): Reshape = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[Reshape]
    
    inline def resizing(): Resizing = ^.asInstanceOf[js.Dynamic].applyDynamic("resizing")().asInstanceOf[Resizing]
    inline def resizing(args: ResizingArgs): Resizing = ^.asInstanceOf[js.Dynamic].applyDynamic("resizing")(args.asInstanceOf[js.Any]).asInstanceOf[Resizing]
    
    inline def rnn(args: RNNLayerArgs): typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(args.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_]
    
    inline def separableConv2d(args: SeparableConvLayerArgs): SeparableConv2D = ^.asInstanceOf[js.Dynamic].applyDynamic("separableConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[SeparableConv2D]
    
    inline def simpleRNN(args: SimpleRNNLayerArgs): SimpleRNN = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNN")(args.asInstanceOf[js.Any]).asInstanceOf[SimpleRNN]
    
    inline def simpleRNNCell(args: SimpleRNNCellLayerArgs): SimpleRNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNNCell")(args.asInstanceOf[js.Any]).asInstanceOf[SimpleRNNCell]
    
    inline def softmax(): Softmax = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")().asInstanceOf[Softmax]
    inline def softmax(args: SoftmaxLayerArgs): Softmax = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(args.asInstanceOf[js.Any]).asInstanceOf[Softmax]
    
    inline def spatialDropout1d(args: SpatialDropout1DLayerConfig): SpatialDropout1D = ^.asInstanceOf[js.Dynamic].applyDynamic("spatialDropout1d")(args.asInstanceOf[js.Any]).asInstanceOf[SpatialDropout1D]
    
    inline def stackedRNNCells(args: StackedRNNCellsArgs): StackedRNNCells = ^.asInstanceOf[js.Dynamic].applyDynamic("stackedRNNCells")(args.asInstanceOf[js.Any]).asInstanceOf[StackedRNNCells]
    
    inline def thresholdedReLU(): ThresholdedReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")().asInstanceOf[ThresholdedReLU]
    inline def thresholdedReLU(args: ThresholdedReLULayerArgs): ThresholdedReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")(args.asInstanceOf[js.Any]).asInstanceOf[ThresholdedReLU]
    
    inline def timeDistributed(args: WrapperLayerArgs): TimeDistributed = ^.asInstanceOf[js.Dynamic].applyDynamic("timeDistributed")(args.asInstanceOf[js.Any]).asInstanceOf[TimeDistributed]
    
    inline def upSampling2d(args: UpSampling2DLayerArgs): UpSampling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("upSampling2d")(args.asInstanceOf[js.Any]).asInstanceOf[UpSampling2D]
    
    inline def zeroPadding2d(): ZeroPadding2D = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")().asInstanceOf[ZeroPadding2D]
    inline def zeroPadding2d(args: ZeroPadding2DLayerArgs): ZeroPadding2D = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")(args.asInstanceOf[js.Any]).asInstanceOf[ZeroPadding2D]
  }
  
  inline def loadLayersModel(pathOrIOHandler: String): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  
  object metrics {
    
    @JSImport("@tensorflow/tfjs-layers", "metrics")
    @js.native
    val ^ : js.Any = js.native
    
    inline def MAPE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("MAPE")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def MSE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("MSE")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def categoricalCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineProximity")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def mape(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("mape")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsoluteError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsolutePercentageError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def mse(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("mse")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("precision")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("recall")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseCategoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  inline def model(args: ContainerArgs): typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(args.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]
  
  object models {
    
    @JSImport("@tensorflow/tfjs-layers", "models")
    @js.native
    val ^ : js.Any = js.native
    
    inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
    inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
    inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
    inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.tensorflowTfjsLayers.distEngineTrainingMod.LayersModel]]
  }
  
  inline def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallbackConstructor")(verbosityLevel.asInstanceOf[js.Any], callbackConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object regularizers {
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def l1(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")().asInstanceOf[Regularizer]
    inline def l1(config: L1Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
    
    inline def l1l2(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1l2")().asInstanceOf[Regularizer]
    inline def l1l2(config: L1L2Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1l2")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
    
    inline def l2(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l2")().asInstanceOf[Regularizer]
    inline def l2(config: L2Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l2")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  }
  
  inline def sequential(): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")().asInstanceOf[Sequential]
  inline def sequential(config: SequentialArgs): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")(config.asInstanceOf[js.Any]).asInstanceOf[Sequential]
  
  @JSImport("@tensorflow/tfjs-layers", "version_layers")
  @js.native
  val versionLayers: /* "4.0.0" */ String = js.native
}
