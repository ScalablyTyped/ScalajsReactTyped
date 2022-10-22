package typingsJapgolly.oidcProvider.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oidcProvider.anon.ExpiresAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdToken extends StObject {
  
  val available: UnknownObject
  
  val client: Client
  
  val ctx: KoaContextWithOIDC
  
  val extra: UnknownObject
  
  def issue(context: ExpiresAt): js.Promise[String]
  
  def payload(): js.Promise[UnknownObject]
  
  def set(key: String, value: Any): Unit
}
object IdToken {
  
  inline def apply(
    available: UnknownObject,
    client: Client,
    ctx: KoaContextWithOIDC,
    extra: UnknownObject,
    issue: ExpiresAt => js.Promise[String],
    payload: CallbackTo[js.Promise[UnknownObject]],
    set: (String, Any) => Callback
  ): IdToken = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], issue = js.Any.fromFunction1(issue), payload = payload.toJsFn, set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[IdToken]
  }
  
  extension [Self <: IdToken](x: Self) {
    
    inline def setAvailable(value: UnknownObject): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: KoaContextWithOIDC): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: UnknownObject): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setIssue(value: ExpiresAt => js.Promise[String]): Self = StObject.set(x, "issue", js.Any.fromFunction1(value))
    
    inline def setPayload(value: CallbackTo[js.Promise[UnknownObject]]): Self = StObject.set(x, "payload", value.toJsFn)
    
    inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
