package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a configuration data composed of one or more platform backends containing settings used by software modules. */
trait SystemIntegration
  extends StObject
     with XBackend
     with XInitialization
object SystemIntegration {
  
  inline def apply(
    acquire: Callback,
    getOwnUpdateHandler: String => XUpdateHandler,
    getUpdateHandler: (String, String) => XUpdateHandler,
    initialize: SeqEquiv[Any] => Callback,
    listLayers: (String, String) => SafeArray[XLayer],
    listOwnLayers: String => SafeArray[XLayer],
    queryInterface: `type` => Any,
    release: Callback
  ): SystemIntegration = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[SystemIntegration]
  }
}
