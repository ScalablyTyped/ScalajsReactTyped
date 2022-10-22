package typingsJapgolly.gaxios

import typingsJapgolly.gaxios.buildSrcCommonMod.GaxiosOptions
import typingsJapgolly.gaxios.buildSrcCommonMod.GaxiosResponse
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGaxiosMod {
  
  @JSImport("gaxios/build/src/gaxios", "Gaxios")
  @js.native
  /**
    * The Gaxios class is responsible for making HTTP requests.
    * @param defaults The default set of options to be used for this instance.
    */
  open class Gaxios () extends StObject {
    def this(defaults: GaxiosOptions) = this()
    
    /* private */ var _defaultAdapter: Any = js.native
    
    /**
      * Internal, retryable version of the `request` method.
      * @param opts Set of HTTP options that will be used for this HTTP request.
      */
    /* protected */ def _request[T](): js.Promise[GaxiosResponse[T]] = js.native
    /* protected */ def _request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
    
    /* protected */ var agentCache: Map[String, Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
    
    /**
      * Default HTTP options that will be used for every HTTP request.
      */
    var defaults: GaxiosOptions = js.native
    
    /* private */ var getResponseData: Any = js.native
    
    /**
      * Encode a set of key/value pars into a querystring format (?foo=bar&baz=boo)
      * @param params key value pars to encode
      */
    /* private */ var paramsSerializer: Any = js.native
    
    /**
      * Perform an HTTP request with the given options.
      * @param opts Set of HTTP options that will be used for this HTTP request.
      */
    def request[T](): js.Promise[GaxiosResponse[T]] = js.native
    def request[T](opts: GaxiosOptions): js.Promise[GaxiosResponse[T]] = js.native
    
    /* private */ var translateResponse: Any = js.native
    
    /**
      * Validates the options, and merges them with defaults.
      * @param opts The original options passed from the client.
      */
    /* private */ var validateOpts: Any = js.native
    
    /**
      * By default, throw for any non-2xx status code
      * @param status status code from the HTTP response
      */
    /* private */ var validateStatus: Any = js.native
  }
}
