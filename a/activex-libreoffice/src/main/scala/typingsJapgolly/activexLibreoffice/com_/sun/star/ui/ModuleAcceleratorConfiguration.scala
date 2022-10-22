package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.2 */
trait ModuleAcceleratorConfiguration
  extends StObject
     with XAcceleratorConfiguration {
  
  def createWithModuleIdentifier(ModuleIdentifier: String): Unit
}
object ModuleAcceleratorConfiguration {
  
  inline def apply(
    AllKeyEvents: SafeArray[KeyEvent],
    acquire: Callback,
    addConfigurationListener: XUIConfigurationListener => Callback,
    createWithModuleIdentifier: String => Callback,
    getAllKeyEvents: CallbackTo[SafeArray[KeyEvent]],
    getCommandByKeyEvent: KeyEvent => String,
    getKeyEventsByCommand: String => SafeArray[KeyEvent],
    getPreferredKeyEventsForCommandList: SeqEquiv[String] => SafeArray[Any],
    hasStorage: CallbackTo[Boolean],
    isModified: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: Callback,
    removeCommandFromAllKeyEvents: String => Callback,
    removeConfigurationListener: XUIConfigurationListener => Callback,
    removeKeyEvent: KeyEvent => Callback,
    setKeyEvent: (KeyEvent, String) => Callback,
    setStorage: XStorage => Callback,
    store: Callback,
    storeToStorage: XStorage => Callback
  ): ModuleAcceleratorConfiguration = {
    val __obj = js.Dynamic.literal(AllKeyEvents = AllKeyEvents.asInstanceOf[js.Any], acquire = acquire.toJsFn, addConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => addConfigurationListener(t0).runNow()), createWithModuleIdentifier = js.Any.fromFunction1((t0: String) => createWithModuleIdentifier(t0).runNow()), getAllKeyEvents = getAllKeyEvents.toJsFn, getCommandByKeyEvent = js.Any.fromFunction1(getCommandByKeyEvent), getKeyEventsByCommand = js.Any.fromFunction1(getKeyEventsByCommand), getPreferredKeyEventsForCommandList = js.Any.fromFunction1(getPreferredKeyEventsForCommandList), hasStorage = hasStorage.toJsFn, isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, removeCommandFromAllKeyEvents = js.Any.fromFunction1((t0: String) => removeCommandFromAllKeyEvents(t0).runNow()), removeConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => removeConfigurationListener(t0).runNow()), removeKeyEvent = js.Any.fromFunction1((t0: KeyEvent) => removeKeyEvent(t0).runNow()), setKeyEvent = js.Any.fromFunction2((t0: KeyEvent, t1: String) => (setKeyEvent(t0, t1)).runNow()), setStorage = js.Any.fromFunction1((t0: XStorage) => setStorage(t0).runNow()), store = store.toJsFn, storeToStorage = js.Any.fromFunction1((t0: XStorage) => storeToStorage(t0).runNow()))
    __obj.asInstanceOf[ModuleAcceleratorConfiguration]
  }
  
  extension [Self <: ModuleAcceleratorConfiguration](x: Self) {
    
    inline def setCreateWithModuleIdentifier(value: String => Callback): Self = StObject.set(x, "createWithModuleIdentifier", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
