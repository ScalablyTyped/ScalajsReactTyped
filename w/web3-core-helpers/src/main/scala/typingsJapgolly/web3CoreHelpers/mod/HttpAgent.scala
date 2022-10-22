package typingsJapgolly.web3CoreHelpers.mod

import typingsJapgolly.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpAgent extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var http: js.UndefOr[Agent] = js.undefined
  
  var https: js.UndefOr[typingsJapgolly.node.httpsMod.Agent] = js.undefined
}
object HttpAgent {
  
  inline def apply(): HttpAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAgent]
  }
  
  extension [Self <: HttpAgent](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setHttps(value: typingsJapgolly.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
  }
}
