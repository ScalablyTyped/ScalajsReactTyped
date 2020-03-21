package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPU extends js.Object {
  /**
    * An amount of unused CPU accumulated in your bucket.
    * @see http://docs.screeps.com/cpu-limit.html#Bucket
    */
  var bucket: Double
  /**
    * Use this method to get heap statistics for your virtual machine.
    *
    * This method will be undefined if you are not using IVM.
    *
    * The return value is almost identical to the Node.js function v8.getHeapStatistics().
    * This function returns one additional property: externally_allocated_size which is the total amount of currently
    * allocated memory which is not included in the v8 heap but counts against this isolate's memory limit.
    * ArrayBuffer instances over a certain size are externally allocated and will be counted here.
    */
  var getHeapStatistics: js.UndefOr[js.Function0[HeapStatistics]] = js.undefined
  /**
    * This method will be undefined if you are not using IVM.
    *
    * Reset your runtime environment and wipe all data in heap memory.
    * Player code execution stops immediately.
    */
  var halt: js.UndefOr[js.Function0[scala.Nothing]] = js.undefined
  /**
    * Your assigned CPU limit for the current shard.
    */
  var limit: Double
  /**
    * An object with limits for each shard with shard names as keys. You can use `setShardLimits` method to re-assign them.
    */
  var shardLimits: CPUShardLimits
  /**
    * An amount of available CPU time at the current game tick. Usually it is higher than `Game.cpu.limit`.
    */
  var tickLimit: Double
  /**
    * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
    */
  def getUsed(): Double
  /**
    * Allocate CPU limits to different shards. Total amount of CPU should remain equal to `Game.cpu.shardLimits`.
    * This method can be used only once per 12 hours.
    *
    * @param limits An object with CPU values for each shard in the same format as `Game.cpu.shardLimits`.
    * @returns One of the following codes: `OK | ERR_BUSY | ERR_INVALID_ARGS`
    */
  def setShardLimits(limits: CPUShardLimits): OK | ERR_BUSY | ERR_INVALID_ARGS
}

object CPU {
  @scala.inline
  def apply(
    bucket: Double,
    getUsed: CallbackTo[Double],
    limit: Double,
    setShardLimits: CPUShardLimits => CallbackTo[OK | ERR_BUSY | ERR_INVALID_ARGS],
    shardLimits: CPUShardLimits,
    tickLimit: Double,
    getHeapStatistics: js.UndefOr[CallbackTo[HeapStatistics]] = js.undefined,
    halt: js.UndefOr[CallbackTo[scala.Nothing]] = js.undefined
  ): CPU = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], shardLimits = shardLimits.asInstanceOf[js.Any], tickLimit = tickLimit.asInstanceOf[js.Any])
    __obj.updateDynamic("getUsed")(getUsed.toJsFn)
    __obj.updateDynamic("setShardLimits")(js.Any.fromFunction1((t0: typingsJapgolly.screeps.CPUShardLimits) => setShardLimits(t0).runNow()))
    getHeapStatistics.foreach(p => __obj.updateDynamic("getHeapStatistics")(p.toJsFn))
    halt.foreach(p => __obj.updateDynamic("halt")(p.toJsFn))
    __obj.asInstanceOf[CPU]
  }
}

