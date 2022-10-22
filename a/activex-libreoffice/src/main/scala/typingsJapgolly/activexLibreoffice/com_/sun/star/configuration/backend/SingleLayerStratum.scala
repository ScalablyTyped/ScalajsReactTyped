package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a single layer of configuration data */
trait SingleLayerStratum
  extends StObject
     with XSingleLayerStratum
     with XBackendEntities
object SingleLayerStratum {
  
  inline def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: Callback,
    getAdminEntity: CallbackTo[String],
    getLayer: (String, String) => XLayer,
    getOwnerEntity: CallbackTo[String],
    getUpdatableLayer: String => XUpdatableLayer,
    isEqualEntity: (String, String) => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    supportsEntity: String => Boolean
  ): SingleLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAdminEntity = getAdminEntity.toJsFn, getLayer = js.Any.fromFunction2(getLayer), getOwnerEntity = getOwnerEntity.toJsFn, getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), isEqualEntity = js.Any.fromFunction2(isEqualEntity), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[SingleLayerStratum]
  }
}
