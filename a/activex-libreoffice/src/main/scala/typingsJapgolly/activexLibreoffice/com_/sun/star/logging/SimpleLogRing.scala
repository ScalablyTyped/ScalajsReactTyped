package typingsJapgolly.activexLibreoffice.com_.sun.star.logging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service allows to log the events in a ring of specified size.
  * @since OOo 3.2
  */
trait SimpleLogRing
  extends StObject
     with XSimpleLogRing {
  
  /** creates a ring of default size - 256 messages */
  def create(): Unit
  
  /**
    * creates a ring of specified size
    * @param nSize the number of messages in a ring
    */
  def createWithSize(nSize: Double): Unit
}
object SimpleLogRing {
  
  inline def apply(
    CollectedLog: SafeArray[String],
    create: Callback,
    createWithSize: Double => Callback,
    getCollectedLog: CallbackTo[SafeArray[String]],
    logString: String => Callback
  ): SimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog.asInstanceOf[js.Any], create = create.toJsFn, createWithSize = js.Any.fromFunction1((t0: Double) => createWithSize(t0).runNow()), getCollectedLog = getCollectedLog.toJsFn, logString = js.Any.fromFunction1((t0: String) => logString(t0).runNow()))
    __obj.asInstanceOf[SimpleLogRing]
  }
  
  extension [Self <: SimpleLogRing](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setCreateWithSize(value: Double => Callback): Self = StObject.set(x, "createWithSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
