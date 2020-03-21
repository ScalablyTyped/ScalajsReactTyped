package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsJapgolly.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typingsJapgolly.tensorflowTfjsCore.typesMod.WeightGroup
import typingsJapgolly.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/io_utils", JSImport.Namespace)
@js.native
object ioUtilsMod extends js.Object {
  def arrayBufferToBase64String(buffer: scala.scalajs.js.typedarray.ArrayBuffer): String = js.native
  def base64StringToArrayBuffer(str: String): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def basename(path: String): String = js.native
  def concatenateArrayBuffers(buffers: js.Array[scala.scalajs.js.typedarray.ArrayBuffer]): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def concatenateTypedArrays(xs: js.Array[TypedArray]): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def decodeWeights(buffer: scala.scalajs.js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[AnonData] = js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[AnonData] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  def stringByteLength(str: String): Double = js.native
}

