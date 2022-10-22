package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsLayers.distBaseCallbacksMod.BaseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "CallbackList")
@js.native
/**
  * Constructor of CallbackList.
  * @param callbacks Array of `Callback` instances.
  * @param queueLength Queue length for keeping running statistics over
  *   callback execution time.
  */
open class CallbackList ()
  extends typingsJapgolly.tensorflowTfjsLayers.mod.CallbackList {
  def this(callbacks: js.Array[BaseCallback]) = this()
  def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
  def this(callbacks: Unit, queueLength: Double) = this()
}
