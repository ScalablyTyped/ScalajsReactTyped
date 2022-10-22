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

/**
  * provides read/write access to an accelerator configuration set.
  *
  * Such configuration set base on: ; Key events structureand Commands, which are represented as URLs; describing a function, which and can be executed
  * using the dispatch API.
  *
  * Note further: ;  All changes you made on this configuration access modify the the configuration set inside memory only. You have to use the {@link
  * com.sun.star.util.XFlushable} interface (which must be available at the same implementation object too), to make it persistent.
  * @see AcceleratorConfiguration
  * @see dom.sun.star.util.XFlushable
  * @since OOo 2.0
  */
trait XAcceleratorConfiguration
  extends StObject
     with XUIConfigurationPersistence
     with XUIConfigurationStorage
     with XUIConfiguration {
  
  /**
    * return the list of all key events, which are available at this configuration set.
    *
    * The key events are the "primary keys" of this configuration sets. Means: Commands are registered for key events.
    *
    * Such key event can be mapped to its bound command, using the method getCommandForKeyEvent().
    * @returns A list of key events.
    * @see getCommandForKeyEvent().
    */
  val AllKeyEvents: SafeArray[KeyEvent]
  
  /**
    * return the list of all key events, which are available at this configuration set.
    *
    * The key events are the "primary keys" of this configuration sets. Means: Commands are registered for key events.
    *
    * Such key event can be mapped to its bound command, using the method getCommandForKeyEvent().
    * @returns A list of key events.
    * @see getCommandForKeyEvent().
    */
  def getAllKeyEvents(): SafeArray[KeyEvent]
  
  /**
    * return the registered command for the specified key event.
    *
    * This function can be used to: ; by a generic service, which can execute commands if a keyboard event occurs.or to iterate over the whole container and
    * change some accelerator bindings.
    * @param aKeyEvent the key event, where the registered command is searched for.
    * @returns The registered command for the specified key event.
    * @throws com::sun::star::container::NoSuchElementException if the key event is an invalid one or does not exists inside this configuration set.
    */
  def getCommandByKeyEvent(aKeyEvent: KeyEvent): String
  
  /**
    * optimized access to the relation "command-key" instead of "key-command" which is provided normally by this interface.
    *
    * It can be used to implement collision handling, if more than one key event match to the same command. The returned list contains all possible key
    * events - and the outside code can select an possible one. Of course - mostly this list will contain only one key event ...
    * @param sCommand the command, where key bindings are searched for.
    * @returns A list of {@link com.sun.star.awt.KeyEvent} structures, where the specified command is registered for.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified command is empty. It can't be checked, if a command is valid - because every URL
    * @throws com::sun::star::container::NoSuchElementException if the specified command isn't empty but does not occur inside this configuration set.
    */
  def getKeyEventsByCommand(sCommand: String): SafeArray[KeyEvent]
  
  /**
    * optimized function to map a list of commands to a corresponding list of key events.
    *
    * It provides a fast mapping, which is e.g. needed by a menu or toolbar implementation. E.g. a sub menu is described by a list of commands - and the
    * implementation of the menu must show the corresponding shortcuts. Iteration over all items of this configuration set can be very expensive.
    *
    * Instead to the method getKeyEventsForCommand() the returned list contains only one(!) key event bound to one(!) requested command. If more than one
    * key event is bound to a command - a selection is done inside this method. This internal selection can't be influenced from outside.
    * @param lCommandList a list of commands
    * @returns A (non packed!) list of key events, where every item match by index directly to a command of the specified **CommandList** . If a command does no
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the specified commands is empty. It can't be checked, if a command is valid - b
    */
  def getPreferredKeyEventsForCommandList(lCommandList: SeqEquiv[String]): SafeArray[Any]
  
  /**
    * search for an key-command-binding inside this configuration set, where the specified command is used.
    *
    * If such binding could be located, the command will be removed from it. If as result of that the key binding will be empty, if will be removed too.
    *
    * This is an optimized method, which can perform removing of commands from this configuration set. Because normally Commands are "foreign keys" and key
    * identifier the "primary keys" - it needs some work to remove all commands outside this container ...
    * @param sCommand the command, which should be removed from any key binding.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified command is empty.
    * @throws com::sun::star::container::NoSuchElementException if the specified command isn't used inside this configuration set.
    */
  def removeCommandFromAllKeyEvents(sCommand: String): Unit
  
  /**
    * remove a key-command-binding from this configuration set.
    * @param aKeyEvent the key event, which should be removed.
    * @throws com::sun::star::container::NoSuchElementException if the key event does not exists inside this configuration set.
    */
  def removeKeyEvent(aKeyEvent: KeyEvent): Unit
  
  /**
    * modify or create a key - command - binding.
    *
    * If the specified key event does not already exists inside this configuration access, it will be created and the command will be registered for it.
    *
    * If the specified key event already exists, its command will be overwritten with the new command. There is no warning nor any error about that! The
    * outside code has to use the method getCommandForKeyEvent() to check for possible collisions.
    *
    * Note: This method can't be used to remove entities from the configuration set. Empty parameters will result into an exception! Use the method {@link
    * removeKeyEvent()} instead.
    * @param aKeyEvent specify the key event, which must be updated or new created.
    * @param sCommand the new command for the specified key event.
    * @see removeKeyEvent()
    * @throws com::sun::star::lang::IllegalArgumentException if the key event isn't a valid one. Commands can be checked only, if they are empty. Because every
    */
  def setKeyEvent(aKeyEvent: KeyEvent, sCommand: String): Unit
}
object XAcceleratorConfiguration {
  
