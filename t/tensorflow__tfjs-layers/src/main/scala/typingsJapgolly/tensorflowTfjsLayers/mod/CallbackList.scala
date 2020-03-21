package typingsJapgolly.tensorflowTfjsLayers.mod

import typingsJapgolly.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
class CallbackList ()
  extends typingsJapgolly.tensorflowTfjsLayers.baseCallbacksMod.CallbackList {
  def this(callbacks: js.Array[BaseCallback]) = this()
  def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
}

