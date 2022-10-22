package typingsJapgolly.xummSdk

import typingsJapgolly.xummSdk.distSrcMetaMod.Meta
import typingsJapgolly.xummSdk.distSrcTypesPayloadOnPayloadEventMod.onPayloadEvent
import typingsJapgolly.xummSdk.distSrcTypesPayloadPayloadAndSubscriptionMod.PayloadAndSubscription
import typingsJapgolly.xummSdk.distSrcTypesPayloadPayloadSubscriptionMod.PayloadSubscription
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummDeletePayloadResponse
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummGetPayloadResponse
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummJsonTransaction
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyBlob
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadBodyJson
import typingsJapgolly.xummSdk.distSrcTypesXummApiMod.XummPostPayloadResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPayloadMod {
  
  @JSImport("xumm-sdk/dist/src/Payload", "Payload")
  @js.native
  open class Payload protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def cancel(payload: String): js.Promise[XummDeletePayloadResponse | Null] = js.native
    def cancel(payload: String, returnErrors: Boolean): js.Promise[XummDeletePayloadResponse | Null] = js.native
    def cancel(payload: XummGetPayloadResponse): js.Promise[XummDeletePayloadResponse | Null] = js.native
    def cancel(payload: XummGetPayloadResponse, returnErrors: Boolean): js.Promise[XummDeletePayloadResponse | Null] = js.native
    def cancel(payload: XummPostPayloadResponse): js.Promise[XummDeletePayloadResponse | Null] = js.native
    def cancel(payload: XummPostPayloadResponse, returnErrors: Boolean): js.Promise[XummDeletePayloadResponse | Null] = js.native
    
    def create(payload: XummJsonTransaction): js.Promise[XummPostPayloadResponse | Null] = js.native
    def create(payload: XummJsonTransaction, returnErrors: Boolean): js.Promise[XummPostPayloadResponse | Null] = js.native
    def create(payload: XummPostPayloadBodyBlob): js.Promise[XummPostPayloadResponse | Null] = js.native
    def create(payload: XummPostPayloadBodyBlob, returnErrors: Boolean): js.Promise[XummPostPayloadResponse | Null] = js.native
    def create(payload: XummPostPayloadBodyJson): js.Promise[XummPostPayloadResponse | Null] = js.native
    def create(payload: XummPostPayloadBodyJson, returnErrors: Boolean): js.Promise[XummPostPayloadResponse | Null] = js.native
    
    def createAndSubscribe(payload: XummJsonTransaction): js.Promise[PayloadAndSubscription] = js.native
    def createAndSubscribe(payload: XummJsonTransaction, callback: onPayloadEvent): js.Promise[PayloadAndSubscription] = js.native
    def createAndSubscribe(payload: XummPostPayloadBodyBlob): js.Promise[PayloadAndSubscription] = js.native
    def createAndSubscribe(payload: XummPostPayloadBodyBlob, callback: onPayloadEvent): js.Promise[PayloadAndSubscription] = js.native
    def createAndSubscribe(payload: XummPostPayloadBodyJson): js.Promise[PayloadAndSubscription] = js.native
    def createAndSubscribe(payload: XummPostPayloadBodyJson, callback: onPayloadEvent): js.Promise[PayloadAndSubscription] = js.native
    
    def get(payload: String): js.Promise[XummGetPayloadResponse | Null] = js.native
    def get(payload: String, returnErrors: Boolean): js.Promise[XummGetPayloadResponse | Null] = js.native
    def get(payload: XummPostPayloadResponse): js.Promise[XummGetPayloadResponse | Null] = js.native
    def get(payload: XummPostPayloadResponse, returnErrors: Boolean): js.Promise[XummGetPayloadResponse | Null] = js.native
    
    def resolvePayload(payload: String): js.Promise[XummGetPayloadResponse | Null] = js.native
    def resolvePayload(payload: XummGetPayloadResponse): js.Promise[XummGetPayloadResponse | Null] = js.native
    def resolvePayload(payload: XummPostPayloadResponse): js.Promise[XummGetPayloadResponse | Null] = js.native
    
    def subscribe(payload: String): js.Promise[PayloadSubscription] = js.native
    def subscribe(payload: String, callback: onPayloadEvent): js.Promise[PayloadSubscription] = js.native
    def subscribe(payload: XummGetPayloadResponse): js.Promise[PayloadSubscription] = js.native
    def subscribe(payload: XummGetPayloadResponse, callback: onPayloadEvent): js.Promise[PayloadSubscription] = js.native
    def subscribe(payload: XummPostPayloadResponse): js.Promise[PayloadSubscription] = js.native
    def subscribe(payload: XummPostPayloadResponse, callback: onPayloadEvent): js.Promise[PayloadSubscription] = js.native
  }
}
