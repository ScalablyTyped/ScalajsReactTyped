package typingsJapgolly.mparticleWebSdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  def getAllUserAttributes(): AllUserAttributes
  
  /**
    *
    * @deprecated Cart persistence in mParticle has been deprecated
    */
  def getCart(): Cart
  
  def getConsentState(): ConsentState
  
  def getFirstSeenTime(): Double
  
  def getLastSeenTime(): Double
  
  def getMPID(): MPID
  
  def getUserAttributesLists(): Record[String, js.Array[UserAttributesValue]]
  
  def getUserIdentities(): IdentityApiData
  
  def isLoggedIn(): Boolean
  
  def removeAllUserAttributes(): Unit
  
  def removeUserAttribute(key: String): Unit
  
  def removeUserTag(tag: String): Unit
  
  def setConsentState(ConsentState: ConsentState): Unit
  
  def setUserAttribute(key: String, value: String): Unit
  
  def setUserAttributeList(key: String, value: js.Array[UserAttributesValue]): Unit
  
  def setUserAttributes(attributeObject: Record[String, Any]): Unit
  
  def setUserTag(tag: String): Unit
}
object User {
  
  inline def apply(
    getAllUserAttributes: CallbackTo[AllUserAttributes],
    getCart: CallbackTo[Cart],
    getConsentState: CallbackTo[ConsentState],
    getFirstSeenTime: CallbackTo[Double],
    getLastSeenTime: CallbackTo[Double],
    getMPID: CallbackTo[MPID],
    getUserAttributesLists: CallbackTo[Record[String, js.Array[UserAttributesValue]]],
    getUserIdentities: CallbackTo[IdentityApiData],
    isLoggedIn: CallbackTo[Boolean],
    removeAllUserAttributes: japgolly.scalajs.react.Callback,
    removeUserAttribute: String => japgolly.scalajs.react.Callback,
    removeUserTag: String => japgolly.scalajs.react.Callback,
    setConsentState: ConsentState => japgolly.scalajs.react.Callback,
    setUserAttribute: (String, String) => japgolly.scalajs.react.Callback,
    setUserAttributeList: (String, js.Array[UserAttributesValue]) => japgolly.scalajs.react.Callback,
    setUserAttributes: Record[String, Any] => japgolly.scalajs.react.Callback,
    setUserTag: String => japgolly.scalajs.react.Callback
  ): User = {
    val __obj = js.Dynamic.literal(getAllUserAttributes = getAllUserAttributes.toJsFn, getCart = getCart.toJsFn, getConsentState = getConsentState.toJsFn, getFirstSeenTime = getFirstSeenTime.toJsFn, getLastSeenTime = getLastSeenTime.toJsFn, getMPID = getMPID.toJsFn, getUserAttributesLists = getUserAttributesLists.toJsFn, getUserIdentities = getUserIdentities.toJsFn, isLoggedIn = isLoggedIn.toJsFn, removeAllUserAttributes = removeAllUserAttributes.toJsFn, removeUserAttribute = js.Any.fromFunction1((t0: String) => removeUserAttribute(t0).runNow()), removeUserTag = js.Any.fromFunction1((t0: String) => removeUserTag(t0).runNow()), setConsentState = js.Any.fromFunction1((t0: ConsentState) => setConsentState(t0).runNow()), setUserAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setUserAttribute(t0, t1)).runNow()), setUserAttributeList = js.Any.fromFunction2((t0: String, t1: js.Array[UserAttributesValue]) => (setUserAttributeList(t0, t1)).runNow()), setUserAttributes = js.Any.fromFunction1((t0: Record[String, Any]) => setUserAttributes(t0).runNow()), setUserTag = js.Any.fromFunction1((t0: String) => setUserTag(t0).runNow()))
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setGetAllUserAttributes(value: CallbackTo[AllUserAttributes]): Self = StObject.set(x, "getAllUserAttributes", value.toJsFn)
    
    inline def setGetCart(value: CallbackTo[Cart]): Self = StObject.set(x, "getCart", value.toJsFn)
    
    inline def setGetConsentState(value: CallbackTo[ConsentState]): Self = StObject.set(x, "getConsentState", value.toJsFn)
    
    inline def setGetFirstSeenTime(value: CallbackTo[Double]): Self = StObject.set(x, "getFirstSeenTime", value.toJsFn)
    
    inline def setGetLastSeenTime(value: CallbackTo[Double]): Self = StObject.set(x, "getLastSeenTime", value.toJsFn)
    
    inline def setGetMPID(value: CallbackTo[MPID]): Self = StObject.set(x, "getMPID", value.toJsFn)
    
    inline def setGetUserAttributesLists(value: CallbackTo[Record[String, js.Array[UserAttributesValue]]]): Self = StObject.set(x, "getUserAttributesLists", value.toJsFn)
    
    inline def setGetUserIdentities(value: CallbackTo[IdentityApiData]): Self = StObject.set(x, "getUserIdentities", value.toJsFn)
    
    inline def setIsLoggedIn(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoggedIn", value.toJsFn)
    
    inline def setRemoveAllUserAttributes(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeAllUserAttributes", value.toJsFn)
    
    inline def setRemoveUserAttribute(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeUserAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveUserTag(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeUserTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetConsentState(value: ConsentState => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setConsentState", js.Any.fromFunction1((t0: ConsentState) => value(t0).runNow()))
    
    inline def setSetUserAttribute(value: (String, String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setUserAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetUserAttributeList(value: (String, js.Array[UserAttributesValue]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setUserAttributeList", js.Any.fromFunction2((t0: String, t1: js.Array[UserAttributesValue]) => (value(t0, t1)).runNow()))
    
    inline def setSetUserAttributes(value: Record[String, Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setUserAttributes", js.Any.fromFunction1((t0: Record[String, Any]) => value(t0).runNow()))
    
    inline def setSetUserTag(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setUserTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
