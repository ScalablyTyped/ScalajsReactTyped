package typingsJapgolly.materializeCss.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.FormSelect, 'getSelectedValues' | 'destroy'> */
trait PickFormSelectgetSelected extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
  
  def getSelectedValues(): js.Array[String]
  @JSName("getSelectedValues")
  var getSelectedValues_Original: js.Function0[js.Array[String]]
}
object PickFormSelectgetSelected {
  
  inline def apply(destroy: Callback, getSelectedValues: CallbackTo[js.Array[String]]): PickFormSelectgetSelected = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getSelectedValues = getSelectedValues.toJsFn)
    __obj.asInstanceOf[PickFormSelectgetSelected]
  }
  
  extension [Self <: PickFormSelectgetSelected](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetSelectedValues(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getSelectedValues", value.toJsFn)
  }
}
