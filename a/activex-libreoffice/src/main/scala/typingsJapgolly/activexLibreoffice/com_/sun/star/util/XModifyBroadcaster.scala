package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts each modification made on the date data of the object which supports this interface.
  *
  * The modified object must post the modification events immediately after the modification is performed.
  */
trait XModifyBroadcaster
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive events "modified." */
  def addModifyListener(aListener: XModifyListener): Unit
  
  /** removes the specified listener. */
  def removeModifyListener(aListener: XModifyListener): Unit
}
object XModifyBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeModifyListener: XModifyListener => Callback
  ): XModifyBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()))
    __obj.asInstanceOf[XModifyBroadcaster]
  }
  
  extension [Self <: XModifyBroadcaster](x: Self) {
    
    inline def setAddModifyListener(value: XModifyListener => Callback): Self = StObject.set(x, "addModifyListener", js.Any.fromFunction1((t0: XModifyListener) => value(t0).runNow()))
    
    inline def setRemoveModifyListener(value: XModifyListener => Callback): Self = StObject.set(x, "removeModifyListener", js.Any.fromFunction1((t0: XModifyListener) => value(t0).runNow()))
  }
}
