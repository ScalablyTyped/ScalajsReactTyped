package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * has to be provided if an object wants to receive events when several things happen to components within frames of the desktop frame tree.
  *
  * E.g., you can receive events of instantiation/destruction and activation/deactivation of components.
  * @see XFrame.addFrameActionListener()
  * @see XFrame.removeFrameActionListener()
  */
trait XFrameActionListener
  extends StObject
     with XEventListener {
  
  /**
    * is called whenever any action occurs to a component within a frame.
    * @param Action describes the detected frame action for which the listener can react
    */
  def frameAction(Action: FrameActionEvent): Unit
}
object XFrameActionListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    frameAction: FrameActionEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFrameActionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), frameAction = js.Any.fromFunction1((t0: FrameActionEvent) => frameAction(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFrameActionListener]
  }
  
  extension [Self <: XFrameActionListener](x: Self) {
    
    inline def setFrameAction(value: FrameActionEvent => Callback): Self = StObject.set(x, "frameAction", js.Any.fromFunction1((t0: FrameActionEvent) => value(t0).runNow()))
  }
}
