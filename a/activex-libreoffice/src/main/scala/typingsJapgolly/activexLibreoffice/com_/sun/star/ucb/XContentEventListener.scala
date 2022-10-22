package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a listener for events related to XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
trait XContentEventListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called whenever a content wishes to notify changes.
    * @param evt the event.
    */
  def contentEvent(evt: ContentEvent): Unit
}
object XContentEventListener {
  
  inline def apply(
    acquire: Callback,
    contentEvent: ContentEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XContentEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, contentEvent = js.Any.fromFunction1((t0: ContentEvent) => contentEvent(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContentEventListener]
  }
  
  extension [Self <: XContentEventListener](x: Self) {
    
    inline def setContentEvent(value: ContentEvent => Callback): Self = StObject.set(x, "contentEvent", js.Any.fromFunction1((t0: ContentEvent) => value(t0).runNow()))
  }
}
