package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XUIConfigurationManager2
  extends StObject
     with XUIConfigurationStorage
     with XUIConfigurationPersistence
     with XUIConfigurationManager
     with XUIConfiguration
     with XComponent
object XUIConfigurationManager2 {
  
  inline def apply(
    EventsManager: XInterface,
    ImageManager: XInterface,
    ShortCutManager: XAcceleratorConfiguration,
    acquire: Callback,
    addConfigurationListener: XUIConfigurationListener => Callback,
    addEventListener: XEventListener => Callback,
    createSettings: CallbackTo[XIndexContainer],
    dispose: Callback,
    getEventsManager: CallbackTo[XInterface],
    getImageManager: CallbackTo[XInterface],
    getSettings: (String, Boolean) => XIndexAccess,
    getShortCutManager: CallbackTo[XAcceleratorConfiguration],
    getUIElementsInfo: Double => SafeArray[SafeArray[PropertyValue]],
    hasSettings: String => Boolean,
    hasStorage: CallbackTo[Boolean],
    insertSettings: (String, XIndexAccess) => Callback,
    isModified: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: Callback,
    removeConfigurationListener: XUIConfigurationListener => Callback,
    removeEventListener: XEventListener => Callback,
    removeSettings: String => Callback,
    replaceSettings: (String, XIndexAccess) => Callback,
    reset: Callback,
    setStorage: XStorage => Callback,
    store: Callback,
    storeToStorage: XStorage => Callback
  ): XUIConfigurationManager2 = {
    val __obj = js.Dynamic.literal(EventsManager = EventsManager.asInstanceOf[js.Any], ImageManager = ImageManager.asInstanceOf[js.Any], ShortCutManager = ShortCutManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, addConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => addConfigurationListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createSettings = createSettings.toJsFn, dispose = dispose.toJsFn, getEventsManager = getEventsManager.toJsFn, getImageManager = getImageManager.toJsFn, getSettings = js.Any.fromFunction2(getSettings), getShortCutManager = getShortCutManager.toJsFn, getUIElementsInfo = js.Any.fromFunction1(getUIElementsInfo), hasSettings = js.Any.fromFunction1(hasSettings), hasStorage = hasStorage.toJsFn, insertSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (insertSettings(t0, t1)).runNow()), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, removeConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => removeConfigurationListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeSettings = js.Any.fromFunction1((t0: String) => removeSettings(t0).runNow()), replaceSettings = js.Any.fromFunction2((t0: String, t1: XIndexAccess) => (replaceSettings(t0, t1)).runNow()), reset = reset.toJsFn, setStorage = js.Any.fromFunction1((t0: XStorage) => setStorage(t0).runNow()), store = store.toJsFn, storeToStorage = js.Any.fromFunction1((t0: XStorage) => storeToStorage(t0).runNow()))
    __obj.asInstanceOf[XUIConfigurationManager2]
  }
}
