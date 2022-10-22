package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to receive notifications when the frame title changes */
trait XTitleChangeListener
  extends StObject
     with XEventListener {
  
  /** The frame title has changed */
  def titleChanged(aEvent: TitleChangedEvent): Unit
}
object XTitleChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    titleChanged: TitleChangedEvent => Callback
  ): XTitleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, titleChanged = js.Any.fromFunction1((t0: TitleChangedEvent) => titleChanged(t0).runNow()))
    __obj.asInstanceOf[XTitleChangeListener]
  }
  
  extension [Self <: XTitleChangeListener](x: Self) {
    
    inline def setTitleChanged(value: TitleChangedEvent => Callback): Self = StObject.set(x, "titleChanged", js.Any.fromFunction1((t0: TitleChangedEvent) => value(t0).runNow()))
  }
}
