package typingsJapgolly.vsoNodeApi

import typingsJapgolly.typedRestClient.httpClientMod.HttpClient
import typingsJapgolly.typedRestClient.restClientMod.RestClient
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import typingsJapgolly.vsoNodeApi.vsoClientMod.VsoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ClientApiBases", JSImport.Namespace)
@js.native
object clientApiBasesMod extends js.Object {
  @js.native
  class ClientApiBase protected () extends js.Object {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String, options: IRequestOptions) = this()
    var baseUrl: String = js.native
    var http: HttpClient = js.native
    var rest: RestClient = js.native
    var userAgent: String = js.native
    var vsoClient: VsoClient = js.native
    def createAcceptHeader(`type`: String): String = js.native
    def createAcceptHeader(`type`: String, apiVersion: String): String = js.native
    def createRequestOptions(`type`: String): typingsJapgolly.typedRestClient.restClientMod.IRequestOptions = js.native
    def createRequestOptions(`type`: String, apiVersion: String): typingsJapgolly.typedRestClient.restClientMod.IRequestOptions = js.native
    def formatResponse(data: js.Any, responseTypeMetadata: js.Any, isCollection: Boolean): js.Any = js.native
  }
  
}

