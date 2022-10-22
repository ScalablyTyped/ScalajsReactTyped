package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreHttpHttpSocketMod.default
import typingsJapgolly.pusherJs.typesSrcCoreHttpRequestHooksMod.RequestHooks
import typingsJapgolly.pusherJs.typesSrcCoreHttpSocketHooksMod.SocketHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreHttpHttpFactoryMod {
  
  trait HTTPFactory extends StObject {
    
    def createPollingSocket(url: String): default
    
    def createRequest(hooks: RequestHooks, method: String, url: String): typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default
    
    def createSocket(hooks: SocketHooks, url: String): default
    
    def createStreamingSocket(url: String): default
    
    var createXDR: js.UndefOr[
        js.Function2[
          /* method */ String, 
          /* url */ String, 
          typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default
        ]
      ] = js.undefined
    
    def createXHR(method: String, url: String): typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default
  }
  object HTTPFactory {
    
    inline def apply(
      createPollingSocket: String => default,
      createRequest: (RequestHooks, String, String) => typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default,
      createSocket: (SocketHooks, String) => default,
      createStreamingSocket: String => default,
      createXHR: (String, String) => typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default
    ): HTTPFactory = {
      val __obj = js.Dynamic.literal(createPollingSocket = js.Any.fromFunction1(createPollingSocket), createRequest = js.Any.fromFunction3(createRequest), createSocket = js.Any.fromFunction2(createSocket), createStreamingSocket = js.Any.fromFunction1(createStreamingSocket), createXHR = js.Any.fromFunction2(createXHR))
      __obj.asInstanceOf[HTTPFactory]
    }
    
    extension [Self <: HTTPFactory](x: Self) {
      
      inline def setCreatePollingSocket(value: String => default): Self = StObject.set(x, "createPollingSocket", js.Any.fromFunction1(value))
      
      inline def setCreateRequest(
        value: (RequestHooks, String, String) => typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default
      ): Self = StObject.set(x, "createRequest", js.Any.fromFunction3(value))
      
      inline def setCreateSocket(value: (SocketHooks, String) => default): Self = StObject.set(x, "createSocket", js.Any.fromFunction2(value))
      
      inline def setCreateStreamingSocket(value: String => default): Self = StObject.set(x, "createStreamingSocket", js.Any.fromFunction1(value))
      
      inline def setCreateXDR(
        value: (/* method */ String, /* url */ String) => typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default
      ): Self = StObject.set(x, "createXDR", js.Any.fromFunction2(value))
      
      inline def setCreateXDRUndefined: Self = StObject.set(x, "createXDR", js.undefined)
      
      inline def setCreateXHR(value: (String, String) => typingsJapgolly.pusherJs.typesSrcCoreHttpHttpRequestMod.default): Self = StObject.set(x, "createXHR", js.Any.fromFunction2(value))
    }
  }
}
