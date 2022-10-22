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
  * Provides a unified interface for the {@link ModuleUIConfigurationManager} service.
  * @since LibreOffice 4.2
  */
trait XModuleUIConfigurationManager2
  extends StObject
     with XUIConfigurationPersistence
     with XUIConfigurationManager
     with XModuleUIConfigurationManager
     with XUIConfiguration
object XModuleUIConfigurationManager2 {
  
  inline def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: Callback,
    addConfigurationListener: XUIConfigurationListener => Callback,
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
  ): XModuleUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager.asInstanceOf[js.Any], ImageManager = ImageManager.asInstanceOf[js.Any], ShortCutManager = ShortCutManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, addConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => addConfigurationListener(t0).runNow()), createSettings = createSettings.toJsFn, getDefaultSettings = js.Any.fromFunction1(getDefaultSettings), getEventsManager = getEventsManager.toJsFn, getImageManager = getImageManager.toJsFn, getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = getShortCutManager.toJsFn, getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), insertSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (insertSettings(t0, t1)).runNow()), isDefaultSettings = js.Any.fromFunction1(isDefaultSettings), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, removeConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => removeConfigurationListener(t0).runNow()), removeSettings = js.Any.fromFunction1((t0: String) => removeSettings(t0).runNow()), replaceSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (replaceSettings(t0, t1)).runNow()), reset = reset.toJsFn, store = store.toJsFn, storeToStorage = js.Any.fromFunction1((t0: XStorage) => storeToStorage(t0).runNow()))
    __obj.asInstanceOf[XModuleUIConfigurationManager2]
  }
}
