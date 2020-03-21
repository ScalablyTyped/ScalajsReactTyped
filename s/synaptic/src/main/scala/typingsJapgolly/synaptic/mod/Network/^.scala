package typingsJapgolly.synaptic.mod.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Network")
@js.native
object ^ extends js.Object {
  /**
    * Rebuild a network that has been stored in a json using the method toJSON().
    */
  def fromJSON(exported: js.Any): typingsJapgolly.synaptic.mod.Network = js.native
  /**
    * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
    * @returns Source code that can train a network inside a worker.
    */
  def getWorkerSharedFunctions(): String = js.native
}

