package typingsJapgolly.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsJapgolly.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typingsJapgolly.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetSpec is the specification of a daemon set.
  */
trait DaemonSetSpec extends js.Object {
  /**
    * The minimum number of seconds for which a newly created DaemonSet pod should be ready
    * without any of its container crashing, for it to be considered available. Defaults to 0
    * (pod will be considered available as soon as it is ready).
    */
  var minReadySeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of old history to retain to allow rollback. This is a pointer to distinguish
    * between explicit zero and not specified. Defaults to 10.
    */
  var revisionHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * A label query over pods that are managed by the daemon set. Must match in order to be
    * controlled. If empty, defaulted to labels on Pod template. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * An object that describes the pod that will be created. The DaemonSet will create exactly
    * one copy of this pod on every node that matches the template's node selector (or on every
    * node if no node selector is specified). More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
    */
  var template: Input[PodTemplateSpec]
  /**
    * DEPRECATED. A sequence number representing a specific generation of the template. Populated
    * by the system. It can be set only during the creation.
    */
  var templateGeneration: js.UndefOr[Input[Double]] = js.undefined
  /**
    * An update strategy to replace existing DaemonSet pods with new pods.
    */
  var updateStrategy: js.UndefOr[Input[DaemonSetUpdateStrategy]] = js.undefined
}

object DaemonSetSpec {
  @scala.inline
  def apply(
    template: Input[PodTemplateSpec],
    minReadySeconds: Input[Double] = null,
    revisionHistoryLimit: Input[Double] = null,
    selector: Input[LabelSelector] = null,
    templateGeneration: Input[Double] = null,
    updateStrategy: Input[DaemonSetUpdateStrategy] = null
  ): DaemonSetSpec = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (minReadySeconds != null) __obj.updateDynamic("minReadySeconds")(minReadySeconds.asInstanceOf[js.Any])
    if (revisionHistoryLimit != null) __obj.updateDynamic("revisionHistoryLimit")(revisionHistoryLimit.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (templateGeneration != null) __obj.updateDynamic("templateGeneration")(templateGeneration.asInstanceOf[js.Any])
    if (updateStrategy != null) __obj.updateDynamic("updateStrategy")(updateStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetSpec]
  }
}

