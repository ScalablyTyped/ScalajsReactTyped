package typingsJapgolly.wdioTypes.anon

import typingsJapgolly.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Http extends StObject {
  
  var http: Agent
  
  var https: typingsJapgolly.node.httpsMod.Agent
}
object Http {
  
  inline def apply(http: Agent, https: typingsJapgolly.node.httpsMod.Agent): Http = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
  
  extension [Self <: Http](x: Self) {
    
    inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttps(value: typingsJapgolly.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
  }
}
