package typingsJapgolly.winrt.Windows.Security.Credentials

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPasswordCredential extends StObject {
  
  var password: String
  
  var properties: IPropertySet
  
  var resource: String
  
  def retrievePassword(): Unit
  
  var userName: String
}
object IPasswordCredential {
  
  inline def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: Callback,
    userName: String
  ): IPasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], retrievePassword = retrievePassword.toJsFn, userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasswordCredential]
  }
  
  extension [Self <: IPasswordCredential](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setRetrievePassword(value: Callback): Self = StObject.set(x, "retrievePassword", value.toJsFn)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
  }
}
