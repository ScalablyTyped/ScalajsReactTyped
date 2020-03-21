package typingsJapgolly.synaptic.mod._Global_

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.synaptic.AnonConnections
import typingsJapgolly.synaptic.TypeofConnection
import typingsJapgolly.synaptic.Typeofsquash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Neuron")
@js.native
/**
  * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
  */
class Neuron ()
  extends typingsJapgolly.synaptic.mod.Neuron

@JSGlobal("Neuron")
@js.native
object Neuron
  extends Instantiable0[typingsJapgolly.synaptic.mod.Neuron] {
  var Connection: TypeofConnection = js.native
  val squash: Typeofsquash = js.native
  def quantity(): AnonConnections = js.native
  def uid(): Double = js.native
}

