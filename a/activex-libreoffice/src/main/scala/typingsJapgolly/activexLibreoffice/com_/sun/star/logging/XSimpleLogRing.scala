package typingsJapgolly.activexLibreoffice.com_.sun.star.logging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a simple log ring allowing to collect a limited number of last events
  *
  * The intention of this interface is to provide a simple possibility for developer to collect the most important events without affecting the
  * performance. For this reasons the messages related API is quite simple, the strings should be produced by the preprocessor mainly.
  * @since OOo 3.2
  */
trait XSimpleLogRing extends StObject {
  
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  val CollectedLog: SafeArray[String]
  
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  def getCollectedLog(): SafeArray[String]
  
  /** allows to add a message to the logger */
  def logString(aMessage: String): Unit
}
object XSimpleLogRing {
  
  inline def apply(
    CollectedLog: SafeArray[String],
    getCollectedLog: CallbackTo[SafeArray[String]],
    logString: String => Callback
  ): XSimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog.asInstanceOf[js.Any], getCollectedLog = getCollectedLog.toJsFn, logString = js.Any.fromFunction1((t0: String) => logString(t0).runNow()))
    __obj.asInstanceOf[XSimpleLogRing]
  }
  
  extension [Self <: XSimpleLogRing](x: Self) {
    
    inline def setCollectedLog(value: SafeArray[String]): Self = StObject.set(x, "CollectedLog", value.asInstanceOf[js.Any])
    
    inline def setGetCollectedLog(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getCollectedLog", value.toJsFn)
    
    inline def setLogString(value: String => Callback): Self = StObject.set(x, "logString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
