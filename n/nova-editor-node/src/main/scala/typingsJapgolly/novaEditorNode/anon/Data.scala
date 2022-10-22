package typingsJapgolly.novaEditorNode.anon

import typingsJapgolly.novaEditorNode.Transferrable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[T /* <: Transferrable */] extends StObject {
  
  var data: T
}
object Data {
  
  inline def apply[T /* <: Transferrable */](data: T): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  extension [Self <: Data[?], T /* <: Transferrable */](x: Self & Data[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
