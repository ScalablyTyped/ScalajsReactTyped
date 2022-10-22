package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface enables an object to get interceptors registered that change context menus or prevent them from being executed. */
trait XContextMenuInterception
  extends StObject
     with XInterface {
  
  /** registers an {@link XContextMenuInterceptor} , which will become the first interceptor in the chain of registered interceptors. */
  def registerContextMenuInterceptor(Interceptor: XContextMenuInterceptor): Unit
  
  /**
    * removes an {@link XContextMenuInterceptor} which was previously registered using {@link XContextMenuInterception.registerContextMenuInterceptor()} .
    *
    * The order of removals is arbitrary. It is not necessary to remove the last registered interceptor first.
    */
  def releaseContextMenuInterceptor(Interceptor: XContextMenuInterceptor): Unit
}
object XContextMenuInterception {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Callback,
    release: Callback,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Callback
  ): XContextMenuInterception = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1((t0: XContextMenuInterceptor) => registerContextMenuInterceptor(t0).runNow()), release = release.toJsFn, releaseContextMenuInterceptor = js.Any.fromFunction1((t0: XContextMenuInterceptor) => releaseContextMenuInterceptor(t0).runNow()))
    __obj.asInstanceOf[XContextMenuInterception]
  }
  
  extension [Self <: XContextMenuInterception](x: Self) {
    
    inline def setRegisterContextMenuInterceptor(value: XContextMenuInterceptor => Callback): Self = StObject.set(x, "registerContextMenuInterceptor", js.Any.fromFunction1((t0: XContextMenuInterceptor) => value(t0).runNow()))
    
    inline def setReleaseContextMenuInterceptor(value: XContextMenuInterceptor => Callback): Self = StObject.set(x, "releaseContextMenuInterceptor", js.Any.fromFunction1((t0: XContextMenuInterceptor) => value(t0).runNow()))
  }
}
