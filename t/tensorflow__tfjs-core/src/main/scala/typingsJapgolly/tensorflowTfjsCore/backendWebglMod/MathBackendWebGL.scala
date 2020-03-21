package typingsJapgolly.tensorflowTfjsCore.backendWebglMod

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLTexture
import typingsJapgolly.tensorflowTfjsCore.backendMod.DataStorage
import typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.DataType
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsJapgolly.tensorflowTfjsCore.tensorMod.DataId
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor
import typingsJapgolly.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsJapgolly.tensorflowTfjsCore.texUtilMod.TextureData
import typingsJapgolly.tensorflowTfjsCore.textureManagerMod.TextureManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/backend_webgl", "MathBackendWebGL")
@js.native
class MathBackendWebGL () extends KernelBackend {
  def this(gpgpu: GPGPUContext) = this()
  var acquireTexture: js.Any = js.native
  var activeTimers: js.Any = js.native
  var argMinMaxReduce: js.Any = js.native
  var argReduce: js.Any = js.native
  var argReducePacked: js.Any = js.native
  var binaryCache: js.Any = js.native
  var canvas: js.Any = js.native
  var checkNumericalProblems: js.Any = js.native
  /**
    * Computes a complex binary operation that can be decomposed into a simple
    * binary operation on both the real and imagary parts.
    */
  var complexSeparableBinaryOp: js.Any = js.native
  var computeBytes: js.Any = js.native
  var conv2dByMatMul: js.Any = js.native
  var conv2dWithIm2Row: js.Any = js.native
  var convertAndCacheOnCPU: js.Any = js.native
  var cpuBackend: js.Any = js.native
  var dataRefCount: js.Any = js.native
  var decode: js.Any = js.native
  var disposed: js.Any = js.native
  var downloadWaitMs: js.Any = js.native
  var endTimer: js.Any = js.native
  var fftImpl: js.Any = js.native
  var floatPrecisionValue: js.Any = js.native
  var getAndSaveBinary: js.Any = js.native
  var getCPUBackend: js.Any = js.native
  var getQueryTime: js.Any = js.native
  var getValuesFromTexture: js.Any = js.native
  var gpgpu: GPGPUContext = js.native
  var gpgpuCreatedLocally: js.Any = js.native
  var makeComplexComponentTensorInfo: js.Any = js.native
  var makeOutput: js.Any = js.native
  var numBytesInGPU: js.Any = js.native
  var numMBBeforeWarning: js.Any = js.native
  var packTensor: js.Any = js.native
  var packedBinaryOp: js.Any = js.native
  var packedReshape: js.Any = js.native
  var packedUnaryOp: js.Any = js.native
  var pendingDeletes: js.Any = js.native
  var pendingDisposal: js.Any = js.native
  var pendingRead: js.Any = js.native
  var programTimersStack: js.Any = js.native
  var reduce: js.Any = js.native
  var releaseGPUData: js.Any = js.native
  var segOpCompute: js.Any = js.native
  var shallowSlice: js.Any = js.native
  var shouldExecuteOnCPU: js.Any = js.native
  var startTimer: js.Any = js.native
  var texData: DataStorage[TextureData] = js.native
  var textureManager: js.Any = js.native
  var unpackTensor: js.Any = js.native
  var uploadToGPU: js.Any = js.native
  var uploadWaitMs: js.Any = js.native
  var warnedAboutMemory: js.Any = js.native
  def compileAndRun[K /* <: TensorInfo */](program: GPGPUProgram, inputs: js.Array[TensorInfo]): K = js.native
  def compileAndRun[K /* <: TensorInfo */](program: GPGPUProgram, inputs: js.Array[TensorInfo], outputDtype: DataType): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit],
    preventEagerUnpackingOfOutput: Boolean
  ): K = js.native
  @JSName("depthToSpace")
  def depthToSpace_NCHW(x: Tensor4D, blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(x: Tensor4D, blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
  /**
    * Returns internal information for the specific data bucket. Used in unit
    * tests.
    */
  def getDataInfo(dataId: DataId): TextureData = js.native
  def getGPGPUContext(): GPGPUContext = js.native
  def getTexture(dataId: DataId): WebGLTexture = js.native
  def getTextureManager(): TextureManager = js.native
  def makeTensorInfo(shape: js.Array[Double], dtype: DataType): TensorInfo = js.native
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def runWebGLProgram(program: GPGPUProgram, inputs: js.Array[TensorInfo], outputDtype: DataType): TensorInfo = js.native
  def runWebGLProgram(
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): TensorInfo = js.native
  def runWebGLProgram(
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit],
    preventEagerUnpackingOfOutput: Boolean
  ): TensorInfo = js.native
}

