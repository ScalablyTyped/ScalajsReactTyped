package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register an {@link XDispatchProvider} which intercepts all requests of {@link XDispatch} to this instance.
  *
  * Note: Nobody can guarantee order of used interceptor objects if more than ones exist. Later registered ones will be used at first. But it's possible
  * to increase the chance for that by providing the optional interface {@link XInterceptorInfo} .
  * @see XDispatchProvider
  * @see XDispatch
  * @see XInterceptorInfo
  */
trait XDispatchProviderInterception
  extends StObject
     with XInterface {
  
  /**
    * registers an {@link XDispatchProviderInterceptor} , which will become the first interceptor in the chain of registered interceptors.
    * @param Interceptor the interceptor which wishes to be registered
    * @see XDispatchProviderInterception.releaseDispatchProviderInterceptor()
    */
  def registerDispatchProviderInterceptor(Interceptor: XDispatchProviderInterceptor): Unit
  
  /**
    * removes an {@link XDispatchProviderInterceptor} which was previously registered
    *
    * The order of removals is arbitrary. It is not necessary to remove the last registered interceptor first.
    * @param Interceptor the interceptor which wishes to be unregistered
    * @see XDispatchProviderInterception.registerDispatchProviderInterceptor()
    */
  def releaseDispatchProviderInterceptor(Interceptor: XDispatchProviderInterceptor): Unit
}
object XDispatchProviderInterception {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
    release: Callback,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback
  ): XDispatchProviderInterception = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => registerDispatchProviderInterceptor(t0).runNow()), release = release.toJsFn, releaseDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => releaseDispatchProviderInterceptor(t0).runNow()))
    __obj.asInstanceOf[XDispatchProviderInterception]
  }
  
  extension [Self <: XDispatchProviderInterception](x: Self) {
    
    inline def setRegisterDispatchProviderInterceptor(value: XDispatchProviderInterceptor => Callback): Self = StObject.set(x, "registerDispatchProviderInterceptor", js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => value(t0).runNow()))
    
    inline def setReleaseDispatchProviderInterceptor(value: XDispatchProviderInterceptor => Callback): Self = StObject.set(x, "releaseDispatchProviderInterceptor", js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => value(t0).runNow()))
  }
}
