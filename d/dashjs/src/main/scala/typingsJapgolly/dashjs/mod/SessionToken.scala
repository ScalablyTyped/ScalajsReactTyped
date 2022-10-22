package typingsJapgolly.dashjs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.MediaKeySession
import typingsJapgolly.std.MediaKeyStatusMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionToken extends StObject {
  
  def getExpirationTime(): Double
  
  def getKeyStatuses(): MediaKeyStatusMap
  
  def getSessionId(): String
  
  def getSessionType(): String
  
  def getUsable(): Boolean
  
  var initData: Any
  
  var session: MediaKeySession
}
object SessionToken {
  
  inline def apply(
    getExpirationTime: CallbackTo[Double],
    getKeyStatuses: CallbackTo[MediaKeyStatusMap],
    getSessionId: CallbackTo[String],
    getSessionType: CallbackTo[String],
    getUsable: CallbackTo[Boolean],
    initData: Any,
    session: MediaKeySession
  ): SessionToken = {
    val __obj = js.Dynamic.literal(getExpirationTime = getExpirationTime.toJsFn, getKeyStatuses = getKeyStatuses.toJsFn, getSessionId = getSessionId.toJsFn, getSessionType = getSessionType.toJsFn, getUsable = getUsable.toJsFn, initData = initData.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionToken]
  }
  
  extension [Self <: SessionToken](x: Self) {
    
    inline def setGetExpirationTime(value: CallbackTo[Double]): Self = StObject.set(x, "getExpirationTime", value.toJsFn)
    
    inline def setGetKeyStatuses(value: CallbackTo[MediaKeyStatusMap]): Self = StObject.set(x, "getKeyStatuses", value.toJsFn)
    
    inline def setGetSessionId(value: CallbackTo[String]): Self = StObject.set(x, "getSessionId", value.toJsFn)
    
    inline def setGetSessionType(value: CallbackTo[String]): Self = StObject.set(x, "getSessionType", value.toJsFn)
    
    inline def setGetUsable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUsable", value.toJsFn)
    
    inline def setInitData(value: Any): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    inline def setSession(value: MediaKeySession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
