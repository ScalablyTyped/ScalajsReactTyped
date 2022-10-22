package typingsJapgolly.matterJs.mod

import typingsJapgolly.matterJs.matterJsStrings.mousedown
import typingsJapgolly.matterJs.matterJsStrings.mousemove
import typingsJapgolly.matterJs.matterJsStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseEvent[T]
  extends StObject
     with IEvent[T] {
  
  @JSName("name")
  var name_IMouseEvent: mousedown | mousemove | mouseup
}
object IMouseEvent {
  
  inline def apply[T](name: mousedown | mousemove | mouseup, source: T): IMouseEvent[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent[T]]
  }
  
  extension [Self <: IMouseEvent[?], T](x: Self & IMouseEvent[T]) {
    
    inline def setName(value: mousedown | mousemove | mouseup): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
