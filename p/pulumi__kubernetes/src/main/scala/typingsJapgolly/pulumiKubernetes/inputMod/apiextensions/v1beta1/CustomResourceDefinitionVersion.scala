package typingsJapgolly.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
trait CustomResourceDefinitionVersion extends js.Object {
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See
    * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
    * for details. Top-level and per-version columns are mutually exclusive. Per-version columns
    * must not all be set to identical values (top-level columns should be used instead). If no
    * top-level or per-version columns are specified, a single column displaying the age of the
    * custom resource is used.
    */
  var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinition]]]] = js.undefined
  /**
    * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are
    * served under this version at `/apis/<group>/<version>/...` if `served` is true.
    */
  var name: Input[String]
  /**
    * schema describes the schema used for validation and pruning of this version of the custom
    * resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas
    * must not all be set to identical values (top-level validation schema should be used
    * instead).
    */
  var schema: js.UndefOr[Input[CustomResourceValidation]] = js.undefined
  /**
    * served is a flag enabling/disabling this version from being served via REST APIs
    */
  var served: Input[Boolean]
  /**
    * storage indicates this version should be used when persisting custom resources to storage.
    * There must be exactly one version with storage=true.
    */
  var storage: Input[Boolean]
  /**
    * subresources specify what subresources this version of the defined custom resource have.
    * Top-level and per-version subresources are mutually exclusive. Per-version subresources
    * must not all be set to identical values (top-level subresources should be used instead).
    */
  var subresources: js.UndefOr[Input[CustomResourceSubresources]] = js.undefined
}

object CustomResourceDefinitionVersion {
  @scala.inline
  def apply(
    name: Input[String],
    served: Input[Boolean],
    storage: Input[Boolean],
    additionalPrinterColumns: Input[js.Array[Input[CustomResourceColumnDefinition]]] = null,
    schema: Input[CustomResourceValidation] = null,
    subresources: Input[CustomResourceSubresources] = null
  ): CustomResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], served = served.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    if (additionalPrinterColumns != null) __obj.updateDynamic("additionalPrinterColumns")(additionalPrinterColumns.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (subresources != null) __obj.updateDynamic("subresources")(subresources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionVersion]
  }
}

