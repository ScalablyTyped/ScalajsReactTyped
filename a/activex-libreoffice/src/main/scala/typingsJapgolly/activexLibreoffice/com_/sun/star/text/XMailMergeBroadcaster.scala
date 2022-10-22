package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for adding/removing of mail merge event listeners.
  *
  * Registered listeners will be notified with a {@link com.sun.star.text.MailMergeEvent} when a document is about to get merged.
  * @see com.sun.star.text.MailMergeEvent
  * @see com.sun.star.text.MailMerge
  * @since OOo 1.1.2
  */
trait XMailMergeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds an entry to the list of mail merge listeners.
    * @param xListener The listener to be added.
    */
  def addMailMergeEventListener(xListener: XMailMergeListener): Unit
  
  /**
    * Removes an entry to the list of mail merge listeners.
    * @param xListener The listener to be removed.
    */
  def removeMailMergeEventListener(xListener: XMailMergeListener): Unit
}
object XMailMergeBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addMailMergeEventListener: XMailMergeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeMailMergeEventListener: XMailMergeListener => Callback
  ): XMailMergeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addMailMergeEventListener = js.Any.fromFunction1((t0: XMailMergeListener) => addMailMergeEventListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeMailMergeEventListener = js.Any.fromFunction1((t0: XMailMergeListener) => removeMailMergeEventListener(t0).runNow()))
    __obj.asInstanceOf[XMailMergeBroadcaster]
  }
  
  extension [Self <: XMailMergeBroadcaster](x: Self) {
    
    inline def setAddMailMergeEventListener(value: XMailMergeListener => Callback): Self = StObject.set(x, "addMailMergeEventListener", js.Any.fromFunction1((t0: XMailMergeListener) => value(t0).runNow()))
    
    inline def setRemoveMailMergeEventListener(value: XMailMergeListener => Callback): Self = StObject.set(x, "removeMailMergeEventListener", js.Any.fromFunction1((t0: XMailMergeListener) => value(t0).runNow()))
  }
}
