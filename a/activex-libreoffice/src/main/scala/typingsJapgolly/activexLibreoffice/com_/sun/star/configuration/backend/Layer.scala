package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XTimeStamped
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read-only access to a configuration data layer.
  *
  * A layer contains the configuration setting changes to be performed on a default settings tree to obtain the values of those settings for a given
  * entity and component.
  * @see com.sun.star.configuration.backend.Schema Service providing access to schema data for a configuration component.
  * @see com.sun.star.configuration.backend.UpdatableLayer Service providing write access to a configuration data layer.
  * @since OOo 1.1.2
  */
trait Layer
  extends StObject
     with XCompositeLayer
     with XTimeStamped {
  
  /**
    * The URL of the layer data.
    * @since OOo 2.0
    */
  var URL: String
}
object Layer {
  
  inline def apply(
    Timestamp: String,
    URL: String,
    acquire: Callback,
    getTimestamp: CallbackTo[String],
    listSubLayerIds: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    readData: XLayerHandler => Callback,
    readSubLayerData: (XLayerHandler, String) => Callback,
    release: Callback
  ): Layer = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTimestamp = getTimestamp.toJsFn, listSubLayerIds = listSubLayerIds.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1((t0: XLayerHandler) => readData(t0).runNow()), readSubLayerData = js.Any.fromFunction2((t0: XLayerHandler, t1: String) => (readSubLayerData(t0, t1)).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[Layer]
  }
  
  extension [Self <: Layer](x: Self) {
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
