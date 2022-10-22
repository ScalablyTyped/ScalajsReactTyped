package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.RefFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBlur extends StObject {
  
  var className: String
  
  def onBlur(e: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  def onFocus(e: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  def onInput(): js.UndefOr[Unit]
  
  def onKeyDown(e: ReactEventFrom[org.scalajs.dom.Element]): Unit
  
  var ref: RefFn[Any]
  
  var rows: Double
}
object OnBlur {
  
  inline def apply(
    className: String,
    onBlur: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    onFocus: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    onInput: CallbackTo[js.UndefOr[Unit]],
    onKeyDown: ReactEventFrom[org.scalajs.dom.Element] => Callback,
    ref: Any | Null => Callback,
    rows: Double
  ): OnBlur = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onFocus(t0).runNow()), onInput = onInput.toJsFn, onKeyDown = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => onKeyDown(t0).runNow()), ref = js.Any.fromFunction1((t0: Any | Null) => ref(t0).runNow()), rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlur]
  }
  
  extension [Self <: OnBlur](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnFocus(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInput(value: CallbackTo[js.UndefOr[Unit]]): Self = StObject.set(x, "onInput", value.toJsFn)
    
    inline def setOnKeyDown(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setRef(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
