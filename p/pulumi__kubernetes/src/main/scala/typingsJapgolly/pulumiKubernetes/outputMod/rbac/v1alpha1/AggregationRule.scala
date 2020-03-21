package typingsJapgolly.pulumiKubernetes.outputMod.rbac.v1alpha1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
  */
trait AggregationRule extends js.Object {
  /**
    * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
    * create the rules. If any of the selectors match, then the ClusterRole's permissions will be
    * added
    */
  val clusterRoleSelectors: js.Array[LabelSelector]
}

object AggregationRule {
  @scala.inline
  def apply(clusterRoleSelectors: js.Array[LabelSelector]): AggregationRule = {
    val __obj = js.Dynamic.literal(clusterRoleSelectors = clusterRoleSelectors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AggregationRule]
  }
}

