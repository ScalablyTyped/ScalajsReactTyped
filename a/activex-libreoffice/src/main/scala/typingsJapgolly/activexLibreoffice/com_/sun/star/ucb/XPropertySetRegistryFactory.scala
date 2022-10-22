package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory for property set registries.
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XPropertySetRegistryFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a property set registry.
    * @param URL The identifier of the registry to create ( e.g. file-URL ). The value can be an empty string.
    * @returns The registry.
    */
  def createPropertySetRegistry(URL: String): XPropertySetRegistry
}
object XPropertySetRegistryFactory {
  
  inline def apply(
    acquire: Callback,
    createPropertySetRegistry: String => XPropertySetRegistry,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertySetRegistryFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createPropertySetRegistry = js.Any.fromFunction1(createPropertySetRegistry), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertySetRegistryFactory]
  }
  
  extension [Self <: XPropertySetRegistryFactory](x: Self) {
    
    inline def setCreatePropertySetRegistry(value: String => XPropertySetRegistry): Self = StObject.set(x, "createPropertySetRegistry", js.Any.fromFunction1(value))
  }
}
