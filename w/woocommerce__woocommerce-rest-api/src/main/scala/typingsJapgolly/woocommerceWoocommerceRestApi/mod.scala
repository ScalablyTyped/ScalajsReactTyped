package typingsJapgolly.woocommerceWoocommerceRestApi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`Options Error`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@woocommerce/woocommerce-rest-api", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WooCommerceRestApi {
    def this(opt: WooCommerceRestApi) = this()
    /**
      * Class constructor.
      */
    def this(opt: WooCommerceRestApiOptions) = this()
  }
  
  @JSImport("@woocommerce/woocommerce-rest-api", "OptionsException")
  @js.native
  open class OptionsException protected () extends StObject {
    /**
      * Constructor.
      */
    def this(message: String) = this()
    
    var message: String = js.native
    
    var name: `Options Error` = js.native
  }
  
  @js.native
  trait WooCommerceRestApi extends StObject {
    
    /**
      * Get OAuth
      */
    def _getOAuth(): Any = js.native
    
    /**
      * Get URL
      */
    def _getUrl(endpoint: String, params: Any): String = js.native
    
    /**
      * Normalize query string for oAuth
      */
    def _normalizeQueryString(url: String, params: Any): String = js.native
    
    /**
      * Parse params object.
      */
    def _parseParamsObject(params: Any, query: Any): WooCommerceRestApiQuery = js.native
    
    /**
      * Do requests
      */
    def _request(method: WooCommerceRestApiMethod, endpoint: String, data: Any, params: Any): js.Promise[Any] = js.native
    
    /**
      * Set default options
      */
    def _setDefaultsOptions(opt: WooCommerceRestApiOptions): Unit = js.native
    
    var axiosConfig: Any = js.native
    
    var classVersion: String = js.native
    
    var consumerKey: String = js.native
    
    var consumerSecret: String = js.native
    
    /**
      * DELETE requests
      */
    def delete(endpoint: String): js.Promise[Any] = js.native
    def delete(endpoint: String, params: Any): js.Promise[Any] = js.native
    
    var encoding: WooCommerceRestApiEncoding = js.native
    
    /**
      * GET requests
      */
    def get(endpoint: String): js.Promise[Any] = js.native
    def get(endpoint: String, params: Any): js.Promise[Any] = js.native
    
    /**
      * OPTIONS requests
      */
    def options(endpoint: String): js.Promise[Any] = js.native
    def options(endpoint: String, params: Any): js.Promise[Any] = js.native
    
    var port: Double = js.native
    
    /**
      * POST requests
      */
    def post(endpoint: String, data: Any): js.Promise[Any] = js.native
    def post(endpoint: String, data: Any, params: Any): js.Promise[Any] = js.native
    
    /**
      * PUT requests
      */
    def put(endpoint: String, data: Any): js.Promise[Any] = js.native
    def put(endpoint: String, data: Any, params: Any): js.Promise[Any] = js.native
    
    var queryStringAuth: Boolean = js.native
    
    var timeout: Double = js.native
    
    var url: String = js.native
    
    var version: WooCommerceRestApiVersion = js.native
    
    var wpAPIPrefix: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`utf-8`
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.ascii
  */
  trait WooCommerceRestApiEncoding extends StObject
  object WooCommerceRestApiEncoding {
    
    inline def ascii: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.ascii]
    
    inline def `utf-8`: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`utf-8` = "utf-8".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`utf-8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.get
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.post
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.put
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.delete
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.options
  */
  trait WooCommerceRestApiMethod extends StObject
  object WooCommerceRestApiMethod {
    
    inline def delete: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.delete = "delete".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.delete]
    
    inline def get: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.get = "get".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.get]
    
    inline def options: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.options = "options".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.options]
    
    inline def post: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.post = "post".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.post]
    
    inline def put: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.put = "put".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.put]
  }
  
  trait WooCommerceRestApiOptions extends StObject {
    
    /* Define the custom Axios config, also override this library options */
    var axiosConfig: js.UndefOr[Any] = js.undefined
    
    /* Your API consumer key */
    var consumerKey: String
    
    /* Your API consumer secret */
    var consumerSecret: String
    
    /* Encoding, default is 'utf-8' */
    var encoding: js.UndefOr[WooCommerceRestApiEncoding] = js.undefined
    
    /* Provide support for URLs with ports, eg: `8080` */
    var port: js.UndefOr[Double] = js.undefined
    
    /* When `true` and using under HTTPS force Basic Authentication as query string, default is `false` */
    var queryStringAuth: js.UndefOr[Boolean] = js.undefined
    
    /* Define the request timeout */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /* Your Store URL, example: http://woo.dev/ */
    var url: String
    
    /* API version, default is `v3` */
    var version: js.UndefOr[WooCommerceRestApiVersion] = js.undefined
    
    /* Custom WP REST API URL prefix, used to support custom prefixes created with the `rest_url_prefix filter` */
    var wpAPIPrefix: js.UndefOr[String] = js.undefined
  }
  object WooCommerceRestApiOptions {
    
    inline def apply(consumerKey: String, consumerSecret: String, url: String): WooCommerceRestApiOptions = {
      val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WooCommerceRestApiOptions]
    }
    
    extension [Self <: WooCommerceRestApiOptions](x: Self) {
      
      inline def setAxiosConfig(value: Any): Self = StObject.set(x, "axiosConfig", value.asInstanceOf[js.Any])
      
      inline def setAxiosConfigUndefined: Self = StObject.set(x, "axiosConfig", js.undefined)
      
      inline def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      inline def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: WooCommerceRestApiEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQueryStringAuth(value: Boolean): Self = StObject.set(x, "queryStringAuth", value.asInstanceOf[js.Any])
      
      inline def setQueryStringAuthUndefined: Self = StObject.set(x, "queryStringAuth", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: WooCommerceRestApiVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWpAPIPrefix(value: String): Self = StObject.set(x, "wpAPIPrefix", value.asInstanceOf[js.Any])
      
      inline def setWpAPIPrefixUndefined: Self = StObject.set(x, "wpAPIPrefix", js.undefined)
    }
  }
  
  type WooCommerceRestApiQuery = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv3
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv2
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv1
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv3`
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv2`
    - typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv1`
  */
  trait WooCommerceRestApiVersion extends StObject
  object WooCommerceRestApiVersion {
    
    inline def `wc-apiSlashv1`: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv1` = "wc-api/v1".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv1`]
    
    inline def `wc-apiSlashv2`: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv2` = "wc-api/v2".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv2`]
    
    inline def `wc-apiSlashv3`: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv3` = "wc-api/v3".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv3`]
    
    inline def wcSlashv1: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv1 = "wc/v1".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv1]
    
    inline def wcSlashv2: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv2 = "wc/v2".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv2]
    
    inline def wcSlashv3: typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv3 = "wc/v3".asInstanceOf[typingsJapgolly.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv3]
  }
}
