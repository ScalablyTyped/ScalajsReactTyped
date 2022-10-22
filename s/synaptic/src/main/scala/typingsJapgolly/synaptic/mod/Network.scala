package typingsJapgolly.synaptic.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Worker
import typingsJapgolly.synaptic.anon.Code
import typingsJapgolly.synaptic.mod.Layer.LayerConnection
import typingsJapgolly.synaptic.mod.Layer.connectionType
import typingsJapgolly.synaptic.mod.Layer.gateType
import typingsJapgolly.synaptic.mod.Network.Optimized
import typingsJapgolly.synaptic.mod.Network.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("synaptic", "Network")
@js.native
/**
  * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
  */
open class Network () extends StObject {
  def this(options: Options) = this()
  
  /**
    * When a network is activated, an input must be provided to activate the input layer, then all the hidden layers are activated in order, and finally the output layer is activated and its activation is returned.
    * @param activation
    */
  def activate(activation: js.Array[Double]): js.Array[Double] = js.native
  
  /**
    * Clear all elegibility traces and extended elegibility traces (the network forgets its context, but not what was trained).
    */
  def clear(): Unit = js.native
  
  /**
    * A Network can gate a connection between two other Networks or Layers, or a Layers's self-connection.
    * @param layerConnection
    * @param gateType
    */
  def gate(layerConnection: LayerConnection, gateType: gateType): Unit = js.native
  
  /**
    * Returns number of inputs of the network.
    */
  def inputs(): Double = js.native
  
  var layers: Options = js.native
  
  /**
    * Return an array with all the neurons in the network, in activation order.
    */
  def neurons(): js.Array[Double] = js.native
  
  /**
    * Hardcodes the behaviour of the whole network into a single optimized function.
    */
  def optimize(): Unit = js.native
  
  var optimized: Optimized = js.native
  
  /**
    * Returns number of outputs of hte network.
    */
  def outputs(): Double = js.native
  
  def project(otherNetwork: Layer): LayerConnection = js.native
  def project(otherNetwork: Layer, connectionType: Unit, weights: Any): LayerConnection = js.native
  def project(otherNetwork: Layer, connectionType: connectionType): LayerConnection = js.native
  def project(otherNetwork: Layer, connectionType: connectionType, weights: Any): LayerConnection = js.native
  /**
    * A network can project a connection to another, or gate a connection between two others networks in the same way Layers do.
    * @param [connectionType=Layer.connectionType.ALL_TO_ALL]
    */
  def project(otherNetwork: Network): LayerConnection = js.native
  def project(otherNetwork: Network, connectionType: Unit, weights: Any): LayerConnection = js.native
  def project(otherNetwork: Network, connectionType: connectionType): LayerConnection = js.native
  def project(otherNetwork: Network, connectionType: connectionType, weights: Any): LayerConnection = js.native
  
  /**
    * You can provide a target value and a learning rate to a network and backpropagate the error from the output layer to all the hidden layers in reverse order until reaching the input layer.
    * @param learningRate
    * @param targetValue
    */
  def propagate(learningRate: Double, targetValue: js.Array[Double]): Unit = js.native
  
  /**
    * Reset all weights and clear all traces (ends up like a new network).
    */
  def reset(): Unit = js.native
  
  /**
    * Restores all the values from the optimized network the their respective objects in order to manipulate the network.
    */
  def restore(): Any | Unit = js.native
  
  /**
    * The method set(layers) receives an object with layers in the same format as the constructor of Network and sets them as the layers of the Network, this is useful when you are extending the Network class to create your own architectures.
    */
  def set(options: Options): Unit = js.native
  
  def setOptimize(optimize: Any): Unit = js.native
  
  /**
    * The network can be exported to a single javascript Function. This can be useful when your network is already trained and you just need to use it, since the standalone functions is just one javascript function with an array and operations within, with no dependencies on Synaptic or any other library.
    * @returns Returns a function that works as the activation of the network and can be used without depending on the library.
    */
  def standalone(): js.Function1[/* inputs */ js.Array[Double], js.Array[Double]] = js.native
  
  /**
    * Export the topology into dot language which can be visualized as graphs using dot.
    * @param edgeConnection
    */
  def toDot(): Code = js.native
  def toDot(edgeConnection: Any): Code = js.native
  
  /**
    * Networks can be stored as JSON's.
    */
  def toJSON(): Any = js.native
  
  /**
    * The network can be converted into a WebWorker. This feature doesn't work in node.js, and it's not supported on every browser (it must support Blob).
    * @returns Return a HTML5 WebWorker specialized on training the network stored in `memory`. Train based on the given dataSet and options. The worker returns the updated `memory` when done.
    */
  def worker(): Worker = js.native
  def worker(memory: Any): Worker = js.native
  def worker(memory: Any, set: Any): Worker = js.native
  def worker(memory: Any, set: Any, options: Any): Worker = js.native
  def worker(memory: Any, set: Unit, options: Any): Worker = js.native
  def worker(memory: Unit, set: Any): Worker = js.native
  def worker(memory: Unit, set: Any, options: Any): Worker = js.native
  def worker(memory: Unit, set: Unit, options: Any): Worker = js.native
}
/* static members */
object Network {
  
  @JSImport("synaptic", "Network")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Rebuild a network that has been stored in a json using the method toJSON().
    */
  inline def fromJSON(exported: Any): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(exported.asInstanceOf[js.Any]).asInstanceOf[Network]
  
  /**
    * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
    * @returns Source code that can train a network inside a worker.
    */
  inline def getWorkerSharedFunctions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkerSharedFunctions")().asInstanceOf[String]
  
  trait Optimized extends StObject {
    
    var memory: js.typedarray.Float64Array
    
    def ownership(memoryBuffer: js.typedarray.Float64Array): Unit
  }
  object Optimized {
    
    inline def apply(memory: js.typedarray.Float64Array, ownership: js.typedarray.Float64Array => Callback): Optimized = {
      val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], ownership = js.Any.fromFunction1((t0: js.typedarray.Float64Array) => ownership(t0).runNow()))
      __obj.asInstanceOf[Optimized]
    }
    
    extension [Self <: Optimized](x: Self) {
      
      inline def setMemory(value: js.typedarray.Float64Array): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setOwnership(value: js.typedarray.Float64Array => Callback): Self = StObject.set(x, "ownership", js.Any.fromFunction1((t0: js.typedarray.Float64Array) => value(t0).runNow()))
    }
  }
  
  trait Options extends StObject {
    
    var hidden: js.Array[Layer]
    
    var input: Layer
    
    var output: Layer
  }
  object Options {
    
    inline def apply(hidden: js.Array[Layer], input: Layer, output: Layer): Options = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHidden(value: js.Array[Layer]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenVarargs(value: Layer*): Self = StObject.set(x, "hidden", js.Array(value*))
      
      inline def setInput(value: Layer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Layer): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
}
