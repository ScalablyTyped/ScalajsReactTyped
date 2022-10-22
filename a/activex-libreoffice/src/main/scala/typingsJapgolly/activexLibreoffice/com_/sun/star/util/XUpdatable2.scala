package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface extends {@link XUpdatable} in order to provide more fine-tuned update modes. When performing a **soft** update, the implementor may
  * decide not to update in certain cases, such as when the controller is locked. When performing a **hard** update, on the other hand, the implementor
  * should perform update more aggressively even when the controller is locked.
  */
trait XUpdatable2
  extends StObject
     with XUpdatable {
  
  /** Perform update, even when the controller is locked. */
  def updateHard(): Unit
  
  /** Perform update, but update may not always be performed especially when the controller is locked. */
  def updateSoft(): Unit
}
object XUpdatable2 {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    update: Callback,
    updateHard: Callback,
    updateSoft: Callback
  ): XUpdatable2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, update = update.toJsFn, updateHard = updateHard.toJsFn, updateSoft = updateSoft.toJsFn)
    __obj.asInstanceOf[XUpdatable2]
  }
  
  extension [Self <: XUpdatable2](x: Self) {
    
    inline def setUpdateHard(value: Callback): Self = StObject.set(x, "updateHard", value.toJsFn)
    
    inline def setUpdateSoft(value: Callback): Self = StObject.set(x, "updateSoft", value.toJsFn)
  }
}
