package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a section column in the document.
  */
trait SectionColumn extends StObject {
  
  /**
    * Specifies the space between adjacent section columns.
    */
  var spacing: Double
  
  /**
    * Specifies the width of the section column.
    */
  var width: Double
}
object SectionColumn {
  
  inline def apply(spacing: Double, width: Double): SectionColumn = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionColumn]
  }
  
  extension [Self <: SectionColumn](x: Self) {
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
