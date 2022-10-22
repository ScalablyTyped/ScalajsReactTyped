package typingsJapgolly.mqtt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibMessageIdProviderMod {
  
  trait IMessageIdProvider extends StObject {
    
    /**
      * Allocate the first vacant messageId. The messageId become occupied status.
      * @return {Number} - The first vacant messageId. If all messageIds are occupied, return null.
      */
    def allocate(): Number | Null
    
    /**
      * Clear all occupied messageIds.
      * The all messageIds are set to vacant status.
      */
    def clear(): Unit
    
    /**
      * Deallocate the messageId. The messageId become vacant status.
      * @param {Number} num - The messageId to deallocate. The messageId must be occupied status.
      *                       In other words, the messageId must be allocated by allocate() or
      *                       occupied by register().
      */
    def deallocate(num: Number): Unit
    
    /**
      * Get the last allocated messageId.
      * @return {Number} - messageId.
      */
    def getLastAllocated(): Number | Null
    
    /**
      * Register the messageId. The messageId become occupied status.
      * If the messageId has already been occupied, then return false.
      * @param {Number} num - The messageId to request use.
      * @return {Boolean} - If `num` was not occupied, then return true, otherwise return false.
      */
    def register(num: Number): Boolean
  }
  object IMessageIdProvider {
    
    inline def apply(
      allocate: CallbackTo[Number | Null],
      clear: Callback,
      deallocate: Number => Callback,
      getLastAllocated: CallbackTo[Number | Null],
      register: Number => Boolean
    ): IMessageIdProvider = {
      val __obj = js.Dynamic.literal(allocate = allocate.toJsFn, clear = clear.toJsFn, deallocate = js.Any.fromFunction1((t0: Number) => deallocate(t0).runNow()), getLastAllocated = getLastAllocated.toJsFn, register = js.Any.fromFunction1(register))
      __obj.asInstanceOf[IMessageIdProvider]
    }
    
    extension [Self <: IMessageIdProvider](x: Self) {
      
      inline def setAllocate(value: CallbackTo[Number | Null]): Self = StObject.set(x, "allocate", value.toJsFn)
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setDeallocate(value: Number => Callback): Self = StObject.set(x, "deallocate", js.Any.fromFunction1((t0: Number) => value(t0).runNow()))
      
      inline def setGetLastAllocated(value: CallbackTo[Number | Null]): Self = StObject.set(x, "getLastAllocated", value.toJsFn)
      
      inline def setRegister(value: Number => Boolean): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
}
