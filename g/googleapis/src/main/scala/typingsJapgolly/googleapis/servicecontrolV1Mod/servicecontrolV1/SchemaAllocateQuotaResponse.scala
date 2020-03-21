package typingsJapgolly.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the AllocateQuota method.
  */
@js.native
trait SchemaAllocateQuotaResponse extends js.Object {
  /**
    * Indicates the decision of the allocate.
    */
  var allocateErrors: js.UndefOr[js.Array[SchemaQuotaError]] = js.native
  /**
    * WARNING: DO NOT use this field until this warning message is removed.
    */
  var allocateInfo: js.UndefOr[SchemaAllocateInfo] = js.native
  /**
    * The same operation_id value used in the AllocateQuotaRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota metrics to indicate the result of allocation. Depending on the
    * request, one or more of the following metrics will be included:  1. Per
    * quota group or per quota metric incremental usage will be specified using
    * the following delta metric :
    * &quot;serviceruntime.googleapis.com/api/consumer/quota_used_count&quot;
    * 2. The quota limit reached condition will be specified using the
    * following boolean metric :
    * &quot;serviceruntime.googleapis.com/quota/exceeded&quot;
    */
  var quotaMetrics: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.native
  /**
    * ID of the actual config used to process the request.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaAllocateQuotaResponse {
  @scala.inline
  def apply(
    allocateErrors: js.Array[SchemaQuotaError] = null,
    allocateInfo: SchemaAllocateInfo = null,
    operationId: String = null,
    quotaMetrics: js.Array[SchemaMetricValueSet] = null,
    serviceConfigId: String = null
  ): SchemaAllocateQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (allocateErrors != null) __obj.updateDynamic("allocateErrors")(allocateErrors.asInstanceOf[js.Any])
    if (allocateInfo != null) __obj.updateDynamic("allocateInfo")(allocateInfo.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaMetrics != null) __obj.updateDynamic("quotaMetrics")(quotaMetrics.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAllocateQuotaResponse]
  }
}

