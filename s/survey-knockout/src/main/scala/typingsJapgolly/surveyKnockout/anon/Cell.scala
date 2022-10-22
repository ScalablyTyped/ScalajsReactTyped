package typingsJapgolly.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  var cell: String
  
  var cellLabel: String
  
  var cellResponsiveTitle: String
  
  var cellText: String
  
  var cellTextSelected: String
  
  var itemChecked: String
  
  var itemDecorator: String
  
  var label: String
  
  var root: String
}
object Cell {
  
  inline def apply(
    cell: String,
    cellLabel: String,
    cellResponsiveTitle: String,
    cellText: String,
    cellTextSelected: String,
    itemChecked: String,
    itemDecorator: String,
    label: String,
    root: String
  ): Cell = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellLabel = cellLabel.asInstanceOf[js.Any], cellResponsiveTitle = cellResponsiveTitle.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
  
  extension [Self <: Cell](x: Self) {
    
    inline def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellLabel(value: String): Self = StObject.set(x, "cellLabel", value.asInstanceOf[js.Any])
    
    inline def setCellResponsiveTitle(value: String): Self = StObject.set(x, "cellResponsiveTitle", value.asInstanceOf[js.Any])
    
    inline def setCellText(value: String): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
    
    inline def setCellTextSelected(value: String): Self = StObject.set(x, "cellTextSelected", value.asInstanceOf[js.Any])
    
    inline def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    inline def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
