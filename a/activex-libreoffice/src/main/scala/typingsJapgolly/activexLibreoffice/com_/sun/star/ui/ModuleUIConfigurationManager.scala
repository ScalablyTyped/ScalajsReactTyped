package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a user interface configuration manager which gives access to user interface configuration data of a module.
  *
  * A module user interface configuration manager supports two layers of configuration settings data: ;  1. Layer: A module default user interface
  * configuration which describe all user interface elements settings that are used by OpenOffice. It is not possible to insert, remove or change elements
  * settings in this layer through the interfaces. ;  2. Layer: A module user interface configuration which only contains customized user interface
  * elements and user-defined ones. All changes on user interface element settings are done on this layer.
  * @since OOo 2.0
  */
trait ModuleUIConfigurationManager
  extends StObject
     with XModuleUIConfigurationManager2 {
  
  /**
    * provides a function to initialize a module user interface configuration manager instance.
    *
    * A module user interface configuration manager instance needs the following arguments as {@link com.sun.star.beans.PropertyValue} to be in a working
    * state: **DefaultConfigStorage** a reference to a {@link com.sun.star.embed.Storage} that contains the default module user interface configuration
    * settings.**UserConfigStorage** a reference to a {@link com.sun.star.embed.Storage} that contains the user-defined module user interface configuration
    * settings.**ModuleIdentifier** string that provides the module identifier.**UserRootCommit** a reference to a {@link
    * com.sun.star.embed.XTransactedObject} which represents the customizable root storage. Every implementation must use this reference to commit its
    * changes also at the root storage. A non-initialized module user interface configuration manager cannot be used, it is treated as a read-only
    * container.
    */
  def createDefault(ModuleShortName: String, ModuleIdentifier: String): Unit
}
object ModuleUIConfigurationManager {
  
  inline def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: Callback,
    addConfigurationListener: XUIConfigurationListener => Callback,
    createDefault: (String, String) => Callback,
    createSettings: CallbackTo[XIndexContainer],
    getDefaultSettings: String => XIndexAccess,
    getEventsManager: CallbackTo[XInterface],
    getImageManager: CallbackTo[XInterface],
    getSettings: (String, Boolean) => XIndexAccess,
    getShortCutManager: CallbackTo[XAcceleratorConfiguration],
    getUIElementsInfo: Double => SafeArray[SafeArray[PropertyValue]],
    hasSettings: String => Boolean,
    insertSettings: (String, XIndexAccess) => Callback,
    isDefaultSettings: String => Boolean,
    isModified: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: Callback,
    removeConfigurationListener: XUIConfigurationListener => Callback,
    removeSettings: String => Callback,
    replaceSettings: (String, XIndexAccess) => Callback,
    reset: Callback,
    store: Callback,
    storeToStorage: XStorage => Callback
  ): ModuleUIConfigurationManager = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager.asInstanceOf[js.Any], ImageManager = ImageManager.asInstanceOf[js.Any], ShortCutManager = ShortCutManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, addConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => addConfigurationListener(t0).runNow()), createDefault = js.Any.fromFunction2((t0: String, t1: String) => (createDefault(t0, t1)).runNow()), createSettings = createSettings.toJsFn, getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), getEventsManager = getEventsManager.toJsFn, getImageManager = getImageManager.toJsFn, getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = getShortCutManager.toJsFn, getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (insertSettings(t0, t1)).runNow()), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, removeConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => removeConfigurationListener(t0).runNow()), removeSettings = js.Any.fromFunction1((t0: String) => removeSettings(t0).runNow()), replaceSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (replaceSettings(t0, t1)).runNow()), reset = reset.toJsFn, store = store.toJsFn, storeToStorage = js.Any.fromFunction1((t0: XStorage) => storeToStorage(t0).runNow()))
    __obj.asInstanceOf[ModuleUIConfigurationManager]
  }
  
  extension [Self <: ModuleUIConfigurationManager](x: Self) {
    
    inline def setCreateDefault(value: (String, String) => Callback): Self = StObject.set(x, "createDefault", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
