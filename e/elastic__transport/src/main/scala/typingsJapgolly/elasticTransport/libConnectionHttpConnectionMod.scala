package typingsJapgolly.elasticTransport

import typingsJapgolly.elasticTransport.anon.FnCall
import typingsJapgolly.elasticTransport.anon.FnCallUrlOptionsCallback
import typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.ConnectionOptions
import typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.ConnectionRequestOptions
import typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.ConnectionRequestParams
import typingsJapgolly.hpagent.mod.HttpProxyAgent
import typingsJapgolly.hpagent.mod.HttpsProxyAgent
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.ClientRequestArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionHttpConnectionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.elasticTransport.libConnectionMod.Connection because Already inherited */ @JSImport("@elastic/transport/lib/connection/HttpConnection", JSImport.Default)
  @js.native
  open class default protected () extends HttpConnection {
    def this(opts: ConnectionOptions) = this()
  }
  
  @js.native
  trait HttpConnection
    extends typingsJapgolly.elasticTransport.libConnectionBaseConnectionMod.default {
    
    var agent: js.UndefOr[Agent | typingsJapgolly.node.httpsMod.Agent | HttpProxyAgent | HttpsProxyAgent] = js.native
    
    def buildRequestObject(params: ConnectionRequestParams, options: ConnectionRequestOptions): ClientRequestArgs = js.native
    
    var makeRequest: FnCall | FnCallUrlOptionsCallback = js.native
  }
}
