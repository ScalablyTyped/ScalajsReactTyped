package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var disabled: Boolean
  
  var kind: secondary
  
  def onClick(): Unit
  
  var shape: default_
  
  var size: default_
}
object Kind {
  
  inline def apply(disabled: Boolean, onClick: Callback): Kind = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], kind = "secondary", onClick = onClick.toJsFn, shape = "default", size = "default")
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setKind(value: secondary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setShape(value: default_): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSize(value: default_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
