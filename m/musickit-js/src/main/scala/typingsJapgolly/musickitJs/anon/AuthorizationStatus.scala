package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.musickitJsInts.`0`
import typingsJapgolly.musickitJs.musickitJsInts.`1`
import typingsJapgolly.musickitJs.musickitJsInts.`2`
import typingsJapgolly.musickitJs.musickitJsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationStatus extends StObject {
  
  var authorizationStatus: `0` | `1` | `2` | `3`
}
object AuthorizationStatus {
  
  inline def apply(authorizationStatus: `0` | `1` | `2` | `3`): AuthorizationStatus = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationStatus]
  }
  
  extension [Self <: AuthorizationStatus](x: Self) {
    
    inline def setAuthorizationStatus(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "authorizationStatus", value.asInstanceOf[js.Any])
  }
}
