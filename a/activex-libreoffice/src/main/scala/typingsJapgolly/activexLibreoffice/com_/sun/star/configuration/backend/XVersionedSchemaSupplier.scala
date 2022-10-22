package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to versioned configuration component schemas.
  * @since OOo 2.0
  */
trait XVersionedSchemaSupplier
  extends StObject
     with XSchemaSupplier {
  
  /**
    * Returns the schema version for a particular component.
    * @param aComponent component whose schema version will be determined
    * @returns a `string` that identifies the schema version for the given component.  The format of the version string is arbitrary. No meaning should be attac
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the version data.
    */
  def getSchemaVersion(aComponent: String): String
}
object XVersionedSchemaSupplier {
  
  inline def apply(
    acquire: Callback,
    getComponentSchema: String => XSchema,
    getSchemaVersion: String => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XVersionedSchemaSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getComponentSchema = js.Any.fromFunction1(getComponentSchema), getSchemaVersion = js.Any.fromFunction1(getSchemaVersion), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XVersionedSchemaSupplier]
  }
  
  extension [Self <: XVersionedSchemaSupplier](x: Self) {
    
    inline def setGetSchemaVersion(value: String => String): Self = StObject.set(x, "getSchemaVersion", js.Any.fromFunction1(value))
  }
}
