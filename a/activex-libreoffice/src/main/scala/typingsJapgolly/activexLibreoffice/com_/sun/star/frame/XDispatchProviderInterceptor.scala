package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to intercept request of {@link XDispatch} .
  *
  * Can be registered as an interceptor by using interface {@link XDispatchProviderInterception} .
  * @see XDispatchProviderInterception
  */
trait XDispatchProviderInterceptor
  extends StObject
     with XDispatchProvider {
  
  /**
    * access to the master {@link XDispatchProvider} of this interceptor
    * @returns the master of this interceptor
    * @see XDispatchProviderInterceptor.setMasterDispatchProvider()
    */
  var MasterDispatchProvider: XDispatchProvider
  
  /**
    * access to the slave {@link XDispatchProvider} of this interceptor
    * @returns the slave of this interceptor
    * @see XDispatchProviderInterceptor.setSlaveDispatchProvider()
    */
  var SlaveDispatchProvider: XDispatchProvider
  
  /**
    * access to the master {@link XDispatchProvider} of this interceptor
    * @returns the master of this interceptor
    * @see XDispatchProviderInterceptor.setMasterDispatchProvider()
    */
  def getMasterDispatchProvider(): XDispatchProvider
  
  /**
    * access to the slave {@link XDispatchProvider} of this interceptor
    * @returns the slave of this interceptor
    * @see XDispatchProviderInterceptor.setSlaveDispatchProvider()
    */
  def getSlaveDispatchProvider(): XDispatchProvider
  
  /**
    * sets the master {@link XDispatchProvider} , which may forward calls to its {@link XDispatchProvider.queryDispatch()} to this dispatch provider.
    * @param NewSupplier the master of this interceptor
    * @see XDispatchProviderInterceptor.getMasterDispatchProvider()
    */
  def setMasterDispatchProvider(NewSupplier: XDispatchProvider): Unit
  
  /**
    * sets the slave {@link XDispatchProvider} to which calls to {@link XDispatchProvider.queryDispatch()} can be forwarded under control of this dispatch
    * provider.
    * @param NewDispatchProvider the new slave of this interceptor
    * @see XDispatchProviderInterceptor.getSlaveDispatchProvider()
    */
  def setSlaveDispatchProvider(NewDispatchProvider: XDispatchProvider): Unit
}
object XDispatchProviderInterceptor {
  
  inline def apply(
    MasterDispatchProvider: XDispatchProvider,
    SlaveDispatchProvider: XDispatchProvider,
    acquire: Callback,
    getMasterDispatchProvider: CallbackTo[XDispatchProvider],
    getSlaveDispatchProvider: CallbackTo[XDispatchProvider],
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    release: Callback,
    setMasterDispatchProvider: XDispatchProvider => Callback,
    setSlaveDispatchProvider: XDispatchProvider => Callback
  ): XDispatchProviderInterceptor = {
    val __obj = js.Dynamic.literal(MasterDispatchProvider = MasterDispatchProvider.asInstanceOf[js.Any], SlaveDispatchProvider = SlaveDispatchProvider.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMasterDispatchProvider = getMasterDispatchProvider.toJsFn, getSlaveDispatchProvider = getSlaveDispatchProvider.toJsFn, queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setMasterDispatchProvider = js.Any.fromFunction1((t0: XDispatchProvider) => setMasterDispatchProvider(t0).runNow()), setSlaveDispatchProvider = js.Any.fromFunction1((t0: XDispatchProvider) => setSlaveDispatchProvider(t0).runNow()))
    __obj.asInstanceOf[XDispatchProviderInterceptor]
  }
  
  extension [Self <: XDispatchProviderInterceptor](x: Self) {
    
    inline def setGetMasterDispatchProvider(value: CallbackTo[XDispatchProvider]): Self = StObject.set(x, "getMasterDispatchProvider", value.toJsFn)
    
    inline def setGetSlaveDispatchProvider(value: CallbackTo[XDispatchProvider]): Self = StObject.set(x, "getSlaveDispatchProvider", value.toJsFn)
    
    inline def setMasterDispatchProvider(value: XDispatchProvider): Self = StObject.set(x, "MasterDispatchProvider", value.asInstanceOf[js.Any])
    
    inline def setSetMasterDispatchProvider(value: XDispatchProvider => Callback): Self = StObject.set(x, "setMasterDispatchProvider", js.Any.fromFunction1((t0: XDispatchProvider) => value(t0).runNow()))
    
    inline def setSetSlaveDispatchProvider(value: XDispatchProvider => Callback): Self = StObject.set(x, "setSlaveDispatchProvider", js.Any.fromFunction1((t0: XDispatchProvider) => value(t0).runNow()))
    
    inline def setSlaveDispatchProvider(value: XDispatchProvider): Self = StObject.set(x, "SlaveDispatchProvider", value.asInstanceOf[js.Any])
  }
}
