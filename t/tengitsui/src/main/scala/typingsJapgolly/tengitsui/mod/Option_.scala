package typingsJapgolly.tengitsui.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option_ extends StObject {
  
  @JSName("$exclusive")
  var $exclusive: js.UndefOr[Boolean] = js.undefined
  
  // 全局
  @JSName("$mutable")
  var $mutable: js.UndefOr[Boolean] = js.undefined
  
  // 排他
  @JSName("$overall")
  var $overall: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[js.Array[Option_]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: Double | String
  
  var label: js.UndefOr[Node] = js.undefined
  
  var name: String
}
object Option_ {
  
  inline def apply(id: Double | String, name: String): Option_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option_]
  }
  
  extension [Self <: Option_](x: Self) {
    
    inline def set$exclusive(value: Boolean): Self = StObject.set(x, "$exclusive", value.asInstanceOf[js.Any])
    
    inline def set$exclusiveUndefined: Self = StObject.set(x, "$exclusive", js.undefined)
    
    inline def set$mutable(value: Boolean): Self = StObject.set(x, "$mutable", value.asInstanceOf[js.Any])
    
    inline def set$mutableUndefined: Self = StObject.set(x, "$mutable", js.undefined)
    
    inline def set$overall(value: Boolean): Self = StObject.set(x, "$overall", value.asInstanceOf[js.Any])
    
    inline def set$overallUndefined: Self = StObject.set(x, "$overall", js.undefined)
    
    inline def setChildren(value: js.Array[Option_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Option_ *): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
