package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance of an ad.
  */
trait AdInstance extends StObject {
  
  /**
    * Return the Audience Network placement ID of this ad instance.
    */
  def getPlacementID(): String
  
  /**
    * Preload the ad. The returned promise resolves when the preload completes, and rejects if it failed.
    * @throws ADS_FREQUENT_LOAD
    * @throws ADS_NO_FILL
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    */
  def loadAsync(): js.Promise[Unit]
  
  /**
    * Present the ad. The returned promise resolves when user finished watching the ad, and rejects if it failed to present or was closed during the ad.
    * @throws ADS_NOT_LOADED
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws INVALID_OPERATION
    */
  def showAsync(): js.Promise[Unit]
}
object AdInstance {
  
  inline def apply(
    getPlacementID: CallbackTo[String],
    loadAsync: CallbackTo[js.Promise[Unit]],
    showAsync: CallbackTo[js.Promise[Unit]]
  ): AdInstance = {
    val __obj = js.Dynamic.literal(getPlacementID = getPlacementID.toJsFn, loadAsync = loadAsync.toJsFn, showAsync = showAsync.toJsFn)
    __obj.asInstanceOf[AdInstance]
  }
  
  extension [Self <: AdInstance](x: Self) {
    
    inline def setGetPlacementID(value: CallbackTo[String]): Self = StObject.set(x, "getPlacementID", value.toJsFn)
    
    inline def setLoadAsync(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "loadAsync", value.toJsFn)
    
    inline def setShowAsync(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "showAsync", value.toJsFn)
  }
}
