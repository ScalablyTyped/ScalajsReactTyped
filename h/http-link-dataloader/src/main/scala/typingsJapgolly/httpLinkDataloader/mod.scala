package typingsJapgolly.httpLinkDataloader

import typingsJapgolly.httpLinkDataloader.typesMod.ClientOptions
import typingsJapgolly.httpLinkDataloader.typesMod.HttpOptions
import typingsJapgolly.httpLinkDataloader.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BatchedGraphQLClient protected ()
    extends typingsJapgolly.httpLinkDataloader.batchedGraphQLClientMod.BatchedGraphQLClient {
    def this(uri: String) = this()
    def this(uri: String, options: Options with ClientOptions) = this()
  }
  
  @js.native
  class HTTPLinkDataloader protected ()
    extends typingsJapgolly.httpLinkDataloader.httplinkdataloaderMod.HTTPLinkDataloader {
    def this(options: HttpOptions) = this()
  }
  
  /* static members */
  @js.native
  object HTTPLinkDataloader extends js.Object {
    /* private */ def createBatchedHttpRequest(options: js.Any): js.Any = js.native
  }
  
}

