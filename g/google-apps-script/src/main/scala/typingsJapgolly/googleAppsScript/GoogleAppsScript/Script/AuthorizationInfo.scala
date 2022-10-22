package typingsJapgolly.googleAppsScript.GoogleAppsScript.Script

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object used to determine whether the user needs to authorize this script to use one or more
  * services, and to provide the URL for an authorization dialog. If the script is published as an add-on that uses installable triggers, this information can be used
  * to control access to sections of code for which the user lacks the necessary authorization.
  * Alternately, the add-on can ask the user to open the URL for the authorization dialog to resolve
  * the problem.
  *
  * This object is returned by ScriptApp.getAuthorizationInfo(authMode). In almost
  * all cases, scripts should call ScriptApp.getAuthorizationInfo(ScriptApp.AuthMode.FULL),
  * since no other authorization mode requires that users grant authorization.
  */
trait AuthorizationInfo extends StObject {
  
  def getAuthorizationStatus(): AuthorizationStatus
  
  def getAuthorizationUrl(): String
}
object AuthorizationInfo {
  
  inline def apply(getAuthorizationStatus: CallbackTo[AuthorizationStatus], getAuthorizationUrl: CallbackTo[String]): AuthorizationInfo = {
    val __obj = js.Dynamic.literal(getAuthorizationStatus = getAuthorizationStatus.toJsFn, getAuthorizationUrl = getAuthorizationUrl.toJsFn)
    __obj.asInstanceOf[AuthorizationInfo]
  }
  
  extension [Self <: AuthorizationInfo](x: Self) {
    
    inline def setGetAuthorizationStatus(value: CallbackTo[AuthorizationStatus]): Self = StObject.set(x, "getAuthorizationStatus", value.toJsFn)
    
    inline def setGetAuthorizationUrl(value: CallbackTo[String]): Self = StObject.set(x, "getAuthorizationUrl", value.toJsFn)
  }
}
