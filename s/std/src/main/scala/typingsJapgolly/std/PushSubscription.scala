package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service.
  * Available only in secure contexts.
  */
trait PushSubscription extends StObject {
  
  /* standard dom */
  val endpoint: java.lang.String
  
  /* standard dom */
  val expirationTime: EpochTimeStamp | Null
  
  /* standard dom */
  def getKey(name: org.scalajs.dom.PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null
  
  /* standard dom */
  val options: org.scalajs.dom.PushSubscriptionOptions
  
  /* standard dom */
  def toJSON(): org.scalajs.dom.PushSubscriptionJSON
  
  /* standard dom */
  def unsubscribe(): js.Promise[scala.Boolean]
}
object PushSubscription {
  
  inline def apply(
    endpoint: java.lang.String,
    getKey: org.scalajs.dom.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null,
    options: org.scalajs.dom.PushSubscriptionOptions,
    toJSON: CallbackTo[org.scalajs.dom.PushSubscriptionJSON],
    unsubscribe: CallbackTo[js.Promise[scala.Boolean]]
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, unsubscribe = unsubscribe.toJsFn, expirationTime = null)
    __obj.asInstanceOf[PushSubscription]
  }
  
  extension [Self <: PushSubscription](x: Self) {
    
    inline def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: EpochTimeStamp): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setGetKey(value: org.scalajs.dom.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setOptions(value: org.scalajs.dom.PushSubscriptionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: CallbackTo[org.scalajs.dom.PushSubscriptionJSON]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setUnsubscribe(value: CallbackTo[js.Promise[scala.Boolean]]): Self = StObject.set(x, "unsubscribe", value.toJsFn)
  }
}
