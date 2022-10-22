package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexLayout extends StObject {
  
  @JSName("$getSize")
  var $getSize: js.Array[Any]
  
  def render(): Unit
}
object FlexLayout {
  
  inline def apply($getSize: js.Array[Any], render: Callback): FlexLayout = {
    val __obj = js.Dynamic.literal($getSize = $getSize.asInstanceOf[js.Any], render = render.toJsFn)
    __obj.asInstanceOf[FlexLayout]
  }
  
  extension [Self <: FlexLayout](x: Self) {
    
    inline def set$getSize(value: js.Array[Any]): Self = StObject.set(x, "$getSize", value.asInstanceOf[js.Any])
    
    inline def set$getSizeVarargs(value: Any*): Self = StObject.set(x, "$getSize", js.Array(value*))
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
  }
}
