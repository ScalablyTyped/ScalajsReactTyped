package typingsJapgolly.gaeaModel.FitGaea

import org.scalajs.dom.HTMLElement
import typingsJapgolly.gaeaModel.anon.MapUniqueKey
import typingsJapgolly.gaeaModel.anon.Source
import typingsJapgolly.gaeaModel.anon.UniqueKey
import typingsJapgolly.gaeaModel.gaeaModelStrings.`new`
import typingsJapgolly.gaeaModel.gaeaModelStrings.combo
import typingsJapgolly.gaeaModel.gaeaModelStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentDragComponentInfo extends StObject {
  
  var comboInfo: js.UndefOr[Source] = js.undefined
  
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double
  
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement
  
  var newInfo: js.UndefOr[UniqueKey] = js.undefined
  
  // 类型
  var `type`: `new` | combo | viewport
  
  var viewportInfo: js.UndefOr[MapUniqueKey] = js.undefined
}
object CurrentDragComponentInfo {
  
  inline def apply(dragStartIndex: Double, dragStartParentElement: HTMLElement, `type`: `new` | combo | viewport): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
  
  extension [Self <: CurrentDragComponentInfo](x: Self) {
    
    inline def setComboInfo(value: Source): Self = StObject.set(x, "comboInfo", value.asInstanceOf[js.Any])
    
    inline def setComboInfoUndefined: Self = StObject.set(x, "comboInfo", js.undefined)
    
    inline def setDragStartIndex(value: Double): Self = StObject.set(x, "dragStartIndex", value.asInstanceOf[js.Any])
    
    inline def setDragStartParentElement(value: HTMLElement): Self = StObject.set(x, "dragStartParentElement", value.asInstanceOf[js.Any])
    
    inline def setNewInfo(value: UniqueKey): Self = StObject.set(x, "newInfo", value.asInstanceOf[js.Any])
    
    inline def setNewInfoUndefined: Self = StObject.set(x, "newInfo", js.undefined)
    
    inline def setType(value: `new` | combo | viewport): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewportInfo(value: MapUniqueKey): Self = StObject.set(x, "viewportInfo", value.asInstanceOf[js.Any])
    
    inline def setViewportInfoUndefined: Self = StObject.set(x, "viewportInfo", js.undefined)
  }
}
