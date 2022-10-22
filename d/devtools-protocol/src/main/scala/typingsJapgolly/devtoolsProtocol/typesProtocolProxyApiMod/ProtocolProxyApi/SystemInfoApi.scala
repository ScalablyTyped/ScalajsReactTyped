package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.mod.Protocol.SystemInfo.GetInfoResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.SystemInfo.GetProcessInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoApi extends StObject {
  
  /**
    * Returns information about the system.
    */
  def getInfo(): js.Promise[GetInfoResponse]
  
  /**
    * Returns information about all running processes.
    */
  def getProcessInfo(): js.Promise[GetProcessInfoResponse]
}
object SystemInfoApi {
  
  inline def apply(
    getInfo: CallbackTo[js.Promise[GetInfoResponse]],
    getProcessInfo: CallbackTo[js.Promise[GetProcessInfoResponse]]
  ): SystemInfoApi = {
    val __obj = js.Dynamic.literal(getInfo = getInfo.toJsFn, getProcessInfo = getProcessInfo.toJsFn)
    __obj.asInstanceOf[SystemInfoApi]
  }
  
  extension [Self <: SystemInfoApi](x: Self) {
    
    inline def setGetInfo(value: CallbackTo[js.Promise[GetInfoResponse]]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setGetProcessInfo(value: CallbackTo[js.Promise[GetProcessInfoResponse]]): Self = StObject.set(x, "getProcessInfo", value.toJsFn)
  }
}
