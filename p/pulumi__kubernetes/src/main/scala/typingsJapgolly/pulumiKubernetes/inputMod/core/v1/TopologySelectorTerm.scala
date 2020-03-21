package typingsJapgolly.pulumiKubernetes.inputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topology selector term represents the result of label queries. A null or empty topology
  * selector term matches no objects. The requirements of them are ANDed. It provides a subset of
  * functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
  */
trait TopologySelectorTerm extends js.Object {
  /**
    * A list of topology selector requirements by labels.
    */
  var matchLabelExpressions: js.UndefOr[Input[js.Array[Input[TopologySelectorLabelRequirement]]]] = js.undefined
}

object TopologySelectorTerm {
  @scala.inline
  def apply(matchLabelExpressions: Input[js.Array[Input[TopologySelectorLabelRequirement]]] = null): TopologySelectorTerm = {
    val __obj = js.Dynamic.literal()
    if (matchLabelExpressions != null) __obj.updateDynamic("matchLabelExpressions")(matchLabelExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorTerm]
  }
}

