package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes the modify state of the object accessible.
  *
  * Additionally, it makes it possible to register listener objects, which get notification whenever the status or content of the object changes.
  */
trait XModifiable
  extends StObject
     with XModifyBroadcaster {
  
  /** @returns `TRUE` if the object is modified.  The modification is always in relation to a certain state (i.e., the initial, loaded, or last stored version). */
  def isModified(): Boolean
  
  /** sets the status of the **modified** -flag from outside of the object. */
  def setModified(bModified: Boolean): Unit
}
object XModifiable {
  
  inline def apply(
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    isModified: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeModifyListener: XModifyListener => Callback,
    setModified: Boolean => Callback
  ): XModifiable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), isModified = isModified.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), setModified = js.Any.fromFunction1((t0: Boolean) => setModified(t0).runNow()))
    __obj.asInstanceOf[XModifiable]
  }
  
  extension [Self <: XModifiable](x: Self) {
    
    inline def setIsModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "isModified", value.toJsFn)
    
    inline def setSetModified(value: Boolean => Callback): Self = StObject.set(x, "setModified", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
