package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides read only access to a configuration component schema.
  *
  * A component is a set of hierarchically organized and semantically related configuration settings, e.g StarWriter settings.
  *
  * A component schema contains two separate sections, one which describes the templates to be used in the dynamic containers (sets) of the component and
  * one which describes the component's data structure.
  * @see com.sun.star.configuration.backend.Layer Service providing access to individual configuration data for an entity.
  * @since OOo 1.1.2
  */
trait Schema
  extends StObject
     with XSchema {
  
  /**
    * The URL of the layer data.
    * @since OOo 2.0
    */
  var URL: String
}
object Schema {
  
  inline def apply(
    URL: String,
    acquire: Callback,
    queryInterface: `type` => Any,
    readComponent: XSchemaHandler => Callback,
    readSchema: XSchemaHandler => Callback,
    readTemplates: XSchemaHandler => Callback,
    release: Callback
  ): Schema = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1((t0: XSchemaHandler) => readComponent(t0).runNow()), readSchema = js.Any.fromFunction1((t0: XSchemaHandler) => readSchema(t0).runNow()), readTemplates = js.Any.fromFunction1((t0: XSchemaHandler) => readTemplates(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
