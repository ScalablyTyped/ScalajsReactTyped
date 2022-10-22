package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideUser extends StObject {
  
  def getCompanyID(): String
  
  def getDisplayName(): String
  
  def getID(): String
  
  def getName(): String
  
  def getPreference(name: String): String
  
  def hasRole(role: String): Boolean
  
  def isMemberOf(group: String): Boolean
  
  def savePreference(name: String, value: String): Unit
}
object GlideUser {
  
  inline def apply(
    getCompanyID: CallbackTo[String],
    getDisplayName: CallbackTo[String],
    getID: CallbackTo[String],
    getName: CallbackTo[String],
    getPreference: String => String,
    hasRole: String => Boolean,
    isMemberOf: String => Boolean,
    savePreference: (String, String) => Callback
  ): GlideUser = {
    val __obj = js.Dynamic.literal(getCompanyID = getCompanyID.toJsFn, getDisplayName = getDisplayName.toJsFn, getID = getID.toJsFn, getName = getName.toJsFn, getPreference = js.Any.fromFunction1(getPreference), hasRole = js.Any.fromFunction1(hasRole), isMemberOf = js.Any.fromFunction1(isMemberOf), savePreference = js.Any.fromFunction2((t0: String, t1: String) => (savePreference(t0, t1)).runNow()))
    __obj.asInstanceOf[GlideUser]
  }
  
  extension [Self <: GlideUser](x: Self) {
    
    inline def setGetCompanyID(value: CallbackTo[String]): Self = StObject.set(x, "getCompanyID", value.toJsFn)
    
    inline def setGetDisplayName(value: CallbackTo[String]): Self = StObject.set(x, "getDisplayName", value.toJsFn)
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPreference(value: String => String): Self = StObject.set(x, "getPreference", js.Any.fromFunction1(value))
    
    inline def setHasRole(value: String => Boolean): Self = StObject.set(x, "hasRole", js.Any.fromFunction1(value))
    
    inline def setIsMemberOf(value: String => Boolean): Self = StObject.set(x, "isMemberOf", js.Any.fromFunction1(value))
    
    inline def setSavePreference(value: (String, String) => Callback): Self = StObject.set(x, "savePreference", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
