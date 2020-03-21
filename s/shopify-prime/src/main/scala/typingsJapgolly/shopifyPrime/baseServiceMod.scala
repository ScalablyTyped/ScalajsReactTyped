package typingsJapgolly.shopifyPrime

import typingsJapgolly.shopifyPrime.shopifyPrimeStrings.DELETE
import typingsJapgolly.shopifyPrime.shopifyPrimeStrings.GET
import typingsJapgolly.shopifyPrime.shopifyPrimeStrings.POST
import typingsJapgolly.shopifyPrime.shopifyPrimeStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/infrastructure/base_service", JSImport.Namespace)
@js.native
object baseServiceMod extends js.Object {
  @js.native
  class BaseService protected () extends js.Object {
    def this(shopDomain: String, accessToken: String, resource: String) = this()
    var accessToken: js.Any = js.native
    var resource: js.Any = js.native
    var shopDomain: js.Any = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_DELETE[T](method: DELETE, path: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_DELETE[T](method: DELETE, path: String, rootElement: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_DELETE[T](method: DELETE, path: String, rootElement: String, payload: js.Object): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_GET[T](method: GET, path: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_GET[T](method: GET, path: String, rootElement: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_GET[T](method: GET, path: String, rootElement: String, payload: js.Object): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_POST[T](method: POST, path: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_POST[T](method: POST, path: String, rootElement: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_POST[T](method: POST, path: String, rootElement: String, payload: js.Object): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_PUT[T](method: PUT, path: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_PUT[T](method: PUT, path: String, rootElement: String): js.Promise[T] = js.native
    @JSName("createRequest")
    /* protected */ def createRequest_PUT[T](method: PUT, path: String, rootElement: String, payload: js.Object): js.Promise[T] = js.native
    /**
      * Joins URI paths into one single string, replacing bad slashes and ensuring the path doesn't end in /.json.
      */
    /* protected */ def joinUriPaths(paths: String*): String = js.native
  }
  
  @js.native
  class default protected () extends BaseService {
    def this(shopDomain: String, accessToken: String, resource: String) = this()
  }
  
  /* static members */
  @js.native
  object BaseService extends js.Object {
    def buildDefaultHeaders(): AnonAccept = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def buildDefaultHeaders(): AnonAccept = js.native
  }
  
}

