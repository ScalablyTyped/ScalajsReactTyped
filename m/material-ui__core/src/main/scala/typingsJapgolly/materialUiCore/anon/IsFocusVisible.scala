package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFocusVisible extends StObject {
  
  def isFocusVisible(event: ReactEventFrom[Element]): Boolean
  
  def onBlurVisible(): Unit
  
  var ref: typingsJapgolly.react.mod.Ref[Any]
}
object IsFocusVisible {
  
  inline def apply(isFocusVisible: ReactEventFrom[Element] => Boolean, onBlurVisible: Callback): IsFocusVisible = {
    val __obj = js.Dynamic.literal(isFocusVisible = js.Any.fromFunction1(isFocusVisible), onBlurVisible = onBlurVisible.toJsFn, ref = null)
    __obj.asInstanceOf[IsFocusVisible]
  }
  
  extension [Self <: IsFocusVisible](x: Self) {
    
    inline def setIsFocusVisible(value: ReactEventFrom[Element] => Boolean): Self = StObject.set(x, "isFocusVisible", js.Any.fromFunction1(value))
    
    inline def setOnBlurVisible(value: Callback): Self = StObject.set(x, "onBlurVisible", value.toJsFn)
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
  }
}
