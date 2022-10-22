package typingsJapgolly.d3pie.anon

import typingsJapgolly.d3pie.d3pieStrings.inner
import typingsJapgolly.d3pie.d3pieStrings.outer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section extends StObject {
  
  var label: String
  
  var section: outer | inner
  
  var value: Double
}
object Section {
  
  inline def apply(label: String, section: outer | inner, value: Double): Section = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  
  extension [Self <: Section](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSection(value: outer | inner): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
