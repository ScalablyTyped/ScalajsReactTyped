package typingsJapgolly.pulumiKubernetes.inputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
  */
trait LimitRangeSpec extends js.Object {
  /**
    * Limits is the list of LimitRangeItem objects that are enforced.
    */
  var limits: Input[js.Array[Input[LimitRangeItem]]]
}

object LimitRangeSpec {
  @scala.inline
  def apply(limits: Input[js.Array[Input[LimitRangeItem]]]): LimitRangeSpec = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LimitRangeSpec]
  }
}

