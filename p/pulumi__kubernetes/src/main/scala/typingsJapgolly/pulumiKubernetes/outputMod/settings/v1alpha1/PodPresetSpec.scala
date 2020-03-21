package typingsJapgolly.pulumiKubernetes.outputMod.settings.v1alpha1

import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.EnvFromSource
import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.EnvVar
import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.Volume
import typingsJapgolly.pulumiKubernetes.outputMod.core.v1.VolumeMount
import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodPresetSpec is a description of a pod preset.
  */
trait PodPresetSpec extends js.Object {
  /**
    * Env defines the collection of EnvVar to inject into containers.
    */
  val env: js.Array[EnvVar]
  /**
    * EnvFrom defines the collection of EnvFromSource to inject into containers.
    */
  val envFrom: js.Array[EnvFromSource]
  /**
    * Selector is a label query over a set of resources, in this case pods. Required.
    */
  val selector: LabelSelector
  /**
    * VolumeMounts defines the collection of VolumeMount to inject into containers.
    */
  val volumeMounts: js.Array[VolumeMount]
  /**
    * Volumes defines the collection of Volume to inject into the pod.
    */
  val volumes: js.Array[Volume]
}

object PodPresetSpec {
  @scala.inline
  def apply(
    env: js.Array[EnvVar],
    envFrom: js.Array[EnvFromSource],
    selector: LabelSelector,
    volumeMounts: js.Array[VolumeMount],
    volumes: js.Array[Volume]
  ): PodPresetSpec = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], envFrom = envFrom.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], volumeMounts = volumeMounts.asInstanceOf[js.Any], volumes = volumes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodPresetSpec]
  }
}

