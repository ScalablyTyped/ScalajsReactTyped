package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides easy read-only access to the complete configuration.
  *
  * This service is still unpublished and unstable.
  * @since LibreOffice 4.0
  */
trait ReadOnlyAccess
  extends StObject
     with XHierarchicalNameAccess {
  
  /**
    * Service constructor.
    * @param locale a string representation of the locale to use for localized properties; use `*` for all-locale access
    */
  def create(locale: String): Unit
}
object ReadOnlyAccess {
  
  inline def apply(
    acquire: Callback,
    create: String => Callback,
    getByHierarchicalName: String => Any,
    hasByHierarchicalName: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): ReadOnlyAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, create = js.Any.fromFunction1((t0: String) => create(t0).runNow()), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[ReadOnlyAccess]
  }
  
  extension [Self <: ReadOnlyAccess](x: Self) {
    
    inline def setCreate(value: String => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
