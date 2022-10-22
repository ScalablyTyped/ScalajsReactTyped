package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.mod.Position
import typingsJapgolly.monacoEditor.mod.Range
import typingsJapgolly.monacoEditor.mod.editor.MouseTargetType.SCROLLBAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetScrollbar
  extends StObject
     with IBaseMouseTarget
     with IMouseTarget {
  
  @JSName("position")
  val position_IMouseTargetScrollbar: Position
  
  @JSName("range")
  val range_IMouseTargetScrollbar: Range
  
  val `type`: SCROLLBAR
}
object IMouseTargetScrollbar {
  
  inline def apply(mouseColumn: Double, position: Position, range: Range, `type`: SCROLLBAR): IMouseTargetScrollbar = {
    val __obj = js.Dynamic.literal(mouseColumn = mouseColumn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], element = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetScrollbar]
  }
  
  extension [Self <: IMouseTargetScrollbar](x: Self) {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: SCROLLBAR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
