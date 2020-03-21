package typingsJapgolly.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as
  * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
  * or memory).  The values will be averaged together before being compared to the target.  Such
  * metrics are built in to Kubernetes, and have special scaling options on top of those
  * available to normal per-pod metrics using the "pods" source.  Only one "target" type should
  * be set.
  */
trait ResourceMetricSource extends js.Object {
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String]
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}

object ResourceMetricSource {
  @scala.inline
  def apply(name: Input[String], target: Input[MetricTarget]): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceMetricSource]
  }
}

