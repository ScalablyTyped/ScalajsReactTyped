package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides read access to a {@link ContentResultSet} .
  *
  * You can either get a simple static {@link ContentResultSet} or you can listen to change-notifications and than swap from the old to a new {@link
  * ContentResultSet} .
  *
  * The following describes the dynamic use:
  *
  * {@link XDynamicResultSet} provides the possibility to get notifications about changes on a {@link ContentResultSet} and have an listener-controlled
  * update from one version to the next version. Two {@link ContentResultSet} implementations were given to the listener in the first notification as
  * interface {@link com.sun.star.sdbc.XResultSet} .
  *
  * To get notifications the listener has to be of type {@link XDynamicResultSetListener} .
  *
  * After registration you will get notifications for events of type {@link ListEvent} .
  *
  * The calling of {@link XDynamicResultSetListener.notify()} has to happen in an own thread, because it could take a longer time and any actions ???
  * until the listener returns the call. So don't block the notify-causing action.
  *
  * While one notify-call is going on:
  *
  *  1. The listener is allowed to access both ContentResultSets, they must be both valid. 2. It is not allowed to start a second notify-call. 3. All
  * additional things we want to send as notification are to be queued. 4. Any other calls are to be accepted and treated.
  *
  * After the listener has returned the notify-call:
  *
  *  1. The listener is allowed to access the new {@link ContentResultSet} . The new one is first assigned in the WELCOME-event and than the ResultSets
  * are always swapped. 2. The listener is not allowed to access the old {@link ContentResultSet} .
  */
trait XDynamicResultSet
  extends StObject
     with XComponent {
  
  /**
    * Using this method you can get information, whether the offered ContentResultSets are sorted or filtered etc correctly as demanded during the creation
    * of the {@link XDynamicResultSet} .
    * @returns zero or more constants of the {@link ContentResultSetCapability} constants group.
    */
  val Capabilities: Double
  
  /**
    * Call this, if you don't care about any changes.
    * @returns an {@link com.sun.star.sdbc.XResultSet} that is implemented as {@link ContentResultSet} . Its content will never change.
    * @throws ListenerAlreadySetException if someone already has registered as listener via {@link XDynamicResultSet.setListener()} or if someone has establish
    */
  val StaticResultSet: XResultSet
  
  /**
    * Connects this to a {@link CachedDynamicResultSet} for optimized remote data transport.
    *
    * This method creates a {@link CachedDynamicResultSetStub} and sets it as Source to the given cache.
    *
    * After this method has returned you can and have to use the given result set cache for further access.
    * @param Cache has to be an implementation of the service {@link CachedDynamicResultSet} . In particular it has to support the interface {@link XSourceIni
    * @throws ListenerAlreadySetException if someone already has fetched the {@link ContentResultSet} via {@link XDynamicResultSet.getStaticResultSet()} .
    * @throws AlreadyInitializedException if **Cache** was already initialized with another source.
    * @throws ServiceNotFoundException
    */
  def connectToCache(Cache: XDynamicResultSet): Unit
  
  /**
    * Using this method you can get information, whether the offered ContentResultSets are sorted or filtered etc correctly as demanded during the creation
    * of the {@link XDynamicResultSet} .
    * @returns zero or more constants of the {@link ContentResultSetCapability} constants group.
    */
  def getCapabilities(): Double
  
  /**
    * Call this, if you don't care about any changes.
    * @returns an {@link com.sun.star.sdbc.XResultSet} that is implemented as {@link ContentResultSet} . Its content will never change.
    * @throws ListenerAlreadySetException if someone already has registered as listener via {@link XDynamicResultSet.setListener()} or if someone has establish
    */
  def getStaticResultSet(): XResultSet
  
  /**
    * Call this, if you want to get notifications about changes.
    *
    * The implementor has to call {@link com.sun.star.lang.XComponent.addEventListener()} in this method, so that we can call {@link
    * com.sun.star.lang.XEventListener.disposing()} at the listener
    * @param Listener a listener for result set notifications
    * @throws ListenerAlreadySetException if this method is called more than once during the life of the implementation object or if this method is called if s
    */
  def setListener(Listener: XDynamicResultSetListener): Unit
}
object XDynamicResultSet {
  
  inline def apply(
    Capabilities: Double,
    StaticResultSet: XResultSet,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    connectToCache: XDynamicResultSet => Callback,
    dispose: Callback,
    getCapabilities: CallbackTo[Double],
    getStaticResultSet: CallbackTo[XResultSet],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setListener: XDynamicResultSetListener => Callback
  ): XDynamicResultSet = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], StaticResultSet = StaticResultSet.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), connectToCache = js.Any.fromFunction1((t0: XDynamicResultSet) => connectToCache(t0).runNow()), dispose = dispose.toJsFn, getCapabilities = getCapabilities.toJsFn, getStaticResultSet = getStaticResultSet.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setListener = js.Any.fromFunction1((t0: XDynamicResultSetListener) => setListener(t0).runNow()))
    __obj.asInstanceOf[XDynamicResultSet]
  }
  
  extension [Self <: XDynamicResultSet](x: Self) {
    
    inline def setCapabilities(value: Double): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setConnectToCache(value: XDynamicResultSet => Callback): Self = StObject.set(x, "connectToCache", js.Any.fromFunction1((t0: XDynamicResultSet) => value(t0).runNow()))
    
    inline def setGetCapabilities(value: CallbackTo[Double]): Self = StObject.set(x, "getCapabilities", value.toJsFn)
    
    inline def setGetStaticResultSet(value: CallbackTo[XResultSet]): Self = StObject.set(x, "getStaticResultSet", value.toJsFn)
    
    inline def setSetListener(value: XDynamicResultSetListener => Callback): Self = StObject.set(x, "setListener", js.Any.fromFunction1((t0: XDynamicResultSetListener) => value(t0).runNow()))
    
    inline def setStaticResultSet(value: XResultSet): Self = StObject.set(x, "StaticResultSet", value.asInstanceOf[js.Any])
  }
}
