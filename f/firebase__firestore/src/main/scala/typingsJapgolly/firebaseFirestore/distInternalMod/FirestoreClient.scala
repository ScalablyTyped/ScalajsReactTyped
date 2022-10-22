package typingsJapgolly.firebaseFirestore.distInternalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FirestoreClient is a top-level class that constructs and owns all of the
  * pieces of the client SDK architecture. It is responsible for creating the
  * async queue that is shared by all of the other components in the system.
  */
trait FirestoreClient extends StObject {
  
  /* private */ var appCheckCredentialListener: Any
  
  /* private */ var appCheckCredentials: Any
  
  /**
    * Asynchronous queue responsible for all of our internal processing. When
    * we get incoming work from the user (via public API) or the network
    * (incoming GRPC messages), we should always schedule onto this queue.
    * This ensures all of our work is properly serialized (e.g. we don't
    * start processing a new operation while the previous one is waiting for
    * an async I/O to complete).
    */
  var asyncQueue: AsyncQueue
  
  /* private */ var authCredentialListener: Any
  
  /* private */ var authCredentials: Any
  
  /* private */ val clientId: Any
  
  /* private */ var databaseInfo: Any
  
  def getConfiguration(): js.Promise[ComponentConfiguration]
  
  var offlineComponents: js.UndefOr[OfflineComponentProvider] = js.undefined
  
  var onlineComponents: js.UndefOr[OnlineComponentProvider] = js.undefined
  
  def setAppCheckTokenChangeListener(listener: js.Function2[/* appCheckToken */ String, /* user */ User, js.Promise[Unit]]): Unit
  
  def setCredentialChangeListener(listener: js.Function1[/* user */ User, js.Promise[Unit]]): Unit
  
  def terminate(): js.Promise[Unit]
  
  /* private */ var user: Any
  
  /**
    * Checks that the client has not been terminated. Ensures that other methods on
    * this class cannot be called after the client is terminated.
    */
  def verifyNotTerminated(): Unit
}
object FirestoreClient {
  
  inline def apply(
    appCheckCredentialListener: Any,
    appCheckCredentials: Any,
    asyncQueue: AsyncQueue,
    authCredentialListener: Any,
    authCredentials: Any,
    clientId: Any,
    databaseInfo: Any,
    getConfiguration: CallbackTo[js.Promise[ComponentConfiguration]],
    setAppCheckTokenChangeListener: js.Function2[/* appCheckToken */ String, /* user */ User, js.Promise[Unit]] => Callback,
    setCredentialChangeListener: js.Function1[/* user */ User, js.Promise[Unit]] => Callback,
    terminate: CallbackTo[js.Promise[Unit]],
    user: Any,
    verifyNotTerminated: Callback
  ): FirestoreClient = {
    val __obj = js.Dynamic.literal(appCheckCredentialListener = appCheckCredentialListener.asInstanceOf[js.Any], appCheckCredentials = appCheckCredentials.asInstanceOf[js.Any], asyncQueue = asyncQueue.asInstanceOf[js.Any], authCredentialListener = authCredentialListener.asInstanceOf[js.Any], authCredentials = authCredentials.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], databaseInfo = databaseInfo.asInstanceOf[js.Any], getConfiguration = getConfiguration.toJsFn, setAppCheckTokenChangeListener = js.Any.fromFunction1((t0: js.Function2[/* appCheckToken */ String, /* user */ User, js.Promise[Unit]]) => setAppCheckTokenChangeListener(t0).runNow()), setCredentialChangeListener = js.Any.fromFunction1((t0: js.Function1[/* user */ User, js.Promise[Unit]]) => setCredentialChangeListener(t0).runNow()), terminate = terminate.toJsFn, user = user.asInstanceOf[js.Any], verifyNotTerminated = verifyNotTerminated.toJsFn)
    __obj.asInstanceOf[FirestoreClient]
  }
  
  extension [Self <: FirestoreClient](x: Self) {
    
    inline def setAppCheckCredentialListener(value: Any): Self = StObject.set(x, "appCheckCredentialListener", value.asInstanceOf[js.Any])
    
    inline def setAppCheckCredentials(value: Any): Self = StObject.set(x, "appCheckCredentials", value.asInstanceOf[js.Any])
    
    inline def setAsyncQueue(value: AsyncQueue): Self = StObject.set(x, "asyncQueue", value.asInstanceOf[js.Any])
    
    inline def setAuthCredentialListener(value: Any): Self = StObject.set(x, "authCredentialListener", value.asInstanceOf[js.Any])
    
    inline def setAuthCredentials(value: Any): Self = StObject.set(x, "authCredentials", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: Any): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInfo(value: Any): Self = StObject.set(x, "databaseInfo", value.asInstanceOf[js.Any])
    
    inline def setGetConfiguration(value: CallbackTo[js.Promise[ComponentConfiguration]]): Self = StObject.set(x, "getConfiguration", value.toJsFn)
    
    inline def setOfflineComponents(value: OfflineComponentProvider): Self = StObject.set(x, "offlineComponents", value.asInstanceOf[js.Any])
    
    inline def setOfflineComponentsUndefined: Self = StObject.set(x, "offlineComponents", js.undefined)
    
    inline def setOnlineComponents(value: OnlineComponentProvider): Self = StObject.set(x, "onlineComponents", value.asInstanceOf[js.Any])
    
    inline def setOnlineComponentsUndefined: Self = StObject.set(x, "onlineComponents", js.undefined)
    
    inline def setSetAppCheckTokenChangeListener(value: js.Function2[/* appCheckToken */ String, /* user */ User, js.Promise[Unit]] => Callback): Self = StObject.set(x, "setAppCheckTokenChangeListener", js.Any.fromFunction1((t0: js.Function2[/* appCheckToken */ String, /* user */ User, js.Promise[Unit]]) => value(t0).runNow()))
    
    inline def setSetCredentialChangeListener(value: js.Function1[/* user */ User, js.Promise[Unit]] => Callback): Self = StObject.set(x, "setCredentialChangeListener", js.Any.fromFunction1((t0: js.Function1[/* user */ User, js.Promise[Unit]]) => value(t0).runNow()))
    
    inline def setTerminate(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "terminate", value.toJsFn)
    
    inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setVerifyNotTerminated(value: Callback): Self = StObject.set(x, "verifyNotTerminated", value.toJsFn)
  }
}
