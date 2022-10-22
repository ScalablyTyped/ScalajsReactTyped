package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides {@link XDispatch} objects for certain functions which are useful at the UI
  *
  * Such dispatch objects must be queried explicitly and used for queried purposes only. They can handle requests with guaranteed notifications ( {@link
  * XNotifyingDispatch} ) or with possible (but not guaranteed) notifications ( {@link XDispatch} ).
  * @see XNotifyingDispatch
  * @see XDispatch
  * @see XControlNotificationListener
  */
trait DispatchProvider
  extends StObject
     with XDispatchProvider
     with XDispatchProviderInterception
object DispatchProvider {
  
  inline def apply(
    acquire: Callback,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback,
    release: Callback,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Callback
  ): DispatchProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => registerDispatchProviderInterceptor(t0).runNow()), release = release.toJsFn, releaseDispatchProviderInterceptor = js.Any.fromFunction1((t0: XDispatchProviderInterceptor) => releaseDispatchProviderInterceptor(t0).runNow()))
    __obj.asInstanceOf[DispatchProvider]
  }
}
