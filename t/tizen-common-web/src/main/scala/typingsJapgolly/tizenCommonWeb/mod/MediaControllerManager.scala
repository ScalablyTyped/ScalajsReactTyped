package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerManager extends StObject {
  
  /**
    * Creates the Server object which holds playback state, meta data
    * and is controlled by Client.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/mediacontroller.server
    *
    * @returns The _MediaController Server_ object.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def createServer(): MediaControllerServer
  
  /**
    * Gets the client object. If not exist, client will be automatically created.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/mediacontroller.client
    *
    * @returns The _MediaController Client_ object.
    *
    * @throw WebAPIException with error type NotSupportedError, if this feature is not supported.
    * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def getClient(): MediaControllerClient
}
object MediaControllerManager {
  
  inline def apply(createServer: CallbackTo[MediaControllerServer], getClient: CallbackTo[MediaControllerClient]): MediaControllerManager = {
    val __obj = js.Dynamic.literal(createServer = createServer.toJsFn, getClient = getClient.toJsFn)
    __obj.asInstanceOf[MediaControllerManager]
  }
  
  extension [Self <: MediaControllerManager](x: Self) {
    
    inline def setCreateServer(value: CallbackTo[MediaControllerServer]): Self = StObject.set(x, "createServer", value.toJsFn)
    
    inline def setGetClient(value: CallbackTo[MediaControllerClient]): Self = StObject.set(x, "getClient", value.toJsFn)
  }
}
