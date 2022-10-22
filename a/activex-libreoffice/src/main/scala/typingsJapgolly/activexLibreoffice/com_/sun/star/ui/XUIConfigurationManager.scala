package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a user interface configuration manager interface which controls the structure of all customizable user interface elements.
  * @since OOo 2.0
  */
trait XUIConfigurationManager
  extends StObject
     with XInterface {
  
  /**
    * retrieves the events manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one events manager instance which controls the mapping of events to script URLs of a module or
    * document.
    * @returns the events manager of the user interface configuration manager, if one exists.
    */
  val EventsManager: XInterface
  
  /**
    * retrieves the image manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one image manager instance which controls all images of a module or document.
    * @returns the image manager of the user interface configuration manager.
    */
  val ImageManager: XInterface
  
  /**
    * retrieves the keyboard short cut manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one keyboard short cut manager instance which controls all short cuts of a module or document.
    * @returns the short cut manager of the user interface configuration manager.
    */
  val ShortCutManager: XAcceleratorConfiguration
  
  /**
    * creates an empty settings data container.
    * @returns an empty user interface element settings data container, which implements {@link UIElementSettings} .
    */
  def createSettings(): XIndexContainer
  
  /**
    * retrieves the events manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one events manager instance which controls the mapping of events to script URLs of a module or
    * document.
    * @returns the events manager of the user interface configuration manager, if one exists.
    */
  def getEventsManager(): XInterface
  
  /**
    * retrieves the image manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one image manager instance which controls all images of a module or document.
    * @returns the image manager of the user interface configuration manager.
    */
  def getImageManager(): XInterface
  
  /**
    * retrieves the settings of a user interface element.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @param bWriteable must be `TRUE` if the retrieved settings should be a writable. Otherwise `FALSE` should be provided to get a shareable reference to th
    * @returns settings data of an existing user interface element, which implements {@link UIElementSettings} . If the settings data cannot be found a {@link c
    */
  def getSettings(ResourceURL: String, bWriteable: Boolean): XIndexAccess
  
  /**
    * retrieves the keyboard short cut manager from the user interface configuration manager.
    *
    * Every user interface configuration manager has one keyboard short cut manager instance which controls all short cuts of a module or document.
    * @returns the short cut manager of the user interface configuration manager.
    */
  def getShortCutManager(): XAcceleratorConfiguration
  
  /**
    * retrieves information about all user interface elements within the user interface configuration manager.
    * @param ElementType makes it possible to narrow the result set to only one type of user interface elements. If all user interface element types should be
    * @returns returns all user interface elements within the user interface configuration manager that meet the given ElementType specification. The following
    * @see UIElementType
    */
  def getUIElementsInfo(ElementType: Double): SafeArray[SafeArray[PropertyValue]]
  
  /**
    * determines if the settings of a user interface element is part the user interface configuration manager.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if settings have been found, otherwise `FALSE` .
    */
  def hasSettings(ResourceURL: String): Boolean
  
  /**
    * inserts the settings of a new user interface element.
    * @param NewResourceURL a resource URL which identifies the new user interface element.
    * @param aNewData the settings data of the new user interface element, which implements {@link UIElementSettings} .  If the settings data is already prese
    */
  def insertSettings(NewResourceURL: String, aNewData: XIndexAccess): Unit
  
  /**
    * removes the settings of an existing user interface element.
    * @param ResourceURL a resource URL which identifies the user interface element settings to be removed.  If the settings data cannot be found a {@link com
    */
  def removeSettings(ResourceURL: String): Unit
  
  /**
    * replaces the settings of a user interface element with new settings.
    * @param ResourceURL a resource URL which identifies the user interface element to be replaced. If no element with the given resource URL exists a {@link
    * @param aNewData the new settings data of an existing user interface element, which implements {@link UIElementSettings} .  If the settings data cannot b
    */
  def replaceSettings(ResourceURL: String, aNewData: XIndexAccess): Unit
  
  /**
    * resets the configuration manager to the default user interface configuration data.
    *
    * This means that all user interface configuration data of the instance will be removed. A module based user interface configuration manager removes
    * user defined elements, but set all other elements back to default. It is not possible to remove default elements from a module user interface
    * configuration manager.
    */
  def reset(): Unit
}
object XUIConfigurationManager {
  
  inline def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: Callback,
    createSettings: CallbackTo[XIndexContainer],
    getEventsManager: CallbackTo[XInterface],
    getImageManager: CallbackTo[XInterface],
    getSettings: (String, Boolean) => XIndexAccess,
    getShortCutManager: CallbackTo[XAcceleratorConfiguration],
    getUIElementsInfo: Double => SafeArray[SafeArray[PropertyValue]],
    hasSettings: String => Boolean,
    insertSettings: (String, XIndexAccess) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSettings: String => Callback,
    replaceSettings: (String, XIndexAccess) => Callback,
    reset: Callback
  ): XUIConfigurationManager = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager.asInstanceOf[js.Any], ImageManager = ImageManager.asInstanceOf[js.Any], ShortCutManager = ShortCutManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, createSettings = createSettings.toJsFn, getEventsManager = getEventsManager.toJsFn, getImageManager = getImageManager.toJsFn, getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = getShortCutManager.toJsFn, getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (insertSettings(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSettings = js.Any.fromFunction1((t0: String) => removeSettings(t0).runNow()), replaceSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (replaceSettings(t0, t1)).runNow()), reset = reset.toJsFn)
    __obj.asInstanceOf[XUIConfigurationManager]
  }
  
  extension [Self <: XUIConfigurationManager](x: Self) {
    
    inline def setCreateSettings(value: CallbackTo[XIndexContainer]): Self = StObject.set(x, "createSettings", value.toJsFn)
    
    inline def setEventsManager(value: XInterface): Self = StObject.set(x, "EventsManager", value.asInstanceOf[js.Any])
    
    inline def setGetEventsManager(value: CallbackTo[XInterface]): Self = StObject.set(x, "getEventsManager", value.toJsFn)
    
    inline def setGetImageManager(value: CallbackTo[XInterface]): Self = StObject.set(x, "getImageManager", value.toJsFn)
    
    inline def setGetSettings(value: (String, Boolean) => XIndexAccess): Self = StObject.set(x, "getSettings", js.Any.fromFunction2(value))
    
    inline def setGetShortCutManager(value: CallbackTo[XAcceleratorConfiguration]): Self = StObject.set(x, "getShortCutManager", value.toJsFn)
    
    inline def setGetUIElementsInfo(value: Double => SafeArray[SafeArray[PropertyValue]]): Self = StObject.set(x, "getUIElementsInfo", js.Any.fromFunction1(value))
    
    inline def setHasSettings(value: String => Boolean): Self = StObject.set(x, "hasSettings", js.Any.fromFunction1(value))
    
    inline def setImageManager(value: XInterface): Self = StObject.set(x, "ImageManager", value.asInstanceOf[js.Any])
    
    inline def setInsertSettings(value: (String, XIndexAccess) => Callback): Self = StObject.set(x, "insertSettings", js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (value(t0, t1)).runNow()))
    
    inline def setRemoveSettings(value: String => Callback): Self = StObject.set(x, "removeSettings", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setReplaceSettings(value: (String, XIndexAccess) => Callback): Self = StObject.set(x, "replaceSettings", js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (value(t0, t1)).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setShortCutManager(value: XAcceleratorConfiguration): Self = StObject.set(x, "ShortCutManager", value.asInstanceOf[js.Any])
  }
}
