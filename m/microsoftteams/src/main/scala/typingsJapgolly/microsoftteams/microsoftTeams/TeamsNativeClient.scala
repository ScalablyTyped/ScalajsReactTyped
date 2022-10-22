package typingsJapgolly.microsoftteams.microsoftTeams

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  */
trait TeamsNativeClient extends StObject {
  
  def framelessPostMessage(msg: String): Unit
}
object TeamsNativeClient {
  
  inline def apply(framelessPostMessage: String => Callback): TeamsNativeClient = {
    val __obj = js.Dynamic.literal(framelessPostMessage = js.Any.fromFunction1((t0: String) => framelessPostMessage(t0).runNow()))
    __obj.asInstanceOf[TeamsNativeClient]
  }
  
  extension [Self <: TeamsNativeClient](x: Self) {
    
    inline def setFramelessPostMessage(value: String => Callback): Self = StObject.set(x, "framelessPostMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
