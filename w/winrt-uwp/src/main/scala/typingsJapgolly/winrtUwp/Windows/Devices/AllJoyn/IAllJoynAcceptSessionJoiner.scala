package typingsJapgolly.winrtUwp.Windows.Devices.AllJoyn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Use this interface to accept requests from peers to join a session. */
trait IAllJoynAcceptSessionJoiner extends StObject {
  
  /** Accept an incoming request to join the session. */
  def accept(): Unit
}
object IAllJoynAcceptSessionJoiner {
  
  inline def apply(accept: Callback): IAllJoynAcceptSessionJoiner = {
    val __obj = js.Dynamic.literal(accept = accept.toJsFn)
    __obj.asInstanceOf[IAllJoynAcceptSessionJoiner]
  }
  
  extension [Self <: IAllJoynAcceptSessionJoiner](x: Self) {
    
    inline def setAccept(value: Callback): Self = StObject.set(x, "accept", value.toJsFn)
  }
}
