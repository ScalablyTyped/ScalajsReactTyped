package typingsJapgolly.cypress.anon

import typingsJapgolly.cypress.typesNetStubbingMod.StringMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Password extends StObject {
  
  var password: StringMatcher
  
  var username: StringMatcher
}
object Password {
  
  inline def apply(password: StringMatcher, username: StringMatcher): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
  
  extension [Self <: Password](x: Self) {
    
    inline def setPassword(value: StringMatcher): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: StringMatcher): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
