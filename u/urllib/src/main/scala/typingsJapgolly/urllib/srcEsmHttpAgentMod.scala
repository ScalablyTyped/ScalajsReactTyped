package typingsJapgolly.urllib

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import typingsJapgolly.node.netMod.LookupFunction
import typingsJapgolly.undici.mod.Agent
import typingsJapgolly.undici.typesConnectorMod.BuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEsmHttpAgentMod {
  
  @JSImport("urllib/src/esm/HttpAgent", "HttpAgent")
  @js.native
  open class HttpAgent protected () extends Agent {
    def this(options: HttpAgentOptions) = this()
    
    /* private */ var `private`: Any = js.native
  }
  
  type CheckAddressFunction = js.Function2[/* ip */ String, /* family */ Double | String, Boolean]
  
  trait HttpAgentOptions extends StObject {
    
    var checkAddress: js.UndefOr[CheckAddressFunction] = js.undefined
    
    var connect: js.UndefOr[BuildOptions] = js.undefined
    
    var lookup: js.UndefOr[LookupFunction] = js.undefined
  }
  object HttpAgentOptions {
    
    inline def apply(): HttpAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpAgentOptions]
    }
    
    extension [Self <: HttpAgentOptions](x: Self) {
      
      inline def setCheckAddress(value: (/* ip */ String, /* family */ Double | String) => Boolean): Self = StObject.set(x, "checkAddress", js.Any.fromFunction2(value))
      
      inline def setCheckAddressUndefined: Self = StObject.set(x, "checkAddress", js.undefined)
      
      inline def setConnect(value: BuildOptions): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setLookup(
        value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Callback
      ): Self = StObject.set(x, "lookup", js.Any.fromFunction3((t0: /* hostname */ String, t1: /* options */ LookupOneOptions, t2: /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    }
  }
}
