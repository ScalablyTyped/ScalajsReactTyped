package typingsJapgolly.winrtUwp.Windows.Devices.SmartCards

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents info about, and operations for, configuring smart cards. */
trait SmartCardProvisioning extends StObject {
  
  var getAuthorityKeyContainerNameAsync: Any
  
  /* unmapped type */
  /**
    * Returns a smart card's authentication challenge/response context.
    * @return After the asynchronous operation completes, returns an instance of SmartCardChalllengeContext , representing the smart card's authentication challenge/response context.
    */
  def getChallengeContextAsync(): IPromiseWithIAsyncOperation[SmartCardChallengeContext]
  
  /**
    * Returns the smart card's ID.
    * @return After the asynchronous operation completes, returns the smart card's ID.
    */
  def getIdAsync(): IPromiseWithIAsyncOperation[String]
  
  /**
    * Returns the smart card's minidriver name.
    * @return After the asynchronous operation completes, returns the smart card's name.
    */
  def getNameAsync(): IPromiseWithIAsyncOperation[String]
  
  /**
    * Changes a smart card's personal identification number (PIN).
    * @return After the smart card PIN change attempt completes, returns true if the smart card's PIN was successfully changed; otherwise false.
    */
  def requestPinChangeAsync(): IPromiseWithIAsyncOperation[Boolean]
  
  /**
    * Resets a smart card's personal identification number (PIN).
    * @param handler The method that handles the smart card PIN reset.
    * @return After the smart card PIN reset attempt completes, returns true if the smart card's PIN was successfully reset; otherwise false.
    */
  def requestPinResetAsync(handler: SmartCardPinResetHandler): IPromiseWithIAsyncOperation[Boolean]
  
  /** Gets the configured smart card. */
  var smartCard: SmartCard
}
object SmartCardProvisioning {
  
  inline def apply(
    getAuthorityKeyContainerNameAsync: Any,
    getChallengeContextAsync: CallbackTo[IPromiseWithIAsyncOperation[SmartCardChallengeContext]],
    getIdAsync: CallbackTo[IPromiseWithIAsyncOperation[String]],
    getNameAsync: CallbackTo[IPromiseWithIAsyncOperation[String]],
    requestPinChangeAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]],
    requestPinResetAsync: SmartCardPinResetHandler => IPromiseWithIAsyncOperation[Boolean],
    smartCard: SmartCard
  ): SmartCardProvisioning = {
    val __obj = js.Dynamic.literal(getAuthorityKeyContainerNameAsync = getAuthorityKeyContainerNameAsync.asInstanceOf[js.Any], getChallengeContextAsync = getChallengeContextAsync.toJsFn, getIdAsync = getIdAsync.toJsFn, getNameAsync = getNameAsync.toJsFn, requestPinChangeAsync = requestPinChangeAsync.toJsFn, requestPinResetAsync = js.Any.fromFunction1(requestPinResetAsync), smartCard = smartCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartCardProvisioning]
  }
  
  extension [Self <: SmartCardProvisioning](x: Self) {
    
    inline def setGetAuthorityKeyContainerNameAsync(value: Any): Self = StObject.set(x, "getAuthorityKeyContainerNameAsync", value.asInstanceOf[js.Any])
    
    inline def setGetChallengeContextAsync(value: CallbackTo[IPromiseWithIAsyncOperation[SmartCardChallengeContext]]): Self = StObject.set(x, "getChallengeContextAsync", value.toJsFn)
    
    inline def setGetIdAsync(value: CallbackTo[IPromiseWithIAsyncOperation[String]]): Self = StObject.set(x, "getIdAsync", value.toJsFn)
    
    inline def setGetNameAsync(value: CallbackTo[IPromiseWithIAsyncOperation[String]]): Self = StObject.set(x, "getNameAsync", value.toJsFn)
    
    inline def setRequestPinChangeAsync(value: CallbackTo[IPromiseWithIAsyncOperation[Boolean]]): Self = StObject.set(x, "requestPinChangeAsync", value.toJsFn)
    
    inline def setRequestPinResetAsync(value: SmartCardPinResetHandler => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "requestPinResetAsync", js.Any.fromFunction1(value))
    
    inline def setSmartCard(value: SmartCard): Self = StObject.set(x, "smartCard", value.asInstanceOf[js.Any])
  }
}
