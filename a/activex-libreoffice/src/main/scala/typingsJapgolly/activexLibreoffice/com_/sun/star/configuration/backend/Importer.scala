package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * imports data into a configuration layer.
  *
  * The configuration changes are read from a {@link XLayer} and stored into a {@link Backend} .
  * @since OOo 1.1.2
  */
trait Importer
  extends StObject
     with XLayerImporter
     with XInitialization
object Importer {
  
  inline def apply(
    TargetBackend: XBackend,
    acquire: Callback,
    getTargetBackend: CallbackTo[XBackend],
    importLayer: XLayer => Callback,
    importLayerForEntity: (XLayer, String) => Callback,
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setTargetBackend: XBackend => Callback
  ): Importer = {
    val __obj = js.Dynamic.literal(TargetBackend = TargetBackend.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTargetBackend = getTargetBackend.toJsFn, importLayer = js.Any.fromFunction1((t0: XLayer) => importLayer(t0).runNow()), importLayerForEntity = js.Any.fromFunction2((t0: XLayer, t1: String) => (importLayerForEntity(t0, t1)).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTargetBackend = js.Any.fromFunction1((t0: XBackend) => setTargetBackend(t0).runNow()))
    __obj.asInstanceOf[Importer]
  }
}
