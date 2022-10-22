package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings to define table borders.
  */
trait TableBordersSettings extends StObject {
  
  /**
    * Gets or sets the background color of table borders.
    */
  var backgroundColor: String
  
  /**
    * Gets or sets the bottom border's settings.
    */
  var bottom: TableBorderSettings
  
  /**
    * Gets or sets the inside horizontal border's settings.
    */
  var insideHorizontal: TableBorderSettings
  
  /**
    * Gets or sets the inside vertical border's settings.
    */
  var insideVertical: TableBorderSettings
  
  /**
    * Gets or sets the left border's settings.
    */
  var left: TableBorderSettings
  
  /**
    * Gets or sets the right border's settings.
    */
  var right: TableBorderSettings
  
  /**
    * Gets or sets the top border's settings.
    */
  var top: TableBorderSettings
}
object TableBordersSettings {
  
  inline def apply(
    backgroundColor: String,
    bottom: TableBorderSettings,
    insideHorizontal: TableBorderSettings,
    insideVertical: TableBorderSettings,
    left: TableBorderSettings,
    right: TableBorderSettings,
    top: TableBorderSettings
  ): TableBordersSettings = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], insideHorizontal = insideHorizontal.asInstanceOf[js.Any], insideVertical = insideVertical.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBordersSettings]
  }
  
  extension [Self <: TableBordersSettings](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: TableBorderSettings): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setInsideHorizontal(value: TableBorderSettings): Self = StObject.set(x, "insideHorizontal", value.asInstanceOf[js.Any])
    
    inline def setInsideVertical(value: TableBorderSettings): Self = StObject.set(x, "insideVertical", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: TableBorderSettings): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: TableBorderSettings): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: TableBorderSettings): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
