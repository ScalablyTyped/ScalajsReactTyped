package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContentSizeChangedEvent extends StObject {
  
  val contentHeight: Double
  
  val contentHeightChanged: Boolean
  
  val contentWidth: Double
  
  val contentWidthChanged: Boolean
}
object IContentSizeChangedEvent {
  
  inline def apply(
    contentHeight: Double,
    contentHeightChanged: Boolean,
    contentWidth: Double,
    contentWidthChanged: Boolean
  ): IContentSizeChangedEvent = {
    val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], contentHeightChanged = contentHeightChanged.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], contentWidthChanged = contentWidthChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentSizeChangedEvent]
  }
  
  extension [Self <: IContentSizeChangedEvent](x: Self) {
    
    inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
    
    inline def setContentHeightChanged(value: Boolean): Self = StObject.set(x, "contentHeightChanged", value.asInstanceOf[js.Any])
    
    inline def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    inline def setContentWidthChanged(value: Boolean): Self = StObject.set(x, "contentWidthChanged", value.asInstanceOf[js.Any])
  }
}
