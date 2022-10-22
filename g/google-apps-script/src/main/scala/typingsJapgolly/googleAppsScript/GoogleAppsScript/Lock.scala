package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lock {
  
  /**
    * A representation of a mutual-exclusion lock.
    *
    * This class allows scripts to make sure that only one instance of the script is executing a
    * given section of code at a time. This is particularly useful for callbacks and triggers, where a
    * user action may cause changes to a shared resource and you want to ensure that aren't collisions.
    *
    * The following examples shows how to use a lock in a form submit handler.
    *
    *     // Generates a unique ticket number for every form submission.
    *     function onFormSubmit(e) {
    *       var targetCell = e.range.offset(0, e.range.getNumColumns(), 1, 1);
    *
    *       // Get a script lock, because we're about to modify a shared resource.
    *       var lock = LockService.getScriptLock();
    *       // Wait for up to 30 seconds for other processes to finish.
    *       lock.waitLock(30000);
    *
    *       var ticketNumber = Number(ScriptProperties.getProperty('lastTicketNumber')) + 1;
    *       ScriptProperties.setProperty('lastTicketNumber', ticketNumber);
    *
    *       // Release the lock so that other processes can continue.
    *       lock.releaseLock();
    *
    *       targetCell.setValue(ticketNumber);
    *     }
    *
    * lastTicketNumber
    * ScriptProperties
    */
  trait Lock extends StObject {
    
    def hasLock(): Boolean
    
    def releaseLock(): Unit
    
    def tryLock(timeoutInMillis: Integer): Boolean
    
    def waitLock(timeoutInMillis: Integer): Unit
  }
  object Lock {
    
    inline def apply(
      hasLock: CallbackTo[Boolean],
      releaseLock: Callback,
      tryLock: Integer => Boolean,
      waitLock: Integer => Callback
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock = {
      val __obj = js.Dynamic.literal(hasLock = hasLock.toJsFn, releaseLock = releaseLock.toJsFn, tryLock = js.Any.fromFunction1(tryLock), waitLock = js.Any.fromFunction1((t0: Integer) => waitLock(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock](x: Self) {
      
      inline def setHasLock(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLock", value.toJsFn)
      
      inline def setReleaseLock(value: Callback): Self = StObject.set(x, "releaseLock", value.toJsFn)
      
      inline def setTryLock(value: Integer => Boolean): Self = StObject.set(x, "tryLock", js.Any.fromFunction1(value))
      
      inline def setWaitLock(value: Integer => Callback): Self = StObject.set(x, "waitLock", js.Any.fromFunction1((t0: Integer) => value(t0).runNow()))
    }
  }
  
  /**
    * Prevents concurrent access to sections of code. This can be useful when you have multiple users
    * or processes modifying a shared resource and want to prevent collisions.
    */
  trait LockService extends StObject {
    
    def getDocumentLock(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock
    
    def getScriptLock(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock
    
    def getUserLock(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock
  }
  object LockService {
    
    inline def apply(
      getDocumentLock: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock],
      getScriptLock: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock],
      getUserLock: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock]
    ): LockService = {
      val __obj = js.Dynamic.literal(getDocumentLock = getDocumentLock.toJsFn, getScriptLock = getScriptLock.toJsFn, getUserLock = getUserLock.toJsFn)
      __obj.asInstanceOf[LockService]
    }
    
    extension [Self <: LockService](x: Self) {
      
      inline def setGetDocumentLock(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock]): Self = StObject.set(x, "getDocumentLock", value.toJsFn)
      
      inline def setGetScriptLock(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock]): Self = StObject.set(x, "getScriptLock", value.toJsFn)
      
      inline def setGetUserLock(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Lock.Lock]): Self = StObject.set(x, "getUserLock", value.toJsFn)
    }
  }
}
