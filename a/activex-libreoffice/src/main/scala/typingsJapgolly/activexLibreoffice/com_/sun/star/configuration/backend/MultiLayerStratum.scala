package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a singe layer of configuration data */
trait MultiLayerStratum
  extends StObject
     with XMultiLayerStratum
     with XBackendEntities
object MultiLayerStratum {
  
  inline def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: Callback,
    getAdminEntity: CallbackTo[String],
    getLayer: (String, String) => XLayer,
    getLayers: (SeqEquiv[String], String) => SafeArray[XLayer],
    getMultipleLayers: (SeqEquiv[String], SeqEquiv[String]) => SafeArray[XLayer],
    getOwnerEntity: CallbackTo[String],
    getUpdatableLayer: String => XUpdatableLayer,
    getUpdateLayerId: (String, String) => String,
    isEqualEntity: (String, String) => Boolean,
    listLayerIds: (String, String) => SafeArray[String],
    queryInterface: `type` => Any,
    release: Callback,
    supportsEntity: String => Boolean
  ): MultiLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAdminEntity = getAdminEntity.toJsFn, getLayer = js.Any.fromFunction2(getLayer), getLayers = js.Any.fromFunction2(getLayers), getMultipleLayers = js.Any.fromFunction2(getMultipleLayers), getOwnerEntity = getOwnerEntity.toJsFn, getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), getUpdateLayerId = js.Any.fromFunction2(getUpdateLayerId), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayerIds = js.Any.fromFunction2(listLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[MultiLayerStratum]
  }
}
