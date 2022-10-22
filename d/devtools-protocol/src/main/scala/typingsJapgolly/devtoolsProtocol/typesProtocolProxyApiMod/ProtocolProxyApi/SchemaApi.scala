package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Schema.GetDomainsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApi extends StObject {
  
  /**
    * Returns supported domains.
    */
  def getDomains(): js.Promise[GetDomainsResponse]
}
object SchemaApi {
  
  inline def apply(getDomains: CallbackTo[js.Promise[GetDomainsResponse]]): SchemaApi = {
    val __obj = js.Dynamic.literal(getDomains = getDomains.toJsFn)
    __obj.asInstanceOf[SchemaApi]
  }
  
  extension [Self <: SchemaApi](x: Self) {
    
    inline def setGetDomains(value: CallbackTo[js.Promise[GetDomainsResponse]]): Self = StObject.set(x, "getDomains", value.toJsFn)
  }
}
