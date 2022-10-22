package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a configuration storage backends containing a complete configuration database, including user data, default or policy layers and schemata.
  *
  * Configuration data is organized into layers which are selected by components and entities.
  *
  * Components are characterized by configuration schemas. A component contains configuration data for a particular application domain or software module.
  *
  * Entities are organized hierarchically in organizations, groups, roles and individual users. Each element of the associated hierarchy corresponds to a
  * layer that applies to an entity.
  *
  * Layers contains data for multiple components associated to a single entity.
  * @since OOo 1.1.2
  */
trait SingleBackend
  extends StObject
     with XSchemaSupplier
     with XMultiLayerStratum
     with XBackendEntities
object SingleBackend {
  
  inline def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: Callback,
    getAdminEntity: CallbackTo[String],
    getComponentSchema: String => XSchema,
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
  ): SingleBackend = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAdminEntity = getAdminEntity.toJsFn, getComponentSchema = js.Any.fromFunction1(getComponentSchema), getLayer = js.Any.fromFunction2(getLayer), getLayers = js.Any.fromFunction2(getLayers), getMultipleLayers = js.Any.fromFunction2(getMultipleLayers), getOwnerEntity = getOwnerEntity.toJsFn, getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), getUpdateLayerId = js.Any.fromFunction2(getUpdateLayerId), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayerIds = js.Any.fromFunction2(listLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[SingleBackend]
  }
}
