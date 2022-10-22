package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait storage extends StObject {
  
  var cookie: typingsJapgolly.webix.webix.cookie
  
  var local: typingsJapgolly.webix.webix.local
  
  var session: typingsJapgolly.webix.webix.session
}
object storage {
  
  @JSImport("webix", "storage")
  @js.native
  val ^ : typingsJapgolly.webix.webix.storage = js.native
  
  extension [Self <: storage](x: Self) {
    
    inline def setCookie(value: typingsJapgolly.webix.webix.cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: typingsJapgolly.webix.webix.local): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setSession(value: typingsJapgolly.webix.webix.session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
