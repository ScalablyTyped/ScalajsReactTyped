package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive ScriptEvents. */
trait XScriptListener
  extends StObject
     with XEventListener {
  
  /** gets called when a "vetoable event" occurs at the object. */
  def approveFiring(aEvent: ScriptEvent): Any
  
  /**
    * gets called when an event takes place. For that a {@link ScriptEventDescriptor} is registered at and attached to an object by an {@link
    * XEventAttacherManager} .
    */
  def firing(aEvent: ScriptEvent): Unit
}
object XScriptListener {
  
  inline def apply(
    acquire: Callback,
    approveFiring: ScriptEvent => Any,
    disposing: EventObject => Callback,
    firing: ScriptEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XScriptListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveFiring = js.Any.fromFunction1(approveFiring), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), firing = js.Any.fromFunction1((t0: ScriptEvent) => firing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XScriptListener]
  }
  
  extension [Self <: XScriptListener](x: Self) {
    
    inline def setApproveFiring(value: ScriptEvent => Any): Self = StObject.set(x, "approveFiring", js.Any.fromFunction1(value))
    
    inline def setFiring(value: ScriptEvent => Callback): Self = StObject.set(x, "firing", js.Any.fromFunction1((t0: ScriptEvent) => value(t0).runNow()))
  }
}
