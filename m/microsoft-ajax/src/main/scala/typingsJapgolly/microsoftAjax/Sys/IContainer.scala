package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Interfaces
/**
  * Provides a common interface for all components that can contain other components.
  */
trait IContainer extends StObject {
  
  //#region Methods
  /**
    * Adds a Component object to the current container.
    * Implement this method for an object that will contain one or more component objects in order to programmatically add components to that container.
    * @param component
    *           The Component object to add.
    */
  def addComponent(component: Component): Unit
  
  /**
    * Returns the specified Component instance.
    * Implement this method for an object that will contain one or more component objects to access components within that container.
    * @param id
    *           The ID of the Component object to search for.
    * @return The Component instance with the specified ID.
    */
  def findComponent(id: String): Component
  
  /**
    * Returns an array of all objects in the current container that inherit from Component.
    * Implement this method for an object that will contain one or more component objects so that the components in that container are available. Types that implement this method should return a copy of the list of components so that modifying the array does not change the contents of the container.
    * @return An array of all objects in the current container that inherit from Component.
    */
  def getComponents(): js.Array[Component]
  
  /**
    * Removes a Component object from the current container.
    * @param component
    *               The Component object to remove.
    */
  def removeComponent(component: Component): Unit
}
object IContainer {
  
  inline def apply(
    addComponent: Component => Callback,
    findComponent: String => Component,
    getComponents: CallbackTo[js.Array[Component]],
    removeComponent: Component => Callback
  ): IContainer = {
    val __obj = js.Dynamic.literal(addComponent = js.Any.fromFunction1((t0: Component) => addComponent(t0).runNow()), findComponent = js.Any.fromFunction1(findComponent), getComponents = getComponents.toJsFn, removeComponent = js.Any.fromFunction1((t0: Component) => removeComponent(t0).runNow()))
    __obj.asInstanceOf[IContainer]
  }
  
  extension [Self <: IContainer](x: Self) {
    
    inline def setAddComponent(value: Component => Callback): Self = StObject.set(x, "addComponent", js.Any.fromFunction1((t0: Component) => value(t0).runNow()))
    
    inline def setFindComponent(value: String => Component): Self = StObject.set(x, "findComponent", js.Any.fromFunction1(value))
    
    inline def setGetComponents(value: CallbackTo[js.Array[Component]]): Self = StObject.set(x, "getComponents", value.toJsFn)
    
    inline def setRemoveComponent(value: Component => Callback): Self = StObject.set(x, "removeComponent", js.Any.fromFunction1((t0: Component) => value(t0).runNow()))
  }
}
