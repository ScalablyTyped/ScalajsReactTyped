package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value of a spin field and makes it possible to register for spin events. */
trait XSpinField
  extends StObject
     with XInterface {
  
  /** registers a listener for spin events. */
  def addSpinListener(l: XSpinListener): Unit
  
  /** decreases the value by one step. */
  def down(): Unit
  
  /** enables/disables automatic repeat mode. */
  def enableRepeat(bRepeat: Boolean): Unit
  
  /** sets the value to the previously set lower value. */
  def first(): Unit
  
  /** sets the value to the previously set upper value. */
  def last(): Unit
  
  /** unregisters a listener for spin events. */
  def removeSpinListener(l: XSpinListener): Unit
  
  /** increases the value by one step. */
  def up(): Unit
}
object XSpinField {
  
  inline def apply(
    acquire: Callback,
    addSpinListener: XSpinListener => Callback,
    down: Callback,
    enableRepeat: Boolean => Callback,
    first: Callback,
    last: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeSpinListener: XSpinListener => Callback,
    up: Callback
  ): XSpinField = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSpinListener = js.Any.fromFunction1((t0: XSpinListener) => addSpinListener(t0).runNow()), down = down.toJsFn, enableRepeat = js.Any.fromFunction1((t0: Boolean) => enableRepeat(t0).runNow()), first = first.toJsFn, last = last.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSpinListener = js.Any.fromFunction1((t0: XSpinListener) => removeSpinListener(t0).runNow()), up = up.toJsFn)
    __obj.asInstanceOf[XSpinField]
  }
  
  extension [Self <: XSpinField](x: Self) {
    
    inline def setAddSpinListener(value: XSpinListener => Callback): Self = StObject.set(x, "addSpinListener", js.Any.fromFunction1((t0: XSpinListener) => value(t0).runNow()))
    
    inline def setDown(value: Callback): Self = StObject.set(x, "down", value.toJsFn)
    
    inline def setEnableRepeat(value: Boolean => Callback): Self = StObject.set(x, "enableRepeat", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setFirst(value: Callback): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setLast(value: Callback): Self = StObject.set(x, "last", value.toJsFn)
    
    inline def setRemoveSpinListener(value: XSpinListener => Callback): Self = StObject.set(x, "removeSpinListener", js.Any.fromFunction1((t0: XSpinListener) => value(t0).runNow()))
    
    inline def setUp(value: Callback): Self = StObject.set(x, "up", value.toJsFn)
  }
}
