package typingsJapgolly.payuEmeaSdk.payu

import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.auto
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.block
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.bold
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.fallback
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.italic
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.normal
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.oblique
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.optional
import typingsJapgolly.payuEmeaSdk.payuEmeaSdkStrings.swap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontOptions extends StObject {
  
  var display: js.UndefOr[auto | block | swap | fallback | optional] = js.undefined
  
  var family: String
  
  var src: String
  
  var style: js.UndefOr[normal | italic | oblique] = js.undefined
  
  var unicodeRange: js.UndefOr[String] = js.undefined
  
  var weight: js.UndefOr[normal | bold | fontWeightNumber] = js.undefined
}
object FontOptions {
  
  inline def apply(family: String, src: String): FontOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOptions]
  }
  
  extension [Self <: FontOptions](x: Self) {
    
    inline def setDisplay(value: auto | block | swap | fallback | optional): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: normal | italic | oblique): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    
    inline def setWeight(value: normal | bold | fontWeightNumber): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
