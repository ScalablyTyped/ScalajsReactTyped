package typingsJapgolly.synaptic.global.Synaptic

import typingsJapgolly.synaptic.anon.Connections
import typingsJapgolly.synaptic.mod.Neuron.SquashingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Synaptic.Neuron")
@js.native
/**
  * Neurons are the basic unit of the neural network. They can be connected together, or used to gate connections between other neurons.
  */
open class Neuron ()
  extends typingsJapgolly.synaptic.mod.Neuron
/* static members */
object Neuron {
  
  @JSGlobal("Synaptic.Neuron")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Synaptic.Neuron.Connection")
  @js.native
  open class Connection_ protected ()
    extends typingsJapgolly.synaptic.mod.Neuron.Connection_ {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
  }
  object Connection_ {
    
    @JSGlobal("Synaptic.Neuron.Connection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  /* was `typeof Connection` */
  @JSGlobal("Synaptic.Neuron.connection")
  @js.native
  open class connection protected ()
    extends typingsJapgolly.synaptic.mod.Neuron.connection {
    def this(from: Double, to: Double) = this()
    def this(from: Double, to: Double, weight: Double) = this()
  }
  /* was `typeof Connection` */
  object connection {
    
    @JSGlobal("Synaptic.Neuron.connection")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
  }
  
  inline def quantity(): Connections = ^.asInstanceOf[js.Dynamic].applyDynamic("quantity")().asInstanceOf[Connections]
  
  object squash {
    
    @JSGlobal("Synaptic.Neuron.squash.HLIM")
    @js.native
    val HLIM: SquashingFunction = js.native
    
    @JSGlobal("Synaptic.Neuron.squash.IDENTITY")
    @js.native
    val IDENTITY: SquashingFunction = js.native
    
    @JSGlobal("Synaptic.Neuron.squash.LOGISTIC")
    @js.native
    val LOGISTIC: SquashingFunction = js.native
    
    @JSGlobal("Synaptic.Neuron.squash.ReLU")
    @js.native
    val ReLU: SquashingFunction = js.native
    
    @JSGlobal("Synaptic.Neuron.squash.TANH")
    @js.native
    val TANH: SquashingFunction = js.native
  }
  
  inline def uid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[Double]
}
