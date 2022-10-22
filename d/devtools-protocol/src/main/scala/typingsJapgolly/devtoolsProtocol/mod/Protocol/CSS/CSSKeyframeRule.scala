package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSKeyframeRule extends StObject {
  
  /**
    * Associated key text.
    */
  var keyText: Value
  
  /**
    * Parent stylesheet's origin.
    */
  var origin: StyleSheetOrigin
  
  /**
    * Associated style declaration.
    */
  var style: CSSStyle
  
  /**
    * The css style sheet identifier (absent for user agent stylesheet and user-specified
    * stylesheet rules) this rule came from.
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.undefined
}
object CSSKeyframeRule {
  
  inline def apply(keyText: Value, origin: StyleSheetOrigin, style: CSSStyle): CSSKeyframeRule = {
    val __obj = js.Dynamic.literal(keyText = keyText.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeyframeRule]
  }
  
  extension [Self <: CSSKeyframeRule](x: Self) {
    
    inline def setKeyText(value: Value): Self = StObject.set(x, "keyText", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: StyleSheetOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
  }
}
