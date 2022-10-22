package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wixStyleReact.distTypesTimeTableMod.TimeTableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOnClickPrefixIcon extends StObject {
  
  var label: String
  
  def onClick(e: org.scalajs.dom.Event, item: TimeTableColumn, index: Double): Any
  
  var prefixIcon: js.UndefOr[Node] = js.undefined
}
object LabelOnClickPrefixIcon {
  
  inline def apply(label: String, onClick: (org.scalajs.dom.Event, TimeTableColumn, Double) => Any): LabelOnClickPrefixIcon = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction3(onClick))
    __obj.asInstanceOf[LabelOnClickPrefixIcon]
  }
  
  extension [Self <: LabelOnClickPrefixIcon](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: (org.scalajs.dom.Event, TimeTableColumn, Double) => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    inline def setPrefixIcon(value: VdomNode): Self = StObject.set(x, "prefixIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setPrefixIconNull: Self = StObject.set(x, "prefixIcon", null)
    
    inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
    
    inline def setPrefixIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "prefixIcon", js.Array(value*))
    
    inline def setPrefixIconVdomElement(value: VdomElement): Self = StObject.set(x, "prefixIcon", value.rawElement.asInstanceOf[js.Any])
  }
}
