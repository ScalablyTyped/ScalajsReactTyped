package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements {@link Backend} provides access to a configuration database composed of one or more storage backends containing settings used by software
  * modules.
  */
trait MultiStratumBackend
  extends StObject
     with Backend
     with XInitialization
object MultiStratumBackend {
  
  inline def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: Callback,
    getAdminEntity: CallbackTo[String],
    getComponentSchema: String => XSchema,
    getOwnUpdateHandler: String => XUpdateHandler,
    getOwnerEntity: CallbackTo[String],
    getUpdateHandler: (String, String) => XUpdateHandler,
    initialize: SeqEquiv[Any] => Callback,
    isEqualEntity: (String, String) => Boolean,
    listLayers: (String, String) => SafeArray[XLayer],
    listOwnLayers: String => SafeArray[XLayer],
    queryInterface: `type` => Any,
    release: Callback,
    supportsEntity: String => Boolean
  ): MultiStratumBackend = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAdminEntity = getAdminEntity.toJsFn, getComponentSchema = js.Any.fromFunction1(getComponentSchema), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getOwnerEntity = getOwnerEntity.toJsFn, getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[MultiStratumBackend]
  }
}
