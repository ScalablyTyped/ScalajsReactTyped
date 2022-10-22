package typingsJapgolly.xrm.Xrm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.XrmEnum.ClientFormFactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the client context.
  */
trait ClientContext extends StObject {
  
  /**
    * Returns a value to indicate which client the script is executing in.
    * @returns The client, as either "Web", "Outlook", or "Mobile"
    */
  def getClient(): Client
  
  /**
    * Gets client's current state.
    * @returns The client state, as either "Online" or "Offline"
    */
  def getClientState(): ClientState
  
  /**
    * Use this method to get information about the kind of device the user is using.
    */
  def getFormFactor(): ClientFormFactor
  
  /**
    * Returns information whether the network is available or not.
    */
  def isNetworkAvailable(): Boolean
  
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean
}
object ClientContext {
  
  inline def apply(
    getClient: CallbackTo[Client],
    getClientState: CallbackTo[ClientState],
    getFormFactor: CallbackTo[ClientFormFactor],
    isNetworkAvailable: CallbackTo[Boolean],
    isOffline: CallbackTo[Boolean]
  ): ClientContext = {
    val __obj = js.Dynamic.literal(getClient = getClient.toJsFn, getClientState = getClientState.toJsFn, getFormFactor = getFormFactor.toJsFn, isNetworkAvailable = isNetworkAvailable.toJsFn, isOffline = isOffline.toJsFn)
    __obj.asInstanceOf[ClientContext]
  }
  
  extension [Self <: ClientContext](x: Self) {
    
    inline def setGetClient(value: CallbackTo[Client]): Self = StObject.set(x, "getClient", value.toJsFn)
    
    inline def setGetClientState(value: CallbackTo[ClientState]): Self = StObject.set(x, "getClientState", value.toJsFn)
    
    inline def setGetFormFactor(value: CallbackTo[ClientFormFactor]): Self = StObject.set(x, "getFormFactor", value.toJsFn)
    
    inline def setIsNetworkAvailable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNetworkAvailable", value.toJsFn)
    
    inline def setIsOffline(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOffline", value.toJsFn)
  }
}
