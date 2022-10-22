package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkStyle extends StObject {
  
  /* standard dom */
  val sheet: org.scalajs.dom.CSSStyleSheet | Null
}
object LinkStyle {
  
  inline def apply(): LinkStyle = {
    val __obj = js.Dynamic.literal(sheet = null)
    __obj.asInstanceOf[LinkStyle]
  }
  
  extension [Self <: LinkStyle](x: Self) {
    
    inline def setSheet(value: org.scalajs.dom.CSSStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetNull: Self = StObject.set(x, "sheet", null)
  }
}
