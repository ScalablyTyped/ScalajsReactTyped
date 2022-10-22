package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISessionChannel extends StObject {
  
  def onSession(session: Session): Any
  
  def sendSession(session: Session): Unit
}
object ISessionChannel {
  
  inline def apply(onSession: Session => Any, sendSession: Session => Callback): ISessionChannel = {
    val __obj = js.Dynamic.literal(onSession = js.Any.fromFunction1(onSession), sendSession = js.Any.fromFunction1((t0: Session) => sendSession(t0).runNow()))
    __obj.asInstanceOf[ISessionChannel]
  }
  
  extension [Self <: ISessionChannel](x: Self) {
    
    inline def setOnSession(value: Session => Any): Self = StObject.set(x, "onSession", js.Any.fromFunction1(value))
    
    inline def setSendSession(value: Session => Callback): Self = StObject.set(x, "sendSession", js.Any.fromFunction1((t0: Session) => value(t0).runNow()))
  }
}
