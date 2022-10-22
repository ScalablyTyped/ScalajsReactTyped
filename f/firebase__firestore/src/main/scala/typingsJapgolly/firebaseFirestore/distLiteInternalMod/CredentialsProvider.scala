package typingsJapgolly.firebaseFirestore.distLiteInternalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods for getting the uid and token for the current user and
  * listening for changes.
  */
trait CredentialsProvider[T] extends StObject {
  
  /** Requests a token for the current user. */
  def getToken(): js.Promise[Token | Null]
  
  /**
    * Marks the last retrieved token as invalid, making the next GetToken request
    * force-refresh the token.
    */
  def invalidateToken(): Unit
  
  def shutdown(): Unit
  
  /**
    * Starts the credentials provider and specifies a listener to be notified of
    * credential changes (sign-in / sign-out, token changes). It is immediately
    * called once with the initial user.
    *
    * The change listener is invoked on the provided AsyncQueue.
    */
  def start(asyncQueue: AsyncQueue, changeListener: CredentialChangeListener[T]): Unit
}
object CredentialsProvider {
  
  inline def apply[T](
    getToken: CallbackTo[js.Promise[Token | Null]],
    invalidateToken: Callback,
    shutdown: Callback,
    start: (AsyncQueue, CredentialChangeListener[T]) => Callback
  ): CredentialsProvider[T] = {
    val __obj = js.Dynamic.literal(getToken = getToken.toJsFn, invalidateToken = invalidateToken.toJsFn, shutdown = shutdown.toJsFn, start = js.Any.fromFunction2((t0: AsyncQueue, t1: CredentialChangeListener[T]) => (start(t0, t1)).runNow()))
    __obj.asInstanceOf[CredentialsProvider[T]]
  }
  
  extension [Self <: CredentialsProvider[?], T](x: Self & CredentialsProvider[T]) {
    
    inline def setGetToken(value: CallbackTo[js.Promise[Token | Null]]): Self = StObject.set(x, "getToken", value.toJsFn)
    
    inline def setInvalidateToken(value: Callback): Self = StObject.set(x, "invalidateToken", value.toJsFn)
    
    inline def setShutdown(value: Callback): Self = StObject.set(x, "shutdown", value.toJsFn)
    
    inline def setStart(value: (AsyncQueue, CredentialChangeListener[T]) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: AsyncQueue, t1: CredentialChangeListener[T]) => (value(t0, t1)).runNow()))
  }
}
