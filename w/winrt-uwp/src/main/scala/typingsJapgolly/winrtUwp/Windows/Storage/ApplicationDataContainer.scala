package typingsJapgolly.winrtUwp.Windows.Storage

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a container for app settings. The methods and properties of this class support creating, deleting, enumerating, and traversing the container hierarchy. */
trait ApplicationDataContainer extends StObject {
  
  /** Gets the child application settings containers of this application settings container. */
  var containers: IMapView[String, ApplicationDataContainer]
  
  /**
    * Creates or opens the specified settings container in the current settings container.
    * @param name The name of the container.
    * @param disposition One of the enumeration values.
    * @return The settings container.
    */
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer
  
  /**
    * Deletes the specified settings container, its subcontainers, and all application settings in the hierarchy.
    * @param name The name of the settings container.
    */
  def deleteContainer(name: String): Unit
  
  /** Gets the type (local or roaming) of the app data store that is associated with the current settings container. */
  var locality: ApplicationDataLocality
  
  /** Gets the name of the current settings container. */
  var name: String
  
  /** Gets an object that represents the settings in this settings container. */
  var values: IPropertySet
}
object ApplicationDataContainer {
  
  inline def apply(
    containers: IMapView[String, ApplicationDataContainer],
    createContainer: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer,
    deleteContainer: String => Callback,
    locality: ApplicationDataLocality,
    name: String,
    values: IPropertySet
  ): ApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1((t0: String) => deleteContainer(t0).runNow()), locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDataContainer]
  }
  
  extension [Self <: ApplicationDataContainer](x: Self) {
    
    inline def setContainers(value: IMapView[String, ApplicationDataContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setCreateContainer(value: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer): Self = StObject.set(x, "createContainer", js.Any.fromFunction2(value))
    
    inline def setDeleteContainer(value: String => Callback): Self = StObject.set(x, "deleteContainer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLocality(value: ApplicationDataLocality): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: IPropertySet): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
