package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyText
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: text
}
object CustomPropertyText {
  
  inline def apply(): CustomPropertyText = {
    val __obj = js.Dynamic.literal(component = "text")
    __obj.asInstanceOf[CustomPropertyText]
  }
  
  extension [Self <: CustomPropertyText](x: Self) {
    
    inline def setComponent(value: text): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
  }
}
