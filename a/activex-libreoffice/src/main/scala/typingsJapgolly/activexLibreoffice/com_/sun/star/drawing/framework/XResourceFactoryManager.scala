package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XResourceFactoryManager} is part of the configuration controller and manages the set of registered resource factories.
  * @see XConfigurationController
  * @see XResourceFactory
  */
trait XResourceFactoryManager extends StObject {
  
  /**
    * Register a new resource factory for the given URL.
    *
    * When one factory is responsible for more than one type of resource then this method has to be called for each type. If this method is called multiple
    * times for the same URL then a previously registered factory is removed for the URL.
    * @param sResourceURL The URL of the resource that the factory can create.
    * @param xResourceFactory The resource factory object.
    */
  def addResourceFactory(sResourceURL: String, xResourceFactory: XResourceFactory): Unit
  
  /**
    * Return the resource factory that was previously registered for the given resource type. This method is typically called by one of the resource
    * controllers.
    * @param sResourceURL The URL of the resource type for which to return the resource factory.
    * @returns When no resource factory was registered for the given resource type then an empty reference is returned.
    */
  def getResourceFactory(sResourceURL: String): XResourceFactory
  
  /**
    * Remove a resource factory for all resource types it has been registered for. Use {@link removeResourceFactoryForURL()} to remove a factory just for
    * one resource type and to leave it registered for others.
    * @param xResourceFactory The resource factory object to remove.
    */
  def removeResourceFactoryForReference(xResourceFactory: XResourceFactory): Unit
  
  /**
    * Remove a resource factory for one type of resource. When the factory has been registered for other URLs as well then it remains registered for them.
    * Use the {@link removeResourceFactoryForReference()} to remove a factory completely.
    * @param sResourceURL The URL for which to remove the resource factory.
    */
  def removeResourceFactoryForURL(sResourceURL: String): Unit
}
object XResourceFactoryManager {
  
  inline def apply(
    addResourceFactory: (String, XResourceFactory) => Callback,
    getResourceFactory: String => XResourceFactory,
    removeResourceFactoryForReference: XResourceFactory => Callback,
    removeResourceFactoryForURL: String => Callback
  ): XResourceFactoryManager = {
    val __obj = js.Dynamic.literal(addResourceFactory = js.Any.fromFunction2((t0: String, t1: XResourceFactory) => (addResourceFactory(t0, t1)).runNow()), getResourceFactory = js.Any.fromFunction1(getResourceFactory), removeResourceFactoryForReference = js.Any.fromFunction1((t0: XResourceFactory) => removeResourceFactoryForReference(t0).runNow()), removeResourceFactoryForURL = js.Any.fromFunction1((t0: String) => removeResourceFactoryForURL(t0).runNow()))
    __obj.asInstanceOf[XResourceFactoryManager]
  }
  
  extension [Self <: XResourceFactoryManager](x: Self) {
    
    inline def setAddResourceFactory(value: (String, XResourceFactory) => Callback): Self = StObject.set(x, "addResourceFactory", js.Any.fromFunction2((t0: String, t1: XResourceFactory) => (value(t0, t1)).runNow()))
    
    inline def setGetResourceFactory(value: String => XResourceFactory): Self = StObject.set(x, "getResourceFactory", js.Any.fromFunction1(value))
    
    inline def setRemoveResourceFactoryForReference(value: XResourceFactory => Callback): Self = StObject.set(x, "removeResourceFactoryForReference", js.Any.fromFunction1((t0: XResourceFactory) => value(t0).runNow()))
    
    inline def setRemoveResourceFactoryForURL(value: String => Callback): Self = StObject.set(x, "removeResourceFactoryForURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
