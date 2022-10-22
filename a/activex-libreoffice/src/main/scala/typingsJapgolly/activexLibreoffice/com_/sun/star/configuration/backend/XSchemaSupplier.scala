package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to configuration component schemas.
  * @since OOo 1.1.2
  */
trait XSchemaSupplier
  extends StObject
     with XInterface {
  
  /**
    * Returns the schema information (component + templates) for a particular component.
    * @param aComponent component whose schema will be accessed
    * @returns an object allowing access to the various parts of the schema, `NULL` if the component doesn't exist.
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getComponentSchema(aComponent: String): XSchema
}
object XSchemaSupplier {
  
  inline def apply(
    acquire: Callback,
    getComponentSchema: String => XSchema,
    queryInterface: `type` => Any,
    release: Callback
  ): XSchemaSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getComponentSchema = js.Any.fromFunction1(getComponentSchema), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSchemaSupplier]
  }
  
  extension [Self <: XSchemaSupplier](x: Self) {
    
    inline def setGetComponentSchema(value: String => XSchema): Self = StObject.set(x, "getComponentSchema", js.Any.fromFunction1(value))
  }
}
