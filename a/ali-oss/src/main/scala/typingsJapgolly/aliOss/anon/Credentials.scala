package typingsJapgolly.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  var credentials: typingsJapgolly.aliOss.mod.Credentials
}
object Credentials {
  
  inline def apply(credentials: typingsJapgolly.aliOss.mod.Credentials): Credentials = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  extension [Self <: Credentials](x: Self) {
    
    inline def setCredentials(value: typingsJapgolly.aliOss.mod.Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
