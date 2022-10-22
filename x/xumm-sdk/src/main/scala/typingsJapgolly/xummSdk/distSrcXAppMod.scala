package typingsJapgolly.xummSdk

import typingsJapgolly.xummSdk.distSrcMetaMod.Meta
import typingsJapgolly.xummSdk.distSrcTypesXAppXAppEventPushPostBodyMod.xAppEventPushPostBody
import typingsJapgolly.xummSdk.distSrcTypesXAppXAppEventResponseMod.xAppEventResponse
import typingsJapgolly.xummSdk.distSrcTypesXAppXAppOttDataMod.xAppOttData
import typingsJapgolly.xummSdk.distSrcTypesXAppXAppPushResponseMod.xAppPushResponse
import typingsJapgolly.xummSdk.distSrcXAppUserdataMod.xAppUserdata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcXAppMod {
  
  @JSImport("xumm-sdk/dist/src/xApp", "xApp")
  @js.native
  open class xApp protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def event(data: xAppEventPushPostBody): js.Promise[xAppEventResponse] = js.native
    
    def get(ott: String): js.Promise[xAppOttData | Null] = js.native
    
    def push(data: xAppEventPushPostBody): js.Promise[xAppPushResponse] = js.native
    
    var userdata: xAppUserdata = js.native
  }
}
