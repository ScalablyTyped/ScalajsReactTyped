package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuOptions extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}

object CpuOptions {
  @scala.inline
  def apply(CoreCount: Int | scala.Double = null, ThreadsPerCore: Int | scala.Double = null): CpuOptions = {
    val __obj = js.Dynamic.literal()
    if (CoreCount != null) __obj.updateDynamic("CoreCount")(CoreCount.asInstanceOf[js.Any])
    if (ThreadsPerCore != null) __obj.updateDynamic("ThreadsPerCore")(ThreadsPerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuOptions]
  }
}

