package typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxBlockquoteElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var cite: js.UndefOr[String] = js.undefined
}
object JsxBlockquoteElementProps {
  
  inline def apply(): JsxBlockquoteElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxBlockquoteElementProps]
  }
  
  extension [Self <: JsxBlockquoteElementProps](x: Self) {
    
    inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
