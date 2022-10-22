package typingsJapgolly.smartystreetsJavascriptSdk.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalAddressAutocomplete.Lookup
import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport("smartystreets-javascript-sdk", "core.Batch")
  @js.native
  open class Batch[T] () extends StObject {
    
    def add(lookup: T): Unit = js.native
    
    def clear(): Unit = js.native
    
    def getByIndex(index: Double): T = js.native
    
    def getByInputId(inputId: String): js.Array[T] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def lenght(): Double = js.native
    
    var lookups: js.Array[T] = js.native
    
    def lookupsHasRoomForLookup(): Boolean = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "core.ClientBuilder")
  @js.native
  open class ClientBuilder[T, R] protected () extends StObject {
    def this(credentials: SharedCredentials) = this()
    def this(credentials: StaticCredentials) = this()
    
    var baseUrl: String = js.native
    
    def buildClient(baseUrl: String, Client: Client[T, R]): Client[T, R] = js.native
    
    def buildInternationalAddressAutocompleteClient(): Client[Lookup, Lookup] = js.native
    
    def buildInternationalStreetClient(): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup
      ] = js.native
    
    def buildSender(): Any = js.native
    
    def buildUsAutocompleteClient(): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup
      ] = js.native
    
    def buildUsAutocompleteProClient(): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup
      ] = js.native
    
    def buildUsExtractClient(): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup
      ] = js.native
    
    def buildUsReverseGeoClient(): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup
      ] = js.native
    
    def buildUsStreetApiClient(): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup]
      ] = js.native
    
    def buildUsZipcodeClient(): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup]
      ] = js.native
    
    var customHeaders: Any = js.native
    
    var debug: Boolean = js.native
    
    var httpSender: Any = js.native
    
    var licenses: js.Array[String] = js.native
    
    var maxRetries: Double = js.native
    
    var maxTimeout: Double = js.native
    
    var proxy: String = js.native
    
    var signer: StaticCredentials | SharedCredentials = js.native
    
    def withBaseUrl(url: String): ClientBuilder[T, R] = js.native
    
    def withCustomHeaders(customHeaders: Any): ClientBuilder[T, R] = js.native
    
    def withDebug(): ClientBuilder[T, R] = js.native
    
    def withLicenses(licenses: js.Array[String]): ClientBuilder[T, R] = js.native
    
    def withMaxRetries(retries: Double): ClientBuilder[T, R] = js.native
    
    def withMaxTimeout(timeout: Double): ClientBuilder[T, R] = js.native
    
    def withProxy(host: String, port: Double): ClientBuilder[T, R] = js.native
    def withProxy(host: String, port: Double, username: String): ClientBuilder[T, R] = js.native
    def withProxy(host: String, port: Double, username: String, password: String): ClientBuilder[T, R] = js.native
    def withProxy(host: String, port: Double, username: Unit, password: String): ClientBuilder[T, R] = js.native
    
    def withSender(sender: Any): ClientBuilder[T, R] = js.native
  }
  
  object Errors {
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BadCredentialsError")
    @js.native
    open class BadCredentialsError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BadRequestError")
    @js.native
    open class BadRequestError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BatchEmptyError")
    @js.native
    open class BatchEmptyError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.BatchFullError")
    @js.native
    open class BatchFullError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.GatewayTimeoutError")
    @js.native
    open class GatewayTimeoutError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.InternalServerError")
    @js.native
    open class InternalServerError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.PaymentRequiredError")
    @js.native
    open class PaymentRequiredError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.RequestEntityTooLargeError")
    @js.native
    open class RequestEntityTooLargeError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.ServiceUnavailableError")
    @js.native
    open class ServiceUnavailableError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.SmartyError")
    @js.native
    open class SmartyError protected ()
      extends StObject
         with Error {
      def this(message: String) = this()
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
    }
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.TooManyRequestsError")
    @js.native
    open class TooManyRequestsError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.UndefinedLookupError")
    @js.native
    open class UndefinedLookupError () extends SmartyError
    
    @JSImport("smartystreets-javascript-sdk", "core.Errors.UnprocessableEntityError")
    @js.native
    open class UnprocessableEntityError protected () extends SmartyError {
      def this(message: String) = this()
    }
  }
  
  @JSImport("smartystreets-javascript-sdk", "core.SharedCredentials")
  @js.native
  open class SharedCredentials protected () extends StObject {
    def this(authId: String) = this()
    def this(authId: String, hostName: String) = this()
    
    def sign(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Any = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "core.StaticCredentials")
  @js.native
  open class StaticCredentials protected () extends StObject {
    def this(authId: String, authToken: String) = this()
    
    def sign(
      request: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Any = js.native
  }
  
  object buildClient {
    
    @JSImport("smartystreets-javascript-sdk", "core.buildClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def internationalAddressAutocomplete(credentials: SharedCredentials): Client[Lookup, Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("internationalAddressAutocomplete")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[Lookup, Lookup]]
    inline def internationalAddressAutocomplete(credentials: StaticCredentials): Client[Lookup, Lookup] = ^.asInstanceOf[js.Dynamic].applyDynamic("internationalAddressAutocomplete")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[Lookup, Lookup]]
    
    inline def internationalStreet(credentials: SharedCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("internationalStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup
      ]]
    inline def internationalStreet(credentials: StaticCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("internationalStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.internationalStreet.Lookup
      ]]
    
    inline def usAutocomplete(credentials: SharedCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocomplete")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup
      ]]
    inline def usAutocomplete(credentials: StaticCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocomplete")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocomplete.Lookup
      ]]
    
    inline def usAutocompletePro(credentials: SharedCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocompletePro")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup
      ]]
    inline def usAutocompletePro(credentials: StaticCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usAutocompletePro")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usAutocompletePro.Lookup
      ]]
    
    inline def usExtract(credentials: SharedCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usExtract")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup
      ]]
    inline def usExtract(credentials: StaticCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usExtract")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usExtract.Lookup
      ]]
    
    inline def usReverseGeo(credentials: SharedCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usReverseGeo")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup
      ]]
    inline def usReverseGeo(credentials: StaticCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usReverseGeo")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup, 
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usReverseGeo.Lookup
      ]]
    
    inline def usStreet(credentials: SharedCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup]
      ]]
    inline def usStreet(credentials: StaticCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usStreet")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usStreet.Lookup]
      ]]
    
    inline def usZipcode(credentials: SharedCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usZipcode")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup]
      ]]
    inline def usZipcode(credentials: StaticCredentials): Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("usZipcode")(credentials.asInstanceOf[js.Any]).asInstanceOf[Client[
        typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup | Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup], 
        Batch[typingsJapgolly.smartystreetsJavascriptSdk.mod.usZipcode.Lookup]
      ]]
  }
  
  trait Client[T, R]
    extends StObject
       with ClientInstance {
    
    def send(lookup: T): js.Promise[R]
  }
  object Client {
    
    inline def apply[T, R](send: T => js.Promise[R], sender: Any): Client[T, R] = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client[T, R]]
    }
    
    extension [Self <: Client[?, ?], T, R](x: Self & (Client[T, R])) {
      
      inline def setSend(value: T => js.Promise[R]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  trait ClientInstance extends StObject {
    
    var sender: Any
  }
  object ClientInstance {
    
    inline def apply(sender: Any): ClientInstance = {
      val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInstance]
    }
    
    extension [Self <: ClientInstance](x: Self) {
      
      inline def setSender(value: Any): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
}
