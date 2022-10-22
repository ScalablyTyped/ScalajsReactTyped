package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordWrap extends StObject {
  
  /**
    * Specifies the font settings of the tile labels.
    */
  var font: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Specifies what to do with labels that overflow their tiles after applying wordWrap: hide, truncate them and display an ellipsis, or do nothing.
    */
  var textOverflow: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.common.charts.TextOverflow] = js.undefined
  
  /**
    * Changes the visibility of the tile labels.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how to wrap texts that do not fit into a single line.
    */
  var wordWrap: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.common.charts.WordWrap] = js.undefined
}
object WordWrap {
  
  inline def apply(): WordWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordWrap]
  }
  
  extension [Self <: WordWrap](x: Self) {
    
    inline def setFont(value: typingsJapgolly.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setTextOverflow(value: typingsJapgolly.devextreme.mod.DevExpress.common.charts.TextOverflow): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWordWrap(value: typingsJapgolly.devextreme.mod.DevExpress.common.charts.WordWrap): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
