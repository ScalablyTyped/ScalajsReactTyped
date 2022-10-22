package typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxSvgStyleProps extends StObject {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object JsxSvgStyleProps {
  
  inline def apply(): JsxSvgStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxSvgStyleProps]
  }
  
  extension [Self <: JsxSvgStyleProps](x: Self) {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
