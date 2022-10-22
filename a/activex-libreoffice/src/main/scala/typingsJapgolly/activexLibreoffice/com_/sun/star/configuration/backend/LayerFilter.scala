package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a filtered version of a configuration data {@link Layer} .
  *
  * A layer filter wraps a source {@link XLayer} object and provides access to a filtered version of its data. The data read from the filter usually is
  * produced from the source data by adding and removing elements or modifying values.
  * @see com.sun.star.configuration.backend.DataImporter Service that supports applying a LayerFilter to imported data.
  * @since OOo 2.0
  */
trait LayerFilter
  extends StObject
     with XLayer
     with XInitialization
object LayerFilter {
  
  inline def apply(
    acquire: Callback,
    initialize: SeqEquiv[Any] => Callback,
    queryInterface: `type` => Any,
    readData: XLayerHandler => Callback,
    release: Callback
  ): LayerFilter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1((t0: XLayerHandler) => readData(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[LayerFilter]
  }
}
