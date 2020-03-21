package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import typingsJapgolly.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Namespace provides a scope for Names. Use of multiple namespaces is optional.
  */
trait Namespace extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Namespace
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Spec defines the behavior of the Namespace. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: NamespaceSpec
  /**
    * Status describes the current status of a Namespace. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val status: NamespaceStatus
}

object Namespace {
  @scala.inline
  def apply(
    apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1,
    kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Namespace,
    metadata: ObjectMeta,
    spec: NamespaceSpec,
    status: NamespaceStatus
  ): Namespace = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Namespace]
  }
}

