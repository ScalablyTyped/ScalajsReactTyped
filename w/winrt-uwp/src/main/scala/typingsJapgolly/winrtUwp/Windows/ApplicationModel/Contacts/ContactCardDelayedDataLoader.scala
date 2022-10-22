package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a delayed data loader for a contact card. */
trait ContactCardDelayedDataLoader extends StObject {
  
  /** Closes the delayed data loader. This informs the contact card to complete the UI (for example, remove any progress indications, like the progress bar) because no more updates to the contact card UI will be requested. The user then can determine that the contact data shown in the UI is complete. */
  def close(): Unit
  
  /**
    * Updates the contact card with the Contact object and completes the contact card UI.
    * @param contact The contact to update the contact card with.
    */
  def setData(contact: Contact): Unit
}
object ContactCardDelayedDataLoader {
  
  inline def apply(close: Callback, setData: Contact => Callback): ContactCardDelayedDataLoader = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, setData = js.Any.fromFunction1((t0: Contact) => setData(t0).runNow()))
    __obj.asInstanceOf[ContactCardDelayedDataLoader]
  }
  
  extension [Self <: ContactCardDelayedDataLoader](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setSetData(value: Contact => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: Contact) => value(t0).runNow()))
  }
}
