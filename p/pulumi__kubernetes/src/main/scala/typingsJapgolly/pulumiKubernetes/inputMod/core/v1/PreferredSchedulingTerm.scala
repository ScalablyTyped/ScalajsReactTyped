package typingsJapgolly.pulumiKubernetes.inputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a
  * no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
  */
trait PreferredSchedulingTerm extends js.Object {
  /**
    * A node selector term, associated with the corresponding weight.
    */
  var preference: Input[NodeSelectorTerm]
  /**
    * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    */
  var weight: Input[Double]
}

object PreferredSchedulingTerm {
  @scala.inline
  def apply(preference: Input[NodeSelectorTerm], weight: Input[Double]): PreferredSchedulingTerm = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreferredSchedulingTerm]
  }
}

