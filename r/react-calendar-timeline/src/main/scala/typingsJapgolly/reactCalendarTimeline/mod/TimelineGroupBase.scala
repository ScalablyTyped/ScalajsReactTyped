package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineGroupBase extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: Id
  
  var rightTitle: js.UndefOr[Node] = js.undefined
  
  var stackItems: js.UndefOr[Boolean] = js.undefined
  
  var title: Node
}
object TimelineGroupBase {
  
  inline def apply(id: Id): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = null)
    __obj.asInstanceOf[TimelineGroupBase]
  }
  
  extension [Self <: TimelineGroupBase](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRightTitle(value: VdomNode): Self = StObject.set(x, "rightTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def setRightTitleNull: Self = StObject.set(x, "rightTitle", null)
    
    inline def setRightTitleUndefined: Self = StObject.set(x, "rightTitle", js.undefined)
    
    inline def setRightTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "rightTitle", js.Array(value*))
    
    inline def setRightTitleVdomElement(value: VdomElement): Self = StObject.set(x, "rightTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStackItems(value: Boolean): Self = StObject.set(x, "stackItems", value.asInstanceOf[js.Any])
    
    inline def setStackItemsUndefined: Self = StObject.set(x, "stackItems", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
