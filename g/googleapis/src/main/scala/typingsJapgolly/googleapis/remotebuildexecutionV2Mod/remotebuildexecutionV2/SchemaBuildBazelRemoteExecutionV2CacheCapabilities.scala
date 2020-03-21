package typingsJapgolly.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities of the remote cache system.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2CacheCapabilities extends js.Object {
  /**
    * Capabilities for updating the action cache.
    */
  var actionCacheUpdateCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities] = js.native
  /**
    * Supported cache priority range for both CAS and ActionCache.
    */
  var cachePriorityCapabilities: js.UndefOr[SchemaBuildBazelRemoteExecutionV2PriorityCapabilities] = js.native
  /**
    * All the digest functions supported by the remote cache. Remote cache may
    * support multiple digest functions simultaneously.
    */
  var digestFunction: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum total size of blobs to be uploaded/downloaded using batch
    * methods. A value of 0 means no limit is set, although in practice there
    * will always be a message size limitation of the protocol in use, e.g.
    * GRPC.
    */
  var maxBatchTotalSizeBytes: js.UndefOr[String] = js.native
  /**
    * Whether absolute symlink targets are supported.
    */
  var symlinkAbsolutePathStrategy: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2CacheCapabilities {
  @scala.inline
  def apply(
    actionCacheUpdateCapabilities: SchemaBuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = null,
    cachePriorityCapabilities: SchemaBuildBazelRemoteExecutionV2PriorityCapabilities = null,
    digestFunction: js.Array[String] = null,
    maxBatchTotalSizeBytes: String = null,
    symlinkAbsolutePathStrategy: String = null
  ): SchemaBuildBazelRemoteExecutionV2CacheCapabilities = {
    val __obj = js.Dynamic.literal()
    if (actionCacheUpdateCapabilities != null) __obj.updateDynamic("actionCacheUpdateCapabilities")(actionCacheUpdateCapabilities.asInstanceOf[js.Any])
    if (cachePriorityCapabilities != null) __obj.updateDynamic("cachePriorityCapabilities")(cachePriorityCapabilities.asInstanceOf[js.Any])
    if (digestFunction != null) __obj.updateDynamic("digestFunction")(digestFunction.asInstanceOf[js.Any])
    if (maxBatchTotalSizeBytes != null) __obj.updateDynamic("maxBatchTotalSizeBytes")(maxBatchTotalSizeBytes.asInstanceOf[js.Any])
    if (symlinkAbsolutePathStrategy != null) __obj.updateDynamic("symlinkAbsolutePathStrategy")(symlinkAbsolutePathStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2CacheCapabilities]
  }
}

