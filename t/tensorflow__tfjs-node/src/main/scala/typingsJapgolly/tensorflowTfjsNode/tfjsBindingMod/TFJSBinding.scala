package typingsJapgolly.tensorflowTfjsNode.tfjsBindingMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.BackendValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TFJSBinding extends js.Object {
  var TFEOpAttr: Instantiable0[typingsJapgolly.tensorflowTfjsNode.tfjsBindingMod.TFEOpAttr]
  var TF_ATTR_BOOL: Double
  var TF_ATTR_FLOAT: Double
  var TF_ATTR_INT: Double
  var TF_ATTR_RESOURCE: Double
  var TF_ATTR_SHAPE: Double
  var TF_ATTR_STRING: Double
  var TF_ATTR_TYPE: Double
  var TF_BOOL: Double
  var TF_COMPLEX64: Double
  var TF_FLOAT: Double
  var TF_INT32: Double
  var TF_INT64: Double
  var TF_RESOURCE: Double
  var TF_STRING: Double
  var TF_UINT8: Double
  var TF_Version: String
  var TensorMetadata: Instantiable0[typingsJapgolly.tensorflowTfjsNode.tfjsBindingMod.TensorMetadata]
  def createTensor(shape: js.Array[Double], dtype: Double, buffer: BackendValues): Double
  def deleteSavedModel(savedModelId: Double): Unit
  def deleteTensor(tensorId: Double): Unit
  def executeOp(opName: String, opAttrs: js.Array[TFEOpAttr], inputTensorIds: js.Array[Double], numOutputs: Double): js.Array[TensorMetadata]
  def getNumOfSavedModels(): Double
  def isUsingGpuDevice(): Boolean
  def loadSavedModel(exportDir: String, tags: String): Double
  def runSavedModel(
    savedModelId: Double,
    inputTensorIds: js.Array[Double],
    inputOpNames: String,
    outputOpNames: String
  ): js.Array[TensorMetadata]
  def tensorDataSync(tensorId: Double): scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
}

object TFJSBinding {
  @scala.inline
  def apply(
    TFEOpAttr: Instantiable0[TFEOpAttr],
    TF_ATTR_BOOL: Double,
    TF_ATTR_FLOAT: Double,
    TF_ATTR_INT: Double,
    TF_ATTR_RESOURCE: Double,
    TF_ATTR_SHAPE: Double,
    TF_ATTR_STRING: Double,
    TF_ATTR_TYPE: Double,
    TF_BOOL: Double,
    TF_COMPLEX64: Double,
    TF_FLOAT: Double,
    TF_INT32: Double,
    TF_INT64: Double,
    TF_RESOURCE: Double,
    TF_STRING: Double,
    TF_UINT8: Double,
    TF_Version: String,
    TensorMetadata: Instantiable0[TensorMetadata],
    createTensor: (js.Array[Double], Double, BackendValues) => CallbackTo[Double],
    deleteSavedModel: Double => Callback,
    deleteTensor: Double => Callback,
    executeOp: (String, js.Array[TFEOpAttr], js.Array[Double], Double) => CallbackTo[js.Array[TensorMetadata]],
    getNumOfSavedModels: CallbackTo[Double],
    isUsingGpuDevice: CallbackTo[Boolean],
    loadSavedModel: (String, String) => CallbackTo[Double],
    runSavedModel: (Double, js.Array[Double], String, String) => CallbackTo[js.Array[TensorMetadata]],
    tensorDataSync: Double => CallbackTo[
      scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
    ]
  ): TFJSBinding = {
    val __obj = js.Dynamic.literal(TFEOpAttr = TFEOpAttr.asInstanceOf[js.Any], TF_ATTR_BOOL = TF_ATTR_BOOL.asInstanceOf[js.Any], TF_ATTR_FLOAT = TF_ATTR_FLOAT.asInstanceOf[js.Any], TF_ATTR_INT = TF_ATTR_INT.asInstanceOf[js.Any], TF_ATTR_RESOURCE = TF_ATTR_RESOURCE.asInstanceOf[js.Any], TF_ATTR_SHAPE = TF_ATTR_SHAPE.asInstanceOf[js.Any], TF_ATTR_STRING = TF_ATTR_STRING.asInstanceOf[js.Any], TF_ATTR_TYPE = TF_ATTR_TYPE.asInstanceOf[js.Any], TF_BOOL = TF_BOOL.asInstanceOf[js.Any], TF_COMPLEX64 = TF_COMPLEX64.asInstanceOf[js.Any], TF_FLOAT = TF_FLOAT.asInstanceOf[js.Any], TF_INT32 = TF_INT32.asInstanceOf[js.Any], TF_INT64 = TF_INT64.asInstanceOf[js.Any], TF_RESOURCE = TF_RESOURCE.asInstanceOf[js.Any], TF_STRING = TF_STRING.asInstanceOf[js.Any], TF_UINT8 = TF_UINT8.asInstanceOf[js.Any], TF_Version = TF_Version.asInstanceOf[js.Any], TensorMetadata = TensorMetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("createTensor")(js.Any.fromFunction3((t0: js.Array[scala.Double], t1: scala.Double, t2: typingsJapgolly.tensorflowTfjsCore.distTypesMod.BackendValues) => createTensor(t0, t1, t2).runNow()))
    __obj.updateDynamic("deleteSavedModel")(js.Any.fromFunction1((t0: scala.Double) => deleteSavedModel(t0).runNow()))
    __obj.updateDynamic("deleteTensor")(js.Any.fromFunction1((t0: scala.Double) => deleteTensor(t0).runNow()))
    __obj.updateDynamic("executeOp")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Array[typingsJapgolly.tensorflowTfjsNode.tfjsBindingMod.TFEOpAttr], t2: js.Array[scala.Double], t3: scala.Double) => executeOp(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getNumOfSavedModels")(getNumOfSavedModels.toJsFn)
    __obj.updateDynamic("isUsingGpuDevice")(isUsingGpuDevice.toJsFn)
    __obj.updateDynamic("loadSavedModel")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => loadSavedModel(t0, t1).runNow()))
    __obj.updateDynamic("runSavedModel")(js.Any.fromFunction4((t0: scala.Double, t1: js.Array[scala.Double], t2: java.lang.String, t3: java.lang.String) => runSavedModel(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("tensorDataSync")(js.Any.fromFunction1((t0: scala.Double) => tensorDataSync(t0).runNow()))
    __obj.asInstanceOf[TFJSBinding]
  }
}

