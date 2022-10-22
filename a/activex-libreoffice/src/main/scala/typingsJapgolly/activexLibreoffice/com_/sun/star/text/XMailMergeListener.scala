package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to notify listeners about mail merge events.
  *
  * Registered listeners will be notified with a {@link com.sun.star.text.MailMergeEvent} when a document is about to get merged.
  * @see com.sun.star.text.MailMerge
  * @see com.sun.star.text.MailMergeEvent
  * @since OOo 1.1.2
  */
trait XMailMergeListener
  extends StObject
     with XInterface {
  
  /**
    * Notifies the listener about mail merge events.
    * @param aEvent The Event containing the model of the document to be merged that is send to the listener.
    */
  def notifyMailMergeEvent(aEvent: MailMergeEvent): Unit
}
object XMailMergeListener {
  
  inline def apply(
    acquire: Callback,
    notifyMailMergeEvent: MailMergeEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XMailMergeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, notifyMailMergeEvent = js.Any.fromFunction1((t0: MailMergeEvent) => notifyMailMergeEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMailMergeListener]
  }
  
  extension [Self <: XMailMergeListener](x: Self) {
    
    inline def setNotifyMailMergeEvent(value: MailMergeEvent => Callback): Self = StObject.set(x, "notifyMailMergeEvent", js.Any.fromFunction1((t0: MailMergeEvent) => value(t0).runNow()))
  }
}
