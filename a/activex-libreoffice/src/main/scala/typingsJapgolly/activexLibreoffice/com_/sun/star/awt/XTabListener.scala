package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** such listener will be informed if tab's was inserted/removed from an {@link XSimpleTabController} instance or if the properties of a tab was changed. */
trait XTabListener
  extends StObject
     with XEventListener {
  
  /** a tab was activated (e.g. by using mouse/keyboard or method {@link XSimpleTabController.activateTab()} */
  def activated(ID: Double): Unit
  
  /**
    * a tab was changed within it's properties.
    * @param ID the unique ID of the changed tab.
    * @param Properties the current set of properties for this tab.
    */
  def changed(ID: Double, Properties: SeqEquiv[NamedValue]): Unit
  
  /** a tab was deactivated, because another tab became the new active state. */
  def deactivated(ID: Double): Unit
  
  /**
    * a new tab was inserted.
    * @param ID this is the unique ID of this new tab.
    */
  def inserted(ID: Double): Unit
  
  /**
    * a tab was removed.
    * @param ID this was the unique ID of this tab.
    */
  def removed(ID: Double): Unit
}
object XTabListener {
  
  inline def apply(
    acquire: Callback,
    activated: Double => Callback,
    changed: (Double, SeqEquiv[NamedValue]) => Callback,
    deactivated: Double => Callback,
    disposing: EventObject => Callback,
    inserted: Double => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removed: Double => Callback
  ): XTabListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, activated = js.Any.fromFunction1((t0: Double) => activated(t0).runNow()), changed = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[NamedValue]) => (changed(t0, t1)).runNow()), deactivated = js.Any.fromFunction1((t0: Double) => deactivated(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), inserted = js.Any.fromFunction1((t0: Double) => inserted(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removed = js.Any.fromFunction1((t0: Double) => removed(t0).runNow()))
    __obj.asInstanceOf[XTabListener]
  }
  
  extension [Self <: XTabListener](x: Self) {
    
    inline def setActivated(value: Double => Callback): Self = StObject.set(x, "activated", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setChanged(value: (Double, SeqEquiv[NamedValue]) => Callback): Self = StObject.set(x, "changed", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[NamedValue]) => (value(t0, t1)).runNow()))
    
    inline def setDeactivated(value: Double => Callback): Self = StObject.set(x, "deactivated", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setInserted(value: Double => Callback): Self = StObject.set(x, "inserted", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoved(value: Double => Callback): Self = StObject.set(x, "removed", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
