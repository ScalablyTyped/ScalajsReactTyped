package typingsJapgolly.devexpressUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassBatchUpdatableMod {
  
  /* note: abstract class */ @JSImport("@devexpress/utils/lib/class/batch-updatable", "BatchUpdatableObject")
  @js.native
  open class BatchUpdatableObject ()
    extends StObject
       with IBatchUpdatableObjectExtend {
    
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def continueUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def endUpdate(): Unit = js.native
    
    def isLocked(): Boolean = js.native
    
    /* CompleteClass */
    override def isUpdateLocked(): Boolean = js.native
    
    /* private */ var occurredEvents: Any = js.native
    
    /* CompleteClass */
    override def onUpdateLocked(): Unit = js.native
    
    def onUpdateUnlocked(occurredEvents: Double): Unit = js.native
    
    def registerOccurredEvent(eventMask: Double): Unit = js.native
    
    def resetOccurredEvents(): Unit = js.native
    
    /* CompleteClass */
    override def suspendUpdate(): Unit = js.native
    
    /* private */ var suspendUpdateCount: Any = js.native
  }
  
  @JSImport("@devexpress/utils/lib/class/batch-updatable", "EmptyBatchUpdatableObject")
  @js.native
  open class EmptyBatchUpdatableObject ()
    extends StObject
       with IBatchUpdatableObject {
    
    /* CompleteClass */
    override def beginUpdate(): Unit = js.native
    
    /* CompleteClass */
    override def endUpdate(): Unit = js.native
  }
  
  trait IBatchUpdatableObject extends StObject {
    
    def beginUpdate(): Unit
    
    def endUpdate(): Unit
  }
  object IBatchUpdatableObject {
    
    inline def apply(beginUpdate: Callback, endUpdate: Callback): IBatchUpdatableObject = {
      val __obj = js.Dynamic.literal(beginUpdate = beginUpdate.toJsFn, endUpdate = endUpdate.toJsFn)
      __obj.asInstanceOf[IBatchUpdatableObject]
    }
    
    extension [Self <: IBatchUpdatableObject](x: Self) {
      
      inline def setBeginUpdate(value: Callback): Self = StObject.set(x, "beginUpdate", value.toJsFn)
      
      inline def setEndUpdate(value: Callback): Self = StObject.set(x, "endUpdate", value.toJsFn)
    }
  }
  
  trait IBatchUpdatableObjectExtend
    extends StObject
       with IBatchUpdatableObject {
    
    def continueUpdate(): Unit
    
    def isUpdateLocked(): Boolean
    
    def onUpdateLocked(): Unit
    
    def suspendUpdate(): Unit
  }
  object IBatchUpdatableObjectExtend {
    
    inline def apply(
      beginUpdate: Callback,
      continueUpdate: Callback,
      endUpdate: Callback,
      isUpdateLocked: CallbackTo[Boolean],
      onUpdateLocked: Callback,
      suspendUpdate: Callback
    ): IBatchUpdatableObjectExtend = {
      val __obj = js.Dynamic.literal(beginUpdate = beginUpdate.toJsFn, continueUpdate = continueUpdate.toJsFn, endUpdate = endUpdate.toJsFn, isUpdateLocked = isUpdateLocked.toJsFn, onUpdateLocked = onUpdateLocked.toJsFn, suspendUpdate = suspendUpdate.toJsFn)
      __obj.asInstanceOf[IBatchUpdatableObjectExtend]
    }
    
    extension [Self <: IBatchUpdatableObjectExtend](x: Self) {
      
      inline def setContinueUpdate(value: Callback): Self = StObject.set(x, "continueUpdate", value.toJsFn)
      
      inline def setIsUpdateLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUpdateLocked", value.toJsFn)
      
      inline def setOnUpdateLocked(value: Callback): Self = StObject.set(x, "onUpdateLocked", value.toJsFn)
      
      inline def setSuspendUpdate(value: Callback): Self = StObject.set(x, "suspendUpdate", value.toJsFn)
    }
  }
}
