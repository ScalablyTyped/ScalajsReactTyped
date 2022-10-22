package typingsJapgolly.googleapisCommon

import typingsJapgolly.gaxios.buildSrcCommonMod.GaxiosOptions
import typingsJapgolly.gaxios.buildSrcCommonMod.GaxiosResponse
import typingsJapgolly.node.http2Mod.ClientHttp2Session
import typingsJapgolly.node.timersMod.global.NodeJS.Timer
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcHttp2Mod {
  
  @JSImport("googleapis-common/build/src/http2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closeSession(url: URL_): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSession")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def request[T](config: GaxiosOptions): js.Promise[GaxiosResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GaxiosResponse[T]]]
  
  trait SessionData extends StObject {
    
    var session: ClientHttp2Session
    
    var timeoutHandle: js.UndefOr[Timer] = js.undefined
  }
  object SessionData {
    
    inline def apply(session: ClientHttp2Session): SessionData = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionData]
    }
    
    extension [Self <: SessionData](x: Self) {
      
      inline def setSession(value: ClientHttp2Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setTimeoutHandle(value: Timer): Self = StObject.set(x, "timeoutHandle", value.asInstanceOf[js.Any])
      
      inline def setTimeoutHandleUndefined: Self = StObject.set(x, "timeoutHandle", js.undefined)
    }
  }
}
