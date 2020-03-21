package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.backendMod.KernelBackend
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackend extends js.Object {
  var backend: KernelBackend
  var bytes: Double
  var dtype: string | float32 | int32 | bool | complex64
  var refCount: Double
  var shape: js.Array[Double]
}

object AnonBackend {
  @scala.inline
  def apply(
    backend: KernelBackend,
    bytes: Double,
    dtype: string | float32 | int32 | bool | complex64,
    refCount: Double,
    shape: js.Array[Double]
  ): AnonBackend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackend]
  }
}

