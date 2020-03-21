package typingsJapgolly.tensorflowTfjs.mod

import typingsJapgolly.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsJapgolly.tensorflowTfjsCore.mod.DataStorage[T] {
  def this(backend: typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}

