package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideUser extends StObject {
  
  def getCompanyID(): String
  
  def getDisplayName(): String
  
  def getDomainID(): String
  
  def getEmail(): String
  
  def getFirstName(): String
  
  def getID(): String
  
  def getLastName(): String
  
  def getName(): String
  
  def getPreference(name: String): String
  
  def getRoles(): js.Array[String]
  
  def getUserRoles(): js.Array[String]
  
  def hasRole(role: String): Boolean
  
  def isMemberOf(group: String): Boolean
  
  def savePreference(name: String, value: String): Unit
}
object GlideUser {
  
  inline def apply(
    getCompanyID: CallbackTo[String],
    getDisplayName: CallbackTo[String],
    getDomainID: CallbackTo[String],
    getEmail: CallbackTo[String],
    getFirstName: CallbackTo[String],
    getID: CallbackTo[String],
    getLastName: CallbackTo[String],
    getName: CallbackTo[String],
    getPreference: String => String,
    getRoles: CallbackTo[js.Array[String]],
    getUserRoles: CallbackTo[js.Array[String]],
    hasRole: String => Boolean,
    isMemberOf: String => Boolean,
    savePreference: (String, String) => Callback
  ): GlideUser = {
    val __obj = js.Dynamic.literal(getCompanyID = getCompanyID.toJsFn, getDisplayName = getDisplayName.toJsFn, getDomainID = getDomainID.toJsFn, getEmail = getEmail.toJsFn, getFirstName = getFirstName.toJsFn, getID = getID.toJsFn, getLastName = getLastName.toJsFn, getName = getName.toJsFn, getPreference = js.Any.fromFunction1(getPreference), getRoles = getRoles.toJsFn, getUserRoles = getUserRoles.toJsFn, hasRole = js.Any.fromFunction1(hasRole), isMemberOf = js.Any.fromFunction1(isMemberOf), savePreference = js.Any.fromFunction2((t0: String, t1: String) => (savePreference(t0, t1)).runNow()))
    __obj.asInstanceOf[GlideUser]
  }
  
  extension [Self <: GlideUser](x: Self) {
    
    inline def setGetCompanyID(value: CallbackTo[String]): Self = StObject.set(x, "getCompanyID", value.toJsFn)
    
    inline def setGetDisplayName(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayName", value.toJsFn)
    
    inline def setGetDomainID(value: CallbackTo[String]): Self = StObject.set(x, "getDomainID", value.toJsFn)
    
    inline def setGetEmail(value: CallbackTo[String]): Self = StObject.set(x, "getEmail", value.toJsFn)
    
    inline def setGetFirstName(value: CallbackTo[String]): Self = StObject.set(x, "getFirstName", value.toJsFn)
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
    
    inline def setGetLastName(value: CallbackTo[String]): Self = StObject.set(x, "getLastName", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPreference(value: String => String): Self = StObject.set(x, "getPreference", js.Any.fromFunction1(value))
    
    inline def setGetRoles(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getRoles", value.toJsFn)
    
    inline def setGetUserRoles(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getUserRoles", value.toJsFn)
    
    inline def setHasRole(value: String => Boolean): Self = StObject.set(x, "hasRole", js.Any.fromFunction1(value))
    
    inline def setIsMemberOf(value: String => Boolean): Self = StObject.set(x, "isMemberOf", js.Any.fromFunction1(value))
    
    inline def setSavePreference(value: (String, String) => Callback): Self = StObject.set(x, "savePreference", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
