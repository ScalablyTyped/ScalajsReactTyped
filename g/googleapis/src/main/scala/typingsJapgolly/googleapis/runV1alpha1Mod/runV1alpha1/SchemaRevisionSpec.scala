package typingsJapgolly.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RevisionSpec holds the desired state of the Revision (from the client).
  */
@js.native
trait SchemaRevisionSpec extends js.Object {
  /**
    * ConcurrencyModel specifies the desired concurrency model (Single or
    * Multi) for the Revision. Defaults to Multi. Deprecated in favor of
    * ContainerConcurrency. +optional
    */
  var concurrencyModel: js.UndefOr[String] = js.native
  /**
    * Container defines the unit of execution for this Revision. In the context
    * of a Revision, we disallow a number of the fields of this Container,
    * including: name, ports, and volumeMounts. The runtime contract is
    * documented here:
    * https://github.com/knative/serving/blob/master/docs/runtime-contract.md
    */
  var container: js.UndefOr[SchemaContainer] = js.native
  /**
    * ContainerConcurrency specifies the maximum allowed in-flight (concurrent)
    * requests per container of the Revision. Values are: - `0` thread-safe,
    * the system should manage the max concurrency. This is    the default
    * value. - `1` not-thread-safe. Single concurrency - `2-N` thread-safe, max
    * concurrency of N
    */
  var containerConcurrency: js.UndefOr[Double] = js.native
  /**
    * Deprecated and not currently populated by Cloud Run. See
    * metadata.generation instead, which is the sequence number containing the
    * latest generation of the desired state.  Read-only.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * Not currently used by Cloud Run.
    */
  var serviceAccountName: js.UndefOr[String] = js.native
  /**
    * ServingState holds a value describing the state the resources are in for
    * this Revision. Users must not specify this when creating a revision. It
    * is expected that the system will manipulate this based on routability and
    * load.  Populated by the system. Read-only.
    */
  var servingState: js.UndefOr[String] = js.native
  /**
    * TimeoutSeconds holds the max duration the instance is allowed for
    * responding to a request. Not currently used by Cloud Run.
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object SchemaRevisionSpec {
  @scala.inline
  def apply(
    concurrencyModel: String = null,
    container: SchemaContainer = null,
    containerConcurrency: Int | Double = null,
    generation: Int | Double = null,
    serviceAccountName: String = null,
    servingState: String = null,
    timeoutSeconds: Int | Double = null
  ): SchemaRevisionSpec = {
    val __obj = js.Dynamic.literal()
    if (concurrencyModel != null) __obj.updateDynamic("concurrencyModel")(concurrencyModel.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerConcurrency != null) __obj.updateDynamic("containerConcurrency")(containerConcurrency.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (serviceAccountName != null) __obj.updateDynamic("serviceAccountName")(serviceAccountName.asInstanceOf[js.Any])
    if (servingState != null) __obj.updateDynamic("servingState")(servingState.asInstanceOf[js.Any])
    if (timeoutSeconds != null) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevisionSpec]
  }
}

