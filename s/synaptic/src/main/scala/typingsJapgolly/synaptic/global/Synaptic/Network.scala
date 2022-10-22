package typingsJapgolly.synaptic.global.Synaptic

import typingsJapgolly.synaptic.mod.Network.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Synaptic.Network")
@js.native
/**
  * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
  */
open class Network ()
  extends typingsJapgolly.synaptic.mod.Network {
  def this(options: Options) = this()
}
/* static members */
object Network {
  
  @JSGlobal("Synaptic.Network")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Rebuild a network that has been stored in a json using the method toJSON().
    */
  inline def fromJSON(exported: Any): typingsJapgolly.synaptic.mod.Network = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(exported.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.synaptic.mod.Network]
  
  /**
    * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
    * @returns Source code that can train a network inside a worker.
    */
  inline def getWorkerSharedFunctions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkerSharedFunctions")().asInstanceOf[String]
}
