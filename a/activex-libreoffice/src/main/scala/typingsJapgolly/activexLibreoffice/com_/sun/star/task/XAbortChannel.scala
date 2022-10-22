package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Use this interface to abort a command asynchronously. For example, have a look at {@link com.sun.star.deployment.XPackageManager} . */
trait XAbortChannel extends StObject {
  
  /** sends an abort notification to all commands associated with this channel. */
  def sendAbort(): Unit
}
object XAbortChannel {
  
  inline def apply(sendAbort: Callback): XAbortChannel = {
    val __obj = js.Dynamic.literal(sendAbort = sendAbort.toJsFn)
    __obj.asInstanceOf[XAbortChannel]
  }
  
  extension [Self <: XAbortChannel](x: Self) {
    
    inline def setSendAbort(value: Callback): Self = StObject.set(x, "sendAbort", value.toJsFn)
  }
}
