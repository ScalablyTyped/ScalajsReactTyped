package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsJapgolly.tensorflowTfjs.mod.DataStorage[T] {
  def this(backend: typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}

