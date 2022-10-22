package typingsJapgolly.tensorflowTfjsCore.mod

import typingsJapgolly.tensorflowTfjsCore.distBackendsBackendMod.DataMover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "DataStorage")
@js.native
open class DataStorage[T] protected ()
  extends typingsJapgolly.tensorflowTfjsCore.distBaseMod.DataStorage[T] {
  def this(
    backend: typingsJapgolly.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend,
    dataMover: DataMover
  ) = this()
}
