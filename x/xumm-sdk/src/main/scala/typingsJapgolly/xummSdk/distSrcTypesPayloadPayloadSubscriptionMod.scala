package typingsJapgolly.xummSdk

import typingsJapgolly.websocket.mod.w3cwebsocket
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummGetPayloadResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesPayloadPayloadSubscriptionMod {
  
  @js.native
  trait PayloadSubscription extends StObject {
    
    var payload: XummGetPayloadResponse = js.native
    
    def resolve(): Unit = js.native
    def resolve(resolveData: Any): Unit = js.native
    
    var resolved: js.UndefOr[js.Promise[Any]] = js.native
    
    var websocket: w3cwebsocket = js.native
  }
}