  inline def apply(
    AllKeyEvents: SafeArray[KeyEvent],
    acquire: Callback,
    addConfigurationListener: XUIConfigurationListener => Callback,
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
  ): XAcceleratorConfiguration = {
    val __obj = js.Dynamic.literal(AllKeyEvents = AllKeyEvents.asInstanceOf[js.Any], acquire = acquire.toJsFn, addConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => addConfigurationListener(t0).runNow()), getAllKeyEvents = getAllKeyEvents.toJsFn, getCommandByKeyEvent = js.Any.fromFunction1(getCommandByKeyEvent), getKeyEventsByCommand = js.Any.fromFunction1(getKeyEventsByCommand), getPreferredKeyEventsForCommandList = js.Any.fromFunction1(getPreferredKeyEventsForCommandList), hasStorage = hasStorage.toJsFn, isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, removeCommandFromAllKeyEvents = js.Any.fromFunction1((t0: String) => removeCommandFromAllKeyEvents(t0).runNow()), removeConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => removeConfigurationListener(t0).runNow()), removeKeyEvent = js.Any.fromFunction1((t0: KeyEvent) => removeKeyEvent(t0).runNow()), setKeyEvent = js.Any.fromFunction2((t0: KeyEvent, t1: String) => (setKeyEvent(t0, t1)).runNow()), setStorage = js.Any.fromFunction1((t0: XStorage) => setStorage(t0).runNow()), store = store.toJsFn, storeToStorage = js.Any.fromFunction1((t0: XStorage) => storeToStorage(t0).runNow()))
    __obj.asInstanceOf[XAcceleratorConfiguration]
  }
  
  extension [Self <: XAcceleratorConfiguration](x: Self) {
    
    inline def setAllKeyEvents(value: SafeArray[KeyEvent]): Self = StObject.set(x, "AllKeyEvents", value.asInstanceOf[js.Any])
    
    inline def setGetAllKeyEvents(value: CallbackTo[SafeArray[KeyEvent]]): Self = StObject.set(x, "getAllKeyEvents", value.toJsFn)
    
    inline def setGetCommandByKeyEvent(value: KeyEvent => String): Self = StObject.set(x, "getCommandByKeyEvent", js.Any.fromFunction1(value))
    
    inline def setGetKeyEventsByCommand(value: String => SafeArray[KeyEvent]): Self = StObject.set(x, "getKeyEventsByCommand", js.Any.fromFunction1(value))
    
    inline def setGetPreferredKeyEventsForCommandList(value: SeqEquiv[String] => SafeArray[Any]): Self = StObject.set(x, "getPreferredKeyEventsForCommandList", js.Any.fromFunction1(value))
    
    inline def setRemoveCommandFromAllKeyEvents(value: String => Callback): Self = StObject.set(x, "removeCommandFromAllKeyEvents", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveKeyEvent(value: KeyEvent => Callback): Self = StObject.set(x, "removeKeyEvent", js.Any.fromFunction1((t0: KeyEvent) => value(t0).runNow()))
    
    inline def setSetKeyEvent(value: (KeyEvent, String) => Callback): Self = StObject.set(x, "setKeyEvent", js.Any.fromFunction2((t0: KeyEvent, t1: String) => (value(t0, t1)).runNow()))
  }
}
