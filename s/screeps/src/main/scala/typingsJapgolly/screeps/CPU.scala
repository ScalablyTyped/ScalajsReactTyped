package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPU extends StObject {
  
  /**
    * An amount of unused CPU accumulated in your bucket.
    * @see http://docs.screeps.com/cpu-limit.html#Bucket
    */
  var bucket: Double
  
  /**
    * Generate 1 pixel resource unit for 10000 CPU from your bucket.
    */
  def generatePixel(): OK | ERR_NOT_ENOUGH_RESOURCES
  
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
    * Get amount of CPU time used from the beginning of the current game tick. Always returns 0 in the Simulation mode.
    */
  def getUsed(): Double
  
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
    * Allocate CPU limits to different shards. Total amount of CPU should remain equal to `Game.cpu.shardLimits`.
    * This method can be used only once per 12 hours.
    *
    * @param limits An object with CPU values for each shard in the same format as `Game.cpu.shardLimits`.
    * @returns One of the following codes: `OK | ERR_BUSY | ERR_INVALID_ARGS`
    */
  def setShardLimits(limits: CPUShardLimits): OK | ERR_BUSY | ERR_INVALID_ARGS
  
  /**
    * An object with limits for each shard with shard names as keys. You can use `setShardLimits` method to re-assign them.
    */
  var shardLimits: CPUShardLimits
  
  /**
    * An amount of available CPU time at the current game tick. Usually it is higher than `Game.cpu.limit`.
    */
  var tickLimit: Double
  
  /**
    * Unlock full CPU for your account for additional 24 hours.
    * This method will consume 1 CPU unlock bound to your account (See `Game.resources`).
    * If full CPU is not currently unlocked for your account, it may take some time (up to 5 minutes) before unlock is applied to your account.
    */
  def unlock(): OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL
  
  /**
    * Whether full CPU is currently unlocked for your account.
    */
  var unlocked: Boolean
  
  /**
    * The time in milliseconds since UNIX epoch time until full CPU is unlocked for your account.
    * This property is not defined when full CPU is not unlocked for your account or it's unlocked with a subscription.
    */
  var unlockedTime: js.UndefOr[Double] = js.undefined
}
object CPU {
  
  inline def apply(
    bucket: Double,
    generatePixel: CallbackTo[OK | ERR_NOT_ENOUGH_RESOURCES],
    getUsed: CallbackTo[Double],
    limit: Double,
    setShardLimits: CPUShardLimits => OK | ERR_BUSY | ERR_INVALID_ARGS,
    shardLimits: CPUShardLimits,
    tickLimit: Double,
    unlock: CallbackTo[OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL],
    unlocked: Boolean
  ): CPU = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], generatePixel = generatePixel.toJsFn, getUsed = getUsed.toJsFn, limit = limit.asInstanceOf[js.Any], setShardLimits = js.Any.fromFunction1(setShardLimits), shardLimits = shardLimits.asInstanceOf[js.Any], tickLimit = tickLimit.asInstanceOf[js.Any], unlock = unlock.toJsFn, unlocked = unlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPU]
  }
  
  extension [Self <: CPU](x: Self) {
    
    inline def setBucket(value: Double): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setGeneratePixel(value: CallbackTo[OK | ERR_NOT_ENOUGH_RESOURCES]): Self = StObject.set(x, "generatePixel", value.toJsFn)
    
    inline def setGetHeapStatistics(value: CallbackTo[HeapStatistics]): Self = StObject.set(x, "getHeapStatistics", value.toJsFn)
    
    inline def setGetHeapStatisticsUndefined: Self = StObject.set(x, "getHeapStatistics", js.undefined)
    
    inline def setGetUsed(value: CallbackTo[Double]): Self = StObject.set(x, "getUsed", value.toJsFn)
    
    inline def setHalt(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "halt", value.toJsFn)
    
    inline def setHaltUndefined: Self = StObject.set(x, "halt", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setSetShardLimits(value: CPUShardLimits => OK | ERR_BUSY | ERR_INVALID_ARGS): Self = StObject.set(x, "setShardLimits", js.Any.fromFunction1(value))
    
    inline def setShardLimits(value: CPUShardLimits): Self = StObject.set(x, "shardLimits", value.asInstanceOf[js.Any])
    
    inline def setTickLimit(value: Double): Self = StObject.set(x, "tickLimit", value.asInstanceOf[js.Any])
    
    inline def setUnlock(value: CallbackTo[OK | ERR_NOT_ENOUGH_RESOURCES | ERR_FULL]): Self = StObject.set(x, "unlock", value.toJsFn)
    
    inline def setUnlocked(value: Boolean): Self = StObject.set(x, "unlocked", value.asInstanceOf[js.Any])
    
    inline def setUnlockedTime(value: Double): Self = StObject.set(x, "unlockedTime", value.asInstanceOf[js.Any])
    
    inline def setUnlockedTimeUndefined: Self = StObject.set(x, "unlockedTime", js.undefined)
  }
}
