package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.client
  */
trait Client extends StObject {
  
  /**
    * Whether this control should disable its scrolling capabilities.
    */
  var disableScroll: Boolean
  
  /**
    * Returns a value to indicate which client the script is executing in.
    * Web: Web application, or Unified Interface
    * Outlook: Outlook
    * Mobile: Mobile app
    */
  def getClient(): String
  
  /**
    * Device form factor.
    * Unknown = 0
    * Desktop = 1
    * Tablet = 2
    * Phone = 3
    */
  def getFormFactor(): Double
  
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean
}
object Client {
  
  inline def apply(
    disableScroll: Boolean,
    getClient: CallbackTo[String],
    getFormFactor: CallbackTo[Double],
    isOffline: CallbackTo[Boolean]
  ): Client = {
    val __obj = js.Dynamic.literal(disableScroll = disableScroll.asInstanceOf[js.Any], getClient = getClient.toJsFn, getFormFactor = getFormFactor.toJsFn, isOffline = isOffline.toJsFn)
    __obj.asInstanceOf[Client]
  }
  
  extension [Self <: Client](x: Self) {
    
    inline def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
    
    inline def setGetClient(value: CallbackTo[String]): Self = StObject.set(x, "getClient", value.toJsFn)
    
    inline def setGetFormFactor(value: CallbackTo[Double]): Self = StObject.set(x, "getFormFactor", value.toJsFn)
    
    inline def setIsOffline(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOffline", value.toJsFn)
  }
}
