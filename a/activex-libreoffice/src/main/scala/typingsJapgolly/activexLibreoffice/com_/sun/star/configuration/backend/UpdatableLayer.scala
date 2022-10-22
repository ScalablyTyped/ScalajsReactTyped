package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read/write access to a configuration data layer.
  *
  * A layer contains the configuration setting changes to be performed on a default layer (or schema) to obtain the values of those settings for a given
  * entity and component.
  *
  * An updatable layer can be read or replaced with another layer.
  * @since OOo 1.1.2
  */
trait UpdatableLayer
  extends StObject
     with Layer
     with XUpdatableLayer
object UpdatableLayer {
  
  inline def apply(
    Timestamp: String,
    URL: String,
    acquire: Callback,
    getTimestamp: CallbackTo[String],
    listSubLayerIds: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    readData: XLayerHandler => Callback,
    readSubLayerData: (XLayerHandler, String) => Callback,
    release: Callback,
    replaceWith: XLayer => Callback
  ): UpdatableLayer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTimestamp = getTimestamp.toJsFn, listSubLayerIds = listSubLayerIds.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1((t0: XLayerHandler) => readData(t0).runNow()), readSubLayerData = js.Any.fromFunction2((t0: XLayerHandler, t1: String) => (readSubLayerData(t0, t1)).runNow()), release = release.toJsFn, replaceWith = js.Any.fromFunction1((t0: XLayer) => replaceWith(t0).runNow()))
    __obj.asInstanceOf[UpdatableLayer]
  }
}
