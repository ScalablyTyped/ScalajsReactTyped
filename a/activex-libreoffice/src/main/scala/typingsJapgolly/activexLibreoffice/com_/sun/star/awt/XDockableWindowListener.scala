package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive docking events. */
trait XDockableWindowListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the window was actively closed */
  def closed(e: EventObject): Unit
  
  /**
    * is invoked during the docking procedure when the window has been moved.
    *
    * on return the {@link DockingData} must contain either the old tracking rectangle or a changed rectangle if required, additionally it must indicate if
    * the window should be docked or floating
    *
    * Note: the tracking rectangle indicates to the user where the window would be placed if they release the mouse.
    */
  def docking(e: DockingEvent): DockingData
  
  /** is invoked when the docking procedure ends. aWindowRect contains the new position and size of the window */
  def endDocking(e: EndDockingEvent): Unit
  
  /** is invoked when the window currently is in pop-up mode and wants to be undocked or closed */
  def endPopupMode(e: EndPopupModeEvent): Unit
  
  /**
    * is invoked when the floating mode is about to be changed between floating and docked or vice versa
    *
    * if returned FALSE the floating mode will not be changed
    */
  def prepareToggleFloatingMode(e: EventObject): Boolean
  
  /** is invoked when the docking procedure starts. */
  def startDocking(e: DockingEvent): Unit
  
  /** is invoked when the floating mode is changed between floating and docked or vice versa */
  def toggleFloatingMode(e: EventObject): Unit
}
object XDockableWindowListener {
  
  inline def apply(
    acquire: Callback,
    closed: EventObject => Callback,
    disposing: EventObject => Callback,
    docking: DockingEvent => DockingData,
    endDocking: EndDockingEvent => Callback,
    endPopupMode: EndPopupModeEvent => Callback,
    prepareToggleFloatingMode: EventObject => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    startDocking: DockingEvent => Callback,
    toggleFloatingMode: EventObject => Callback
  ): XDockableWindowListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, closed = js.Any.fromFunction1((t0: EventObject) => closed(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), docking = js.Any.fromFunction1(docking), endDocking = js.Any.fromFunction1((t0: EndDockingEvent) => endDocking(t0).runNow()), endPopupMode = js.Any.fromFunction1((t0: EndPopupModeEvent) => endPopupMode(t0).runNow()), prepareToggleFloatingMode = js.Any.fromFunction1(prepareToggleFloatingMode), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startDocking = js.Any.fromFunction1((t0: DockingEvent) => startDocking(t0).runNow()), toggleFloatingMode = js.Any.fromFunction1((t0: EventObject) => toggleFloatingMode(t0).runNow()))
    __obj.asInstanceOf[XDockableWindowListener]
  }
  
  extension [Self <: XDockableWindowListener](x: Self) {
    
    inline def setClosed(value: EventObject => Callback): Self = StObject.set(x, "closed", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setDocking(value: DockingEvent => DockingData): Self = StObject.set(x, "docking", js.Any.fromFunction1(value))
    
    inline def setEndDocking(value: EndDockingEvent => Callback): Self = StObject.set(x, "endDocking", js.Any.fromFunction1((t0: EndDockingEvent) => value(t0).runNow()))
    
    inline def setEndPopupMode(value: EndPopupModeEvent => Callback): Self = StObject.set(x, "endPopupMode", js.Any.fromFunction1((t0: EndPopupModeEvent) => value(t0).runNow()))
    
    inline def setPrepareToggleFloatingMode(value: EventObject => Boolean): Self = StObject.set(x, "prepareToggleFloatingMode", js.Any.fromFunction1(value))
    
    inline def setStartDocking(value: DockingEvent => Callback): Self = StObject.set(x, "startDocking", js.Any.fromFunction1((t0: DockingEvent) => value(t0).runNow()))
    
    inline def setToggleFloatingMode(value: EventObject => Callback): Self = StObject.set(x, "toggleFloatingMode", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
