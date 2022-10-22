package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles access to the elements of a component schema, i.e its templates and its component definition.
  * @since OOo 1.1.2
  */
trait XSchema
  extends StObject
     with XInterface {
  
  /**
    * Describes only the component definition to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the component definition
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readComponent(aHandler: XSchemaHandler): Unit
  
  /**
    * Describes the full schema (templates + component) to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the templates and the component definition
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readSchema(aHandler: XSchemaHandler): Unit
  
  /**
    * Describes the component templates to a {@link XSchemaHandler} .
    * @param aHandler schema handler that will receive calls describing the contents of the templates
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data or if a subsequent call to any of the
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XSchemaHandler} .
    */
  def readTemplates(aHandler: XSchemaHandler): Unit
}
object XSchema {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    readComponent: XSchemaHandler => Callback,
    readSchema: XSchemaHandler => Callback,
    readTemplates: XSchemaHandler => Callback,
    release: Callback
  ): XSchema = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1((t0: XSchemaHandler) => readComponent(t0).runNow()), readSchema = js.Any.fromFunction1((t0: XSchemaHandler) => readSchema(t0).runNow()), readTemplates = js.Any.fromFunction1((t0: XSchemaHandler) => readTemplates(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XSchema]
  }
  
  extension [Self <: XSchema](x: Self) {
    
    inline def setReadComponent(value: XSchemaHandler => Callback): Self = StObject.set(x, "readComponent", js.Any.fromFunction1((t0: XSchemaHandler) => value(t0).runNow()))
    
    inline def setReadSchema(value: XSchemaHandler => Callback): Self = StObject.set(x, "readSchema", js.Any.fromFunction1((t0: XSchemaHandler) => value(t0).runNow()))
    
    inline def setReadTemplates(value: XSchemaHandler => Callback): Self = StObject.set(x, "readTemplates", js.Any.fromFunction1((t0: XSchemaHandler) => value(t0).runNow()))
  }
}
