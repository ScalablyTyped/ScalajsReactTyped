package typingsJapgolly.urllibNext

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.netMod.LookupFunction
import typingsJapgolly.urllibNext.anon.Cert
import typingsJapgolly.urllibNext.srcEsmHttpAgentMod.CheckAddressFunction
import typingsJapgolly.urllibNext.srcEsmRequestMod.RequestOptions
import typingsJapgolly.urllibNext.srcEsmRequestMod.RequestURL
import typingsJapgolly.urllibNext.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEsmHttpClientMod {
  
  @JSImport("urllib-next/src/esm/HttpClient", "HEADER_USER_AGENT")
  @js.native
  val HEADER_USER_AGENT: String = js.native
  
  @JSImport("urllib-next/src/esm/HttpClient", "HttpClient")
  @js.native
  open class HttpClient () extends EventEmitter {
    def this(clientOptions: ClientOptions) = this()
    
    /* private */ var `private`: Any = js.native
    
    def request(url: RequestURL): js.Promise[HttpClientResponse] = js.native
    def request(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = js.native
  }
  
  trait ClientOptions extends StObject {
    
    /**
      * check request address to protect from SSRF and similar attacks.
      * It receive two arguments(ip and family) and should return true or false to identified the address is legal or not.
      * It rely on lookup and have the same version requirement.
      */
    var checkAddress: js.UndefOr[CheckAddressFunction] = js.undefined
    
    var connect: js.UndefOr[Cert] = js.undefined
    
    var defaultArgs: js.UndefOr[RequestOptions] = js.undefined
    
    /**
      * Custom DNS lookup function, default is `dns.lookup`.
      */
    var lookup: js.UndefOr[LookupFunction] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setCheckAddress(value: (/* ip */ String, /* family */ Double | String) => Boolean): Self = StObject.set(x, "checkAddress", js.Any.fromFunction2(value))
      
      inline def setCheckAddressUndefined: Self = StObject.set(x, "checkAddress", js.undefined)
      
      inline def setConnect(value: Cert): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDefaultArgs(value: RequestOptions): Self = StObject.set(x, "defaultArgs", value.asInstanceOf[js.Any])
      
      inline def setDefaultArgsUndefined: Self = StObject.set(x, "defaultArgs", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3((t0: /* hostname */ String, t1: /* options */ LookupOneOptions, t2: /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    }
  }
}
