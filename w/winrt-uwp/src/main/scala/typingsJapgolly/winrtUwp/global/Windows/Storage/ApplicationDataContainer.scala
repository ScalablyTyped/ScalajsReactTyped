package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a container for app settings. The methods and properties of this class support creating, deleting, enumerating, and traversing the container hierarchy. */
/* note: abstract class */ @JSGlobal("Windows.Storage.ApplicationDataContainer")
@js.native
open class ApplicationDataContainer ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Storage.ApplicationDataContainer {
  
  /** Gets the child application settings containers of this application settings container. */
  /* CompleteClass */
  var containers: IMapView[String, typingsJapgolly.winrtUwp.Windows.Storage.ApplicationDataContainer] = js.native
  
  /**
    * Creates or opens the specified settings container in the current settings container.
    * @param name The name of the container.
    * @param disposition One of the enumeration values.
    * @return The settings container.
    */
  /* CompleteClass */
  override def createContainer(
    name: String,
    disposition: typingsJapgolly.winrtUwp.Windows.Storage.ApplicationDataCreateDisposition
  ): typingsJapgolly.winrtUwp.Windows.Storage.ApplicationDataContainer = js.native
  
  /**
    * Deletes the specified settings container, its subcontainers, and all application settings in the hierarchy.
    * @param name The name of the settings container.
    */
  /* CompleteClass */
  override def deleteContainer(name: String): Unit = js.native
  
  /** Gets the type (local or roaming) of the app data store that is associated with the current settings container. */
  /* CompleteClass */
  var locality: typingsJapgolly.winrtUwp.Windows.Storage.ApplicationDataLocality = js.native
  
  /** Gets the name of the current settings container. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets an object that represents the settings in this settings container. */
  /* CompleteClass */
  var values: IPropertySet = js.native
}
