package typingsJapgolly.tensorflowTfjsCore.mod

import typingsJapgolly.tensorflowTfjsCore.backendMod.DataMover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typingsJapgolly.tensorflowTfjsCore.backendMod.DataStorage[T] {
  def this(backend: typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}

