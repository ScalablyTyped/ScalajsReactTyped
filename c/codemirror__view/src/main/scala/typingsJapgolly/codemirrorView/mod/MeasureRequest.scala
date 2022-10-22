package typingsJapgolly.codemirrorView.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureRequest[T] extends StObject {
  
  /**
    When multiple requests with the same key are scheduled, only the
    last one will actually be ran.
    */
  var key: js.UndefOr[Any] = js.undefined
  
  /**
    Called in a DOM read phase to gather information that requires
    DOM layout. Should _not_ mutate the document.
    */
  def read(view: EditorView): T
  
  /**
    Called in a DOM write phase to update the document. Should _not_
    do anything that triggers DOM layout.
    */
  var write: js.UndefOr[js.Function2[/* measure */ T, /* view */ EditorView, Unit]] = js.undefined
}
object MeasureRequest {
  
  inline def apply[T](read: EditorView => T): MeasureRequest[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[MeasureRequest[T]]
  }
  
  extension [Self <: MeasureRequest[?], T](x: Self & MeasureRequest[T]) {
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRead(value: EditorView => T): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setWrite(value: (/* measure */ T, /* view */ EditorView) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction2((t0: /* measure */ T, t1: /* view */ EditorView) => (value(t0, t1)).runNow()))
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
