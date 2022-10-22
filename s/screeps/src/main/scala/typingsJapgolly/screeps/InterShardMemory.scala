package typingsJapgolly.screeps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `InterShardMemory` object provides an interface for communicating between shards.
  * Your script is executed separatedly on each shard, and their `Memory` objects are isolated from each other.
  * In order to pass messages and data between shards, you need to use `InterShardMemory` instead.
  *
  * Every shard can have its own data string that can be accessed by all other shards.
  * A shard can write only to its own data, other shards' data is read-only.
  *
  * This data has nothing to do with `Memory` contents, it's a separate data container.
  */
trait InterShardMemory extends StObject {
  
  /**
    * Returns the string contents of the current shard's data.
    */
  def getLocal(): String
  
  /**
    * Returns the string contents of another shard's data, null if shard exists but data is not set.
    *
    * @param shard Shard name.
    * @throws Error if shard name is invalid
    */
  def getRemote(shard: String): String | Null
  
  /**
    * Replace the current shard's data with the new value
    * @param value New data value in string format.
    */
  def setLocal(value: String): Unit
}
object InterShardMemory {
  
  inline def apply(getLocal: CallbackTo[String], getRemote: String => String | Null, setLocal: String => Callback): InterShardMemory = {
    val __obj = js.Dynamic.literal(getLocal = getLocal.toJsFn, getRemote = js.Any.fromFunction1(getRemote), setLocal = js.Any.fromFunction1((t0: String) => setLocal(t0).runNow()))
    __obj.asInstanceOf[InterShardMemory]
  }
  
  extension [Self <: InterShardMemory](x: Self) {
    
    inline def setGetLocal(value: CallbackTo[String]): Self = StObject.set(x, "getLocal", value.toJsFn)
    
    inline def setGetRemote(value: String => String | Null): Self = StObject.set(x, "getRemote", js.Any.fromFunction1(value))
    
    inline def setSetLocal(value: String => Callback): Self = StObject.set(x, "setLocal", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
